package com.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Supplier;
import com.domain.SupplierExample;
import com.domain.SupplierVo;
import com.mapper.SupplierMapper;
import com.service.SupplierService;
@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierMapper supplierMapper;
	
	/**
	 * 查出默认标识符为1的供应商并修改供应商的默认标识符为空
	 */
	public void updateIsDefault(){
		SupplierExample supplierExample = new SupplierExample();
		supplierExample.createCriteria().andIsdefaultEqualTo((byte) 1);
		List<Supplier> defaultSupplier = supplierMapper.selectByExample(supplierExample);
		if(defaultSupplier.size() > 0) {
			Supplier supplier = defaultSupplier.get(0);
			supplier.setIsdefault(null);
			supplierMapper.updateByPrimaryKey(supplier);
		}
	}

	@Override
	public boolean addSupplier(Supplier supplier) {
		if((byte)1 == supplier.getIsdefault()) {
			updateIsDefault();
		}		
		int rows = supplierMapper.insert(supplier);
		return rows>0;
	}

	@Override
	public List<Supplier> getSupplierByName(String supplierName) {
		SupplierExample supplierExample = new SupplierExample();
		supplierExample.createCriteria().andSplnameEqualTo(supplierName);
		List<Supplier> suppliers = supplierMapper.selectByExample(supplierExample);
		return suppliers;
	}

	@Override
	public List<Supplier> getAllSupplier() {
		List<Supplier> list = supplierMapper.selectByExample(null);		
		return list;
	}

	@Override
	public boolean updateSupplier(Supplier supplier) {
		if((byte)1 == supplier.getIsdefault()) {
			updateIsDefault();
		}
		int rows = supplierMapper.updateByPrimaryKey(supplier);
		return rows > 0;
	}

	@Override
	public boolean deleteSupplier(String splIds) {
		
		try {
			String[] idarr = splIds.split(",");
			for (String supplierId : idarr) {
				supplierMapper.deleteByPrimaryKey(supplierId);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Map<String, Object> getSupplierPageBean(Integer pageIndex, Integer pageSize, String querysplname,
			String querycontact) {
		SupplierExample supplierExample = new SupplierExample();
		if(querysplname != null && querysplname != " ") {
			supplierExample.createCriteria().andSplnameLike("%"+querysplname+"%");
		}
		if(querycontact != null && querycontact != " ") {
			supplierExample.createCriteria().andContactLike("%"+querycontact+"%");
		}
		int total = supplierMapper.countByExample(supplierExample);
		
		int start = pageIndex*pageSize; 
		
		List<Supplier> suppliers = supplierMapper.selectSupplierPageBean(start,pageSize,querysplname,querycontact);
		
		Map<String, Object> show = new HashMap<>();
		show.put("data", suppliers);
		show.put("total", total);
		return show;
	}

	@Override
	public Supplier getSupplierById(String splIds) {
		Supplier supplier = supplierMapper.selectByPrimaryKey(splIds);
		return supplier;
	}
	
	
}
