//package com.lxhdj.zk;
//
//import com.alibaba.fastjson.JSON;
//import com.lxhdj.DemoApplication;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {DemoApplication.class})
//@Slf4j
//public class ZkTest {
//
//    @Autowired
//    private ZkApi zkApi;
//
//
//    @Test
//    public void getChildrenTest() {
//        List<String> children = zkApi.getChildren("/wgj", false);
//        System.out.println(JSON.toJSONString(children));
//        for (String path : children) {
//            String data = zkApi.getData("/wgj/" + path, new WatcherApi());
//            System.out.println(data);
//        }
//        while (true) {
//
//        }
//    }
//
//    @Test
//    public void getDataTest() {
//        String value = zkApi.getData("/wgj", new WatcherApi());
//        System.out.println(value);
//    }
//
//    @Test
//    public void createTempNodeTest() {
//        zkApi.createTempNode("/temptest", "wgj");
//        try {
//            Thread.sleep(1000 * 10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    @Test
//    public void createSerialNodeTest() {
//        String str = zkApi.createSerialNode("/wgj", String.valueOf(System.currentTimeMillis()));
//        System.out.println(str);
//    }
//}
