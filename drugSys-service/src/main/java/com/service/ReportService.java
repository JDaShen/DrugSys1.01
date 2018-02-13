package com.service;

import com.domain.DispatchDetailVo;
import com.domain.Logdetail;
import com.domain.Report;
import com.domain.ReportVo;
import com.domain.StockPageBean;
import com.domain.StockSumVo;

public interface ReportService {

	void AddReportLoss(ReportVo rVo);
	//查询所有报告单
	void getReportDetailByCriteia(StockPageBean<Report> pageBean);
	//通过id查询报告单
	void getReportDetail(StockPageBean<DispatchDetailVo> pageBean);
	//过期查询
	void expireQuery(StockPageBean<StockSumVo> pageBean);
	//库存报警查询
	void warningQuery(StockPageBean<StockSumVo> pageBean);

}
