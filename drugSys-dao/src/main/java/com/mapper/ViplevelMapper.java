package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Viplevel;
import com.domain.ViplevelExample;

public interface ViplevelMapper {
    int countByExample(ViplevelExample example);

    int deleteByExample(ViplevelExample example);

    int deleteByPrimaryKey(String levelid);

    int insert(Viplevel record);

    int insertSelective(Viplevel record);

    List<Viplevel> selectByExample(ViplevelExample example);

    Viplevel selectByPrimaryKey(String levelid);

    int updateByExampleSelective(@Param("record") Viplevel record, @Param("example") ViplevelExample example);

    int updateByExample(@Param("record") Viplevel record, @Param("example") ViplevelExample example);

    int updateByPrimaryKeySelective(Viplevel record);

    int updateByPrimaryKey(Viplevel record);
}