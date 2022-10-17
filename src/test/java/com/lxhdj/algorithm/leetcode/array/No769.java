package com.lxhdj.algorithm.leetcode.array;

public class No769 {
    public static void main(String[] args) {

    }

    public int maxChunksToSorted(int[] arr) {
        int len = arr.length;
        int ans = 0;
        int max = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(arr[i], max);
            if (max == i) {
                ans++;
            }
        }
        return ans;
    }
}
