package org.leetcode.items._101_200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: hujiangping
 * @Date: 2023/6/5 23:56
 * @Description: _179_最大数
 * @Version 1.0.0
 */
public class _179_最大数 {
    public static String largestNumber(int[] nums) {
        List<String> res = new ArrayList<>(nums.length);
        for (int num : nums) {
            res.add(String.valueOf(num));
        }
        res.sort((o1, o2) -> {
            int len = Math.min(o1.length(), o2.length());
            for (int i = 0; i < len; i++) {
                if (o1.charAt(i) > o2.charAt(i)) {
                    return 1;
                } else if (o1.charAt(i) < o2.charAt(i)) {
                    return -1;
                }
            }
            if (len == o1.length() && len == o2.length()) return 0;
            else if (len == o2.length()) return 1;
            else return -1;
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = res.size() - 1; i >= 0; i--) {
            stringBuilder.append(res.get(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        int[] ints = new int[]{3,5,9,30,34};
        System.out.println(largestNumber(ints));
    }
}
