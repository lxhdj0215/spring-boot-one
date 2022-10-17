package com.lxhdj.algorithm.leetcode.array;

public class No485 {
    public static void main(String[] args) {
//        int[] nums = {1, 1, 0, 1, 1, 1};
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                max++;
            } else {
                max = 0;
            }
            ans = Math.max(ans, max);
        }
        return ans;
    }
}
