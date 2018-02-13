package com.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Staff;
import com.domain.StaffExample;
import com.domain.StaffExample.Criteria;
import com.domain.StaffShowVo;
import com.domain.StaffVo;
import com.mapper.StaffMapper;
import com.service.StaffService;

@Service
@Transactional
public class StaffServiceImpl implements StaffService {
	@Autowired
	private StaffMapper staffMapper;

	@Override
	public boolean addStaff(Staff staff) {
		int rows = staffMapper.insert(staff);
		return rows > 0;
	}

	@Override
	public List<Staff> getStaffsByJob(String jobId) {
		StaffExample staffExample = new StaffExample();
		staffExample.createCriteria().andJobidEqualTo(jobId);
		List<Staff> staffs = staffMapper.selectByExample(staffExample);
		return staffs;
	}

	@Override
	public List<Staff> getAllStaff() {
		List<Staff> staffs = staffMapper.selectByExample(null);
		return staffs;
	}

	@Override
	public boolean updateStaff(Staff staff) {
		
		try {
				staffMapper.updateByPrimaryKey(staff);
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean deleteStaff(String sfIds) {
		try {
			String[] staffIds = sfIds.split(",");
			for (String staffId : staffIds) {
				staffMapper.deleteByPrimaryKey(staffId);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Map<String, Object> getAllStaffPageBean(Integer pageIndex, Integer pageSize, String querysfName,
			String querysfAddress, Integer querysfState) {
		StaffExample staffExample = new StaffExample();
		Criteria criteria = staffExample.createCriteria();
		if(querysfName != null && querysfName != " ") {
			criteria.andSfnameLike("%"+querysfName+"%");
		}
		if(querysfAddress != null && querysfAddress != " ") {
			criteria.andSfaddressLike("%"+querysfAddress+"%");
		}
		if(querysfState != null) {
			criteria.andSfstateEqualTo(querysfState);
		}
//		int total = staffMapper.countByCriteria(querysfName,querysfAddress,querysfState);
		int total = staffMapper.countByExample(staffExample);
		System.out.println(total);
		
		int start = pageIndex*pageSize;
		
		List<StaffShowVo> staffs = staffMapper.selectStaffPageBean(start,pageSize,querysfName,querysfAddress,querysfState);
		
		Map<String, Object> show = new HashMap<>();
		show.put("data", staffs);
		show.put("total", total);
		return show;
	}

	@Override
	public Staff getStaffById(String sfid) {
		
		return staffMapper.selectByPrimaryKey(sfid);
	}

}
