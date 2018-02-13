package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Check;
import com.domain.CheckExample;
import com.domain.PageCriterias;

public interface CheckMapper {
    int countByExample(CheckExample example);

    int deleteByExample(CheckExample example);

    int deleteByPrimaryKey(String cid);

    int insert(Check record);

    int insertSelective(Check record);

    List<Check> selectByExample(CheckExample example);

    Check selectByPrimaryKey(String cid);

    int updateByExampleSelective(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByExample(@Param("record") Check record, @Param("example") CheckExample example);

    int updateByPrimaryKeySelective(Check record);

    int updateByPrimaryKey(Check record);
    //查询所有盘点单
	List<Check> getAllCheck(PageCriterias pageCriteria);
	//统计所有盘点单条数
	int getTotalCheckEntry(PageCriterias pageCriteria);
	

}