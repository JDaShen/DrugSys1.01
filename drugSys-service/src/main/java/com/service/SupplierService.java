package com.service;

import java.util.List;
import java.util.Map;

import com.domain.Supplier;
import com.domain.SupplierVo;

public interface SupplierService {
	
	/**
	 * 添加供货商
	 * @param supplier
	 * @return
	 */
	boolean addSupplier(Supplier supplier);
	
	/**
	 * 根据供货商名称查询供货商
	 * @param supplierName
	 * @return
	 */
	List<Supplier> getSupplierByName(String supplierName);
	
	/**
	 * 获取所有供货商
	 * @return
	 */
	List<Supplier> getAllSupplier();
	
	/**
	 * 修改供应商
	 * @param supplier
	 * @return
	 */
	boolean updateSupplier(Supplier supplier);
	
	/**
	 * 
	 * 删除供应商
	 * @param supplierVo
	 * @return
	 */
	boolean deleteSupplier(String splIds);
	
	/**
	 * 供应商分页条件查询
	 * @return
	 */
	Map<String, Object> getSupplierPageBean(Integer pageIndex,Integer pageSize,String querysplname,String querycontact);
	
	/**
	 * 根据id获取供应商
	 * @param splIds
	 * @return
	 */
	Supplier getSupplierById(String splIds);
	
}
