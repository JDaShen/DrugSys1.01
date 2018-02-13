package com.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Check;
import com.domain.CheckVo;
import com.domain.Checkitems;
import com.domain.DispatchDetailVo;
import com.domain.GoodsVo;
import com.domain.PageCriterias;
import com.domain.Rpitems;
import com.domain.StockPageBean;
import com.mapper.CheckMapper;
import com.mapper.CheckitemsMapper;
import com.mapper.LogdetailMapper;
import com.service.CheckService;
@Service
@Transactional
public class CheckServiceImpl implements CheckService {
	@Autowired
	private CheckMapper checkMapper;
	@Autowired
	private CheckitemsMapper citemsMapper;
	@Autowired
	private LogdetailMapper log;
	@Override
	/**
	 * 添加盘点单，同时插入三张表
	 */
	public void AddCheck(CheckVo cVo) {
		System.out.println("pand");
		//1.插入盘点表
		Check check = cVo.getCheck();
		String cid = check.getCid();
		List<GoodsVo> items = cVo.getcList();
		int size = items.size();
		check.setGoodsentry(size);
		check.setAmount(23);
		check.setComment(null);
		System.out.println(check);
		checkMapper.insert(check);
		//2.插入详细表
		for (GoodsVo goodsVo : items) {
			Checkitems cis = new Checkitems();
			cis.setCid(cid);
			cis.setDiid(goodsVo.getDiId());
			cis.setDiname(goodsVo.getDiName());
			cis.setWqty(Integer.parseInt(goodsVo.getReals()));
			cis.setRqty(goodsVo.getRqty());
			//使用字符串裁切+随机数生成ID
			int rad = (int) (Math.random()*9999);
			String itemsId = cid.substring(0,9)+rad;
			cis.setItemid(itemsId);
			citemsMapper.insert(cis);
		}
		//3.修改日志表盘点状态
		for (GoodsVo goodsVo : items) {
			String diId = goodsVo.getDiId();
			log.updateState(diId);
		}
	}
	/**
	 * 查询所有盘点单=2张表
	 */
	@Override
	public void getCheckDetailByCriteia(StockPageBean<Check> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		List<Check> data = checkMapper.getAllCheck(pageCriteria);
		int total = checkMapper.getTotalCheckEntry(pageCriteria);
		
		//赋值
		pageBean.setTotal(total);
		pageBean.setData(data);
	}
	/**
	 * 根据CID查询调度单
	 */
	@Override
	public void getCheckDetailById(StockPageBean<DispatchDetailVo> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		List<DispatchDetailVo> data = citemsMapper.getAllDetailByCid(pageCriteria);
		int total = citemsMapper.getTotalDetailEntryById(pageCriteria);
		
		//赋值
		pageBean.setTotal(total);
		pageBean.setData(data);
	}
	/**
	 * 查询未盘点商品
	 */
	@Override
	public void getAllPendCheckGoods(StockPageBean<DispatchDetailVo> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		List<DispatchDetailVo> data = log.getAllPendCheckGoods(pageCriteria);
		int total = log.getAllPendCheckGoodssEntry(pageCriteria);
		
		//赋值
		pageBean.setTotal(total);
		pageBean.setData(data);
	}

}
