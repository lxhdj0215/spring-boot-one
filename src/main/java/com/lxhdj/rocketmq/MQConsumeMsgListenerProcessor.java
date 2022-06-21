//package com.lxhdj.rocketmq;
//
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
//import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
//import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
//import org.apache.rocketmq.common.message.MessageExt;
//import org.springframework.util.CollectionUtils;
//
//import java.util.List;
//
//
////@Component
//@Slf4j
//public class MQConsumeMsgListenerProcessor implements MessageListenerConcurrently {
//
//
//    /**
//     * 默认msg里只有一条消息，可以通过设置consumeMessageBatchMaxSize参数来批量接收消息
//     * 不要抛异常，如果没有return CONSUME_SUCCESS ，consumer会重新消费该消息，直到return CONSUME_SUCCESS
//     *
//     * @param msgList
//     * @param consumeConcurrentlyContext
//     * @return
//     */
//    @Override
//    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> msgList, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
//        if (CollectionUtils.isEmpty(msgList)) {
//            log.info("MQ接收消息为空，直接返回成功");
//            return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//        }
//        MessageExt messageExt = msgList.get(0);
////        log.info("MQ接收到的消息为：" + messageExt.toString());
//        try {
//            String topic = messageExt.getTopic();
//            String tags = messageExt.getTags();
//            String body = new String(messageExt.getBody(), "utf-8");
//
//            log.info("msg = {}, MQ消息topic={}, tags={}, 消息内容={}", messageExt.toString(), topic, tags, body);
//        } catch (Exception e) {
//            log.error("获取MQ消息内容异常{}", e);
//        }
//        // TODO 处理业务逻辑
//        //暂停一会再获取
//
//        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
//    }
//}
