package com.lxhdj.algorithm.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class No454 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};
        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
        System.out.println(fourSumCount(new int[]{0}, new int[]{0}, new int[]{0}, new int[]{0}));
        System.out.println(fourSumCount(new int[]{-1, -1}, new int[]{-1, 1}, new int[]{-1, 1}, new int[]{1, -1}));
    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums1) {
            for (int b : nums2) {
                map.put(a + b, map.getOrDefault(a + b, 0) + 1);
            }
        }
        for (int c : nums3) {
            for (int d : nums4) {
                if (map.get(-c - d) != null) {
                    ans = ans + map.get(-c - d);
                }
            }
        }
        return ans;
    }
}
