package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.PorderVo;
import com.domain.Purchaseandgoodsreject;
import com.domain.PurchaseandgoodsrejectExample;

public interface PurchaseandgoodsrejectMapper {
    int countByExample(PurchaseandgoodsrejectExample example);

    int deleteByExample(PurchaseandgoodsrejectExample example);

    int deleteByPrimaryKey(String tradeid);

    int insert(Purchaseandgoodsreject record);

    int insertSelective(Purchaseandgoodsreject record);

    List<Purchaseandgoodsreject> selectByExample(PurchaseandgoodsrejectExample example);

    Purchaseandgoodsreject selectByPrimaryKey(String tradeid);

    int updateByExampleSelective(@Param("record") Purchaseandgoodsreject record, @Param("example") PurchaseandgoodsrejectExample example);

    int updateByExample(@Param("record") Purchaseandgoodsreject record, @Param("example") PurchaseandgoodsrejectExample example);

    int updateByPrimaryKeySelective(Purchaseandgoodsreject record);

    int updateByPrimaryKey(Purchaseandgoodsreject record);

	/**
	 * 自己写的
	 */
    //查询所有未入库的订单
    List<Purchaseandgoodsreject> getOrdersUndo();
    //确认入库，改变状态
    void updateOrderState(String ids);
    //确认退货，改变状态
    void updateOrderStateRefuse(String ids);
    
    /**
     * 条件查询采购单
     * @param start
     * @param splid
     * @param sfid
     * @param pageSize
     * @return
     */
	List<PorderVo> getPgrInfoByCriterias(@Param("start") int start,@Param("splid") String splid,
			@Param("sfid") String sfid,@Param("pageSize") Integer pageSize);
}