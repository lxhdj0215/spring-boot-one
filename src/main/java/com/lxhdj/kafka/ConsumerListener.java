package com.lxhdj.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;

//@Component
@Slf4j
public class ConsumerListener {
//    private int i = 0;

    @KafkaListener(topics = "wgjone")
    public void listener(ConsumerRecord<?, ?> record) {
//        i++;
//        if (i % 1000 == 0) {
//            System.out.println(i);
//        }
        log.info("topic:{}, offset:{}, value:{}, partition:{}", record.topic(), record.offset(), record.value(), record.partition());
    }
}
