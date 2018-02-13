package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Staff;
import com.domain.StaffShowVo;
import com.domain.StaffVo;
import com.service.StaffService;

@Controller
public class StaffController {
	@Autowired
	private StaffService staffService;
	
	/**
	 * 添加员工
	 * @param staff
	 * @param response
	 * @throws IOException 
	 */
	@RequestMapping(value="/addStaff.action")
	public void addStaff(@RequestBody Staff staff,HttpServletResponse response) throws IOException {
		boolean flag = staffService.addStaff(staff);
		if(flag) {
			response.getWriter().write("success");
		}else {
			response.getWriter().write("loss");
		}
	}
	
	/**
	 * 根据职位获取员工列表
	 * @param jobId
	 * @return
	 */
	@RequestMapping(value="/getStaffsByJob.action")
	public @ResponseBody List<Staff> getStaffsByJob (String jobId){
		List<Staff> staffs = staffService.getStaffsByJob(jobId);
		return staffs;
	}
	
	
	/**
	 * 获取全部员工
	 * @return
	 */
	@RequestMapping(value="/getAllStaff.action")
	public @ResponseBody List<Staff> getAllStaff(){
		List<Staff> staffs = staffService.getAllStaff();
		return staffs;
	}
	
	/**
	 * 分页条件查询员工
	 * @param pageIndex
	 * @param pageSize
	 * @param querysfName
	 * @param sfAddress
	 * @param sfState
	 * @return
	 */
	@RequestMapping(value="/getAllStaffPageBean.action")
	public @ResponseBody Map<String, Object> getAllStaffPageBean(Integer pageIndex,Integer pageSize,String querysfName,
			String querysfAddress,Integer querysfState){
		Map<String, Object> show = staffService.getAllStaffPageBean(pageIndex,pageSize,querysfName,querysfAddress,querysfState);
		return show;
	}
	
	/**
	 * 修改员工
	 * @param staffVo
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/updateStaff.action")
	public void updateStaff(@RequestBody Staff staff,HttpServletResponse response) throws IOException {
		boolean flag = staffService.updateStaff(staff);
		if(flag) {
			response.getWriter().write("success");
		}else {
			response.getWriter().write("loss");
		}
	}
	
	/**
	 * 删除员工
	 * @param staffVo
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/deleteStaff.action")
	public void deleteStaff(String sfIds,HttpServletResponse response) throws IOException {
		boolean flag = staffService.deleteStaff(sfIds);
		if(flag) {
			response.getWriter().write("success");
		}else {
			response.getWriter().write("loss");
		}	
	}
	
	/**
	 * 根据ID查询员工
	 * @param sfid
	 * @return
	 */
	@RequestMapping(value="/getStaffById.action")
	public @ResponseBody Staff getStaffById(String sfid) {
		Staff staff = staffService.getStaffById(sfid);
		return staff;
	}
}
