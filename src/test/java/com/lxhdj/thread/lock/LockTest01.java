package com.lxhdj.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockTest01 {

    static ReentrantLock reentrantLock = new ReentrantLock();
    static volatile int i = 0;

    public static void main(String[] args) {

        Runnable runnable = () -> one();
        Thread[] threads = new Thread[10];
        for (Thread thread : threads) {
            thread = new Thread(runnable);
            thread.start();
        }
    }

    public static void one() {
        try {
            reentrantLock.lock();
            System.out.println(i);
            i++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();

        }
    }
}
