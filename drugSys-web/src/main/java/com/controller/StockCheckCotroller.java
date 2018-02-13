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

import com.domain.Check;
import com.domain.CheckVo;
import com.domain.DispatchDetailVo;
import com.domain.GoodsVo;
import com.domain.PageCriterias;
import com.domain.Report;
import com.domain.ReportVo;
import com.domain.StockPageBean;
import com.service.CheckService;
import com.service.ReportService;

@Controller
@RequestMapping("/check")
public class StockCheckCotroller {
	@Autowired
	CheckService checkServicce;
	
	/**
	 * 添加盘点单+项+修改数据库状态（diid）
	 */
	@RequestMapping("/addCheck.action")
	public void AddReportLoss(@RequestBody Check check,HttpServletRequest request,HttpServletResponse response) {
		HttpSession session = request.getSession();
		//获取需要添加的商品
		List<GoodsVo> cItems = (List<GoodsVo>) session.getAttribute("itemList");
		CheckVo cVo = new CheckVo();
		cVo.setCheck(check);
		cVo.setcList(cItems);
		//判断是否有商品
		boolean flag;
		if(cItems==null) {//注意逻辑啊，老错
		System.out.println("为空");
			 flag = false;
		}else {
			flag =  true;
			checkServicce.AddCheck(cVo);
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
	 * 通过盘点单获取详细信息
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping("/getCheckDetail.action")
	public @ResponseBody StockPageBean<DispatchDetailVo> getReportDetailById(PageCriterias pageCriterias){
		StockPageBean<DispatchDetailVo> pageBean = new StockPageBean<>();
		pageBean.setPageCriteria(pageCriterias);
		checkServicce.getCheckDetailById(pageBean);
		return pageBean;
	}
	/**
	 * 查询所有盘点单
	 * @param pageCriteriasgetAllPendCheckGoods.action
	 * @return
	 */
	@RequestMapping("/getAllCheck.action")
	public @ResponseBody StockPageBean<Check> getReports(PageCriterias pageCriterias){
		StockPageBean<Check> pageBean = new StockPageBean<>();
		pageBean.setPageCriteria(pageCriterias);
		checkServicce.getCheckDetailByCriteia(pageBean);
		return pageBean;
	}
	/**
	 * 查询未盘点单商品
	 * @param pageCriterias
	 * @return
	 */
	@RequestMapping("/getAllPendCheckGoods.action")
	public @ResponseBody StockPageBean<DispatchDetailVo> getAllPendCheckGoods(PageCriterias pageCriterias){
		StockPageBean<DispatchDetailVo> pageBean = new StockPageBean<>();
		pageBean.setPageCriteria(pageCriterias);
		checkServicce.getAllPendCheckGoods(pageBean);
		return pageBean;
	}
	
}
