package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Churu;
import com.whwj.entity.zzx.ChuruExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChuruMapper {
    int countByExample(ChuruExample example);

    int deleteByExample(ChuruExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Churu record);

    int insertSelective(Churu record);

    List<Churu> selectByExample(ChuruExample example);

    Churu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Churu record, @Param("example") ChuruExample example);

    int updateByExample(@Param("record") Churu record, @Param("example") ChuruExample example);

    int updateByPrimaryKeySelective(Churu record);

    int updateByPrimaryKey(Churu record);
}