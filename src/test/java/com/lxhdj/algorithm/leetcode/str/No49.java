package com.lxhdj.algorithm.leetcode.str;

import java.util.*;

public class No49 {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
        System.out.println(groupAnagrams(new String[]{""}));
        System.out.println(groupAnagrams(new String[]{"a"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(strs[i]);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }

    public static List<List<String>> groupAnagrams_(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) {
                continue;
            }
            visited[i] = true;
            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                if (check(strs[i], strs[j])) {
                    list.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(list);
        }
        return ans;
    }

    private static boolean check(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            mapA.put(s.charAt(i), mapA.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            mapB.put(t.charAt(i), mapB.getOrDefault(t.charAt(i), 0) + 1);
        }
        for (Character c : mapA.keySet()) {
            if (mapB.get(c) == null || !mapA.get(c).equals(mapB.get(c))) {
                return false;
            }
        }
        return true;
    }
}
