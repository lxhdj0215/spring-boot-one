package com.lxhdj.common;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CommonTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("/user/{id}", "UserController");
        String s = map.get("/user/123");


        StringBuffer buffer = new StringBuffer();
        buffer.append("");

        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "A");
    }
}
