package com.lxhdj.dao.mapper;

import com.lxhdj.dao.model.Mission;
import com.lxhdj.dao.model.MissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MissionMapper extends Mapper<Mission> {
    long countByExample(MissionExample example);

    int deleteByExample(MissionExample example);

    List<Mission> selectByExample(MissionExample example);

    int updateByExampleSelective(@Param("record") Mission record, @Param("example") MissionExample example);

    int updateByExample(@Param("record") Mission record, @Param("example") MissionExample example);
}