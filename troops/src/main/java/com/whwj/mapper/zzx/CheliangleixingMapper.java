package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Cheliangleixing;
import com.whwj.entity.zzx.CheliangleixingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheliangleixingMapper {
    int countByExample(CheliangleixingExample example);

    int deleteByExample(CheliangleixingExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cheliangleixing record);

    int insertSelective(Cheliangleixing record);

    List<Cheliangleixing> selectByExample(CheliangleixingExample example);

    Cheliangleixing selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cheliangleixing record, @Param("example") CheliangleixingExample example);

    int updateByExample(@Param("record") Cheliangleixing record, @Param("example") CheliangleixingExample example);

    int updateByPrimaryKeySelective(Cheliangleixing record);

    int updateByPrimaryKey(Cheliangleixing record);
}