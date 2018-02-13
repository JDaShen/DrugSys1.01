package com.controller;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Drugdetailed;
import com.domain.Druginfo;
import com.domain.Drugtotal;
import com.service.DrugMCService;


@Controller
@RequestMapping("/drugMC")
public class DrugManagementController {
	
	@Autowired
	private DrugMCService drugMCService;
	
	/**
	 * 显示树菜单
	 * @return
	 */
	@RequestMapping("/showTree")
	public @ResponseBody List<Object> showTree() throws Exception { 
		List<Object> drugma = new ArrayList<>();
		//药品管理
		Map<String, Object> tree1 = new HashMap<>();
		tree1.put("id", 0);
		tree1.put("name", "药品管理");
		drugma.add(tree1);
		
		//detail 节点
		Map<String, Object> detail = new HashMap<>();
		detail.put("id","x");
		detail.put("name", "查询所有分类");
		detail.put("pid", 0);
		detail.put("page", "/drugSys-parent/drugMC/toShowDetail.action?ddid=");
		drugma.add(detail);
		
		//all 为所有分类 节点
		Map<String, Object> all = new HashMap<>();
		all.put("id",null);
		all.put("name", "所有分类药品");
		all.put("pid", 0);
		all.put("page", "/drugSys-parent/drugMC/toShowDrugs.action?ddid=");
		drugma.add(all);
		
		//获取 一级tree 菜单
		List<Drugtotal> dtList = drugMCService.showTree1();
		for (int i = 0; i < dtList.size(); i++) {
			Map<String, Object> tree2 = new HashMap<>();
			Drugtotal drugtotal = dtList.get(i);
			tree2.put("pid", 0);
			tree2.put("id", drugtotal.getDtid());
			tree2.put("name", drugtotal.getDtname());
			drugma.add(tree2);
			List<Drugdetailed> ddList = drugMCService.getDrugDetail(drugtotal.getDtid());
			//判断 一级tree下面是否有子节点
			if (ddList.size() > 0) {
				/*tree1.put("isLeaf", true);
				tree1.put("expanded", false);*/
				for (int j = 0; j < ddList.size(); j++) {
					Map<String, Object> children = new HashMap<>();
					Drugdetailed drugdetailed = ddList.get(j);
					children.put("pid", drugtotal.getDtid());
					children.put("page", "/drugSys-parent/drugMC/toShowDrugs.action?ddid=");
					children.put("id", drugdetailed.getDdid());
					children.put("name", drugdetailed.getDdname());
					drugma.add(children);
				}
			}
			
		}
		//采购进货管理
		Map<String, Object> purchase = new HashMap<>();
		purchase.put("id", "a");
		purchase.put("name", "采购进货管理");
		drugma.add(purchase);
		
		Map<String, Object> p1 = new HashMap<>();
		p1.put("id", "a1");
		p1.put("page", "/drugSys-parent/page/drugPurchase.action?ddid=");
		p1.put("pid", "a");
		p1.put("name", "采购进货");
		drugma.add(p1);
		
		Map<String, Object> p2 = new HashMap<>();
		p2.put("id", "a2");
		p2.put("page", "/drugSys-parent/page/drugPurchaseConfirm.action?ddid=");
		p2.put("pid", "a");
		p2.put("name", "进货入库");
		drugma.add(p2);
		
		Map<String, Object> p3 = new HashMap<>();
		p3.put("id", "a3");
		p3.put("page", "/drugSys-parent/page/drugPurchaseRefuse.action?ddid=");
		p3.put("pid", "a");
		p3.put("name", "采购退货");
		drugma.add(p3);
		
		Map<String, Object> p4 = new HashMap<>();
		p4.put("id", "a4");
		p4.put("page", "/drugSys-parent/page/drugPurchaseInfo.action?ddid=");
		p4.put("pid", "a");
		p4.put("name", "采购流水");
		drugma.add(p4);
		
		Map<String, Object> p5 = new HashMap<>();
		p5.put("id", "a5");
		p5.put("page", "/drugSys-parent/page/stockChangeQuery.action?ddid=");
		p5.put("pid", "a");
		p5.put("name", "当前库存查询");
		drugma.add(p5);
		
		//销售管理
		Map<String, Object> sale = new HashMap<>();
		sale.put("id", "b");
		sale.put("name", "销售管理");
		drugma.add(sale);
		
		Map<String, Object> s1 = new HashMap<>();
		s1.put("id", "b1");
		s1.put("page", "/drugSys-parent/page/drugSale.action?ddid=");
		s1.put("pid", "b");
		s1.put("name", "新的销售");
		drugma.add(s1);
		
		Map<String, Object> s2 = new HashMap<>();
		s2.put("id", "b2");
		s2.put("page", "/drugSys-parent/page/drugSaleRefuse.action?ddid=");
		s2.put("pid", "b");
		s2.put("name", "销售退货");
		drugma.add(s2);
		
		Map<String, Object> s3 = new HashMap<>();
		s3.put("id", "b3");
		s3.put("page", "/drugSys-parent/page/drugSaleInfo.action?ddid=");
		s3.put("pid", "b");
		s3.put("name", "销售流水");
		drugma.add(s3);
		
		Map<String, Object> s4 = new HashMap<>();
		s4.put("id", "b4");
		s4.put("page", "/drugSys-parent/page/stockChangeQuery.action?ddid=");
		s4.put("pid", "b");
		s4.put("name", "当前库存查询");
		drugma.add(s4);
		
		//库存管理
		Map<String, Object> stock = new HashMap<>();
		stock.put("id", "c");
		stock.put("name", "库存管理");
		drugma.add(stock); 
		
		Map<String, Object> t1 = new HashMap<>();
		t1.put("id", "c1");
		t1.put("page", "/drugSys-parent/page/stockDispatch.action?ddid=");
		t1.put("pid", "c");
		t1.put("name", "库存调拨");
		drugma.add(t1);
		
		Map<String, Object> t2 = new HashMap<>();
		t2.put("id", "c2");
		t2.put("page", "/drugSys-parent/page/reportLoss.action?ddid=");
		t2.put("pid", "c");
		t2.put("name", "报损包溢");
		drugma.add(t2);
		
		Map<String, Object> t3 = new HashMap<>();
		t3.put("id", "c3");
		t3.put("page", "/drugSys-parent/page/check.action?ddid=");
		t3.put("pid", "c");
		t3.put("name", "库存盘点");
		drugma.add(t3);
		
		Map<String, Object> t4 = new HashMap<>();
		t4.put("id", "c4");
		t4.put("page", "/drugSys-parent/page/stockChangeQuery.action?ddid=");
		t4.put("pid", "c");
		t4.put("name", "库存变动");
		drugma.add(t4);
		
		Map<String, Object> t5 = new HashMap<>();
		t5.put("id", "c5");
		t5.put("page", "/drugSys-parent/page/expireQuery.action?ddid=");
		t5.put("pid", "c");
		t5.put("name", "过期查询");
		drugma.add(t5);
		
		Map<String, Object> t6 = new HashMap<>();
		t6.put("id", "c6");
		t6.put("page", "/drugSys-parent/page/stockWarning.action?ddid=");
		t6.put("pid", "c");
		t6.put("name", "库存报警");
		drugma.add(t6);
		
		//系统管理
		Map<String, Object> sysma = new HashMap<>();
		sysma.put("id", "d");
		sysma.put("name", "系统管理");
		drugma.add(sysma); 
		
		Map<String, Object> sm1 = new HashMap<>();
		sm1.put("id", "d1");
		sm1.put("page", "/drugSys-parent/page/supplierPage.action?ddid=");
		sm1.put("pid", "d");
		sm1.put("name", "供应商管理");
		drugma.add(sm1);
		
		Map<String, Object> sm2 = new HashMap<>();
		sm2.put("id", "d2");
		sm2.put("pid", "d");
		sm2.put("name", "业务员及职务管理");
		drugma.add(sm2);
		
		Map<String, Object> sm2a = new HashMap<>();
		sm2a.put("id", "d2a");
		sm2a.put("page", "/drugSys-parent/page/jobPage.action?ddid=");
		sm2a.put("pid", "d2");
		sm2a.put("name", "职务管理");
		drugma.add(sm2a);
		
		Map<String, Object> sm2b = new HashMap<>();
		sm2b.put("id", "d2b");
		sm2b.put("page", "/drugSys-parent/page/staffPage.action?ddid=");
		sm2b.put("pid", "d2");
		sm2b.put("name", "业务员管理");
		drugma.add(sm2b);
		
		Map<String, Object> customer = new HashMap<>();
		customer.put("id", "d3");
		customer.put("pid", "d");
		customer.put("name", "客户管理");
		drugma.add(customer);
		
		Map<String, Object> cs1 = new HashMap<>();
		cs1.put("id", "d3a");
		cs1.put("page", "/drugSys-parent/page/vipLevelPage.action?ddid=");
		cs1.put("pid", "d3");
		cs1.put("name", "VIP等级管理");
		drugma.add(cs1);
		
		Map<String, Object> cs2 = new HashMap<>();
		cs2.put("id", "d3b");
		cs2.put("page", "/drugSys-parent/page/customerPage.action?ddid=");
		cs2.put("pid", "d3");
		cs2.put("name", "客户详情");
		drugma.add(cs2);
		//返回 json 结果
		return drugma;
		
	}
	
	/**
	 * 查询所有药品一级分类
	 * @return
	 */
	@RequestMapping("/showDrugTotal")
	public @ResponseBody List<Drugtotal> showDrugTotal(){
		List<Drugtotal> dtList = drugMCService.showTree1();
		return dtList;
	}
	
	/**
	 * 查询所有药品二级分类
	 * @return
	 */
	@RequestMapping("/showDrugDetail")
	public @ResponseBody List<Drugdetailed> showDrugDetail(String dtid){
		List<Drugdetailed> ddList = drugMCService.showDrugDetail(dtid);
		return ddList;
	}
	/**
	 * 转药品查询显示页面
	 * @return
	 * @throws IOException 
	 * @throws ServletException 
	 */
	@RequestMapping("/toShowDrugs")
	public String toShowDrugs(HttpServletRequest request,String ddid) throws IOException  {
		request.setAttribute("ddid", ddid);
		return "/drugManage/showAllDrugs";
		
	}
	
	/**
	 * 转 查询所有分类页面
	 * @return
	 */
	@RequestMapping("/toShowDetail")
	public String toDrug() {
		return "/drugManage/showAllDetail";
	}
	/**
	 * 去添加分类页面
	 * @return
	 */
	@RequestMapping("/toAddDetail")
	public String toAddDetail() {
		return "/drugManage/addDdtail";
	}
	/**
	 * 去修改分类页面
	 * @return
	 */
	@RequestMapping("/toUpdateDetail")
	public String toUpdateDetail() {
		return "/drugManage/updateDetail";
	}
	
	/**
	 * 去药品添加页面，页面为iframe弹窗形式
	 * @return
	 */
	@RequestMapping("/toAddDrug")
	public String toAddDrug() {
		return "/drugManage/addDrug";
	}
	
	/**
	 * 去药品修改页面，页面为iframe弹窗形式
	 * @return
	 */
	@RequestMapping("/toUpdateDrug")
	public String toUpdateDrug() {
		return "/drugManage/updateDrug";
	}	
	
	/**
	 * 分页查询二级分类下的所有药品信息
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/getDrugsByPage")
	public @ResponseBody Map<String, Object> getDrugsByPage(Integer pageIndex,Integer pageSize,String diname,String ddid,String diid){
		Map<String, Object> drugs = new HashMap<>();
		List<Druginfo> drugList = drugMCService.getDrugsByPage(pageIndex,pageSize,ddid,diid,diname);
		Integer total = drugMCService.getDrugsCount(ddid,diid,diname);
		drugs.put("data", drugList);
		drugs.put("total", total);
		return drugs;
		
	}
	
	/**
	 * 获取所有药品
	 * @return
	 */
	@RequestMapping(value="/showAllDrugs")
	public @ResponseBody Map<String, Object> showAllDrugs(String ddid,Integer pageIndex,Integer pageSize,String diname){
		List<Druginfo> allDrugs = drugMCService.showAllDrugs(pageIndex,pageSize,diname,ddid);
		Integer total = drugMCService.getDrugsCount(ddid, null, diname);
		Map<String, Object> map = new HashMap<>();
		map.put("data", allDrugs);
		map.put("total", total);
		return map;
	}
	
	/**
	 * 添加新药品
	 * @param druginfo
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/addDrug")
	public void addDrug(@RequestBody Druginfo druginfo,HttpServletResponse response) throws IOException {
		drugMCService.addDrug(druginfo);
		String text = "success";
		response.getWriter().write(text);
	}
	
	/**
	 * 添加类别
	 * @param drugdetailed
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/addDetail")
	public void addDetail(@RequestBody Drugdetailed drugdetailed,HttpServletResponse response) throws IOException {
		drugMCService.addDetail(drugdetailed);
		String text = "success";
		response.getWriter().write(text);
	}
	
	/**
	 * 根据id查询 druginfo 对象，药品信息,数据回显用
	 * @param response
	 * @param diid
	 * @throws IOException 
	 */
	@RequestMapping("/getDrugById")
	public @ResponseBody Druginfo getDrugById(HttpServletResponse response,String diid) throws IOException {
		Druginfo druginfo = drugMCService.getDrugById(diid);
		return druginfo;
	}
	
	/**
	 * 根据id查询DetailById 对象，信息,数据回显用
	 * @param response
	 * @param ddid
	 * @throws IOException 
	 */
	@RequestMapping("/getDetailById")
	public @ResponseBody Drugdetailed getDetailById(HttpServletResponse response,String ddid) throws IOException {
		Drugdetailed drugdetailed = drugMCService.getDetailById(ddid);
		return drugdetailed;
	}
	
	/**
	 * 修改药品信息
	 * @param druginfo
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/updateDrug")
	public void updateDrug(@RequestBody Druginfo druginfo,HttpServletResponse response) throws IOException {
		drugMCService.updateDrug(druginfo);
		String text = "success";
		response.getWriter().write(text);
	}
	
	/**
	 * 修改类别
	 * @param drugdetailed
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/updateDetail")
	public void updateDetail(@RequestBody Drugdetailed drugdetailed,HttpServletResponse response) throws IOException {
		drugMCService.updateDetail(drugdetailed);
		String text = "success";
		response.getWriter().write(text);
	}
	
	/**
	 * 批量删除药品
	 * @param response
	 * @param diids
	 * @throws IOException
	 */
	@RequestMapping("/deleteDrug")
	public void deleteDrug(HttpServletResponse response,String diids) throws IOException {
		drugMCService.deleteDrug(diids);
		String text = "success";
		response.getWriter().write(text);
	}
	
	/**
	 * 批量删除类别
	 * @param response
	 * @param ddids
	 * @throws IOException
	 */
	@RequestMapping("/deleteDetail")
	public void deleteDetail(HttpServletResponse response,String ids) throws IOException {
		boolean delInfo = drugMCService.deleteDetail(ids);
		if (delInfo) {
			response.getWriter().write("success");
		}else{
			response.getWriter().write("error");
		}
	}
	
	/**
	 * 查询 所有药品 分类
	 * @param pageIndex
	 * @param pageSize
	 * @param name
	 * @return
	 */
	@RequestMapping("/showAllDetails")
	public @ResponseBody Map<String, Object> showAllDetails(Integer pageIndex,Integer pageSize,String name){
		List<Drugdetailed> allDetails = drugMCService.showAllDetails(pageIndex,pageSize,name);
		Integer total = drugMCService.getDetailCount(name);
		Map<String, Object> map = new HashMap<>();
		map.put("data", allDetails);
		map.put("total", total);
		return map;
	}
}
