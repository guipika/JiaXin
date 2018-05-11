package com.whwj.mapper.fei;

import com.whwj.entity.fei.Baoyang;
import com.whwj.entity.fei.BaoyangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaoyangMapper {
    int countByExample(BaoyangExample example);

    int deleteByExample(BaoyangExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Baoyang record);

    int insertSelective(Baoyang record);

    List<Baoyang> selectByExample(BaoyangExample example);

    Baoyang selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Baoyang record, @Param("example") BaoyangExample example);

    int updateByExample(@Param("record") Baoyang record, @Param("example") BaoyangExample example);

    int updateByPrimaryKeySelective(Baoyang record);

    int updateByPrimaryKey(Baoyang record);
}