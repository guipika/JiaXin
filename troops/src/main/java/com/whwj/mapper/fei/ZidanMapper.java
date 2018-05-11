package com.whwj.mapper.fei;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.whwj.entity.fei.Zidan;
import com.whwj.entity.fei.ZidanExample;

public interface ZidanMapper {
    int countByExample(ZidanExample example);

    int deleteByExample(ZidanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zidan record);

    int insertSelective(Zidan record);

    List<Zidan> selectByExample(ZidanExample example);

    Zidan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zidan record, @Param("example") ZidanExample example);

    int updateByExample(@Param("record") Zidan record, @Param("example") ZidanExample example);

    int updateByPrimaryKeySelective(Zidan record);

    int updateByPrimaryKey(Zidan record);
}