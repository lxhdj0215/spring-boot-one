package com.lxhdj.thread.pool;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolTest {
    @Test
    public void test02() {
        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(10, 10,
                        0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<>(100), new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 0; i < 100; i++) {
            int taskId = i;
            Runnable task = () -> {
                System.out.println("thread name-" + Thread.currentThread().getName() + ",task-" + taskId);
            };
            threadPoolExecutor.submit(task);
        }
    }

    @Test
    public void test03() {
        TransmittableThreadLocal<String> context = new TransmittableThreadLocal<>();

        // =====================================================
        // 在父线程中设置
        context.set("value-set-in-parent");

        Runnable task = () -> {
            System.out.println(context.get());
        };
        // 额外的处理，生成修饰了的对象ttlRunnable
        Runnable ttlRunnable = TtlRunnable.get(task);

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(ttlRunnable);

        // =====================================================

        // Task中可以读取，值是"value-set-in-parent"
        String value = context.get();
        System.out.println("main:" + value);
    }

    @Test
    public void test01() {
        ThreadLocal<Integer> local = new ThreadLocal<>();
        TransmittableThreadLocal<String> context = new TransmittableThreadLocal<>();
        context.set("value-set-in-parent");
        local.set(10);

        Callable<String> callable = () -> {
//            if (true) {
//                throw new NullPointerException();
//            }
//            Thread.sleep(1000 * 100);
            String value = context.get();
            System.out.println("=========" + value);
            String name = Thread.currentThread().getName();
//            System.out.println("local = " + local.get());
//            System.out.println("执行线程：" + name);
            return name;
        };


        ThreadPoolExecutor threadPoolExecutor =
                new ThreadPoolExecutor(1, 1,
                        0L, TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<>(), new ThreadPoolExecutor.CallerRunsPolicy());

        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            context.set("value-set-in-parent" + "-" + i);
            Future<String> future = threadPoolExecutor.submit(callable);
            futures.add(future);
        }
        try {
            for (Future<String> future : futures) {
                System.out.println(future.get(1, TimeUnit.SECONDS));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
        Integer integer = local.get();
        System.out.println(integer);
    }
}
