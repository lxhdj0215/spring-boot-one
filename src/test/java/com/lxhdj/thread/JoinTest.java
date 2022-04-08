package com.lxhdj.thread;

/**
 * @Author: wangguijun@meituan.com
 * @Date: 2022/3/14 9:05 下午
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread" + i);
            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            thread.join();
            System.out.println("main" + i);
        }
    }
}
