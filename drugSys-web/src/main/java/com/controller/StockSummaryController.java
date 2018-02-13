package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Logdetail;
import com.domain.PageCriterias;
import com.domain.StockPageBean;
import com.domain.StockSumVo;
import com.service.StockSummaryService;

/**
 * 库存信息汇总
 * @author zyg
 *
 */
@Controller
@RequestMapping("/summary")
public class StockSummaryController {
		@Autowired
		StockSummaryService stockSummaryService;
		/**
		 * 获取所有库存信息
		 * @param pageCriterias
		 */
		@RequestMapping("/stockSummary.action")
		public @ResponseBody StockPageBean<StockSumVo> getStockSummary(PageCriterias pageCriterias) {
			StockPageBean<StockSumVo> pageBean = new StockPageBean<>();
			pageBean.setPageCriteria(pageCriterias);
			stockSummaryService.getStockSummary(pageBean);
			return pageBean;
			
		}
		/**
		 * 根据diid统计商品流动信息
		 * @param pageCriterias
		 * @return pageBean
		 */
		@RequestMapping("/getSummaryDetail.action")
		public @ResponseBody StockPageBean<Logdetail> getSummayDetailByDiid(PageCriterias pageCriterias){
			StockPageBean<Logdetail> pageBean = new StockPageBean<>();
			pageBean.setPageCriteria(pageCriterias);
			stockSummaryService.getGoodsChangeByDiid(pageBean);
			return pageBean;
			
		}
}
