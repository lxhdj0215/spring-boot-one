package com.lxhdj.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 1};
        System.out.println(new Main1().findShortestSubArray(nums));;
    }

    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> mapCount = new HashMap<>();
        Map<Integer, Integer> mapStart = new HashMap<>();
        Map<Integer, Integer> mapEnd = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer count = mapCount.get(nums[i]);
            if (count != null) {
                mapCount.put(nums[i], count + 1);
            } else {
                mapCount.put(nums[i], 1);
            }
            Integer start = mapStart.get(nums[i]);
            if (start == null) {
                mapStart.put(nums[i], i);
            }
            mapEnd.put(nums[i], i);
        }
        Integer max = nums[0];
        int len = mapEnd.get(max) - mapStart.get(max);
        for (Integer key : mapCount.keySet()) {
            if (mapCount.get(key) > mapCount.get(max)) {
                max = key;
                len = mapEnd.get(max) - mapStart.get(max) + 1;
            }
            if (mapCount.get(key) == mapCount.get(max) && (mapEnd.get(key) - mapStart.get(key) + 1) < len) {
                max = key;
                len = mapEnd.get(max) - mapStart.get(max) + 1;
            }
        }
        return len;

    }

    public static String ArrayChallenge(String[] strArr) {
        List<ListNode> listNodes = new ArrayList<>();
        for (String str : strArr) {
            System.out.println(str);
            String str1 = str.substring(1, str.length() - 1);
            System.out.println(str1);
            String[] strs = str1.split(",");
            System.out.println();
            int children = Integer.valueOf(strs[0]);
            int parent = Integer.valueOf(strs[1]);
            ListNode listNode = null;
            for (ListNode node : listNodes) {
                if (node.val == parent) {
                    listNode = node;
                    break;
                }
            }
            if (listNode == null) {
                listNode = new ListNode(parent);
                List<ListNode> childrens = new ArrayList<>();
                listNode.childrens = childrens;
                listNodes.add(listNode);
            }
            listNode.childrens.add(new ListNode(children));
        }

        for (ListNode node : listNodes) {
            if (node.childrens.size() > 2) {
                return "false";
            }
        }


        // code goes here
        return "true";
    }

    static class ListNode {
        int val;
        List<ListNode> childrens;
        List<ListNode> parents;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }
    }
}
