package com.lxhdj.thread.pool;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.*;

@Slf4j
public class ThreadTest {
    private static Object lock = new Object();
    private static Object lockA = new Object();

    private Deque<Task> deque = new LinkedList<>();


    private static volatile int a = 0;

//    public static void main(String[] args) {
//        Thread thread1 = new Thread(() -> {
//            synchronized (lock) {
//                System.out.println("线程1 获得锁lock");
//                try {
//                    Thread.sleep(1000 * 100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(() -> {
//            synchronized (lock) {
//                System.out.println("线程2 获得锁lock");
//            }
//        });
//        thread1.start();
//        thread2.start();
////        thread2.
//    }


    public static void main(String[] args) {
        String[] strArr = new String[]{"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"};

    }

    public static String ArrayChallenge(String[] strArr) {

        Map<String, List<String>> mapA = new HashMap<>();
        Map<String, List<String>> mapB = new HashMap<>();


        // code goes here
        return strArr[0];
    }


    @Test
    public void test02() {
        Deque<Task> deque = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            Task task = new Task();
            task.setThreadName(String.valueOf(i));
            task.setIndex(i);
            deque.push(task);
        }
        while (!deque.isEmpty()) {
            System.out.println(deque.pop().getThreadName());
        }
    }


    @Test
    public void test01() {
        String[] threadNames = new String[]{"A", "B", "C", "D"};
        for (int i = 0; i < 100; i++) {
            Task task = new Task();
            task.setThreadName(threadNames[i % 4]);
            task.setIndex(i);
            deque.push(task);
        }
        System.out.println(JSON.toJSONString(deque));
        Runnable runnable = new RunnableImpl(deque);
        List<Thread> threadList = new ArrayList<Thread>();
        for (int i = 0; i < threadNames.length; i++) {
            threadList.add(new Thread(runnable, threadNames[i]));
        }
        for (int i = 0; i < threadList.size(); i++) {
            threadList.get(i).start();
        }
        while (true) {
            
        }
    }

    static class RunnableImpl implements Runnable {
        private Deque<Task> taskList;

        public RunnableImpl(Deque<Task> taskList) {
            this.taskList = taskList;
        }

        @Override
        public void run() {
            while (true) {
                synchronized (lock) {
//                    System.out.println(taskList.peek().getThreadName() + "======" + Thread.currentThread().getName());
                    while (!taskList.peek().getThreadName().equals(Thread.currentThread().getName())) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    Task task = taskList.pop();
                    System.out.println(Thread.currentThread().getName() + "----------" + task.getIndex());
                    lock.notifyAll();
                }
            }
        }
    }

    @Data
    static class Task {
        private String threadName;
        private Integer index;

        public String getThreadName() {
            return threadName;
        }

        public void setThreadName(String threadName) {
            this.threadName = threadName;
        }

        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }
    }
}
