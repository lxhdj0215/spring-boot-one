package com.lxhdj.algorithm.leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class No697 {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(findShortestSubArray(nums));
    }

    public static int findShortestSubArray(int[] nums) {
        int ans = 0;
        int max = 0;
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                int[] arr = new int[3];
                arr[0] = 1;
                arr[1] = i;
                arr[2] = i;
                map.put(nums[i], arr);
            } else {
                map.get(nums[i])[0]++;
                map.get(nums[i])[2] = i;
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key)[0] > max) {
                max = map.get(key)[0];
                ans = map.get(key)[2] - map.get(key)[1] + 1;
            } else if (map.get(key)[0] == max) {
                ans = Math.min(map.get(key)[2] - map.get(key)[1] + 1, ans);
            }
        }
        return ans;
    }
}
