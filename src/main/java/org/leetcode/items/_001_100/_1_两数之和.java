package org.leetcode.items._001_100;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/4/21 20:22
 * @Description: _1
 * @Version 1.0.0
 */
public class _1_两数之和 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                if (map.containsKey(target - map.get(nums[i]))){
                    return new int[]{i,map.get(target - nums[i])};
                }
            }
            map.put(nums[i],i);
        }
        return nums;
    }
}
