package com.lxhdj.thread.pool;

public class ABTest {
    private static Object lock = new Object();

    private static volatile boolean fire = false;


    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                synchronized (lock) {
                    try {
                        if (fire) {
                            System.out.println(Thread.currentThread().getId());
                            fire = false;
                            lock.wait();
                        } else {
                            lock.notify();
                            fire = true;
                        }
//                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(runnable);
        thread1.start();
//        System.out.println("main thread");
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        synchronized (lock) {
//            lock.notify();
//        }
    }
}
