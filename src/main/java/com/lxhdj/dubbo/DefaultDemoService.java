//package com.lxhdj.dubbo;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.dubbo.config.annotation.DubboService;
//import org.springframework.beans.factory.annotation.Value;
//
//@DubboService
//@Slf4j
//public class DefaultDemoService implements DemoService {
//
//    /**
//     * The default value of ${dubbo.application.name} is ${spring.application.name}
//     */
//    @Value("${dubbo.application.name}")
//    private String serviceName;
//
//    public String sayHello(String name) {
//        log.info("DefaultDemoService, name = {}", name);
//        return String.format("[%s] : Hello, %s", serviceName, name);
//    }
//
//    @Override
//    public String sayHello1(String name) {
//        return String.format("[%s] : Hello, %s", serviceName, name);
//    }
//}
