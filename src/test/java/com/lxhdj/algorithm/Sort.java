package com.lxhdj.algorithm;

import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {

//    Random random = new Random();

    @Test
    public void sort() {
        List<String> list = new ArrayList<>();
        list.set(4, "aa");
        System.out.println(JSON.toJSONString(list));

        String str = "aab";
        System.out.println(str.substring(1, 2));
//        String str = "\"leetcode\"\n" +
//                "[\"leet\",\"code\"]"

//        String str = "leetcode";
//        str = str.replace("leet", "");
//        str = str.replace("code", "");
//        System.out.println(str);

        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);

        System.out.println(JSON.toJSONString(intervals));

    }

    @Test
    public void quickSortTest() {
//        int[] arr = {5, 6, 7, 4, 3, 2, 1};
        int[] arr = {3, 2, 1, 5, 6, 4};
        List<String> list = new ArrayList<>();
        list.toArray();
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = partiton_(nums, start, end);
        quickSort(nums, start, index - 1);
        quickSort(nums, index + 1, end);
    }

    public int partiton_(int[] nums, int start, int end) {
        int index = nums[start];
        int left = start;
        int right = end;
        while (left < right) {
            while (left < right && nums[right] >= index) {
                right--;
            }
            while (left < right && nums[left] <= index) {
                left++;
            }
            if (left < right) {
                swap(nums, left, right);
            }
        }
        swap(nums, start, right);
//        System.out.println(Arrays.toString(nums));
        return right;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    public int partition_(int[] a, int l, int r) {
        int x = a[r];
        int i = l;
        for (int j = l; j < r; ++j) {
            if (a[j] <= x) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i, r);
        return i;
    }

    public int partition(int[] a, int l, int r) {
        int x = a[l];
        int i = l + 1;
        for (int j = l + 1; j <= r; ++j) {
            if (a[j] <= x) {
                swap(a, i, j);
                i++;
            }
        }
        swap(a, i - 1, l);
        return i - 1;
    }
}
