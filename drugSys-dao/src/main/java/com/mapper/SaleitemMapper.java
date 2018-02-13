package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Saleitem;
import com.domain.SaleitemExample;

public interface SaleitemMapper {
    int countByExample(SaleitemExample example);

    int deleteByExample(SaleitemExample example);

    int deleteByPrimaryKey(String soitemid);

    int insert(Saleitem record);

    int insertSelective(Saleitem record);

    List<Saleitem> selectByExample(SaleitemExample example);

    Saleitem selectByPrimaryKey(String soitemid);

    int updateByExampleSelective(@Param("record") Saleitem record, @Param("example") SaleitemExample example);

    int updateByExample(@Param("record") Saleitem record, @Param("example") SaleitemExample example);

    int updateByPrimaryKeySelective(Saleitem record);

    int updateByPrimaryKey(Saleitem record);
}