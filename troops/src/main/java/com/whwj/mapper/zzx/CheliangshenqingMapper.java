package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Cheliangshenqing;
import com.whwj.entity.zzx.CheliangshenqingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheliangshenqingMapper {
    int countByExample(CheliangshenqingExample example);

    int deleteByExample(CheliangshenqingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cheliangshenqing record);

    int insertSelective(Cheliangshenqing record);

    List<Cheliangshenqing> selectByExample(CheliangshenqingExample example);

    Cheliangshenqing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cheliangshenqing record, @Param("example") CheliangshenqingExample example);

    int updateByExample(@Param("record") Cheliangshenqing record, @Param("example") CheliangshenqingExample example);

    int updateByPrimaryKeySelective(Cheliangshenqing record);

    int updateByPrimaryKey(Cheliangshenqing record);
}