package com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.PgrPageBean;
import com.domain.Pgritem;
import com.domain.Purchaseandgoodsreject;
import com.domain.PurchaseandgoodsrejectExample;
import com.domain.SaleVo;
import com.domain.Saleorder;
import com.mapper.PurchaseandgoodsrejectMapper;
import com.mapper.SaleitemMapper;
import com.mapper.SaleorderMapper;
import com.service.DrugPurchaseService;
import com.service.DrugSaleService;
@Service
@Transactional
public class DrugSaleServiceImpl implements DrugSaleService {
	@Autowired
	private SaleorderMapper saleorderMapper;
	@Autowired
	private SaleitemMapper saleitemMapper;
	
	/**
	 * 查询所有销售流水
	 */
	@Override
	public List<Saleorder> getDrugSaleInfo(PgrPageBean<Saleorder> pgrPageBean) {
		List<Saleorder> list = saleorderMapper.getAllSaled();
		return list;
	}
	/**
	 * 添加一个订单
	 */
	@Override
	public void addSaleOrder(SaleVo vo) {
		saleorderMapper.insertSelective(vo.getSaleOrder());
		saleitemMapper.insertSelective(vo.getSaleOrderItem());
	}
	/**
	 * 退货
	 */
	@Override
	public void refuseOrder(String[] ids) {
		for (int i = 0; i < ids.length; i++) {
			saleorderMapper.updateOrderTradeType(ids[i]);
		}
	}
	/**
	 * 查询所有已销售的
	 */
	@Override
	public List<Saleorder> getDrugSaleInfo2(PgrPageBean<Saleorder> pgrPageBean) {
		List<Saleorder> list = saleorderMapper.getAllSaleInfo();
		return list;
	}
}
