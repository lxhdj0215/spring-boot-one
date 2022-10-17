package com.lxhdj.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class No18 {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
//        System.out.println(fourSum(nums, 0));
        System.out.println(fourSum(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296));
        System.out.println(fourSum_(new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296));
//        long l = 1000000000 + 1000000000 + 1000000000 + 1000000000;
//        System.out.println(l);
    }
    public static List<List<Integer>> fourSum_(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        if(nums == null || nums.length < 4) {
            return list;
        }
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < length - 3; i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j = i + 1; j < length - 2; j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int k = j + 1;
                int m = length - 1;
                while(k < m) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[m];
                    if(sum == target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[m]));
                        int k0 = k + 1;
                        while(k0 < m && nums[k0] == nums[k]) {
                            k0++;
                        }
                        k = k0;
                        int m0 = m - 1;
                        while(k < m0 && nums[m0] == nums[m]) {
                            m0--;
                        }
                        m = m0;
                    } else if(sum < target) {
                        int k0 = k + 1;
                        while(k0 < m && nums[k0] == nums[k]) {
                            k0++;
                        }
                        k = k0;
                    } else {
                        int m0 = m - 1;
                        while(k < m0 && nums[m0] == nums[m]) {
                            m0--;
                        }
                        m = m0;
                    }
                }
            }
        }
        return list;    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    if (left > j + 1 && nums[left] == nums[left - 1]) {
                        left++;
                        continue;
                    }
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);
                        left++;
                        right--;
                        continue;
                    } else if (sum > target) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
        return ans;
    }
}
