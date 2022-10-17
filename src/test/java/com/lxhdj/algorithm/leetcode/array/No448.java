package com.lxhdj.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No448 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
        System.out.println(findDisappearedNumbers(new int[]{1, 1}));
        System.out.println(findDisappearedNumbers(new int[]{2, 2}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] - pre > 1) {
                for (int j = pre + 1; j < nums[i]; j++) {
                    ans.add(j);
                }
            }
            pre = nums[i];
        }
        for (int i = nums[nums.length - 1] + 1; i <= nums.length; i++) {
            ans.add(i);
        }
        return ans;
    }
}
