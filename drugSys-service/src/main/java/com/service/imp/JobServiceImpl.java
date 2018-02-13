package com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Job;
import com.domain.JobExample;
import com.mapper.JobMapper;
import com.service.JobService;

@Service
@Transactional
public class JobServiceImpl implements JobService{
	@Autowired
	private JobMapper jobMapper;

	@Override
	public boolean addJob(Job job) {
		int rows = jobMapper.insert(job);
		return rows > 0;
	}

	@Override
	public List<Job> getJobByName(String jobName) {
		JobExample jobExample = new JobExample();
		jobExample.createCriteria().andJobnameEqualTo(jobName);
		List<Job> jobs = jobMapper.selectByExample(jobExample);
		return jobs;
	}

	@Override
	public List<Job> getAllJob() {
		List<Job> jobs = jobMapper.selectByExample(null);
		return jobs;
	}

	@Override
	public boolean updateJob(Job job) {
		int rows = jobMapper.updateByPrimaryKey(job);
		return rows > 0;
	}

	@Override
	public Job getJobById(String jobid) {
		Job job = jobMapper.selectByPrimaryKey(jobid);
		return job;
	}

	@Override
	public boolean deleteJob(String jobIds) {

		try {
			String[] ids = jobIds.split(",");
			for (String jobId : ids) {
				jobMapper.deleteByPrimaryKey(jobId);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	
}
