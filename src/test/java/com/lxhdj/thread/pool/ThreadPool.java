package com.lxhdj.thread.pool;

import java.util.Random;
import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
//        Executors.newSingleThreadExecutor();
//        Executors.newCachedThreadPool();
//        Executors.newFixedThreadPool(1);
//        Executors.newScheduledThreadPool(1);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);
        Callable<String> callable = () -> {
            Random random = new Random();
            int i = random.nextInt(10);
            System.out.println("======" + Thread.currentThread().getName());
            if (i == 1) {
                throw new Exception();
            }
            return Thread.currentThread().getName();
        };
        for (int i = 0; i < 100; i++) {
            completionService.submit(callable);
        }
        try {
            Future<String> future;
            while ((future = completionService.take()) != null) {
                try {
                    System.out.println(future.get());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

//        for (int i = 0; i < 10; i++) {
//            try {
//                Future<String> future = completionService.take();
//                System.out.println(future.get());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } catch (ExecutionException e) {
//                e.printStackTrace();
//            }
//        }
//        ThreadPoolExecutor threadPoolExecutor =
//                new ThreadPoolExecutor(1, 1,
//                        0L, TimeUnit.MILLISECONDS,
//                        new LinkedBlockingQueue<>(10));
//        Future<String> submit = threadPoolExecutor.submit(callable);
    }
}
