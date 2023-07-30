package org.leetcode.items._201_300;

import java.util.ArrayList;
import java.util.List;

public class _228_汇总区间 {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String s = "";
            if (i + 1 < nums.length && nums[i+1] == nums[i] + 1){
                int index = i;
                while (index + 1 < nums.length){
                    if (nums[index+1] == nums[index] + 1){
                        index += 1;
                    }else {
                        break;
                    }
                }
                s = nums[i] + "->" + nums[index];
                i = index;
            }else {
                s = String.valueOf(nums[i]);
            }
            res.add(s);
        }
        return res;
    }
}
