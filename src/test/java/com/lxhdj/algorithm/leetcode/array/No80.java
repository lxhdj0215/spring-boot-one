package com.lxhdj.algorithm.leetcode.array;

import java.util.Arrays;

public class No80 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
//        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return nums.length;
        }
        int left = 2;
        int right = 2;
        while (right < nums.length) {
            if (nums[right] != nums[left - 2]) {
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}
