package com.lxhdj.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    static Map<Character, Integer> ori = new HashMap<Character, Integer>();
    static Map<Character, Integer> cnt = new HashMap<Character, Integer>();

    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // String str=input.next();
        System.out.println("hello world");
        int[] a = {1, 2, 3};
        int[] b = {1, 2};
        int[] arr = mergeAndSort(a, b);
        System.out.println(Arrays.toString(arr));

        System.out.println(minWindow("abcdef", "fd"));

    }
    public static String minWindow(String s, String t) {
        int tLen = t.length();
        for (int i = 0; i < tLen; i++) {
            char c = t.charAt(i);
            ori.put(c, ori.getOrDefault(c, 0) + 1);
        }
        int l = 0, r = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = s.length();
        while (r < sLen) {
            ++r;
            if (r < sLen && ori.containsKey(s.charAt(r))) {
                cnt.put(s.charAt(r), cnt.getOrDefault(s.charAt(r), 0) + 1);
            }
            while (check() && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = l + len;
                }
                if (ori.containsKey(s.charAt(l))) {
                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0) - 1);
                }
                ++l;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    public static boolean check() {
        Iterator iter = ori.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();
            if (cnt.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }



    public static int[] mergeAndSort(int[] a, int[] b) {
        if (a == null || b == null) {
            return null;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int aLength = a.length;
        int bLength = b.length;
        int[] ret = new int[aLength + bLength];
        int aIndex = 0;
        int bIndex = 0;
        int cIndex = 0;
        while (aIndex < aLength && bIndex < bLength) {
            if (a[aIndex] < b[bIndex]) {
                ret[cIndex] = a[aIndex];
                cIndex++;
                aIndex++;
            } else {
                ret[cIndex] = a[bIndex];
                cIndex++;
                bIndex++;
            }
        }
        if (aIndex < aLength) {
            for (int i = aIndex; i < aLength; i++) {
                ret[cIndex] = a[i];
                cIndex++;
            }
        } else {
            if (bIndex < bLength) {

            }
        }
        return ret;
    }
}
