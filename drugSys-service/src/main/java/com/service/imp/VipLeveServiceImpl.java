package com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Viplevel;
import com.mapper.ViplevelMapper;
import com.service.VipLevelService;

@Service
@Transactional
public class VipLeveServiceImpl implements VipLevelService {
	@Autowired
	private ViplevelMapper viplevelMapper;

	@Override
	public boolean addVipLevel(Viplevel viplevel) {
		int rows = viplevelMapper.insert(viplevel);
		return rows > 0;
	}

	@Override
	public List<Viplevel> getAllVipLevel() {
		List<Viplevel> viplevels = viplevelMapper.selectByExample(null);
		return viplevels;
	}

	@Override
	public boolean updateVipLevel(Viplevel viplevel) {
		int rows = viplevelMapper.updateByPrimaryKey(viplevel);
		return rows > 0;
	}

	@Override
	public boolean deleteVipLeve(String vipLeveIds) {
		try {
			String[] levelids = vipLeveIds.split(",");
			for (String levelid : levelids) {
				viplevelMapper.deleteByPrimaryKey(levelid);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Viplevel getLivelById(String levelId) {
		
		return viplevelMapper.selectByPrimaryKey(levelId);
	}

}
