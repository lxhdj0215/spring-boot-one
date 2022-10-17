package com.lxhdj.localcache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class LocalCache {

    public static LoadingCache<String, String> loadingCache = CacheBuilder.newBuilder().maximumSize(2)
//                .expireAfterWrite(1000, TimeUnit.MILLISECONDS)
            .build(new CacheLoader<String, String>() {
                @Override
                public String load(String key) throws Exception {
                    System.out.println(key + "真正计算了！");
                    return "cache-" + key;
                }
            });

    public static LoadingCache<String, String> getCache() {
        LoadingCache<String, String> loadingCache = CacheBuilder.newBuilder().maximumSize(2)
//                .expireAfterWrite(1000, TimeUnit.MILLISECONDS)
                .build(new CacheLoader<String, String>() {
                    @Override
                    public String load(String key) throws Exception {
                        System.out.println(key + "真正计算了！");
                        return "cache-" + key;
                    }
                });
        return loadingCache;
    }
}
