package com.lxhdj.algorithm.leetcode.array;

public class No768 {
    public static void main(String[] args) {
        System.out.println(maxChunksToSorted(new int[]{5, 4, 3, 2, 1}));
        System.out.println(maxChunksToSorted(new int[]{2, 1, 3, 4, 4}));
        //[4,2,2,1,1]
        System.out.println(maxChunksToSorted(new int[]{4, 2, 2, 1, 1}));
    }

    public static int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max <= i + 1) {
                ans++;
            }
        }
        return ans;
    }
}
