package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Drugdetailed;
import com.domain.DrugdetailedExample;

public interface DrugdetailedMapper {
    int countByExample(DrugdetailedExample example);

    int deleteByExample(DrugdetailedExample example);

    int deleteByPrimaryKey(String ddid);

    int insert(Drugdetailed record);

    int insertSelective(Drugdetailed record);

    List<Drugdetailed> selectByExample(DrugdetailedExample example);

    Drugdetailed selectByPrimaryKey(String ddid);

    int updateByExampleSelective(@Param("record") Drugdetailed record, @Param("example") DrugdetailedExample example);

    int updateByExample(@Param("record") Drugdetailed record, @Param("example") DrugdetailedExample example);

    int updateByPrimaryKeySelective(Drugdetailed record);

    int updateByPrimaryKey(Drugdetailed record);

	List<Drugdetailed> showAllDetails(@Param("startIndex") Integer startIndex,@Param("pageSize") Integer pageSize,@Param("name") String name);

	Integer getDetailCount(@Param("name") String name);

	void deleteDetail(String[] ddids);
}