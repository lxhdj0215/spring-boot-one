package com.lxhdj.web;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class CommonTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread2;
        Thread thread1;
        thread1= new Thread(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1");
        });
        thread2= new Thread(() -> {
            System.out.println("2");
        });
//        thread2.join();
        thread2.start();
        thread1.start();
        thread1.interrupt();
//        thread1.join();
        System.out.println("3");
    }

    public void aaa() {
        int a = 10;

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "wgj");


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        System.out.println(simpleDateFormat.format(new Date()));

        String str = "wgj";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        byte[] encode = Base64.getEncoder().encode(bytes);
        for (byte b : bytes) {
            System.out.println(Integer.toBinaryString(b));
        }
//        System.out.println(Arrays.toString(str.getBytes(StandardCharsets.UTF_8)));


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的姓名：");
            String name = sc.nextLine();
            System.out.println("请输入你的年龄：");
            int age = sc.nextInt();
            System.out.println("请输入你的工资：");
            float salary = sc.nextFloat();
            System.out.println("你的信息如下：");
            System.out.println("姓名: " + name + "\n" + "年龄：" + age + "\n" + "工资：" + salary);
            sc.close(); // 注意, 要记得调用关闭方法

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void m1() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(null, "123");
        map.put(null, "124");
        System.out.println(map.get(null));
    }


    @Test
    public void one() throws ParseException {

        // 日期格式化
        DateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = simpleFormat.parse("2019-12-25");
        Date endDate = new Date();
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        int days = (int) ((endTime - startTime) / (1000 * 60 * 60 * 24));
        System.out.println("两个时间之间的天数间隔为：" + days);

        LocalDate birthday = LocalDate.parse("2019-12-25");
        LocalDate now = LocalDate.now();

        Period p = Period.between(birthday, now);
        System.out.println(p.getYears());//获取相距年份
        System.out.println(p.getMonths());//获取相距年份余下的月份
        System.out.println(p.getDays());//获取相距月份余下的天数
    }

    public static String reverse(String str) {
        Deque<String> stack = new LinkedList<>();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                if (buffer.length() != 0) {
                    stack.push(buffer.toString());
                    buffer = new StringBuffer();
                }
                continue;
            }
            buffer.append(c);
        }
        stack.push(buffer.toString());
        return String.join(" ", stack);
    }

    @Test
    public void test() {
        Deque<String> stack = new LinkedList<>();
//        stack.push();
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.remove();
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

}
