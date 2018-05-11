package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Junshikemu;
import com.whwj.entity.zzx.JunshikemuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JunshikemuMapper {
    int countByExample(JunshikemuExample example);

    int deleteByExample(JunshikemuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Junshikemu record);

    int insertSelective(Junshikemu record);

    List<Junshikemu> selectByExample(JunshikemuExample example);

    Junshikemu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Junshikemu record, @Param("example") JunshikemuExample example);

    int updateByExample(@Param("record") Junshikemu record, @Param("example") JunshikemuExample example);

    int updateByPrimaryKeySelective(Junshikemu record);

    int updateByPrimaryKey(Junshikemu record);
}