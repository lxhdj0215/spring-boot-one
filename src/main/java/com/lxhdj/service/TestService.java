package com.lxhdj.service;

import com.lxhdj.dao.mapper.MissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TestService {

    @Autowired
    private MissionMapper missionMapper;

    @Autowired
    private MissionService missionService;

    @Transactional
    public void trxTest() {
        missionService.trx_2();
        try {
            missionService.trx_1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
