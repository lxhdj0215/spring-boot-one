package com.lxhdj.thread.pool;

import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {

        StringBuffer buffer = new StringBuffer();
        buffer.append(1);
        String str = "";
        str.equals(str);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        Executors.newSingleThreadExecutor();
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);
        Callable<String> callable = () -> Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            completionService.submit(callable);
        }
        for (int i = 0; i < 10; i++) {
            try {
                Future<String> future = completionService.take();
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(1, 1,
                        0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<>(10));
        Future<String> submit = threadPoolExecutor.submit(callable);
    }
}
