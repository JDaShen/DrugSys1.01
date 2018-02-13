package com.service;

import com.domain.Logdetail;
import com.domain.StockPageBean;
import com.domain.StockSumVo;

public interface StockSummaryService {
	//统计库存信息
	void getStockSummary(StockPageBean<StockSumVo> pageBean);
	//由药品id获取商品流动信息
	void getGoodsChangeByDiid(StockPageBean<Logdetail> pageBean);

}
