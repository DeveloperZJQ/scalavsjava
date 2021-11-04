package datastruct.leetcode;

/**
 * leetcode2 两数相加
 *
 * @author zhangjianqiang
 * @since 2021-11-03
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode pre0 = new ListNode(1);
        ListNode pre1 = new ListNode(3);
        ListNode pre2 = new ListNode(2);
        pre0.next = pre1;
        pre1.next = pre2;
        display(pre0);

        System.out.println("\n------------------------风分割线------------------------");

        ListNode pre10 = new ListNode(5);
        ListNode pre11 = new ListNode(4);
        ListNode pre12 = new ListNode(6);
        pre10.next = pre11;
        pre11.next = pre12;
        display(pre10);

        System.out.println("\n------------------------风分割线1------------------------");

        ListNode solution = addTwoNumbers(pre0, pre10);
        display(solution);

        System.out.println("\n------------------------风分割线2------------------------");

        ListNode solution2 = solution(pre0, pre10);
        display(solution2);
    }

    /**
     * display
     */
    private static void display(ListNode pre) {
        while (pre != null) {
            System.out.print(pre.val);
            pre = pre.next;
        }
    }

    /**
     * 节点
     */
    private static class ListNode {
        private int val;
        private ListNode next;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 实现逻辑
     */
    private static ListNode solution(ListNode l1, ListNode l2) {
        //头节点
        ListNode result = new ListNode(1);
        //指针指向头节点，值是和头节点相等的，如果没有这个引用（指针），就需要在while循环体里加判断是否是头节点并赋值，这样子保证循环体简单，格式简单
        ListNode cur = result;
        int flag = 0;
        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int val = val1 + val2 + flag;
            int keep = val % 10;
            if (val > 9) {
                flag = 1;
            } else {
                flag = 0;
            }
            cur.next = new ListNode(keep);
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
            if (l1 == null && l2 == null && flag == 1) {
                cur.next = new ListNode(1);
            }
        }
        return result.next;
    }

    /**
     * 该方法来自于网络
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //res存放结果，cur为res的尾指针
        ListNode res = new ListNode();
        ListNode cur = res;
        //表示进位
        int carry = 0;
        while (l1 != null || l2 != null) {
            //如果其中有一个到达结尾了，那么这个链表这一位的的数字就为0。
            int a = l1 == null ? 0 : l1.val;
            int b = l2 == null ? 0 : l2.val;
            //两个链表的两位相加
            int sum = a + b + carry;
            //大于10进位
            carry = sum / 10;
            //进位完剩下的余数
            sum %= 10;
            //创建一个节点接入res后面
            cur.next = new ListNode(sum);
            cur = cur.next;
            //分别后移
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        //如果最后还有进位的话，增加一个节点
        if (carry == 1) cur.next = new ListNode(1);
        return res.next;
    }
}