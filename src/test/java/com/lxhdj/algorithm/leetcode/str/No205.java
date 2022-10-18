package com.lxhdj.algorithm.leetcode.str;

import java.util.HashMap;
import java.util.Map;

public class No205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
    }


    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map_ = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = map.get(s.charAt(i));
            if (character == null) {
                map.put(s.charAt(i), t.charAt(i));
            }
            Character character1 = map_.get(t.charAt(i));
            if (character1 == null) {
                map_.put(t.charAt(i), s.charAt(i));
            }
            if (character1 != null && !character1.equals(s.charAt(i))) {
                return false;
            }
            if (character != null && !character.equals(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
