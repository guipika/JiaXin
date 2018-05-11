package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Cheliang;
import com.whwj.entity.zzx.CheliangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheliangMapper {
    int countByExample(CheliangExample example);

    int deleteByExample(CheliangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cheliang record);

    int insertSelective(Cheliang record);

    List<Cheliang> selectByExample(CheliangExample example);

    Cheliang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cheliang record, @Param("example") CheliangExample example);

    int updateByExample(@Param("record") Cheliang record, @Param("example") CheliangExample example);

    int updateByPrimaryKeySelective(Cheliang record);

    int updateByPrimaryKey(Cheliang record);
}