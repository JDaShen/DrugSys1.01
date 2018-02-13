package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Staff;
import com.domain.StaffExample;
import com.domain.StaffShowVo;
import com.domain.StaffVo;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(String sfid);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(String sfid);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);

	List<StaffShowVo> selectStaffPageBean(@Param("start") int start,@Param("pageSize")  Integer pageSize,@Param("querysfName")  String querysfName,
			@Param("querysfAddress") String querysfAddress,@Param("querysfState") Integer querysfState);
	
	int countByCriteria(@Param("querysfName") String querysfName,@Param("querysfAddress") String querysfAddress,@Param("querysfState") Integer querysfState);
}