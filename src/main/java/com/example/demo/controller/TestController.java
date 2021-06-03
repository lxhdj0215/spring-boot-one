package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
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

    @RequestMapping("/one")
    public String one(String name) {
        log.info("name = {}", name);
        return name;
    }
}
