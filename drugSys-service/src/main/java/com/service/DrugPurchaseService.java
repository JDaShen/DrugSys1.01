package com.service;

import java.util.List;
import java.util.Map;

import com.domain.PgrPageBean;
import com.domain.PgrVo;
import com.domain.Pgritem;
import com.domain.Purchaseandgoodsreject;

public interface DrugPurchaseService {
	//添加一个订单
	void addDrugOrder(PgrVo vo);
	//查询所有流水
	List<Purchaseandgoodsreject> getDrugPurchaseInfo(PgrPageBean<Purchaseandgoodsreject> pageBean);
	//查询所有未入库的订单
	List<Purchaseandgoodsreject> getDrugPurchaseInfoUndo(PgrPageBean<Purchaseandgoodsreject> pgrPageBean);
	//确认订单入库
	void confirmOrders(String[] ids);
	//确认采购退货
	void confirmRefuse(String[] ids);
	
	/**
	 * 根据供应商Id获取订单
	 * @param splid
	 * @return
	 */
	Map<String, Object> getPgrInfoByCriterias(String splid,String sfid,Integer pageIndex,Integer pageSize);

}
