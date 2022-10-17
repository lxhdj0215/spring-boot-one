package com.lxhdj.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class No119 {
    public static void main(String[] args) {
        System.out.println(getRow(3));
        System.out.println(getRow(0));
        System.out.println(getRow(1));
        System.out.println(getRow(2));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
            }
            if (i > 0) {
                curr.add(1);
            }
            list.add(curr);
        }
        return list.get(list.size() - 1);
    }
}
