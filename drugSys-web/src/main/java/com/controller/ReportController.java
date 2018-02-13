package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.DispatchDetailVo;
import com.domain.GoodsVo;
import com.domain.Logdetail;
import com.domain.PageCriterias;
import com.domain.Report;
import com.domain.ReportVo;
import com.domain.StockPageBean;
import com.domain.StockSumVo;
import com.service.ReportService;

@Controller
@RequestMapping("/report")
public class ReportController {
	@Autowired
	ReportService reportServicce;
	
	/**
	 * 添加报告单+项+日志
	 */
	@RequestMapping("/addReport.action")
	public void AddReportLoss(@RequestBody Report report,HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		//获取需要添加的商品
		List<GoodsVo> rItems = (List<GoodsVo>) session.getAttribute("itemList");
		ReportVo rVo = new ReportVo();
		rVo.setReport(report);
		rVo.setrItems(rItems);
		//判断是否有商品
		boolean flag;
		if(rItems==null) {//注意逻辑啊，老错
		System.out.println("为空");
			 flag = false;
		}else {
			flag =  true;
			reportServicce.AddReportLoss(rVo);
			session.removeAttribute("itemList");
		}
		//使用一个包装类包装数据
		String json = "{\"flag\":"+flag+"}";
		try {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().write(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 根据报损单id查询所有详细
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping("/getReportDetail.action")
	public @ResponseBody StockPageBean<DispatchDetailVo> getReportDetailById(PageCriterias pageCriterias){
		StockPageBean<DispatchDetailVo> pageBean = new StockPageBean<>();
		pageBean.setPageCriteria(pageCriterias);
		reportServicce.getReportDetail(pageBean);
		return pageBean;
	}
	/**
	 * 查询所有报损单
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping("/getAllReports.action")
	public @ResponseBody StockPageBean<Report> getReports(PageCriterias pageCriterias){
		StockPageBean<Report> pageBean = new StockPageBean<>();
		pageBean.setPageCriteria(pageCriterias);
		reportServicce.getReportDetailByCriteia(pageBean);
		return pageBean;
	}
	/**
	 * 过期查询
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping("/expireQuery.action")
	public @ResponseBody StockPageBean<StockSumVo> expireQuery(PageCriterias pageCriterias) {
		StockPageBean<StockSumVo> pageBean = new StockPageBean<>();
		pageBean.setPageCriteria(pageCriterias);
		reportServicce.expireQuery(pageBean);
		return pageBean;
		
	}
	/**
	 * 库存报警查询
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping("/warning.action")
	public @ResponseBody StockPageBean<StockSumVo> QueryWarning(PageCriterias pageCriterias) {
		StockPageBean<StockSumVo> pageBean = new StockPageBean<>();
		pageBean.setPageCriteria(pageCriterias);
		reportServicce.warningQuery(pageBean);
		return pageBean;
		
	}
}
