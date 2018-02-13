package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Checkitems;
import com.domain.CheckitemsExample;
import com.domain.DispatchDetailVo;
import com.domain.PageCriterias;

public interface CheckitemsMapper {
    int countByExample(CheckitemsExample example);

    int deleteByExample(CheckitemsExample example);

    int deleteByPrimaryKey(String itemid);

    int insert(Checkitems record);

    int insertSelective(Checkitems record);

    List<Checkitems> selectByExample(CheckitemsExample example);

    Checkitems selectByPrimaryKey(String itemid);

    int updateByExampleSelective(@Param("record") Checkitems record, @Param("example") CheckitemsExample example);

    int updateByExample(@Param("record") Checkitems record, @Param("example") CheckitemsExample example);

    int updateByPrimaryKeySelective(Checkitems record);

    int updateByPrimaryKey(Checkitems record);

    	//根据cid查询盘点详细信息
	List<DispatchDetailVo> getAllDetailByCid(PageCriterias pageCriteria);

	//根据盘点单id统计符合条件的条数
	int getTotalDetailEntryById(PageCriterias pageCriteria);
}