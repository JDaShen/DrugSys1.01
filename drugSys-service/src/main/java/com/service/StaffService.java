package com.service;

import java.util.List;
import java.util.Map;

import com.domain.Staff;
import com.domain.StaffVo;

public interface StaffService {
	
	/**
	 * 添加新员工
	 * @param staff
	 * @return
	 */
	boolean addStaff(Staff staff);
	
	/**
	 * 根据职位查询员工
	 * @param jobId
	 * @return
	 */
	List<Staff> getStaffsByJob(String jobId);
	
	/**
	 * 获取全部员工
	 * @return
	 */
	List<Staff> getAllStaff();
	
	/**
	 * 批量修改员工
	 * @param staffVo
	 * @return
	 */
	boolean updateStaff(Staff staff);
	
	/**
	 * 删除员工
	 * @param staffVo
	 * @return
	 */
	boolean deleteStaff(String sfIds);
	
	/**
	 * 分页条件查询员工
	 * @param pageIndex
	 * @param pageSize
	 * @param querysfName
	 * @param sfAddress
	 * @param sfState
	 * @return
	 */
	Map<String, Object> getAllStaffPageBean(Integer pageIndex, Integer pageSize, String querysfName, String sfAddress,
			Integer sfState);
	
	/**
	 * 根据ID查询员工
	 * @param sfid
	 * @return
	 */
	Staff getStaffById(String sfid);

}
