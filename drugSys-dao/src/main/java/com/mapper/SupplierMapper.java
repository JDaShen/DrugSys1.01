package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Supplier;
import com.domain.SupplierExample;

public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(String splid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(String splid);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);

    List<Supplier> selectSupplierPageBean(@Param("start") int start,@Param("pageSize") Integer pageSize,@Param("querysplname") String querysplname,@Param("querycontact") String querycontact);

}