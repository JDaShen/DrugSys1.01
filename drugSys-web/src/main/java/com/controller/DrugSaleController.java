package com.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.PageCriterias;
import com.domain.PgrPageBean;
import com.domain.PgrPageCriterias;
import com.domain.Purchaseandgoodsreject;
import com.domain.SaleVo;
import com.domain.Saleorder;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.service.DrugPurchaseService;
import com.service.DrugSaleService;
	@Controller
	@RequestMapping(value="/drugSale")
	public class DrugSaleController {
	@Autowired
	private DrugSaleService drugSaleService;
	
	/*
	 * 添加一个销售订单
	 */
	@RequestMapping(value="/drugSale.action")
	public String addDrugOrder(SaleVo vo){
		
		/**
		 * 处理数据类型total,tradetype,integral添加pgr未设置的参数
		 */
		Integer amount = vo.getSaleOrderItem().getAmount();
		//BigDecimal ten = new BigDecimal(vo.getSaleOrderItem().getSingelprice());
		BigDecimal singelprice = vo.getSaleOrderItem().getSingelprice();
		BigDecimal bigDecimalamount = new BigDecimal(amount);
		BigDecimal multiply = bigDecimalamount.multiply(singelprice);
		vo.getSaleOrder().setTotal(multiply);
		vo.getSaleOrder().setTradetype(1);
		
		Double dis = vo.getSaleOrderItem().getDiscount();
		
		BigDecimal disdis = new BigDecimal(dis);
		BigDecimal bigDecimal = multiply.multiply(disdis);
		Integer integral = bigDecimal.intValue();
		vo.getSaleOrder().setIntegral(integral);
		/**
		 * 补全item未设置数据 tradeid
		 * vo.getPgritem().setPgritemid("manual-define");
		 */
		vo.getSaleOrderItem().setTradeid(vo.getSaleOrder().getTradeid());
		System.out.println(vo.getSaleOrder());
		System.out.println(vo.getSaleOrderItem());
		drugSaleService.addSaleOrder(vo);
		return "/drugSale/drugSaleInfo";
	}
	
	/**
	 * 查询所有订单流水
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping(value="drugSaleInfo.action")
	public @ResponseBody PgrPageBean<Saleorder> getAllPgrInfo(PgrPageCriterias pageCriterias){
		PgrPageBean<Saleorder> pgrPageBean = new PgrPageBean<>();
		pgrPageBean.setPageCriteria(pageCriterias);
		List<Saleorder> list = drugSaleService.getDrugSaleInfo(pgrPageBean);
		pgrPageBean.setData(list);
		return pgrPageBean;
	}
	/**
	 * 确认销售退货
	 * @param 
	 */
	@RequestMapping(value="drugSaleRefuse.action")
	public String confirmRefuse(String[] ids){
		drugSaleService.refuseOrder(ids);
		return "/drugSale/drugSaleRefuse";
	}
	/**
	 * 查询所有已销售
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping(value="drugSaleInfo2.action")
	public @ResponseBody PgrPageBean<Saleorder> getAllPgrInfo2(PgrPageCriterias pageCriterias){
		PgrPageBean<Saleorder> pgrPageBean = new PgrPageBean<>();
		pgrPageBean.setPageCriteria(pageCriterias);
		List<Saleorder> list = drugSaleService.getDrugSaleInfo2(pgrPageBean);
		pgrPageBean.setData(list);
		return pgrPageBean;
	}
}
