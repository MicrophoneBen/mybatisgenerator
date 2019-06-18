package com.mybatis.multidatasource.mapper;

import com.mybatis.multidatasource.entity.vplusSurveilTask;

public interface vplusSurveilTaskMapper {
    int deleteByPrimaryKey(String taskId);

    int insert(vplusSurveilTask record);

    int insertSelective(vplusSurveilTask record);

    vplusSurveilTask selectByPrimaryKey(String taskId);

    int updateByPrimaryKeySelective(vplusSurveilTask record);

    int updateByPrimaryKey(vplusSurveilTask record);
}