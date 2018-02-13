package com.controller;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.PgrPageBean;
import com.domain.PgrPageCriterias;
import com.domain.PgrVo;
import com.domain.Purchaseandgoodsreject;
import com.service.DrugPurchaseService;
	/**
	 * 采购模块
	 * @author 
	 */
	@Controller
	@RequestMapping(value="/drugPurchase")
	public class DrugPurchaseController {
		@Autowired
		private DrugPurchaseService drugPurchaseService;
	
	/**
	 * 添加订单计划
	 * @param vo
	 * @return
	 */
	@RequestMapping(value="drugPurchaseAdd.action")
	public String addOrder(PgrVo vo){
		/**
		 * 处理数据类型totalprice，添加pgr未设置的参数
		 */
		Integer amount = vo.getPgritem().getAmount();
		BigDecimal ten = new BigDecimal(10);
		BigDecimal bigDecimal = new BigDecimal(amount);
		BigDecimal multiply = bigDecimal.multiply(ten);
		vo.getPgr().setTotalprice(multiply);
		/**
		 * 补全item未设置数据
		 */
		//vo.getPgritem().setPgritemid("manual-define");
		vo.getPgritem().setTradeid(vo.getPgr().getTradeid());
		System.out.println(vo.getPgr());
		System.out.println(vo.getPgritem());
		
		drugPurchaseService.addDrugOrder(vo);
		return "/drugPurchase/drugPurchaseInfo";
	}
	
	/**
	 * 查询所有订单流水
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping(value="drugPurchaseInfo.action")
	public @ResponseBody PgrPageBean<Purchaseandgoodsreject> getAllPgrInfo(PgrPageCriterias pageCriterias){
		PgrPageBean<Purchaseandgoodsreject> pgrPageBean = new PgrPageBean<>();
		pgrPageBean.setPageCriteria(pageCriterias);
		List<Purchaseandgoodsreject> list = drugPurchaseService.getDrugPurchaseInfo(pgrPageBean);
		pgrPageBean.setData(list);
		return pgrPageBean;
	}
	/**
	 * 查询所有未入库的订单
	 */
	@RequestMapping(value="drugPurchaseNeedToDo.action")
	public @ResponseBody PgrPageBean<Purchaseandgoodsreject> getAllPgrInfoUndo(PgrPageCriterias pageCriterias){
		PgrPageBean<Purchaseandgoodsreject> pgrPageBean = new PgrPageBean<>();
		pgrPageBean.setPageCriteria(pageCriterias);
		List<Purchaseandgoodsreject> list = drugPurchaseService.getDrugPurchaseInfoUndo(pgrPageBean);
		pgrPageBean.setData(list);
		return pgrPageBean;
	}
	/**
	 * 确认订单入库
	 * @param 
	 */
	@RequestMapping(value="drugPurchaseConfirm.action")
	public String confirmOrders(String[] ids){
		drugPurchaseService.confirmOrders(ids);
		return "/drugPurchase/drugPurchaseConfirm";
	}
	/**
	 * 确认采购退货
	 * @param 
	 */
	@RequestMapping(value="drugPurchaseRefuse.action")
	public String confirmRefuse(String[] ids){
		drugPurchaseService.confirmRefuse(ids);
		return "/drugPurchase/drugPurchaseRefuse";
	}
	
	@RequestMapping(value="getPgrInfoByCriterias.action")
	public @ResponseBody Map<String, Object> getPgrInfoByCriterias(String splid, String sfid,Integer pageIndex,Integer pageSize ){
		
		Map<String, Object> show = drugPurchaseService.getPgrInfoByCriterias(splid,sfid,pageIndex,pageSize);
		
		return show;
	}
	
		
}
