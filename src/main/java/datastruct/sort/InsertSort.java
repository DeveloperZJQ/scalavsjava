package datastruct.sort;

/**
 * 插入排序
 *
 * @author happy
 * @since 2021-09-05
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6, 5};
        int[] sort = sort(arr);
        Display.display(sort);
    }

    private static int[] sort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }

        //从第二个数字开始
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j + 1] = arr[j];  //数据移动
                } else {
                    break;
                }
            }
            arr[j + 1] = value;  //替换数据
        }
        return arr;
    }
}
