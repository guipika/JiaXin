package com.whwj.mapper.fei;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.whwj.entity.fei.Shebei;
import com.whwj.entity.fei.ShebeiExample;

public interface ShebeiMapper {
    int countByExample(ShebeiExample example);

    int deleteByExample(ShebeiExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Shebei record);

    int insertSelective(Shebei record);

    List<Shebei> selectByExample(ShebeiExample example);

    Shebei selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Shebei record, @Param("example") ShebeiExample example);

    int updateByExample(@Param("record") Shebei record, @Param("example") ShebeiExample example);

    int updateByPrimaryKeySelective(Shebei record);

    int updateByPrimaryKey(Shebei record);
}