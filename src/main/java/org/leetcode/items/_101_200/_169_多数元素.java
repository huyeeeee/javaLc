package org.leetcode.items._101_200;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: hujiangping
 * @Date: 2023/6/5 23:51
 * @Description: _16_多数元素
 * @Version 1.0.0
 */
public class _169_多数元素 {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
            if (map.get(num) * 2> nums.length){
                return num;
            }
        }
        return -1;
    }
}
