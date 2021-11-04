package datastruct.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode 1. 两数之和
 *
 * @author happy
 * @since 2021-05-21
 */
public class TwoNumberSum {
    public static void main(String[] args) {
        int[] a = {2, 5, 5, 7};
        int target = 12;
        int[] result = twoSum(a, target);
        int[] result2 = twoSum2(a, target);
        System.out.println(result[0] + ":" + result[1]);
        System.out.println(result2[0] + ":" + result2[1]);
    }

    //方法一：要点1，如果用双for循环，要考虑数组中有两个数字相等的情况，加上j!=i条件
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 1; j < nums.length; j++) {
                int b = nums[i] + nums[j];
                if (b == target && j != i) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    //方法二
    public static int[] twoSum2(int[] nums, int target) {
        int[] index = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                index[1] = i;
                index[0] = map.get(nums[i]);
            }

            map.put(target - nums[i], i);
        }

        return index;
    }
}