package com.lxhdj.algorithm.leetcode.array;

import java.util.Arrays;

public class No667 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructArray(6, 3)));
    }

    public static int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        for (int i = 0; i < n - k - 1; i++) {
            ans[i] = i + 1;
        }
        int right = n;
        int left = n - k;
        int j = 0;
        for (int i = n - k - 1; i < n; i++) {
            if (j % 2 == 0) {
                ans[i] = left;
                left++;
            } else {
                ans[i] = right;
                right--;
            }
            j++;
        }
        return ans;
    }
}
