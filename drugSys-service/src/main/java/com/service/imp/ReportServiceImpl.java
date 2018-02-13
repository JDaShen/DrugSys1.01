package com.service.imp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.DispatchDetailVo;
import com.domain.GoodsVo;
import com.domain.Logdetail;
import com.domain.PageCriterias;
import com.domain.Report;
import com.domain.ReportVo;
import com.domain.Rpitems;
import com.domain.StockPageBean;
import com.domain.StockSumVo;
import com.mapper.LogdetailMapper;
import com.mapper.ReportMapper;
import com.mapper.RpitemsMapper;
import com.mapper.WarehouseMapper;
import com.service.ReportService;
@Service
@Transactional
public class ReportServiceImpl implements ReportService {
	@Autowired
	LogdetailMapper log;
	@Autowired
	ReportMapper re;
	@Autowired
	RpitemsMapper rits;
	@Autowired
	WarehouseMapper warehouseMapper;
	/**
	 * 同时向三张表插入数据
	 */
	@Override
	public void AddReportLoss(ReportVo rVo) {
	//1.报告单表
		Report report = rVo.getReport();
		report.setRtype(0);
		re.insert(report);
		String rid = rVo.getReport().getRid();
	//2.单详表,四个参数
		List<GoodsVo> items = rVo.getrItems();
		for (GoodsVo goodsVo : items) {
			Rpitems rpitems = new Rpitems();
			rpitems.setRid(rid);
			rpitems.setDiid(goodsVo.getDiId());
			rpitems.setAmount(Integer.parseInt(goodsVo.getReals()));
			//使用字符串裁切+随机数生成ID
			int rad = (int) (Math.random()*9999);
			String itemsId = rid.substring(0,9)+rad;
			rpitems.setRpitemid(itemsId);
			rits.insert(rpitems);
		}
	//3.日志表
		for (GoodsVo goodsVo : items) {
			//使用uuid
			String logId = UUID.randomUUID().toString().replaceAll("-", "");
			Logdetail logdetail = new Logdetail();
			logdetail.setLogid(logId);
			logdetail.setBatch("2316468");
			logdetail.setDiid(goodsVo.getDiId());
			logdetail.setTradeid(rid);
			logdetail.setTradetime(rVo.getReport().getDate());
			logdetail.setOutqty(Integer.parseInt(goodsVo.getReals()));
			logdetail.setInqty(0);
			logdetail.setWid(rVo.getReport().getWid());
			logdetail.setExpire(goodsVo.getExpire());
			logdetail.setSupplier(goodsVo.getManufacturer());
			logdetail.setSfid(rVo.getReport().getSfid());
			logdetail.setInfo("报损出库");
			log.insert(logdetail);
		}
	}
	/**
	 * 查询所有报损单
	 */
	@Override
	public void getReportDetailByCriteia(StockPageBean<Report> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
			List<Report> data=re.getAllReports(pageBean.getPageCriteria());
			pageBean.setData(data);
			int total = re.getTotalReportEntry(pageCriteria);
			//赋值
			pageBean.setData(data);
			pageBean.setTotal(total);
	}
	/**
	 * 报损单详细查询
	 */
	@Override
	public void getReportDetail(StockPageBean<DispatchDetailVo> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		List<DispatchDetailVo> data = re.getAllReportDetailsById(pageCriteria);
		int total = re.getTotalRDetailEntry(pageCriteria);
		//赋值
		pageBean.setData(data);
		pageBean.setTotal(total);
	}
	/**
	 * 过期查询
	 */
	@Override
	public void expireQuery(StockPageBean<StockSumVo> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		List<StockSumVo> data = log.getExpireGoods(pageCriteria);
		int total = log.getTotalExpire(pageCriteria);
		//赋值
		pageBean.setData(data);
		pageBean.setTotal(total);
	}
	/**
	 * 库存报警查询
	 */
	@Override
	public void warningQuery(StockPageBean<StockSumVo> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		List<StockSumVo> data = log.getWarningGoods(pageCriteria);
		int total = log.getTotalWarning(pageCriteria);
		//赋值
		pageBean.setData(data);
		pageBean.setTotal(total);
		
	}
	
}
