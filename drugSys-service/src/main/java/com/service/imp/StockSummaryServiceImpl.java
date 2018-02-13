package com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Logdetail;
import com.domain.PageCriterias;
import com.domain.StockPageBean;
import com.domain.StockSumVo;
import com.mapper.LogdetailMapper;
import com.service.StockSummaryService;
/**
 * 库存汇总
 * @author zyg
 *
 */
@Service
@Transactional
public class StockSummaryServiceImpl implements StockSummaryService {
	@Autowired
	private LogdetailMapper log;
/**
 * 统计库存信息
 */
	@Override
	public void getStockSummary(StockPageBean<StockSumVo> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		List<StockSumVo> data = log.getStockSummary(pageCriteria);
		Integer total = log.getToal(pageCriteria);
		pageBean.setData(data);
		pageBean.setTotal(total);
	}
	/**
	 * 由药品id获取商品流动信息
	 */
@Override
public void getGoodsChangeByDiid(StockPageBean<Logdetail> pageBean) {
	PageCriterias pageCriteria = pageBean.getPageCriteria();
	List<Logdetail> data = log.getGoodsChangeByDiid(pageCriteria);
	int total = log.goodsToal(pageCriteria);
	
	//赋值
	pageBean.setData(data);
	pageBean.setTotal(total);
	
	
	
}
	
}
