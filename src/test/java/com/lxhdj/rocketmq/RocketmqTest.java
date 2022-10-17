package com.lxhdj.rocketmq;


import com.lxhdj.DemoApplication;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.client.producer.SendResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@Slf4j
public class RocketmqTest {

    @Autowired
    private SpringBootProducer springBootProducer;

//    @Autowired
//    private TransactionListener transactionListener;

    @Test
    public void sendTest() {
        for (int i = 0; i < 100; i++) {
            springBootProducer.sendMessage("example", i + "" + "-msg-" + System.currentTimeMillis());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        while (true) {

        }
    }

    @Test
    public void sendTrxTest() {
        String topic = "TrxTopic02";
        String tags = "TagsWgj";
        for (int i = 0; i < 1; i++) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String msg = simpleDateFormat.format(new Date()) + "-lxhdj";
            SendResult sendResult = springBootProducer.sendTrxMsg(topic, tags, msg);
            log.info("sendResult = {}", sendResult);
        }
        while (true) {

        }
    }


    @Test
    public void sendTest01() {
        String topic = "TestTopic";
        String tags = "TagsWgj";
        for (int i = 0; i < 100; i++) {
            String msg = i + "-wgj";
            SendResult sendResult = springBootProducer.sendMsg(topic, tags, msg);
        }
        while (true) {

        }
    }

}
