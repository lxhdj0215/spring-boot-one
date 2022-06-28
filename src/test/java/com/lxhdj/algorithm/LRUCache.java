package com.lxhdj.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    public static void main(String[] args) {
        LRUCache<String, String> cache = new LRUCache<>(2);

        cache.put("a", "abstract");
        cache.put("b", "basic");
        cache.put("c", "call");
        cache.get("a");
        cache.get("b");


        cache.put("d", "call");
        System.out.println(cache);


//        LRUCache<String, String> lruCache = new LRUCache<>(2);
//        lruCache.put("1", "a");
//        lruCache.put("2", "b");
//        lruCache.put("3", "c");
//        lruCache.put("4", "d");
//        lruCache.get("1");
//        lruCache.get("2");
//        System.out.println(JSON.toJSONString(lruCache));
    }

    private int maxEntries;

    public LRUCache(int maxEntries) {
        super(16, 0.75f, true);
        this.maxEntries = maxEntries;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxEntries;
    }
}