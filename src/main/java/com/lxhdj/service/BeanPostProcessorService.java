package com.lxhdj.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BeanPostProcessorService implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("springBeanService".equals(beanName)) {
            log.info("BeanPostProcessorService-postProcessBeforeInitialization,beanName = {}", beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if ("springBeanService".equals(beanName)) {
            log.info("BeanPostProcessorService-postProcessAfterInitialization,beanName = {}", beanName);
        }
        return bean;
    }
}
