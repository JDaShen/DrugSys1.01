package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Drugtotal;
import com.domain.DrugtotalExample;

public interface DrugtotalMapper {
    int countByExample(DrugtotalExample example);

    int deleteByExample(DrugtotalExample example);

    int deleteByPrimaryKey(String dtid);

    int insert(Drugtotal record);

    int insertSelective(Drugtotal record);

    List<Drugtotal> selectByExample(DrugtotalExample example);

    Drugtotal selectByPrimaryKey(String dtid);

    int updateByExampleSelective(@Param("record") Drugtotal record, @Param("example") DrugtotalExample example);

    int updateByExample(@Param("record") Drugtotal record, @Param("example") DrugtotalExample example);

    int updateByPrimaryKeySelective(Drugtotal record);

    int updateByPrimaryKey(Drugtotal record);
}