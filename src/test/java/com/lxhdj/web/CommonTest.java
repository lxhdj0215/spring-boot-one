package com.lxhdj.web;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;

public class CommonTest {

    public static void main(String[] args) {
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
    public void one() {
        byte[] bytes = new byte[3];
        bytes[0] = -1;
        bytes[1] = 127;
        bytes[2] = 127;
        for (byte b : bytes) {
            System.out.println(Integer.toBinaryString(b));
        }
        byte[] b1 = new byte[4];
        System.out.println(((bytes[0] & 11111100)));
        System.out.println("===" + ((bytes[0] & 11111100) >> 2));
        b1[0] = (byte) ((bytes[0] | 11111100) >> 2);
        for (byte b : b1) {
            System.out.println(b);
            System.out.println(Integer.toBinaryString(b));
        }
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
