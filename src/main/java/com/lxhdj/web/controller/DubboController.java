//package com.lxhdj.web.controller;
//
//import com.lxhdj.dubbo.DemoService;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.dubbo.config.annotation.DubboReference;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/dubbo")
//@Slf4j
//public class DubboController {
//
//    @DubboReference
//    private DemoService demoService;
//
//
//    @RequestMapping("/sayHello")
//    public String sayHello(String name) {
//        log.info("DubboController, name = {}", name);
//        return demoService.sayHello(name);
//    }
//}
