package com.lxhdj.thread;

/**
 * @Author: wangguijun@meituan.com
 * @Date: 2022/3/14 9:05 下午
 */
public class JoinTest {
    public static void main(String[] args) throws InterruptedException {
        Thread threadA = new Thread(() -> System.out.println("A"));
        Thread threadB = new Thread(() -> System.out.println("B"));
        Thread threadC = new Thread(() -> System.out.println("C"));
        threadA.start();
        threadA.join();
        threadB.start();
        threadB.join();
        threadC.start();
        threadC.join();
        System.out.println("main");
    }
}
