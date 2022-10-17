package com.lxhdj.thread.trace;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;
import com.alibaba.ttl.threadpool.TtlExecutors;
import org.junit.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TransmittableThreadLocalTest {
    @Test
    public void test01() {
        TransmittableThreadLocal<String> context = new TransmittableThreadLocal<>();
        // 在父线程中设置
        context.set("value-set-in-parent");
        // 在子线程中可以读取，值是"value-set-in-parent"
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "：" + context.get());
        });
        context.set("value-set-in-parent-01");
        thread.start();
//        String value = context.get();
        System.out.println(Thread.currentThread().getName() + ":" + context.get());

    }

    @Test
    public void test02() {
        TransmittableThreadLocal<String> context = new TransmittableThreadLocal<>();
        // 在父线程中设置
        context.set("value-set-in-parent");
        Runnable task = () -> System.out.println(Thread.currentThread().getName() + "=====" + context.get());
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        for (int i = 1; i < 11; i++) {
            context.set("value-set-in-parent" + i);
            // 额外的处理，生成修饰了的对象ttlRunnable
            Runnable ttlRunnable = TtlRunnable.get(task);
            executorService.submit(ttlRunnable);
        }
        // Task中可以读取，值是"value-set-in-parent"
        String value = context.get();
    }

    @Test
    public void test03() {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        // 额外的处理，生成修饰了的对象executorService
        executorService = TtlExecutors.getTtlExecutorService(executorService);

        TransmittableThreadLocal<String> context = new TransmittableThreadLocal<>();

        // =====================================================

        // 在父线程中设置
        context.set("value-set-in-parent");

        Runnable task = () -> System.out.println(Thread.currentThread().getName() + "=====" + context.get());
        Callable call = () -> {
            System.out.println(Thread.currentThread().getName() + "=====" + context.get());
            return context.get();
        };
//        executorService.submit(task);
//        executorService.submit(call);

        for (int i = 1; i < 11; i++) {
            context.set("value-set-in-parent" + i);
            executorService.submit(task);
        }

        // =====================================================

        // Task或是Call中可以读取，值是"value-set-in-parent"
        String value = context.get();
    }
}
