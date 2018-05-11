package com.whwj.mapper.fei;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.whwj.entity.fei.Gun;
import com.whwj.entity.fei.GunExample;

public interface GunMapper {
    int countByExample(GunExample example);

    int deleteByExample(GunExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Gun record);

    int insertSelective(Gun record);

    List<Gun> selectByExample(GunExample example);

    Gun selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Gun record, @Param("example") GunExample example);

    int updateByExample(@Param("record") Gun record, @Param("example") GunExample example);

    int updateByPrimaryKeySelective(Gun record);

    int updateByPrimaryKey(Gun record);
}