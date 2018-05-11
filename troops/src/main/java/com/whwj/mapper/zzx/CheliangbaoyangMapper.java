package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Cheliangbaoyang;
import com.whwj.entity.zzx.CheliangbaoyangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheliangbaoyangMapper {
    int countByExample(CheliangbaoyangExample example);

    int deleteByExample(CheliangbaoyangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cheliangbaoyang record);

    int insertSelective(Cheliangbaoyang record);

    List<Cheliangbaoyang> selectByExample(CheliangbaoyangExample example);

    Cheliangbaoyang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cheliangbaoyang record, @Param("example") CheliangbaoyangExample example);

    int updateByExample(@Param("record") Cheliangbaoyang record, @Param("example") CheliangbaoyangExample example);

    int updateByPrimaryKeySelective(Cheliangbaoyang record);

    int updateByPrimaryKey(Cheliangbaoyang record);
}