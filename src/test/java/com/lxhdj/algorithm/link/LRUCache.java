package com.lxhdj.algorithm.link;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // 缓存是 {1=1}
        lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // 返回 1
        lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // 返回 -1 (未找到)
        lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // 返回 -1 (未找到)
        System.out.println(lRUCache.get(3));    // 返回 3
        System.out.println(lRUCache.get(4));    // 返回 4
    }

    static class DLinkedNode {
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;

        public DLinkedNode() {
        }

        public DLinkedNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int size = 0;
    int capacity;

    Map<Integer, DLinkedNode> cache = new HashMap<>();
    DLinkedNode head = new DLinkedNode();
    DLinkedNode tail = new DLinkedNode();

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node != null) {
            this.moveToHead(node);
            node.value = value;
            return;
        }
        node = new DLinkedNode(key, value);
        cache.put(key, node);
        this.addToHead(node);
        size++;
        if (size > capacity) {
            DLinkedNode tail = removeTail();
            cache.remove(tail.key);
            size--;
        }
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private DLinkedNode removeTail() {
        DLinkedNode prev = tail.prev;
        removeNode(prev);
        return prev;
    }

    private void removeNode(DLinkedNode node) {
        DLinkedNode next = node.next;
        DLinkedNode prev = node.prev;
        prev.next = next;
        next.prev = prev;
        node.next = null;
        next.prev = null;
    }


    private void addToHead(DLinkedNode node) {
        DLinkedNode next = head.next;

        head.next = node;
        node.next = next;

        node.prev = head;
        next.prev = node;
    }
}
