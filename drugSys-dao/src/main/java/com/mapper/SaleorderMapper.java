package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Saleorder;
import com.domain.SaleorderExample;

public interface SaleorderMapper {
	
    int countByExample(SaleorderExample example);

    int deleteByExample(SaleorderExample example);

    int deleteByPrimaryKey(String tradeid);

    int insert(Saleorder record);

    int insertSelective(Saleorder record);

    List<Saleorder> selectByExample(SaleorderExample example);

    Saleorder selectByPrimaryKey(String tradeid);

    int updateByExampleSelective(@Param("record") Saleorder record, @Param("example") SaleorderExample example);

    int updateByExample(@Param("record") Saleorder record, @Param("example") SaleorderExample example);

    int updateByPrimaryKeySelective(Saleorder record);

    int updateByPrimaryKey(Saleorder record);
    
    /**
	 * 自己写的方法
	 * @param ids
	 */
	void updateOrderTradeType(String ids);
	
	List<Saleorder> getAllSaled();
	
	List<Saleorder> getAllSaleInfo();
}