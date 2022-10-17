package com.lxhdj.algorithm.leetcode.array;

public class No565 {
    public static void main(String[] args) {
//        int[] nums = {5, 4, 0, 3, 1, 6, 2};
        int[] nums = {0, 2, 1};
        System.out.println(new No565().arrayNesting(nums));
    }

    public int arrayNesting(int[] nums) {
        int max = 0;
        boolean[] exist = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (exist[i]) {
                continue;
            }
            int count = 0;
            int start = nums[i];
            do {
                exist[start] = true;
                count++;
                start = nums[start];
            } while (start != nums[i]);
            max = Math.max(count, max);
        }
        return max;
    }

}
