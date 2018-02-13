package com.service;

import java.util.List;

import com.domain.Supplier;
import com.domain.Viplevel;

public interface VipLevelService {
	
	/**
	 * 添加VIP等级
	 * @param viplevel
	 * @return
	 */
	boolean addVipLevel(Viplevel viplevel);
	
	/**
	 * 获取所有VIP等级
	 * @return
	 */
	List<Viplevel> getAllVipLevel();
	
	/**
	 * 修改VIP等级
	 * @param viplevel
	 * @return
	 */
	boolean updateVipLevel(Viplevel viplevel);
	
	/**
	 * 删除VIP等级
	 * @param vipLeveIds
	 * @return
	 */
	boolean deleteVipLeve(String vipLeveIds);
	
	/**
	 * 根据ID查询等级
	 * @param levelId
	 * @return
	 */
	Viplevel getLivelById(String levelId);
	
	

}
