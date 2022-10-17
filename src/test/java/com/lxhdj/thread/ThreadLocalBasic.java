package com.lxhdj.thread;

/**
 * @Author: wangguijun@meituan.com
 * @Date: 2022/3/14 9:24 下午
 */
public class ThreadLocalBasic {
    static ThreadLocal<Integer> local = new ThreadLocal<>();
    static InheritableThreadLocal<Integer> integerInheritableThreadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) throws InterruptedException {
        integerInheritableThreadLocal.set(11);
        Thread child = new Thread() {
            @Override
            public void run() {
                System.out.println("child thread initial: " + local.get());
                System.out.println("integerInheritableThreadLocal child thread initial: " + integerInheritableThreadLocal.get());
                local.set(200);
                System.out.println("child thread final: " + local.get());
            }
        };
        local.set(100);
        child.start();
        child.join();
        local.remove();
        System.out.println("main thread final: " + local.get());
        System.out.println("integerInheritableThreadLocal main thread final: " + integerInheritableThreadLocal.get());
    }
}
