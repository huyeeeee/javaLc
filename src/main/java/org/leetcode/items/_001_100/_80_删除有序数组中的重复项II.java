package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/13 15:33
 * @Description: _80_删除有序数组中的重复项II
 * @Version 1.0.0
 */
public class _80_删除有序数组中的重复项II {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        int count = 0;
        int n = 1;
        for (int i = 0; i < nums.length;i++) {
            if (count == i) continue;
            if (nums[count] != nums[i]) {
                n = 1;
                count += 1;
                nums[count] = nums[i];
            }else {
                n += 1;
                if (n >= 3){
                    int j = i;
                    while (j < nums.length - 1 && nums[j] == nums[j+1]){
                        j+=1;
                    }
                    nums[count] = nums[j];
                }else {
                    count += 1;
                    nums[count] = nums[i];
                }
            }
        }
        return count + 1;
    }

    public static void main(String[] args) {
        int[] n = {1,2};
        System.out.println(removeDuplicates(n));
    }
}
