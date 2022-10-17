package com.lxhdj.config;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.TimeUnit;

public class LocalCache {

    public void LocalCache() {
        System.out.println("111");
        try {

        } catch (Error error) {
            error.getMessage();
        }

    }

    public static void main(String[] args) {
        guavaCacheTest001();
    }

    public static void guavaCacheTest001() {
        LoadingCache<String, String> loadingCache = CacheBuilder.newBuilder().maximumSize(2)
                .expireAfterWrite(1000, TimeUnit.MILLISECONDS)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        System.out.println(key + "真正计算了！");
                        return "cache-" + key;
                    }
                });


        Runnable runnable = () -> System.out.println(loadingCache.getUnchecked("key1"));

        Thread[] threads = new Thread[10];
//        for (int i = 0; i < 10; i++) {
//            threads[i] = new Thread(runnable);
//        }
//        for (int i = 0; i < 10; i++) {
//            threads[i].start();
//        }
//
//        try {
//            Thread.sleep(1000 * 5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        for (int i = 0; i < 10; i++) {
//            threads[i] = new Thread(runnable);
//        }
//        for (int i = 0; i < 10; i++) {
//            threads[i].start();
//        }

        System.out.println(loadingCache.getUnchecked("key1"));
        try {
            Thread.sleep(1000 * 2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(runnable);
        }
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        System.out.println(loadingCache.getUnchecked("key1"));
//
//        System.out.println(loadingCache.getUnchecked("key2"));
//        System.out.println(loadingCache.getUnchecked("key2"));
    }
}
