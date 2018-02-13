package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Customer;
import com.domain.CustomerVo;
import com.domain.ShowCustomerVO;
import com.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	/**
	 * 添加客户
	 * @param customer
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/addCustomer.action")
	public void addCustomer(@RequestBody Customer customer,HttpServletResponse response) throws IOException {
		boolean flag = customerService.addCustomer(customer);
		if(flag) {
			 response.getWriter().write("success");
		 }else {
			 response.getWriter().write("loss");
		 }
	}
	
	/**
	 * 获取全部客户
	 * @return
	 */
	@RequestMapping(value="/getAllCustomer.action")
	public @ResponseBody List<ShowCustomerVO> getAllCustomer(){
		List<ShowCustomerVO> customers = customerService.getAllCustomer();
		return customers;
	}
	
	/**
	 * 获取全部客户分页
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	@RequestMapping(value="/getAllCustomerPageBean.action")
	public @ResponseBody Map<String, Object> getAllCustomerPageBean(Integer pageIndex,Integer pageSize ){
		Map<String, Object> show = customerService.getAllCustomerPageBean(pageIndex,pageSize);
		
		return show;
	}
	
	/**
	 * 修改客户	
	 * @param customer
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/updateCustomer.action")
	public void updateCustomer(@RequestBody Customer customer,HttpServletResponse response) throws IOException {
		boolean flag = customerService.updateCustomer(customer);
		if(flag) {
			 response.getWriter().write("success");
		 }else {
			 response.getWriter().write("loss");
		 }	
	}
	
	/**
	 * 删除客户
	 * @param customerVo
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/deleteCustomer.action")
	public void deleteCustomer(String ctids,HttpServletResponse response) throws IOException {
		String msg = customerService.deleteCustomer(ctids);//balanceNotNull,success,loss
		response.getWriter().write(msg);
	}
	
	/**
	 * 根据ID查询客户
	 * @param ctId
	 * @return
	 */
	@RequestMapping(value="/getCustomerById.action")
	public @ResponseBody Customer getCustomerById(String ctid) {
		Customer customer = customerService.getCustomerById(ctid);
		return customer;
	}
}
