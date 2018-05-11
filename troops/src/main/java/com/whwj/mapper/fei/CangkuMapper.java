package com.whwj.mapper.fei;

import com.whwj.entity.fei.Cangku;
import com.whwj.entity.fei.CangkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CangkuMapper {
    int countByExample(CangkuExample example);

    int deleteByExample(CangkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cangku record);

    int insertSelective(Cangku record);

    List<Cangku> selectByExample(CangkuExample example);

    Cangku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cangku record, @Param("example") CangkuExample example);

    int updateByExample(@Param("record") Cangku record, @Param("example") CangkuExample example);

    int updateByPrimaryKeySelective(Cangku record);

    int updateByPrimaryKey(Cangku record);
}