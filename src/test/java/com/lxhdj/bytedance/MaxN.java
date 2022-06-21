package com.lxhdj.bytedance;

import org.junit.jupiter.api.Test;

import java.util.*;

public class MaxN {
    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer();

//        StringBuffer buffer

//        linkedList.poll
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : map.keySet()) {

        }
        for (int v : map.values()) {

        }

        System.out.println(Math.sqrt(7));
        Set<Integer> set = new HashSet<>();
//        set.add()
//        System.out.println(Math.);
        System.out.println(Math.pow(10, 3));
        int[] A = {1, 2, 4, 9};
        int x = 2533;
        String xx = String.valueOf(x);
        System.out.println(my(A, xx, 0, 0));
    }

    public int scoreOfParentheses(String S) {
        return F(S, 0, S.length());
    }

    public int F(String S, int i, int j) {
        //Score of balanced string S[i:j]
        int ans = 0, bal = 0;

        // Split string into primitives
        for (int k = i; k < j; ++k) {
            bal += S.charAt(k) == '(' ? 1 : -1;
            if (bal == 0) {
                if (k - i == 1) {
                    ans++;
                } else {
                    ans += 2 * F(S, i + 1, k);
                } ;
                i = k + 1;
            }
        }

        return ans;
    }

    @Test
    public void fillTest() {
        StringBuffer buffer = new StringBuffer();
        buffer.length();
        buffer.reverse().toString();
        int[] arr = {2, 4, 9};
        int x = 2533;
        Deque<Integer> deque = new LinkedList<>();
        fill(String.valueOf(2111), 0, arr, deque);
        System.out.println(new LinkedList<>(deque));
    }

    public boolean fill(String target, int i, int[] arr, Deque<Integer> deque) {
        int len = target.length();
        int val = target.charAt(i) - '0';
        int max = binarySearch(arr, val);
        if (i == len - 1) {
            if (arr[max] == val || max == -1) {
                return false;
            }
            deque.push(arr[max]);
            return true;
        }
        if (max == -1 && i == 0) {
            for (int j = 0; j < len - 1; j++) {
                deque.push(arr[arr.length - 1]);
            }
            return true;
        }
        if (max == -1) {
            return false;
        }
        if (arr[max] < val) {
            deque.push(arr[max]);
            for (int j = i + 1; j < len; j++) {
                deque.push(arr[arr.length - 1]);
            }
            return true;
        }
        // arr[max] == val
        deque.push(arr[max]);
        boolean bol = fill(target, i + 1, arr, deque);
        if (bol) {
            return true;
        } else {
            deque.pop();

            return false;
        }
    }

    @Test
    public void getMaxTest() {
        int[] A = {1, 2, 4, 9};
        int x = 2533;
        System.out.println(getMax(String.valueOf(2533), A));
        System.out.println(getMax(String.valueOf(2111), A));
        System.out.println(getMax(String.valueOf(1111), A));
    }

    public int getMax(String str, int[] arr) {
        int arrLen = arr.length;
        int[] res = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - '0';
            int max = binarySearch(arr, a);
            if (max == -1) {
                int index = i - 1;
                while (index >= 0) {
                    int temp = binarySearch(arr, res[index] - 1);
                    if (temp != -1) {
                        res[index] = arr[temp];
                        return getMax(res, index, str.length() - index - 1, arr[arrLen - 1]);
                    }
                    index--;
                }
                return fill(str.length() - 1, arr[arrLen] - 1);
            } else if (arr[max] == a) {
                if (i == str.length() - 1) {
                    int index = i - 1;
                    while (index >= 0) {
                        int temp = binarySearch(arr, res[index] - 1);
                        if (temp != -1) {
                            res[index] = arr[temp];
                            return getMax(res, index, str.length() - index - 1, arr[arrLen - 1]);
                        }
                        index--;
                    }
                    return fill(str.length() - 1, arr[arrLen - 1]);
                }
                res[i] = a;
            } else if (arr[max] < a) {
                res[i] = arr[max];
                return getMax(res, i, str.length() - i - 1, arr[arrLen - 1]);
            }
        }
        return 0;
    }

    public int getMax(int[] res, int resEnd, int maxN, int arrMax) {
        int sum = 0;
        for (int i = 0; i <= resEnd; i++) {
            sum = sum * 10 + res[i];
        }
        for (int i = 0; i < maxN; i++) {
            sum = sum * 10 + arrMax;
        }
        return sum;
    }

    public int fill(int n, int max) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum * 10 + max;
        }
        return sum;
    }


    @Test
    public void serarchTest() {
        int[] arr = {1, 2, 3, 5, 6};
        int target = 3;
        System.out.println(binarySearch(arr, 3));
        System.out.println(binarySearch(new int[]{1, 2, 3, 3, 3}, 3));
        System.out.println(binarySearch(arr, 6));
        System.out.println(binarySearch(arr, 5));
        System.out.println(binarySearch(arr, 4));
        System.out.println(binarySearch(arr, 7));
        System.out.println(binarySearch(arr, -10));
        System.out.println(binarySearch(arr, 0));
        System.out.println(binarySearch(arr, 2));

    }


    /**
     * 搜索小于等于目标值
     *
     * @param arr
     * @param target
     * @return
     */
    public int binarySearch(int[] arr, int target) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int ret = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
                ret = mid;
            } else {
                high = mid - 1;
            }
        }
        return ret;
    }


    public static int my(int[] A, String xx, int i, int max) {
        if (i > xx.length()) {
            return 0;
        }
        //如果 i不等于0  以及  max == 之前的数
        //就要继续做小于等于
        //不然就后面全部填最大数
        if (i == 0) {
            //获取当前要判断的数
            int c = (int) xx.charAt(i) - '0';
            for (int a : A) {
                if (a <= c && max < a) {
                    max = a;
                }
            }
            i++;
            return max * (int) Math.pow(10, A.length - i) + my(A, xx, i, max);
        }
        if (i > 0 && max == xx.charAt(i - 1) - '0') {
            max = 0;
            //获取当前要判断的数
            int c = xx.charAt(i) - '0';
            for (int a : A) {
                if (a <= c && max < a) { // 如果
                    max = a;
                }
            }
            i++;
            return max * (int) Math.pow(10, A.length - i) + my(A, xx, i, max);
        } else {
            max = 0;
            int big = Arrays.stream(A).max().getAsInt();
            for (int q = i; q < A.length; q++) {
                max = max + big * (int) Math.pow(10, q - i);
            }
            return max;
        }
    }
}
