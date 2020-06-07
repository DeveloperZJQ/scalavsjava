package datastruct.array;

/**
 * @author happy
 * @create  2020-06-06 22:26
 */

//数组越界
public class ArrayOutOfBound {
    public static void main(String[] args) {
        int[] a = new int[3];

        for (int i =0;i<=a.length;i++){
            a[i] =0;
            System.out.println("hello world\n");
        }
    }
}
