package com.lxhdj.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class InstantiationAwareBeanPostProcessorService implements InstantiationAwareBeanPostProcessor {
    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if ("getSpringBeanService".equals(beanName)) {
            log.info("InstantiationAwareBeanPostProcessorService-postProcessBeforeInstantiation,beanName = {}", beanName);
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if ("springBeanService".equals(beanName)) {
            log.info("InstantiationAwareBeanPostProcessorService-postProcessAfterInstantiation,beanName = {}", beanName);
        }
        return true;
    }

    @Override
    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName)
            throws BeansException {
        if ("springBeanService".equals(beanName)) {
            log.info("InstantiationAwareBeanPostProcessorService-postProcessProperties,beanName = {}", beanName);
        }
        return null;
    }
}
