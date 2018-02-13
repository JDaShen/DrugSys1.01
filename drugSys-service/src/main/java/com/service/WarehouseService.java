package com.service;

import java.util.List;

import com.domain.AddDisptchVo;
import com.domain.DispatchDetailVo;
import com.domain.GoodsVo;
import com.domain.ShowDispatchVo;
import com.domain.StockPageBean;
import com.domain.Warehouse;

public interface WarehouseService {
	//获取所有仓库
	List<Warehouse> getAllWarehouse();

	void  getAllGoodsInfo(StockPageBean<GoodsVo> pageBean);

	void addDispatchers(AddDisptchVo addDisptchVo);
	//获取所有调度单
	void getAllDisptchers(StockPageBean<ShowDispatchVo> pageBean);

	void getAllDisptchersDetailById(StockPageBean<DispatchDetailVo> pageBean);
	
}
