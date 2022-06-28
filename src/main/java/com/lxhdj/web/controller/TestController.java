package com.lxhdj.web.controller;

import com.lxhdj.dao.mapper.MissionMapper;
import com.lxhdj.dao.model.Mission;
import com.lxhdj.service.MissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: ceshi
 * @author: wangguijun1
 * @create: 2021-06-03 15:33
 **/
@RestController
@RequestMapping("/")
@Slf4j
public class TestController {

    @Autowired
    private MissionMapper missionMapper;

    @Autowired
    private MissionService missionService;

    @Autowired
    private ApplicationContext applicationContext;

    public TestController() {
//        System.out.println("TestController instance");
    }

    @RequestMapping("/one")
    public String one(String name) {
        log.info("name = {}", name);
//        missionService.trx();
        return name;
    }

    @RequestMapping("/all")
    public Mission all(Long id) {
        Mission mission = missionMapper.selectByPrimaryKey(id);
        return mission;
    }

//    @Override
//    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        return bean;
//    }
//
//    @Override
//    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        return bean;
//    }
}
