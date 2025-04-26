package org.leetcode.items._201_300;

import java.util.Iterator;

public class _284_顶端迭代器 {
    class PeekingIterator implements Iterator<Integer> {
        Iterator<Integer> iterator;
        Integer next;
        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            next = iterator.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer ret = next;
            next = iterator.hasNext() ? iterator.next() : null; return ret;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }
    }


    public static void main(String[] args) {
//        int[] n1 = {1,4,2,4,7,8,9,5};
//        int[] n2 = {1,2,4,5,7,8,9};

        int[] n1 = {1,4};
        int[] n2 = {1,4};
        System.out.println(findMaxPairs(n1,n2));
    }

    public static int findMaxPairs(int[] nums1,int[] nums2){
        int l1 = nums1.length;
        int l2 = nums2.length;

        int max = -1;
        int[][] dp = new int[l1][l2];
        for(int i = 0;i < l1;i++){
            for(int j = 0;j < l2;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = (nums1[i] == nums2[j] ? 1 : 0);
                } else{

                    dp[i][j] = Math.max(Math.max(dp[i][j-1],dp[i-1][j]) ,dp[i-1][j-1])+ (nums1[i] == nums2[j] ? 1 : 0);
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
}
