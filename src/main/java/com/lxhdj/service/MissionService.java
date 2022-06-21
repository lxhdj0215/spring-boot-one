package com.lxhdj.service;

import com.alibaba.fastjson.JSON;
import com.lxhdj.dao.mapper.MissionMapper;
import com.lxhdj.dao.model.Mission;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class MissionService {

    @Autowired
    private MissionMapper missionMapper;

    @Transactional
    public void trx() {
        trx_2();
        trx_1();
    }

    public MissionService() {
//        System.out.println("MissionService instance");
    }

    @Transactional(propagation= Propagation.NOT_SUPPORTED)
    public void trx_1() {
        String str = "{\"bdTransfer\":1,\"businessType\":1000,\"collectionType\":1,\"createMisCode\":\"zhangjiashan\",\"createMisName\":\"张佳杉\","
                + "\"ctime\":1630471703000,\"endTime\":1633017599000,\"finishTime\":1630471740000,\"id\":14742,\"missionMonitorType\":0,"
                + "\"missionObjectType\":0,\"missionType\":25,\"missionTypeL2\":33,\"name\":\"wgj\",\"predictProcessRate\":60,\"priority\":10,"
                + "\"quotaType\":7,\"remark\":\"关团复开\",\"sortOrder\":0,\"startTime\":1630425600000,\"status\":100,\"tags\":\"关团复开\","
                + "\"utime\":1630471740000}";

        Mission mission = JSON.parseObject(str, Mission.class);
        mission.setId(null);
        mission.setName("wgj-12");
        missionMapper.insert(mission);
        int i = 1 / 0;
    }

    @Transactional(propagation= Propagation.SUPPORTS)
    public void trx_2() {
        String str = "{\"bdTransfer\":1,\"businessType\":1000,\"collectionType\":1,\"createMisCode\":\"zhangjiashan\",\"createMisName\":\"张佳杉\","
                + "\"ctime\":1630471703000,\"endTime\":1633017599000,\"finishTime\":1630471740000,\"id\":14742,\"missionMonitorType\":0,"
                + "\"missionObjectType\":0,\"missionType\":25,\"missionTypeL2\":33,\"name\":\"wgj\",\"predictProcessRate\":60,\"priority\":10,"
                + "\"quotaType\":7,\"remark\":\"关团复开\",\"sortOrder\":0,\"startTime\":1630425600000,\"status\":100,\"tags\":\"关团复开\","
                + "\"utime\":1630471740000}";

        Mission mission = JSON.parseObject(str, Mission.class);
        mission.setId(null);
        mission.setName("wgj-13");
        missionMapper.insert(mission);
    }

}
