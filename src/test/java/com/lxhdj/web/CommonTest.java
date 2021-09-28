package com.lxhdj.web;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.junit.jupiter.api.Test;

public class CommonTest {

    @Test
    public void m1() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, -1);
        System.out.println(date.getTime());
        System.out.println(calendar.getTime().getTime());
    }

    @Test
    public void m2() {
        StringBuilder sb = new StringBuilder();
        sb.append("Test String");
        ///Users/wangguijun/Downloads/file.zip
        File f = new File("test.zip");
        ZipOutputStream out = null;
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            out = new ZipOutputStream(outputStream);
            ZipEntry e = new ZipEntry("mytext.txt");
            out.putNextEntry(e);

            byte[] data = sb.toString().getBytes();
            out.write(data, 0, data.length);
            out.closeEntry();

            out.close();

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            File destFile = new File("/Users/wangguijun/Downloads/file_.zip");
            FileOutputStream fileOutputStream = new FileOutputStream(destFile);
            fileOutputStream.write(outputStream.toByteArray());
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
