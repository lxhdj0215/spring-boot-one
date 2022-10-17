package com.lxhdj.thread;

import java.util.Arrays;

public class Interview2 {

    public static void main(String[] args) {
        int[] source = {1, 2, 2, 5, 5, 5};

        //对原递增整数数组进行去重，并将数组内的数据"居左"
        distinct(source);

        //期待输出 1，2，5，-1，-1，-1
        System.out.println(Arrays.toString(source));

        int maxValue = Integer.MAX_VALUE;

    }


    public static void distinct(final int[] source) {
        int start = 1;
        int n = source.length;
        while (start < n) {
            int temp = source[start - 1];
            int j = start;
            while (source[j] == temp && j < n) {
                j++;
            }
            if (j == start) {
                start++;
                continue;
            }
            int count = j - start;
            for (int k = start; k < n - count; k++) {
                source[k] = source[k + count];
            }
            for (int k = n - 1; k >= n - count; k--) {
                source[k] = -1;
            }
            n = n - count;
            start++;
        }
    }

}

