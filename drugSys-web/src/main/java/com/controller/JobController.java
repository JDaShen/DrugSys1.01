package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Job;
import com.service.JobService;

@Controller
public class JobController {
	@Autowired
	private JobService jobService;
	
	/**
	 * 添加职位
	 * @param job
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/addJob.action")
	public void addJob(@RequestBody Job job,HttpServletResponse response) throws IOException {
		
		System.out.println(job.getJobid());
		boolean flag = jobService.addJob(job);
		
		if(flag) {
			response.getWriter().write("success");
		}else {
			response.getWriter().write("loss");
		}
	}
	
	/**
	 * 根据职位名查询职位
	 * @param jobName
	 * @param model
	 */
	@RequestMapping(value="/getJobByName.action")
	public void getJobByName(String jobName,Model model) {
		List<Job> jobs = jobService.getJobByName(jobName);
		
		if(jobs.size() > 0) {
			model.addAttribute("isExist",true);
		}else {
			model.addAttribute("isExist",false);
		}
	}
	
	/**
	 * 获取全部职位
	 * @return
	 */
	@RequestMapping(value="/getAllJob.action")
	public @ResponseBody List<Job> getAllJob() {
		List<Job> jobs = jobService.getAllJob();
		return jobs;
	}
	
	/**
	 * 修改职位
	 * @param job
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/updateJob.action")
	public void updateJob(@RequestBody Job job,HttpServletResponse response) throws IOException {
		boolean flag = jobService.updateJob(job);
		
		if(flag) {
			response.getWriter().write("success");
		}else {
			response.getWriter().write("loss");
		}
	}
	
	@RequestMapping(value="/deleteJob.action")
	public void deleteJob(String jobIds,HttpServletResponse response) throws IOException{
		boolean flag = jobService.deleteJob(jobIds);
		if(flag) {
			response.getWriter().write("success");
		}else {
			response.getWriter().write("loss");
		}
	}
}
