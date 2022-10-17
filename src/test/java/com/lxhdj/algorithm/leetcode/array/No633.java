package com.lxhdj.algorithm.leetcode.array;

public class No633 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(3));
        System.out.println(judgeSquareSum(2147483646));
    }

    public static boolean judgeSquareSum(int c) {
        boolean bol = false;
        int d = (int) Math.sqrt(c);
        for (int i = 0; i <= d; i++) {
            int a = (int) Math.sqrt(c - i * i);
            if (a * a + i * i == c) {
                return true;
            }
        }
        return bol;
    }
}
