package com.service.imp;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Customer;
import com.domain.CustomerShowVo;
import com.domain.CustomerVo;
import com.domain.ShowCustomerVO;
import com.mapper.CustomerMapper;
import com.service.CustomerService;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper customerMapper;

	@Override
	public boolean addCustomer(Customer customer) {
		int rows = customerMapper.insert(customer);
		return rows > 0;
	}

	@Override
	public List<ShowCustomerVO> getAllCustomer() {
		List<ShowCustomerVO> allCustomer = customerMapper.getAllCustomer();
		return allCustomer;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		int rows = customerMapper.updateByPrimaryKey(customer);
		return rows > 0;
	}

	@Override
	public Customer getCustomerById(String customerId) {
		Customer customer = null;
		customer = customerMapper.selectByPrimaryKey(customerId);
		return customer;
	}

	@Override
	public String deleteCustomer(String ctids) {
		String[] ids = ctids.split(",");
		try {
			for (String ctId : ids) {
				Customer customer = getCustomerById(ctId);
				int i = customer.getBalance().compareTo(BigDecimal.ZERO);
				if(i == 0) {
					customerMapper.deleteByPrimaryKey(ctId);					
				}else {
					return "balanceNotNull";
				}
			}
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "loss";
		}
	}

	@Override
	public Map<String, Object> getAllCustomerPageBean(Integer pageIndex, Integer pageSize) {
		int total = customerMapper.countByExample(null);
		int start = pageIndex*pageSize;
		List<CustomerShowVo> customers = customerMapper.getAllCustomerPageBean(start,pageSize);
		
		Map<String, Object> show = new HashMap<>();
		show.put("data", customers);
		show.put("total", total);
		return show;
	}

}
