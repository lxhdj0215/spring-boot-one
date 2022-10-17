package com.lxhdj.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopK {
    public static void main(String[] args) {
        System.out.println(topK(new int[]{6, 5, 4, 3, 2, 1}, 2));
        System.out.println(topK_(new int[]{6, 5, 4, 3, 2, 1}, 2));
    }

    public static List<Integer> topK(int[] nums, int k) {
        int[] ans = new int[k];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(nums[i]);
                continue;
            }
            Integer peek = priorityQueue.peek();
            if (nums[i] < peek) {
                continue;
            }
        }
        return new ArrayList<>(priorityQueue);
    }

    public static List<Integer> topK_(int[] nums, int k) {
        int[] ans = new int[k];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < nums.length; i++) {
            if (priorityQueue.size() < k) {
                priorityQueue.offer(nums[i]);
                continue;
            }
            Integer peek = priorityQueue.peek();
            if (nums[i] > peek) {
                continue;
            }
            priorityQueue.poll();
            priorityQueue.offer(nums[i]);
        }
        return new ArrayList<>(priorityQueue);
    }
}
