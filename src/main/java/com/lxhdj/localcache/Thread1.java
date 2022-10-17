package com.lxhdj.localcache;

public class Thread1 {
    public static void main(String[] args) {
        System.out.println(LocalCache.loadingCache.getUnchecked("key1"));
    }
}
