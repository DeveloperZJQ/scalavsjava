package datastruct.sort;

import static datastruct.sort.Display.display;

/**
 * 冒泡排序
 *
 * @author happy
 * @since 2021-09-05
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] sort = sort(arr);
        display(sort);
    }

    private static int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        //循环次数
        int loop = 0;
        for (int i = 0; i < arr.length; i++) {
            //提前退出冒泡循环的标志位
            boolean flag = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                loop = loop + 1;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true; // 表示有数据交换
                }
            }
            if (!flag) {
                break;
            }
        }
        System.out.println("loop cnt:" + loop);
        return arr;
    }
}