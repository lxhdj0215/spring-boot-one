package com.lxhdj.algorithm.leetcode.array;

import java.util.Arrays;

public class No283 {

    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {0};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int end = len;
        for (int i = len - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                for (int j = i; j < end - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[end - 1] = 0;
                end = end - 1;
            }
        }
    }
}
