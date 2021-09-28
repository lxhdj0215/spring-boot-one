package com.lxhdj.web;

import com.alibaba.fastjson.JSON;
import com.lxhdj.DemoApplication;
import com.lxhdj.dao.mapper.MissionMapper;
import com.lxhdj.dao.model.Mission;
import com.lxhdj.service.MissionService;
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

    @Test
    public void selectAllTest() {
        List<Mission> missions = missionMapper.selectAll();
        log.info(JSON.toJSONString(missions));
    }

    @Test
    public void m1Test() {
        missionService.trx();
    }
}
