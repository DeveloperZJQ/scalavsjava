package datastruct.linkedlist;

/**
 * @author happy
 * @create 2020-06-08 05:38
 */
public class SingleLinkedListDemo1 {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode heroNode2 = new HeroNode(2, "", "");
        HeroNode heroNode3 = new HeroNode(3, "", "");
        HeroNode heroNode4 = new HeroNode(4, "", "");

        SingleLinkList singleLinkList = new SingleLinkList();
        //添加结点
        singleLinkList.add(heroNode1);
        singleLinkList.add(heroNode2);
        singleLinkList.add(heroNode3);
        singleLinkList.add(heroNode4);
    }
}

//链表bean
class HeroNode{
    public int id;
    public String name;
    public String nickName;
    public HeroNode next;

    public HeroNode(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }

    //去掉next
    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

class SingleLinkList{
    //创建一个空链表头
    private HeroNode head = new HeroNode(1,"","");



    //添加结点的方法
    public void add(HeroNode heroNode){
        //创建一个辅助节点（指针）用来遍历
        HeroNode temp = head;
        while (true){
            if (temp.next==null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }
    //当退出while循环时，temp就指向了链表的最后
    //将最后这个节点的next指向新的节点

    //思路，当不考虑编号顺序时
    //1.找到当前链表的最后结点
    //2.将最后这个结点的next指向新的结点

    //插入后有序
    public void addByOrder(HeroNode heroNode){
        HeroNode temp   = head;
        boolean flag    = false;    //标识英雄号码是否存在，默认为false
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.next.id>heroNode.id){
                break;
            }else if (temp.next.id==heroNode.id){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag){
            System.out.print("英雄编号 %d 已存在，不能插入\n"+heroNode.id);
        }else {
            heroNode.next = temp.next;
            temp.next     = heroNode;
        }

    }

    //遍历链表
    public void list(){
        if (head.next==null){
            System.out.println("链表为空。");
        }
        //头节点是空的，不需要遍历，所以temp直接指向temp.next,即第一个节点
        HeroNode temp = head.next;
        while (true){
            if (temp==null){
                break;
            }
            System.out.println(temp);
            temp=temp.next;
        }
    }

    //修改节点信息，根据编号修改，编号不变
    public void update(HeroNode newHeroNode){
        if (head.next==null){
            System.out.println("链表为空");
        }
        boolean b = false;  //表示节点是否存在
        HeroNode temp = head.next;
        while (true){
            if (temp==null){
                break;
            }
            if (temp.id==newHeroNode.id){
                b = true;
                break;
            }
            else if (temp.id>newHeroNode.id){
                break;
            }
            temp =temp.next;
        }
        if (b){
            temp.name=newHeroNode.name;
            temp.nickName  = newHeroNode.nickName;
            System.out.println("修改成功");
        }else {
            System.out.println("没有找到编号 %d 的节点\n"+newHeroNode.id);
        }
    }

    //删除节点
    public void del(int id){
        HeroNode temp = head;
        boolean b = false;
        while (true){
            if (temp.next==null){
                break;
            }
            if (temp.next.id==id){
                b=true;
                break;
            }
            else if (temp.next.id>id){
                break;
            }
            temp = temp.next;
        }
        if (b){
            temp.next = temp.next.next;
        }else {
            System.out.println("节点不存在");
        }
    }

}