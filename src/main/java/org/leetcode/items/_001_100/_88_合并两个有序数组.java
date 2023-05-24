package org.leetcode.items._001_100;

/**
 * @Author: hujiangping
 * @Date: 2023/5/19 20:42
 * @Description: _88_合并两个有序数组
 * @Version 1.0.0
 */
public class _88_合并两个有序数组 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int c = m + n - 1;
        while(m > 0 && n > 0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[c] = nums1[m-1];
                m -= 1;
            }else{
                nums1[c] = nums2[n-1];
                n -= 1;
            }
            c -= 1;
        }
        while (n > 0){
            nums1[c--] = nums2[--n];
        }
    }

    public static void main(String[] args) {
        int[] n1 = {4,5,6,0,0,0};
        int[] n2 = {1,2,3};
        merge(n1,3,n2,3);
        System.out.println(n1);
    }
}
