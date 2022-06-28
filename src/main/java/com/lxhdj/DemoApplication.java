package com.lxhdj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.lxhdj.dao.mapper")
public class DemoApplication {

    public static void main(String[] args) {
//        System.setProperty("dubbo.application.logger", "log4j2");
        SpringApplication.run(DemoApplication.class, args);
    }

}
