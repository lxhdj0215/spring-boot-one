package com.lxhdj.rocketmq.one;

import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;

//@Component
//@RocketMQMessageListener(consumerGroup = "springBootGroup", topic = "TestTopic")
@RocketMQMessageListener(consumerGroup = "test", topic = "example")
@Slf4j
public class SpringBootConsumer implements RocketMQListener {

    @Override
    public void onMessage(Object message) {
        log.info("Received message : {}", message);
    }
}

