package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Customer;
import com.domain.CustomerExample;
import com.domain.CustomerShowVo;
import com.domain.ShowCustomerVO;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(String ctid);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(String ctid);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    List<ShowCustomerVO> getAllCustomer();

	List<CustomerShowVo> getAllCustomerPageBean(@Param("start") int start,@Param("pageSize") Integer pageSize);
}