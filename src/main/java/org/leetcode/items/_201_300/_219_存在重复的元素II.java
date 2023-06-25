package org.leetcode.items._201_300;

import java.util.HashMap;

/**
 * @Author: hujiangping
 * @Date: 2023/6/25 20:39
 * @Description: _219_存在重复的元素II
 * @Version 1.0.0
 */
public class _219_存在重复的元素II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        int r = Math.min(nums.length, k + 1);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < r; i++) {
            int newValue = map.getOrDefault(nums[i], 0) + 1;
            if (newValue >= 2) return true;
            map.put(nums[i], newValue);
        }
        while (l <= nums.length) {
            if (r >= nums.length) return false;

            if (map.getOrDefault(nums[l],0) > 0) {
                map.put(nums[l], map.get(nums[l]) - 1);
            } else {
                map.remove(nums[l]);
            }

            int newValue = map.getOrDefault(nums[r], 0) + 1;
            if (newValue >= 2){
                return true;
            }
            map.put(nums[r], newValue);

            l += 1;
            r += 1;
        }
        return false;
    }
}
