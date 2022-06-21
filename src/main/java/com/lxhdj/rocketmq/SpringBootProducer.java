//package com.lxhdj.rocketmq;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.rocketmq.client.exception.MQBrokerException;
//import org.apache.rocketmq.client.exception.MQClientException;
//import org.apache.rocketmq.client.producer.*;
//import org.apache.rocketmq.common.message.Message;
//import org.apache.rocketmq.remoting.exception.RemotingException;
//import org.apache.rocketmq.spring.core.RocketMQTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.support.MessageBuilder;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.*;
//
////@Component
//@Slf4j
//public class SpringBootProducer {
//
//    @Autowired
//    private RocketMQTemplate rocketMQTemplate;
//
//
//    @Autowired
//    private TransactionListener transactionListener;
//
//
//    // 发送消息的实例
//    public void sendMessage(String topic, String msg) {
//        rocketMQTemplate.convertAndSend(topic, msg);
//    }
//
//    public SendResult sendTrxMsg(String topic, String tags, String msg) {
//        TransactionMQProducer transactionMQProducer = (TransactionMQProducer) rocketMQTemplate.getProducer();
//        transactionMQProducer.setTransactionListener(transactionListener);
//
//        ExecutorService executorService = new ThreadPoolExecutor(2, 5, 100, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2000), new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                Thread thread = new Thread(r);
//                thread.setName("client-transaction-msg-check-thread");
//                return thread;
//            }
//        });
//        transactionMQProducer.setExecutorService(executorService);
//
//        Message message = new Message(topic, tags, msg.getBytes());
//        SendResult sendResult = null;
//        try {
//            sendResult = transactionMQProducer.sendMessageInTransaction(message, null);
//        } catch (MQClientException e) {
//            e.printStackTrace();
//        }
//        return sendResult;
//    }
//
//
//    public SendResult sendMsg(String topic, String tags, String msg) {
////        log.info("发送MQ消息内容：" + msg);
//        Message sendMsg = new Message(topic, tags, msg.getBytes());
////        sendMsg.setDelayTimeLevel(1);
//        // 默认3秒超时
//        SendResult sendResult = null;
//        try {
//            DefaultMQProducer producer = rocketMQTemplate.getProducer();
//            sendResult = producer.send(sendMsg);
//        } catch (MQClientException e) {
//            e.printStackTrace();
//        } catch (RemotingException e) {
//            e.printStackTrace();
//        } catch (MQBrokerException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("msg：{}, SendResult：{}", msg, sendResult.toString());
//        return sendResult;
//    }
//
//
//    //     发送事务消息的实例
//    public void sendMessageInTransaction(String topic, String msg) throws InterruptedException {
//        String[] tags = {"TagA", "TagB", "TagC", "TagD", "TagE"};
//        for (int i = 0; i < 10; i++) {
//            org.springframework.messaging.Message<String> message = MessageBuilder.withPayload(msg).build();
//            String destination = topic + ":" + tags[i % tags.length];
//
//            TransactionSendResult sendResult =
//                    rocketMQTemplate.sendMessageInTransaction(destination, message, destination);
//
//            System.out.printf("%s%n", sendResult);
//            Thread.sleep(10);
//        }
//    }
//}
//
