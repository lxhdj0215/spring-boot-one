//package com.lxhdj.dubbo;
//
//import org.apache.dubbo.config.annotation.DubboService;
//import org.springframework.beans.factory.annotation.Value;
//
//@DubboService
//public class DefaultDemoServiceTwo implements DemoServiceTwo {
//
//
//    /**
//     * The default value of ${dubbo.application.name} is ${spring.application.name}
//     */
//    @Value("${dubbo.application.name}")
//    private String serviceName;
//
//    public String sayHello(String name) {
//        return String.format("[%s] : Hello, %s", serviceName, name);
//    }
//
//    @Override
//    public String sayHello1(String name) {
//        return String.format("[%s] : Hello, %s", serviceName, name);
//    }
//}
