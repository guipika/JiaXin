package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Junshikaohe;
import com.whwj.entity.zzx.JunshikaoheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JunshikaoheMapper {
    int countByExample(JunshikaoheExample example);

    int deleteByExample(JunshikaoheExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Junshikaohe record);

    int insertSelective(Junshikaohe record);

    List<Junshikaohe> selectByExample(JunshikaoheExample example);

    Junshikaohe selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Junshikaohe record, @Param("example") JunshikaoheExample example);

    int updateByExample(@Param("record") Junshikaohe record, @Param("example") JunshikaoheExample example);

    int updateByPrimaryKeySelective(Junshikaohe record);

    int updateByPrimaryKey(Junshikaohe record);
}