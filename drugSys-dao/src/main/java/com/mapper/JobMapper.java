package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Job;
import com.domain.JobExample;

public interface JobMapper {
    int countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(String jobid);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    Job selectByPrimaryKey(String jobid);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}