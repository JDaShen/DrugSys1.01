package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.PgrVo;
import com.domain.Pgritem;
import com.domain.PgritemExample;

public interface PgritemMapper {

	/**
	 * 自己写的方法
	 * @param example
	 * @return
	 */
	void insertInto(Pgritem p);
	
    int countByExample(PgritemExample example);

    int deleteByExample(PgritemExample example);

    int deleteByPrimaryKey(String pgritemid);

    int insert(Pgritem record);

    int insertSelective(Pgritem record);

    List<Pgritem> selectByExample(PgritemExample example);

    Pgritem selectByPrimaryKey(String pgritemid);

    int updateByExampleSelective(@Param("record") Pgritem record, @Param("example") PgritemExample example);

    int updateByExample(@Param("record") Pgritem record, @Param("example") PgritemExample example);

    int updateByPrimaryKeySelective(Pgritem record);

    int updateByPrimaryKey(Pgritem record);
}