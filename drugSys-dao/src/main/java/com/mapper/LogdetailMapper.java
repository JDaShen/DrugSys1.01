package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.DispatchDetailVo;
import com.domain.Logdetail;
import com.domain.LogdetailExample;
import com.domain.PageCriterias;
import com.domain.StockSumVo;

public interface LogdetailMapper {
    int countByExample(LogdetailExample example);

    int deleteByExample(LogdetailExample example);

    int deleteByPrimaryKey(String logid);

    int insert(Logdetail record);

    int insertSelective(Logdetail record);

    List<Logdetail> selectByExample(LogdetailExample example);

    Logdetail selectByPrimaryKey(String logid);

    int updateByExampleSelective(@Param("record") Logdetail record, @Param("example") LogdetailExample example);

    int updateByExample(@Param("record") Logdetail record, @Param("example") LogdetailExample example);

    int updateByPrimaryKeySelective(Logdetail record);

    int updateByPrimaryKey(Logdetail record);

	void updateState(String diId);
	//统计库存信息
	List<StockSumVo> getStockSummary(PageCriterias pageCriteria);
	//获取符合条件的记录数
	Integer getToal(PageCriterias pageCriteria);
	//根据id获取商品流动信息
	List<Logdetail> getGoodsChangeByDiid(PageCriterias pageCriteria);
	//根据id获取商品流动信息,符合条件的分页总数total
	int goodsToal(PageCriterias pageCriteria);
	//过期查询
	List<StockSumVo> getExpireGoods(PageCriterias pageCriteria);
	//库存报警查询
	List<StockSumVo> getWarningGoods(PageCriterias pageCriteria);
	//统计报警条目
	int getTotalWarning(PageCriterias pageCriteria);
	//统计过期条目
	int getTotalExpire(PageCriterias pageCriteria);
	//查询未盘点商品
	List<DispatchDetailVo> getAllPendCheckGoods(PageCriterias pageCriteria);
	//统计询未盘点商品桃木
	int getAllPendCheckGoodssEntry(PageCriterias pageCriteria);
	
}