package com.uoumeng.umooc.dao;

import com.uoumeng.umooc.entity.Training;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Training record);

    int insertSelective(Training record);

    Training selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Training record);

    int updateByPrimaryKey(Training record);
}