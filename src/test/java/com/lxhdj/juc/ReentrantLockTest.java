package com.lxhdj.juc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    private static ReentrantLock reentrantLock = new ReentrantLock();

    public static void main(String[] args) {

        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(100);
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put(1, "a");

        Runnable runnable = () -> task();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
        }

        while (true) {

        }
//        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
//        reentrantReadWriteLock.readLock().lock();
//        reentrantReadWriteLock.writeLock().lock();

    }

    public static void task() {
        try {
            reentrantLock.lock();
            Thread.sleep(100000);
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getId() + ":" + i);
            }
//            System.out.println(Thread.currentThread());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

}
