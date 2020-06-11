package com.demo.datastruct.linkedlist;

import java.util.Scanner;
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
        //链表中存在，删除原数据，再插入到链表的头部
        if(preNode!=null){
            deleteElemOptim(preNode);
            intsertElemAtBegin(data);
        }else {
            if (length>=this.capacity){
                deleteElemAtEnd();//删除尾节点
            }
            intsertElemAtBegin(data);
        }
    }

    //删除preNode节点的下一个元素
    private void deleteElemOptim(SNode preNode){
        SNode temp = preNode.getNext();
        preNode.setNext(temp.getNext());
        temp = null;
        length--;
    }

    //链表头部插入节点
    private void intsertElemAtBegin(T data){
        SNode next = headNode.getNext();
        headNode.setNext(new SNode(data,next));
        length++;
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

    //删除尾节点
    private void deleteElemAtEnd(){
        SNode  ptr = headNode;
        if (ptr.getNext()==null) {//空链表直接返回
            return;
        }
        while (ptr.getNext().getNext()!=null){//倒数第二个节点
            ptr = ptr.getNext();
        }

        SNode tmp = ptr.getNext();
        ptr.setNext(null);
        tmp = null;
        length--;
    }
    //打印
    public  void printAll(){
        SNode node = headNode.getNext();
        while (node!=null){
            System.out.print(node.getElements()+",");
            node = node.getNext();
        }
        System.out.println();
    }

    //节点信息
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

    public static void main(String[] args) {
        LRUBaseLinkedList list = new LRUBaseLinkedList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            list.add(sc.nextInt());
            list.printAll();
        }
    }
}
