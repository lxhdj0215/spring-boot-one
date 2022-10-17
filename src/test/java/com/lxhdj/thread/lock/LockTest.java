package com.lxhdj.thread.lock;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "bcd";


        char c = str.charAt(0);
        System.out.println(c);
        if (c + 1 == str1.charAt(0)) {
            System.out.println("================");
        }

        LockTest lockTest = new LockTest();
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        for (int i = 0; i < 100; i++) {
            queue.offer(i);
        }
//        while (!queue.isEmpty()) {
//            try {
//                System.out.println(queue.take());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.tryLock();
        Runnable runnable = () -> {
            while (true) {
                synchronized (lockTest) {
                    try {
                        System.out.println(Thread.currentThread().getId() + "=====" + queue.take());
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            threads[i] = thread;
        }
        for (Thread thread : threads) {
            thread.start();
        }
        while (true) {

        }

    }
}
