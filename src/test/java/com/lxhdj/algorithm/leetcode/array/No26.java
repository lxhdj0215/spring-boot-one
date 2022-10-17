package com.lxhdj.algorithm.leetcode.array;

import java.util.Arrays;

public class No26 {
    public static void main(String[] args) {
//        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] nums = {1, 1, 1};
//        int[] nums = {1, 1, 2, 2};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums.length;
        }
        int left = 0;
        int right = 1;
        while (right < nums.length) {
            if (nums[right] != nums[left]) {
                if (right - left > 1) {
                    nums[left + 1] = nums[right];
                }
                left++;
            }
            right++;
        }
        return left + 1;
    }


}
