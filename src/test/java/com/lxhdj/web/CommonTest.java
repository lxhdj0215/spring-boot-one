package com.lxhdj.web;

import com.alibaba.fastjson.JSON;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.assertj.core.util.Lists;
import org.assertj.core.util.Maps;
import org.junit.jupiter.api.Test;

public class CommonTest {

    @Test
    public void m1() {

        List<String> list2 = Collections.emptyList();
        list2.add("111");
        list2.add("124");
        System.out.println(JSON.toJSONString(list2));

//        ArrayList<String> list = Lists.newArrayList("20000318","1141312","1113245","1113234");


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        Set<Integer> integers = map.keySet();
        integers.removeAll(list1);
        System.out.println(JSON.toJSONString(map));

        System.out.println("=========" + map.get(null));


        List<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.stream().forEach(item->{
            if ("1".equals(item)) {
                return;
            }
            System.out.println(item);
        });


        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, -1);
        System.out.println(date.getTime());
        System.out.println(calendar.getTime().getTime());
    }
}
