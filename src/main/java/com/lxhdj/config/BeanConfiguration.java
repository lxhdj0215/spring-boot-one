package com.lxhdj.config;

import com.lxhdj.service.SpringBeanService;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

//    @Bean(initMethod = "init")
    public SpringBeanService getSpringBeanService() {
        return new SpringBeanService();
    }
}
