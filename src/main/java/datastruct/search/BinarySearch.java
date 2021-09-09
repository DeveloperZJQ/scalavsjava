package datastruct.search;

/**
 * 二分查找
 *
 * @author happy
 * @since 2021-09-09
 *
 * 注意事项：
 * 1. 循环退出条件（log<=high)
 * 2. mid的取值
 * 3. low和high 的更新
 */
public class BinarySearch {
    public static void main(String[] args) {
        //简单的二分查找遍历
        int i = binarySearch1(5);
        System.out.println(i);
        //简单的二分递归查找
        int i1 = binarySearch2();
        System.out.println(i1);
        //变形-查找第一个值等于给定值的元素
        //变形-查找最后一个值等于给定值的元素
        //变形-查找第一个大于等于给定值的元素
        //变形-查找最后一个小于等于给定值的元素
    }

    private static int binarySearch1(int value) {
        int[] a = {1, 2, 3, 4, 5, 6};
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] > value) {
                high = mid - 1;
            } else if (a[mid] < value) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    private static int binarySearch2() {
        int[] a = {1, 2, 3, 4, 5, 7, 8};
        int val = 8;
        return bsearchInternally(a, 0, a.length - 1, val);
    }

    private static int bsearchInternally(int[] a, int low, int high, int value) {
        if (low > high) return -1;

        int mid = low + ((high - low) >> 1);
        if (a[mid] == value) {
            return mid;
        } else if (a[mid] < value) {
            return bsearchInternally(a, mid + 1, high, value);
        } else {
            return bsearchInternally(a, low, mid - 1, value);
        }
    }
}
