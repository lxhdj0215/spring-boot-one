package com.lxhdj.thread;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: wangguijun@meituan.com
 * @Date: 2022/3/14 9:27 下午
 */
public class ThreadLocalInit {
    static ThreadLocal<Integer> local = new ThreadLocal<Integer>(){

        @Override
        protected Integer initialValue() {
            return 100;
        }
    };

    public static void main(String[] args) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(2, 1);
        treeMap.put(1, 1);
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }



        System.out.println(local.get());
        local.set(200);
        local.remove();
        System.out.println(local.get());
    }
}
