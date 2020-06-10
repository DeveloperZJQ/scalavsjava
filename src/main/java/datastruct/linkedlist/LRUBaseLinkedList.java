package datastruct.linkedlist;


/**
 * @author happy
 * @create 2020-06-11
 * LRUBaseLinkedList
 *  * 链表--单链表
 *  * 链表--双向链表
 *  * 链表--循环链表
 *  * 链表--双向循环链表
 *  * 链表--实现LRU缓存淘汰策略    ♥
 *  * 数组--实现LRU缓存淘汰策略
 *  * 思考--如何判断一个字符串是否是回文字符串的问题，我想你应该听过，
 *  *       我们今天的题目就是基于这个问题的改造版本。如果字符串是通过单链表来存储的，
 *  *       那该如何来判断是一个回文串呢？你有什么好的解决思路呢？
 *  *       相应的时间空间复杂度又是多少呢？
 */
public class LRUBaseLinkedList<T> {
    //默认节点容量
    private final static Integer DEFAULT_CAPACITY   =   10;

    //头节点
    private SNode<T> headNode;

    //链表长度
    private Integer length;

    //链表容量
    private Integer capacity;

    public LRUBaseLinkedList(){
        this.capacity   =   DEFAULT_CAPACITY;
        this.headNode   =   new SNode<>();
        this.length     =   0;
    }

    public LRUBaseLinkedList(Integer capacity){
        this.headNode   =   new SNode<>();
        this.capacity   =   capacity;
        this.length     =   0;
    }

    public void add(T data){
        SNode preNode = findPreNode(data);


    }

    //获取查到元素的第一个节点
    private SNode findPreNode(T data){
        SNode node = headNode;
        while (node.getNext()!=null){
            if (data.equals(node.getNext().getElements())){
                return node;
            }
            node = node.getNext();
        }
        return null;
    }
    public class SNode<T>{
        private T elements;
        private SNode next;

        public SNode(T elements){
            this.elements = elements;
        }
        public SNode(T elements,SNode next){
            this.elements   =   elements;
            this.next       =   next;
        }

        public SNode(){
            this.next = null;
        }

        public T getElements() {
            return elements;
        }

        public void setElements(T elements) {
            this.elements = elements;
        }

        public SNode getNext() {
            return next;
        }

        public void setNext(SNode next) {
            this.next = next;
        }
    }
}
