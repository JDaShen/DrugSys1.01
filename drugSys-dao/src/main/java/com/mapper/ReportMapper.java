package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.DispatchDetailVo;
import com.domain.PageCriterias;
import com.domain.Report;
import com.domain.ReportExample;

public interface ReportMapper {
    int countByExample(ReportExample example);

    int deleteByExample(ReportExample example);

    int deleteByPrimaryKey(String rid);

    int insert(Report record);

    int insertSelective(Report record);

    List<Report> selectByExample(ReportExample example);

    Report selectByPrimaryKey(String rid);

    int updateByExampleSelective(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByExample(@Param("record") Report record, @Param("example") ReportExample example);

    int updateByPrimaryKeySelective(Report record);

    int updateByPrimaryKey(Report record);

	List<Report> getAllReports(PageCriterias pageCriteria);

	List<DispatchDetailVo> getAllReportDetailsById(PageCriterias pageCriteria);
		//统计所有报告单条目
		int getTotalReportEntry(PageCriterias pageCriteria);
		//统计满足条件的报告详单条目
		int getTotalRDetailEntry(PageCriterias pageCriteria);
}