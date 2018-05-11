package com.whwj.mapper.fei;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.whwj.entity.fei.Guninfo;
import com.whwj.entity.fei.GuninfoExample;

public interface GuninfoMapper {
    int countByExample(GuninfoExample example);

    int deleteByExample(GuninfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Guninfo record);

    int insertSelective(Guninfo record);

    List<Guninfo> selectByExample(GuninfoExample example);

    Guninfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Guninfo record, @Param("example") GuninfoExample example);

    int updateByExample(@Param("record") Guninfo record, @Param("example") GuninfoExample example);

    int updateByPrimaryKeySelective(Guninfo record);

    int updateByPrimaryKey(Guninfo record);
}