package com.lxhdj.web.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.fasterxml.jackson.databind.util.JSONWrappedObject;
import com.lxhdj.dao.mapper.MissionMapper;
import com.lxhdj.dao.model.Mission;
import com.lxhdj.service.MissionService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectSerializer;
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

    @RequestMapping("/one")
    public String one(String name) {
        log.info("name = {}", name);
        missionService.trx();
        return name;
    }


}
