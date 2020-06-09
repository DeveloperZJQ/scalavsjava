package datastruct.linkedlist;

/**
 * copy from SingleLinkedListDemo1
 */
public class SingleLinkedListDemo2 {
    public static void main(String[] args) {
        SingleLinkedList1 singleLinkedList1 = new SingleLinkedList1();

        HeroNode1 heroNode2 = new HeroNode1(2, "z", "zz");
        HeroNode1 heroNode3 = new HeroNode1(3,"j","jj");
        HeroNode1 heroNode4 = new HeroNode1(4,"q","qq");
        singleLinkedList1.add(heroNode2);
        singleLinkedList1.add(heroNode3);
        singleLinkedList1.add(heroNode4);

        singleLinkedList1.list();
    }
}

class HeroNode1{
    public int id;
    public String name;
    public String nickName;
    public HeroNode1 next;

    public HeroNode1(int id,String name,String nickName){
        this.id         =   id;
        this.name       =   name;
        this.nickName   =   nickName;
    }

    @Override
    public String toString() {
        return "HeroNode1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}


class SingleLinkedList1{
    //创建一个空链表头
    private HeroNode1 head= new HeroNode1(1,"","");
    //添加节点

    public void add(HeroNode1 heroNode1){
        HeroNode1 temp = head;

        //为true则进入，否则直接指针重指向
        while (true){
            if (temp.next==null){
                System.out.println(temp.id);
                break;
            }
            temp    =   temp.next;
        }

        temp.next=heroNode1;
    }

    public void list(){
        HeroNode1 headNode = head;

        if (headNode.next==null){
            System.out.println("链表为空");
        }
        HeroNode1 temp = headNode.next;

        while (true){
            if (temp==null){
                break;
            }

            System.out.println(temp);
            temp = temp.next;
        }
    }
}