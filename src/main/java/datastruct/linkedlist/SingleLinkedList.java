package datastruct.linkedlist;

/**
 * @author happy
 * @create 2020-06-07 15:59
 * 链表--单链表  ♥
 * 链表--双向链表
 * 链表--循环链表
 * 链表--双向循环链表
 * 链表--实现LRU缓存淘汰策略
 * 数组--实现LRU缓存淘汰策略
 * 思考--如何判断一个字符串是否是回文字符串的问题，我想你应该听过，
 *       我们今天的题目就是基于这个问题的改造版本。如果字符串是通过单链表来存储的，
 *       那该如何来判断是一个回文串呢？你有什么好的解决思路呢？
 *       相应的时间空间复杂度又是多少呢？
 */


public class SingleLinkedList {
    public static void main(String[] args) {
        Node hero1 = new Node(1, "mm", "m");
        Node hero2 = new Node(2, "gg", "g");
        Node hero3 = new Node(3, "dd", "d");
        Node hero4 = new Node(4, "ll", "l");

        SingleLinked singleLinkList = new SingleLinked();
//        singleLinkList.add(hero1);
//        singleLinkList.add(hero2);
//        singleLinkList.add(hero3);
//        singleLinkList.add(hero4);

        singleLinkList.addByOrder(hero2);
        singleLinkList.addByOrder(hero1);
        singleLinkList.addByOrder(hero4);
        singleLinkList.addByOrder(hero3);

        singleLinkList.list();
        Node newNode = new Node(4, "hh", "h");
        singleLinkList.update(newNode);
        System.out.println("修改后的链表");
        singleLinkList.list();
        singleLinkList.del(1);
        singleLinkList.del(2);
        singleLinkList.del(3);
        singleLinkList.del(4);
        System.out.println("删除后的链表");
        singleLinkList.list();
    }
}


//节点信息
class Node{
    public int id;
    public String name;
    public String nickName;
    public Node node;

    //构造方法
    public Node(int id, String name, String nickName) {
        this.id = id;
        this.name = name;
        this.nickName = nickName;
    }


    //重写toString
    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

class SingleLinked{
    //定义头节点
    private Node head = new Node(1,"xiaoing","gouzi");

    //增加节点
    public void add(Node node){
        if (node.node==null){
            System.out.println("");
        }

        Node temp = head;

        while (true){
            if (temp.node==null){
                break;
            }
            temp    =   temp.node;
        }

        temp.node   =   node;
    }

    public void list(){
        if (head.node==null){
            System.out.println("就这么多");
        }
        Node temp = head.node;
        while (true){
            if (temp.node==null){
                break;
            }
            System.out.println(temp);
            temp = temp.node;
        }
    }


    //删除节点，只需要指针重新指向既可，所以删除和插入都是O(1)
    public void del(int id){
        Node temp = head;
        boolean b = false;
        if (temp.node==null){
            System.out.println("当前节点为空");
        }
        while (true){
            if (temp.node==null){
                break;
            }
            if (temp.node.id==id){
                b=true;
                break;
            }
            if (temp.node.id>id){
                break;
            }
            temp = temp.node;
        }

        if (b){
            temp.node = temp.node.node;
        }else {
            System.out.println("查无此节点");
        }
    }



    //修改节点
    public void update(Node node) {
        Node temp = head.node;


        boolean b = false;

        while (true){
            if (temp==null){
                System.out.println("此链表没有子节点");
            }
            if (temp.id==node.id){
                b = true;
                break;
            }
            if (temp.id>node.id){
                break;
            }

            temp = temp.node;
        }

        if (b){
            temp.name = node.name;
            temp.nickName = node.nickName;
            System.out.println("修改成功");
        }else {
            System.out.println("没有找到编号节点");
        }
    }

    //插入后有序
    public void addByOrder(Node node){
        Node temp       =   head;
        boolean flag    =   false;      //标识是否存在，不存在为false
        while (true){
            if (temp.node==null){
                break;
            }
            if (temp.node.id>node.id){
                break;
            }
            if (temp.node.id==node.id){
                flag = true;
                break;
            }

            temp = temp.node;
        }

        if (flag){
            System.out.println("id已处在");
        }else {
            node.node = temp.node;  //node.node代替最后一个节点
            temp.node = node;
        }
    }
}


