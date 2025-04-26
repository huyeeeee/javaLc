package org.example;


/**
 * 一个排好序的数组，但可能有重复数据，例如 {1, 1, 1, 3, 4, 5, 6}，查找是否有目标数字，没有返回-1，有的话返回在数组中出现的第一次的位置
 */
public class Find {
    public static int findFirstMeetOne(int[] nums,int target){
        int left = 0;
        int right = nums.length - 1;
        boolean hasSame = false;
        while (left <= right){
            int mid = (right - left) /2 + left;
            int num = nums[mid];
            if (num == target){
                int tempIndex = mid;
                while (tempIndex > 0 && nums[tempIndex] == target){
                    hasSame = true;
                    tempIndex -= 1;
                }
                return hasSame ? tempIndex+1 : tempIndex;
            }else if (num > target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 1, 1, 1, 3, 4, 5, 6};
        System.out.println(findFirstMeetOne(nums,0));
    }
}
