//package com.lxhdj.rocketmq;
//
//import lombok.Getter;
//import lombok.Setter;
//import lombok.ToString;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Getter
//@Setter
//@ToString
////@Configuration
//@ConfigurationProperties(prefix = "rocketmq.consumer")
//@Slf4j
//public class MQConsumerConfigure {
//
//    private String groupName;
//    private String namesrvAddr;
//    private String topics;
//    @Autowired
//    private MQConsumeMsgListenerProcessor consumeMsgListenerProcessor;
//
//    /**
//     * mq 消费者配置
//     *
//     * @return
//     * @throws MQClientException
//     */
//    @Bean
//    public DefaultMQPushConsumer defaultConsumer() throws MQClientException {
//        log.info("defaultConsumer 正在创建---------------------------------------");
//        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer(groupName);
//        consumer.setNamesrvAddr(namesrvAddr);
//        consumer.registerMessageListener(consumeMsgListenerProcessor);
//        try {
//            // 设置该消费者订阅的主题和tag，如果订阅该主题下的所有tag，则使用*,
//            String[] topicArr = topics.split(";");
//            for (String topic : topicArr) {
//                String[] tagArr = topic.split("~");
//                consumer.subscribe(tagArr[0], tagArr[1]);
//            }
//            consumer.start();
//            log.info("consumer 创建成功 groupName={}, topics={}, namesrvAddr={}", groupName, topics, namesrvAddr);
//        } catch (MQClientException e) {
//            log.error("consumer 创建失败!");
//        }
//        return consumer;
//    }
//}
