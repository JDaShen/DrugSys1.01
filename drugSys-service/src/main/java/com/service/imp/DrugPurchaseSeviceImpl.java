package com.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.PgrPageBean;
import com.domain.PgrVo;
import com.domain.Pgritem;
import com.domain.PorderVo;
import com.domain.Purchaseandgoodsreject;
import com.domain.PurchaseandgoodsrejectExample;
import com.mapper.PgritemMapper;
import com.mapper.PurchaseandgoodsrejectMapper;
import com.service.DrugPurchaseService;
@Service
@Transactional
public class DrugPurchaseSeviceImpl implements DrugPurchaseService {
	@Autowired
	private PurchaseandgoodsrejectMapper purchaseandgoodsrejectMapper;
	@Autowired
	private PgritemMapper pgritemMapper;
	
	/**
	 * 查询所有订单流水
	 */
	@Override
	public List<Purchaseandgoodsreject> getDrugPurchaseInfo(PgrPageBean<Purchaseandgoodsreject> pageBean) {
		List<Purchaseandgoodsreject> list = purchaseandgoodsrejectMapper.selectByExample(null);
		return list;
	}

	/**
	 * 添加一个订单
	 */
	@Override
	public void addDrugOrder(PgrVo vo) {
		purchaseandgoodsrejectMapper.insert(vo.getPgr());
		pgritemMapper.insert(vo.getPgritem());
	}

	/**
	 * 查询所有未入库的订单
	 */
	@Override
	public List<Purchaseandgoodsreject> getDrugPurchaseInfoUndo(PgrPageBean<Purchaseandgoodsreject> pgrPageBean) {
		List<Purchaseandgoodsreject> list = purchaseandgoodsrejectMapper.getOrdersUndo();
		return list;
	}
	
	/**
	 * 确认订单入库
	 */
	@Override
	public void confirmOrders(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			purchaseandgoodsrejectMapper.updateOrderState(ids[i]);
		}
	}
	/**
	 * 确认采购退货
	 */
	@Override
	public void confirmRefuse(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			purchaseandgoodsrejectMapper.updateOrderStateRefuse(ids[i]);
		}
	}

	@Override
	public Map<String, Object> getPgrInfoByCriterias(String splid, String sfid,Integer pageIndex, Integer pageSize) {
		PurchaseandgoodsrejectExample example = new PurchaseandgoodsrejectExample();
		
		if(splid != null && splid != " ") {
			example.createCriteria().andSplidEqualTo(splid);
		}
		if(sfid != null && sfid != " ") {
			example.createCriteria().andSfidEqualTo(sfid);
		}
		int total = purchaseandgoodsrejectMapper.countByExample(example);
		
		int start = pageIndex*pageSize;
		List<PorderVo> porderVos = purchaseandgoodsrejectMapper.getPgrInfoByCriterias(start,splid,sfid,pageSize);
		
		Map<String, Object> show = new HashMap<>();
		show.put("total", total);
		show.put("data", porderVos);
		
		return show;
	}

	

	
}
