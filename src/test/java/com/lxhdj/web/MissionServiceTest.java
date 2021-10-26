package com.lxhdj.web;

import com.alibaba.fastjson.JSON;
import com.lxhdj.DemoApplication;
import com.lxhdj.dao.mapper.MissionMapper;
import com.lxhdj.dao.model.Mission;
import com.lxhdj.service.MissionService;
import com.lxhdj.service.TestService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@Slf4j
public class MissionServiceTest {

    @Autowired
    private MissionService missionService;

    @Autowired
    private MissionMapper missionMapper;

    @Autowired
    private TestService testService;

    @Test
    public void selectAllTest() {
        List<Mission> missions = missionMapper.selectAll();
        log.info(JSON.toJSONString(missions));
    }

    @Test
    public void m1Test() {
        testService.trxTest();
        //        missionService.trx();
        //        missionService.trx_1();
    }

    @Test
    public void trx_2Test() {
        missionService.trx_2();
    }

    @Test
    public void trx_1Test() {
        missionService.trx_1();
    }

}
