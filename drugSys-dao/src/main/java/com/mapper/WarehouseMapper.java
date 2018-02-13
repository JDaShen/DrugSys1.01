package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.GoodsVo;
import com.domain.PageCriterias;
import com.domain.StockPageBean;
import com.domain.Warehouse;
import com.domain.WarehouseExample;

public interface WarehouseMapper {
    int countByExample(WarehouseExample example);

    int deleteByExample(WarehouseExample example);

    int deleteByPrimaryKey(String wid);

    int insert(Warehouse record);

    int insertSelective(Warehouse record);

    List<Warehouse> selectByExample(WarehouseExample example);

    Warehouse selectByPrimaryKey(String wid);

    int updateByExampleSelective(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByExample(@Param("record") Warehouse record, @Param("example") WarehouseExample example);

    int updateByPrimaryKeySelective(Warehouse record);

    int updateByPrimaryKey(Warehouse record);
    /**
     * 根据库存日志统计所有商品信息--动态查询一套搞定
     * @param pagecriteria
     * @return
     */
	List<GoodsVo> getAllGoodsInfo(PageCriterias pagecriteria);
	/**
	 * 统计符合条件的总数
	 * @param pageCriteria
	 * @return
	 */
	Integer getTotal(PageCriterias pageCriteria);
}