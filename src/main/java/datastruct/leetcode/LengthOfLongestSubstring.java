package datastruct.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串
 *
 * @author happy
 * @since 2021-11-04
 */
public class LengthOfLongestSubstring {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "";
        int solution1 = solution(s1);
        int solution2 = solution(s2);
        int solution3 = solution(s3);
        int solution4 = solution(s4);
        System.out.println("s1:" + solution1 + " ,s2:" + solution2 + " ,s3:" + solution3 + " ,s4:" + solution4);
    }

    /**
     * 实现方法
     */
    private static int solution(String s) {
        if (s.length() < 1) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        String[] split = s.split("");
        int max = 0;
        for (int i = 0; i < split.length; i++) {
            for (int j = i; j < split.length; j++) {
                if (set.contains(split[j])) {
                    max = Math.max(max, set.size());
                    break;
                } else {
                    max = Math.max(max, set.size());
                    set.add(split[j]);
                }
            }
            set.clear();
        }
        return max;
    }
}