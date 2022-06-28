package com.lxhdj.dao;

import com.alibaba.fastjson.JSON;
import com.lxhdj.DemoApplication;
import com.lxhdj.dao.mapper.MissionMapper;
import com.lxhdj.dao.model.Mission;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
@Slf4j
public class MissionMapperTest {

    @Autowired
    private MissionMapper missionMapper;


    @Test
    public void selectAll_Test() {
//        List<Mission> missions = missionMapper.selectAllTest();
//        log.info(JSON.toJSONString(missions));
    }

    @Test
    public void selectByPrimaryKeyTest() {
        Mission mission = missionMapper.selectByPrimaryKey(14754L);
        System.out.println(JSON.toJSONString(mission));
    }


    @Test
    public void addOneTest() {
        String str = "{\"bdTransfer\":1,\"businessType\":1000,\"collectionType\":1,\"createMisCode\":\"zhangjiashan\",\"createMisName\":\"张佳杉\","
                + "\"ctime\":1630471703000,\"endTime\":1633017599000,\"finishTime\":1630471740000,\"id\":14742,\"missionMonitorType\":0,"
                + "\"missionObjectType\":0,\"missionType\":25,\"missionTypeL2\":33,\"name\":\"wgj\",\"predictProcessRate\":60,\"priority\":10,"
                + "\"quotaType\":7,\"remark\":\"关团复开\",\"sortOrder\":0,\"startTime\":1630425600000,\"status\":100,\"tags\":\"关团复开\","
                + "\"utime\":1630471740000}";

        Mission mission = JSON.parseObject(str, Mission.class);
        mission.setId(null);
        mission.setName("wgj-121");
        missionMapper.insert(mission);
        log.info("id = {}", mission.getId());
    }

    @Test
    public void addTwoTest() {
        String str = "{\"bdTransfer\":1,\"businessType\":1000,\"collectionType\":1,\"createMisCode\":\"zhangjiashan\",\"createMisName\":\"张佳杉\","
                + "\"ctime\":1630471703000,\"endTime\":1633017599000,\"finishTime\":1630471740000,\"id\":14742,\"missionMonitorType\":0,"
                + "\"missionObjectType\":0,\"missionType\":25,\"missionTypeL2\":33,\"name\":\"wgj\",\"predictProcessRate\":60,\"priority\":10,"
                + "\"quotaType\":7,\"remark\":\"关团复开\",\"sortOrder\":0,\"startTime\":1630425600000,\"status\":100,\"tags\":\"关团复开\","
                + "\"utime\":1630471740000}";

        Mission mission = JSON.parseObject(str, Mission.class);
        mission.setId(null);
        mission.setName("wgj-121");
        missionMapper.insert(mission);
        log.info("id = {}", mission.getId());
    }

    @Test
    public void addThreeTest() {
        String str = "{\"bdTransfer\":1,\"businessType\":1000,\"collectionType\":1,\"createMisCode\":\"zhangjiashan\",\"createMisName\":\"张佳杉\","
                + "\"ctime\":1630471703000,\"endTime\":1633017599000,\"finishTime\":1630471740000,\"id\":14742,\"missionMonitorType\":0,"
                + "\"missionObjectType\":0,\"missionType\":25,\"missionTypeL2\":33,\"name\":\"wgj\",\"predictProcessRate\":60,\"priority\":10,"
                + "\"quotaType\":7,\"remark\":\"关团复开\",\"sortOrder\":0,\"startTime\":1630425600000,\"status\":100,\"tags\":\"关团复开\","
                + "\"utime\":1630471740000}";

        Mission mission = JSON.parseObject(str, Mission.class);
        mission.setId(null);
        mission.setName("wgj-121");
        missionMapper.insert(mission);
        log.info("id = {}", mission.getId());
    }

//    @Test
//    public void selectFirstTest() {
//        Mission mission = new Mission();
//        mission.setId(14867L);
//        List<Mission> missions = missionMapper.se(mission);
//        log.info(JSON.toJSONString(missions));
//    }

//    @Test
//    public void selectSecondTest() {
//        Mission mission = new Mission();
//        mission.setId(14867L);
//        List<Mission> missions = missionMapper.selectSecond(mission);
//        log.info(JSON.toJSONString(missions));
//    }


}
