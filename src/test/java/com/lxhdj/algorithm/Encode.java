package com.lxhdj.algorithm;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encode {
    public static void main(String[] args) {
        char c = 'z';
        System.out.println((int)c);
        System.out.println(Integer.toBinaryString(0x3f));
        System.out.println(Integer.toBinaryString(0b00111111));
        String str = "wgjsdfasfasfasfasfasfasfasdfd";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (byte b : bytes) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println();
        int sp0 = 0;
        int bits = (bytes[sp0++] & 0xff) << 16 |
                (bytes[sp0++] & 0xff) <<  8 |
                (bytes[sp0++] & 0xff);
        System.out.println(Integer.toBinaryString(bits));

        byte[] encode = Base64.getEncoder().encode(bytes);
        for (byte b : encode) {
            System.out.print(Integer.toBinaryString(b) + " ");
        }
        System.out.println(new String(encode));
    }
}
