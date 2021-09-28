package com.lxhdj.service;

import com.lxhdj.dao.mapper.MissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private MissionMapper missionMapper;


}
