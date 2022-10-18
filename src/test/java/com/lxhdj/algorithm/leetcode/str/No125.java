package com.lxhdj.algorithm.leetcode.str;

public class No125 {
    public static void main(String[] args) {
//        System.out.println(Character.isLetter('a'));
//        System.out.println(Character.isLetter(' '));
//        System.out.println(Character.isLetter(','));

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("race a car"));
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
