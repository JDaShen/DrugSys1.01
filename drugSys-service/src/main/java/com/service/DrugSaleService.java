package com.service;

import java.util.List;

import com.domain.PgrPageBean;
import com.domain.SaleVo;
import com.domain.Saleorder;

public interface DrugSaleService {
	//查询所有销售流水
	List<Saleorder> getDrugSaleInfo(PgrPageBean<Saleorder> pgrPageBean);
	//添加一个订单
	void addSaleOrder(SaleVo vo);
	//销售退货，改变状态
	void refuseOrder(String[] ids);
	//查询所有已销售
	List<Saleorder> getDrugSaleInfo2(PgrPageBean<Saleorder> pgrPageBean);

}
