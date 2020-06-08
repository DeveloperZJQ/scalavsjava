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
public class SingleLinkedList<T> {

    public static class Node{
        private int data;
        private Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public int getData() {
            return data;
        }
    }
}

