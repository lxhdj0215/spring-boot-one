package com.lxhdj.design;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton != null) {
            synchronized (Singleton.class) {
                if (singleton != null) {
                    singleton = new Singleton();
                }
            }
        }
//        Thread.sleep(1000);
        new Singleton().notify();
        return singleton;
    }
}
