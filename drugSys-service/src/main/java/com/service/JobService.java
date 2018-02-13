package com.service;

import java.util.List;

import com.domain.Job;

public interface JobService {
	
	/**
	 * 添加职位
	 * @param job
	 * @return
	 */
	boolean addJob(Job job);
	
	/**
	 * 根据职位名称查询职位
	 * @param jobName
	 * @return
	 */
	List<Job> getJobByName(String jobName);
	
	/**
	 * 获取全部职位
	 * @return
	 */
	List<Job> getAllJob();
	
	/**
	 * 修改职位
	 * @param job
	 * @return
	 */
	boolean updateJob(Job job);
	
	/**
	 * 根据id查询职位
	 * @param jobid
	 * @return
	 */
	Job getJobById(String jobid);
	
	/**
	 * 删除职位
	 * @param jobIds
	 * @return
	 */
	boolean deleteJob(String jobIds);
	
}
