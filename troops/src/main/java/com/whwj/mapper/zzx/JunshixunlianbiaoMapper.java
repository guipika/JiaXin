package com.whwj.mapper.zzx;

import com.whwj.entity.zzx.Junshixunlianbiao;
import com.whwj.entity.zzx.JunshixunlianbiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JunshixunlianbiaoMapper {
    int countByExample(JunshixunlianbiaoExample example);

    int deleteByExample(JunshixunlianbiaoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Junshixunlianbiao record);

    int insertSelective(Junshixunlianbiao record);

    List<Junshixunlianbiao> selectByExample(JunshixunlianbiaoExample example);

    Junshixunlianbiao selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Junshixunlianbiao record, @Param("example") JunshixunlianbiaoExample example);

    int updateByExample(@Param("record") Junshixunlianbiao record, @Param("example") JunshixunlianbiaoExample example);

    int updateByPrimaryKeySelective(Junshixunlianbiao record);

    int updateByPrimaryKey(Junshixunlianbiao record);
}