package com.lxhdj.algorithm.leetcode.array;

import java.util.Arrays;

public class No16 {
    public static void main(String[] args) {
//        int[] nums = {-1, 2, 1, -4};
//        int[] nums = {0,0,0};
        int[] nums = {1, 1, 1, 0};
//        System.out.println(threeSumClosest(nums, 1));
        System.out.println(threeSumClosest(nums, -100));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int ans = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                if (left > i + 1 && nums[left] == nums[left - 1]) {
                    left++;
                    continue;
                }
                if (nums[left] + nums[right] + nums[i] == target) {
                    return target;
                }
                if (Math.abs(nums[left] + nums[right] + nums[i] - target) < Math.abs(ans - target)) {
                    ans = nums[left] + nums[right] + nums[i];
                }
                if (nums[left] + nums[right] + nums[i] > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }
}
