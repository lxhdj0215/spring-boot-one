package com.lxhdj.kafka;

import com.lxhdj.DemoApplication;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.PartitionInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@Slf4j
public class KafkaTest {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Test
    public void sendTest() {
        String msg = "wgj";
        String s = UUID.randomUUID().toString();
        kafkaTemplate.send("wgjone", msg + s);
        List<PartitionInfo> partitionInfoList = kafkaTemplate.partitionsFor("wgjone");
        for (PartitionInfo info : partitionInfoList) {
            System.out.println(info.partition());
        }
    }

    @Test
    public void sendTest2() {
        kafkaTemplate.send("wgjone", "callbackMessage").addCallback(success -> {
            // 消息发送到的topic
            String topic = success.getRecordMetadata().topic();
            // 消息发送到的分区
            int partition = success.getRecordMetadata().partition();
            // 消息在分区内的offset
            long offset = success.getRecordMetadata().offset();
            System.out.println("发送消息成功:" + topic + "-" + partition + "-" + offset);
        }, failure -> {
            System.out.println("发送消息失败:" + failure.getMessage());
        });
        while (true) {

        }
    }
}
