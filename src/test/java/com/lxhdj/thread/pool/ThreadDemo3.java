package com.lxhdj.thread.pool;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class ThreadDemo3 {
    public static void main(String[] args) {
        RunnableImpl runnable = new RunnableImpl(100, 1);

        String[] threadNames = new String[]{"A", "B", "C", "D"};

        List<Thread> threadList = new ArrayList<Thread>();
        for (int i = 0; i < threadNames.length; i++) {
            threadList.add(new Thread(runnable, threadNames[i]));
        }
        runnable.setThreadList(threadList);
        for (int i = 0; i < threadList.size(); i++) {
            threadList.get(i).start();
        }
    }


    private static class RunnableImpl implements Runnable {
        private int count;
        private int index;
        private List<Thread> threadList;
        private Object lock = new Object();

        public RunnableImpl(int count, int index) {
            this.index = index;
            this.count = count;
        }

        private void setThreadList(List<Thread> threadList) {
            this.threadList = threadList;
        }

        @Override
        public void run() {
            while (index < count) {
                synchronized (lock) {
                    if (Thread.currentThread().getName().equals("A")) {
                        while (index % 4 != 1) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                break;
                            }
                        }
                    } else if (Thread.currentThread().getName().equals("B")) {
                        while (index % 4 != 2) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                break;
                            }
                        }
                    } else if (Thread.currentThread().getName().equals("C")) {
                        while (index % 4 != 3) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                break;
                            }
                        }
                    } else if (Thread.currentThread().getName().equals("D")) {
                        while (index % 4 != 0) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                break;
                            }
                        }
                    }
                    if (index > count) {
                        this.interrupt();
                        break;
                    }
                    log.info("{} ---->{}", Thread.currentThread().getName(), index);
                    index++;
                    lock.notifyAll();
                }
            }

        }

        private void interrupt() {
            for (int i = 0; i < threadList.size(); i++) {
                threadList.get(i).interrupt();
            }
        }
    }
}