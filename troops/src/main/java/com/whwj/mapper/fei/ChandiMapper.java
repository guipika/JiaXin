package com.whwj.mapper.fei;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.whwj.entity.fei.Chandi;
import com.whwj.entity.fei.ChandiExample;


public interface ChandiMapper {
    int countByExample(ChandiExample example);

    int deleteByExample(ChandiExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Chandi record);

    int insertSelective(Chandi record);

    List<Chandi> selectByExample(ChandiExample example);

    Chandi selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Chandi record, @Param("example") ChandiExample example);

    int updateByExample(@Param("record") Chandi record, @Param("example") ChandiExample example);

    int updateByPrimaryKeySelective(Chandi record);

    int updateByPrimaryKey(Chandi record);
}