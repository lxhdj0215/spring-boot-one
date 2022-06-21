package com.lxhdj.thread.pool;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolTest {
    @Test
    public void test01() {
        Callable<String> callable = () -> {
            String name = Thread.currentThread().getName();
            System.out.println("执行线程：" + name);
            return name;
        };
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(1, 2,
                        0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<>(2), new ThreadPoolExecutor.CallerRunsPolicy());

        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<String> future = threadPoolExecutor.submit(callable);
            futures.add(future);
        }
        try {
            for (Future<String> future : futures) {
                System.out.println(future.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
