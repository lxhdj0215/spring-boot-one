package com.lxhdj.gc;

import java.util.ArrayList;
import java.util.List;

public class GCTest {
    public static void main(String[] args) {
        List<byte[]> list = new ArrayList<>();
        String str = "wgj";
        byte[] bytes = new byte[1024];
        while (true) {
//            try {
//                Thread.sleep(5);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            list.add(bytes);
        }
    }
}
