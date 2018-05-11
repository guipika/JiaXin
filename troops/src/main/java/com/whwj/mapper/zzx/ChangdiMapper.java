package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Changdi;
import com.whwj.entity.zzx.ChangdiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChangdiMapper {
    int countByExample(ChangdiExample example);

    int deleteByExample(ChangdiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Changdi record);

    int insertSelective(Changdi record);

    List<Changdi> selectByExample(ChangdiExample example);

    Changdi selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Changdi record, @Param("example") ChangdiExample example);

    int updateByExample(@Param("record") Changdi record, @Param("example") ChangdiExample example);

    int updateByPrimaryKeySelective(Changdi record);

    int updateByPrimaryKey(Changdi record);
}