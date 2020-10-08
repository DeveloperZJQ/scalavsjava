package datastruct.linkedlist;

import com.demo.datastruct.linkedlist.LRUBaseLinkedList;

import java.util.Scanner;

/**
 * link https://github.com/wangzheng0822/algo/blob/master/java/07_linkedlist/LinkedListAlgo.java
 * 1.单链表反转；
 * 2.链表中环的检测；
 * 3.两个有序的链表合并；
 * 4.删除链表倒数第n个结点；
 * 5.求链表的中间点；
 */
public class LinkedListAlgo {
    //链表--打印列表
    public void printAll(){

    }

    //
    public static void main(String[] args) {
        LRUBaseLinkedList<Integer> list = new LRUBaseLinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (true) {

            list.add(sc.nextInt());
            list.printAll();
        }
    }
}
