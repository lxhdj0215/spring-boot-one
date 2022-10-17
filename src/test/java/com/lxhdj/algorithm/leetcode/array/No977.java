package com.lxhdj.algorithm.leetcode.array;

import java.util.Arrays;

public class No977 {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
//        int[] nums = {-7,-3,2,3,11};
//        int[] nums = {-5, -3, -2, -1};
        System.out.println(Arrays.toString(new No977().sortedSquares(nums)));
    }

    public int[] sortedSquares(int[] nums) {
        int len = nums.length;
        int index = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] < 0) {
                index = i;
            }
        }
        int[] ans = new int[len];
        int left = index;
        int right = index + 1;
        int j = 0;
        while (left >= 0 || right < len) {
            if (left < 0) {
                ans[j] = nums[right] * nums[right];
                right++;
            } else if (right >= len) {
                ans[j] = nums[left] * nums[left];
                left--;
            } else if (Math.abs(nums[right]) < Math.abs(nums[left])) {
                ans[j] = nums[right] * nums[right];
                right++;
            } else {
                ans[j] = nums[left] * nums[left];
                left--;
            }
            j++;
        }
        return ans;
    }
}
