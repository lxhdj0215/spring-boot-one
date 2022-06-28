package com.lxhdj.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: wangguijun@meituan.com
 * @Date: 2022/3/14 9:38 下午
 */
public class ThreadPoolProblem {
    static ThreadLocal<AtomicInteger> sequencer = new ThreadLocal<AtomicInteger>() {

        @Override
        protected AtomicInteger initialValue() {
            return new AtomicInteger(0);
        }
    };

    static class Task implements Runnable {

        @Override
        public void run() {
            AtomicInteger s = sequencer.get();
            int initial = s.getAndIncrement();
            // 期望初始为0
            System.out.println(initial);
        }
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Executors.newSingleThreadExecutor();
        Executors.newCachedThreadPool();
        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());
        executor.shutdown();
    }
}
