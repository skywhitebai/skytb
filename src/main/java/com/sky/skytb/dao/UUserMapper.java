package com.sky.skytb.dao;

import com.sky.skytb.model.UUser;
import com.sky.skytb.model.UUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserMapper {
    int deleteByExample(UUserExample example);

    int deleteByPrimaryKey(Long userId);

    int insert(UUser record);

    int insertSelective(UUser record);

    List<UUser> selectByExample(UUserExample example);

    UUser selectByPrimaryKey(Long userId);

    int updateByExampleSelective(@Param("record") UUser record, @Param("example") UUserExample example);

    int updateByExample(@Param("record") UUser record, @Param("example") UUserExample example);

    int updateByPrimaryKeySelective(UUser record);

    int updateByPrimaryKey(UUser record);
}