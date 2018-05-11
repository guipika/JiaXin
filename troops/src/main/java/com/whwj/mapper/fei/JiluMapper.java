package com.whwj.mapper.fei;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.whwj.entity.fei.Jilu;
import com.whwj.entity.fei.JiluExample;

public interface JiluMapper {
    int countByExample(JiluExample example);

    int deleteByExample(JiluExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Jilu record);

    int insertSelective(Jilu record);

    List<Jilu> selectByExample(JiluExample example);

    Jilu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Jilu record, @Param("example") JiluExample example);

    int updateByExample(@Param("record") Jilu record, @Param("example") JiluExample example);

    int updateByPrimaryKeySelective(Jilu record);

    int updateByPrimaryKey(Jilu record);
}