package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.DispatchDetailVo;
import com.domain.Dispitems;
import com.domain.DispitemsExample;
import com.domain.PageCriterias;

public interface DispitemsMapper {
    int countByExample(DispitemsExample example);

    int deleteByExample(DispitemsExample example);

    int deleteByPrimaryKey(String ditemid);

    int insert(Dispitems record);

    int insertSelective(Dispitems record);

    List<Dispitems> selectByExample(DispitemsExample example);

    Dispitems selectByPrimaryKey(String ditemid);

    int updateByExampleSelective(@Param("record") Dispitems record, @Param("example") DispitemsExample example);

    int updateByExample(@Param("record") Dispitems record, @Param("example") DispitemsExample example);

    int updateByPrimaryKeySelective(Dispitems record);

    int updateByPrimaryKey(Dispitems record);

	
}