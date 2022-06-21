//package com.lxhdj.web.controller;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.UUID;
//
////@RestController
//@RequestMapping("/kafka")
//@Slf4j
//public class KafkaController {
//
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    @RequestMapping("/send")
//    public void send(String msg) {
//        String s = UUID.randomUUID().toString();
//        kafkaTemplate.send("wgjone", msg + s);
//    }
//}