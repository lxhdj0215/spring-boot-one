package com.lxhdj.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.util.StringValueResolver;

import javax.annotation.PostConstruct;

@Service
@Slf4j
public class SpringBeanService implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware
        , EnvironmentAware, EmbeddedValueResolverAware, ApplicationContextAware
        , ResourceLoaderAware,
        InitializingBean, DisposableBean {

    public SpringBeanService() {
        log.info("SpringBeanService instance");
    }

    @Override
    public void setBeanName(String name) {
        log.info("interface-BeanNameAware, name = {}", name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        log.info("interface-BeanFactoryAware, beanFactory = {}", beanFactory);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("interface-ApplicationContextAware, applicationContext = {}", applicationContext);
    }

    @PostConstruct
    public void postConstruct() {
        log.info("postConstruct");
    }

    public void init() {
        log.info("init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("interface-InitializingBean");
    }

    @Override
    public void destroy() throws Exception {
        log.info("interface-DisposableBean");
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        log.info("interface-BeanClassLoaderAware");
    }

    @Override
    public void setEnvironment(Environment environment) {
        log.info("interface-EnvironmentAware");

    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {
        log.info("interface-EmbeddedValueResolverAware ");

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        log.info("interface-ResourceLoaderAware ");

    }
}
