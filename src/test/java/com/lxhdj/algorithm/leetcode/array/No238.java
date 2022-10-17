package com.lxhdj.algorithm.leetcode.array;

import java.util.Arrays;

public class No238 {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(new No238().productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = left;
            left = nums[i] * left;
        }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right = nums[i] * right;
        }
        return ans;
    }
}
