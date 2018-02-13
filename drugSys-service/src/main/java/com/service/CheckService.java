package com.service;

import com.domain.Check;
import com.domain.CheckVo;
import com.domain.DispatchDetailVo;
import com.domain.StockPageBean;

public interface CheckService {
	//添加盘点单+详细单+日志表
	void AddCheck(CheckVo cVo);
	//条件查询所有盘点单
	void getCheckDetailByCriteia(StockPageBean<Check> pageBean);
	//根据id查询调度单
	void getCheckDetailById(StockPageBean<DispatchDetailVo> pageBean);
	//查询所有未盘点商品
	void getAllPendCheckGoods(StockPageBean<DispatchDetailVo> pageBean);

}
