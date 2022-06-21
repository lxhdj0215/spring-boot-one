package com.lxhdj.config;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

import java.util.concurrent.ExecutionException;

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

    public static void guavaCacheTest001(){
        LoadingCache<String, String> loadingCache = CacheBuilder.newBuilder().maximumSize(2)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        System.out.println(key+"真正计算了！");
                        return "cache-"+key;
                    }
                });

        try {
            String value = loadingCache.get("key1");
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println(loadingCache.getUnchecked("key1"));
        System.out.println(loadingCache.getUnchecked("key1"));

        System.out.println(loadingCache.getUnchecked("key2"));
        System.out.println(loadingCache.getUnchecked("key2"));
    }
}
