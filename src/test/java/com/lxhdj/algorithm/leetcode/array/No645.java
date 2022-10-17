package com.lxhdj.algorithm.leetcode.array;

public class No645 {


    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] - nums[i - 1] == 0) {
                ans[0] = nums[i];
            }
            if (i > 0 && nums[i] - nums[i - 1] > 1) {
                ans[1] = nums[i] - 1;
            }
        }
        if (nums[0] != 1) {
            ans[1] = 1;
        }
        if (nums[nums.length - 1] != nums.length) {
            ans[1] = nums.length;
        }
        return ans;
    }
}
