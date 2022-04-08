package com.lxhdj.web;

import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.Stack;
import org.junit.jupiter.api.Test;

public class CommonTest {

    @Test
    public void m6() {
        Random random = new Random();
        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        while (true) {
            int i = random.nextInt(100);
//            try {
//                Thread.sleep(3);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            if (i < 30) {
                a++;
            } else if (i < 50) {
                b++;
            } else {
                c++;
            }
            count++;
            if (count == 1000) {
                break;
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public int myAtoi(String s) {
        s = s.trim();
        boolean flag = true;
        if (s.charAt(0) == '-') {
            flag = false;
        }
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                continue;
            }
            ans = ans * 10 + s.charAt(i);
        }
        if (!flag) {
            return -ans;
        }
        return ans;
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int n = s.length();
        int fast = 0;
        int slow = 0;
        while (fast < n) {
            int count = 0;
            if (fast == slow) {
                count++;
            }
            int temp = slow;
            while (temp <= fast) {
                if (s.charAt(fast) != s.charAt(temp)){
                    temp++;
                    count++;
                } else {
                    slow = temp + 1;
                    break;
                }
            }
            max = Math.max(count, max);
            fast++;
        }
        return max;
    }


    public String findLongestWord(String s, List<String> dictionary) {
        int max = 0;
        String ans = null;
        for (String str : dictionary) {
            if (equal(str, s)) {
                if (ans == null) {
                    ans = str;
                } else {
                    int length = str.length();
                    if (length > ans.length()) {
                        ans = str;
                    }
                }
            }
        }
        return ans;
    }

    public boolean equal(String a, String target) {
        int n = target.length();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (target.charAt(i) == a.charAt(index)) {
                index++;
                if (index == a.length()) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        boolean[] flag = new boolean[n];
        char [] arr = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (flag[i]) {
                continue;
            }
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            for (int j = i; j < n; j++) {
                if (flag[i]) {
                    continue;
                }
                if (s.charAt(j) == c1) {
                    arr[j] = c2;
                    flag[j] = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return new String(arr).equals(t);
    }

    @Test
    public void m5() {
        int[][] matrix = {{7, 9, 6}};
        System.out.println(spiralOrder(matrix));
    }


    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null) {
            return null;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        if (rows == 0 || columns == 0) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int left = 0;
        int right = columns - 1;
        int top = 0;
        int bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            for (int i = top + 1; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            if (top < bottom) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
                for (int i = bottom - 1; i > top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return list;
    }


    @Test
    public void m3() {
        Set<Integer> set = new HashSet<>();

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        this.removeElement(arr, 2);
    }

    @Test
    public void m4() {

        int[] arr = {5, 4, 0, 3, 1, 6, 2};
        System.out.println(this.arrayNesting(arr));
    }

    public int arrayNesting(int[] nums) {
        int max = 0;
        int n = nums.length;
        for ( int i = 0; i < n; i++) {
            int start = nums[i];
            int count = 0;
            do {
                start = nums[start];
                count++;
            } while (start != nums[i]);
            max = Math.max(count, max);
        }
        return max;
    }

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        while(left < right) {
            while (left < right && nums[right] == val) {
                right--;
            }
            while (left < right && nums[left] != val) {
                left++;
            }
            if (left < right && nums[left] == val) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right--;
                left++;
            }
        }
        return left;
    }

    /**
     * 单调栈 给的一个无序正整数数组，找出数组中每个元素右边第一个比它大的元素，没有输出-1 输入:
     * [4, 3, 4, 5, 1, 2]
     * 输出:
     * [5, 4, 5, -1, 2, -1]
     */

    @Test
    public void m2() {
        int[] arr = {4, 3, 4, 5, 1, 2};
        int[] ret = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                ret[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            ret[stack.pop()] = -1;
        }
        System.out.println(Arrays.toString(ret));


    }



    @Test
    public void m1() {
        List<Integer> list = new ArrayList<>();


        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());

    }
}
