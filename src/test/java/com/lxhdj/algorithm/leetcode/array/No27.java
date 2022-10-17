package com.lxhdj.algorithm.leetcode.array;

import java.util.Arrays;

public class No27 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        System.out.println(removeElement(nums, 3));
        System.out.println(Arrays.toString(nums));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        int end = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] == val) {
                count++;
                for (int j = i; j < end; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[end] = val;
                end--;
            }
        }
        return n - count;
    }
}
