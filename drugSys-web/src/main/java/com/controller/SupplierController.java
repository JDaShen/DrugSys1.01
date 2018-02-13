package com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Supplier;
import com.domain.SupplierVo;
import com.service.SupplierService;

@Controller
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
	
	
	/**
	 * 添加供货商
	 * @param supplier
	 * @throws IOException 
	 */
	@RequestMapping(value="/addSupplier.action",method=RequestMethod.POST)
	public void addSupplier(@RequestBody Supplier supplier,HttpServletResponse response) throws IOException {
		 boolean flag = supplierService.addSupplier(supplier);
		 if(flag) {
			 response.getWriter().write("success");
		 }else {
			 response.getWriter().write("loss");
		 }
		 System.out.println(flag);
	}
	
	/**
	 * 根据供货商名称查询供货商
	 * @param supplierName
	 */
	@RequestMapping(value="/getSupplierByName.action")
	public void getSupplierByName(String supplierName,Model model) {
		List<Supplier> suppliers = supplierService.getSupplierByName(supplierName);
		if(suppliers.size() > 0) {
			model.addAttribute("isExist",true);
		}else {
			model.addAttribute("isExist",false);
		}		
	}
	
	
	/**
	 * 获取所有供应商
	 * @return
	 */
	@RequestMapping(value="/getAllSupplier.action")
	public @ResponseBody List<Supplier> getAllSupplier(){
		List<Supplier> suppliers = supplierService.getAllSupplier();
		return suppliers;
	}
	
	/**
	 * 查询供应商分页
	 * @param pageIndex
	 * @param pageSize
	 * @param querysplname
	 * @param querycontact
	 * @return
	 */
	@RequestMapping(value="/getSupplierPageBean.action")
	public @ResponseBody Map<String, Object> getSupplierPageBean(Integer pageIndex,Integer pageSize,String querysplname,String querycontact){
		 Map<String, Object> show = supplierService.getSupplierPageBean(pageIndex,pageSize,querysplname,querycontact);
				
		return show;
	}
	
	/**
	 * 修改供应商
	 * @param supplier
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/updateSupplier.action")
	public void updateSupplier(@RequestBody Supplier supplier,HttpServletResponse response) throws IOException {

		 boolean flag = supplierService.updateSupplier(supplier);
		 if(flag) {
			 response.getWriter().write("success");
		 }else {
			 response.getWriter().write("loss");
		 }
	}
	
	/**
	 * 删除供应商
	 * @param supplierVo
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/deleteSupplier.action")
	public void deleteSupplier(String  splIds, HttpServletResponse response) throws IOException {

		boolean flag = supplierService.deleteSupplier(splIds);

		if(flag) {
			 response.getWriter().write("success");
		 }else {
			 response.getWriter().write("loss");
		 }	
	}
	
	
		
}
