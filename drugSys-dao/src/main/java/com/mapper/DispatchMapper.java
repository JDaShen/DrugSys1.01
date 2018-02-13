package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Dispatch;
import com.domain.DispatchDetailVo;
import com.domain.DispatchExample;
import com.domain.PageCriterias;
import com.domain.ShowDispatchVo;

public interface DispatchMapper {
    int countByExample(DispatchExample example);

    int deleteByExample(DispatchExample example);

    int deleteByPrimaryKey(String dispid);

    int insert(Dispatch record);
    //插入单条
    int insertOnes(Dispatch record);

    int insertSelective(Dispatch record);

    List<Dispatch> selectByExample(DispatchExample example);

    Dispatch selectByPrimaryKey(String dispid);

    int updateByExampleSelective(@Param("record") Dispatch record, @Param("example") DispatchExample example);

    int updateByExample(@Param("record") Dispatch record, @Param("example") DispatchExample example);

    int updateByPrimaryKeySelective(Dispatch record);

    int updateByPrimaryKey(Dispatch record);
    //查询所有调度单
	List<ShowDispatchVo> getAllDispatcher(PageCriterias pageCriterias);
	//查询调度单详细信息
	List<DispatchDetailVo> getDispatcherDetailById(PageCriterias pageCriteria);
	//统计调度单条数
	int getToals(PageCriterias pageCriteria);
	//通过id统计详单条目数
	int totalDetailEntry(PageCriterias pageCriteria);

}