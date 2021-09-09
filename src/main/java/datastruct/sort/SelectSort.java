package datastruct.sort;

/**
 * 选择排序
 *
 * @author happy
 * @since 2021-09-05
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 6, 5};
        int[] sort = sort(arr);
        Display.display(sort);
    }

    /**
     * 选择排序
     */
    private static int[] sort(int[] arr) {
        if (arr.length <= 1) return arr;
        for (int i = 0; i < arr.length; i++) {

            int minIndex = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 交换
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
        return arr;
    }
}
