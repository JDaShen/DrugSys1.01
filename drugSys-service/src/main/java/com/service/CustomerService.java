package com.service;

import java.util.List;
import java.util.Map;

import com.domain.Customer;
import com.domain.CustomerVo;
import com.domain.ShowCustomerVO;

public interface CustomerService {
	
	/**
	 * 添加客户
	 * @param customer
	 * @return
	 */
	boolean addCustomer(Customer customer);
	
	/**
	 * 获取全部客户
	 * @return
	 */
	List<ShowCustomerVO> getAllCustomer();
	
	/**
	 * 修改用户
	 * @param customer
	 * @return
	 */
	boolean updateCustomer(Customer customer);
	
	/**
	 * 根据ID查询客户
	 * @param customerId
	 * @return
	 */
	Customer getCustomerById(String customerId);
	
	/**
	 * 删除客户
	 * @param customerVo
	 * @return
	 */
	String deleteCustomer(String ctids);
	
	/**
	 * 获取分页
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	Map<String, Object> getAllCustomerPageBean(Integer pageIndex, Integer pageSize);
	
}
