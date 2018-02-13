package com.service.imp;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.AddDisptchVo;
import com.domain.Dispatch;
import com.domain.DispatchDetailVo;
import com.domain.Dispitems;
import com.domain.GoodsVo;
import com.domain.Logdetail;
import com.domain.PageCriterias;
import com.domain.ShowDispatchVo;
import com.domain.StockPageBean;
import com.domain.Warehouse;
import com.mapper.DispatchMapper;
import com.mapper.DispitemsMapper;
import com.mapper.LogdetailMapper;
import com.mapper.WarehouseMapper;
import com.service.WarehouseService;
@Service
@Transactional
public class WarehouseServiceImpl implements WarehouseService {
	@Autowired
	private WarehouseMapper warehouseMapper;
	@Autowired 
	private LogdetailMapper logdetailMapper;
	@Autowired
	private DispatchMapper dispatcherMapper;
	@Autowired
	private DispitemsMapper dispitems;
	/**
	 * 获取所有仓库
	 * @return
	 */
	@Override
	public List<Warehouse> getAllWarehouse() {
		return  warehouseMapper.selectByExample(null);
	}
	/**
	 * 分页查询说有仓库商品
	 */
	@Override
	public void getAllGoodsInfo(StockPageBean<GoodsVo> pageBean) {
		List<GoodsVo> data = warehouseMapper.getAllGoodsInfo(pageBean.getPageCriteria());
		//查询统计所有的套total
		Integer total = warehouseMapper.getTotal(pageBean.getPageCriteria());
		pageBean.setTotal(total);
		pageBean.setData(data);
	}
	/**
	 * 三个操作
	 * 1.添加调度单
	 * 2.添加调度单项
	 * 3.添加日志到log表-手动添加一个info字段信息
	 */
	@Override
	public void addDispatchers(AddDisptchVo addDisptchVo) {
		if(addDisptchVo==null) {
			System.out.println("为空");
			return;
		}
		//from to 由哪个仓库调度到那个仓库
		String from = addDisptchVo.getFrom();
		String to = addDisptchVo.getTo();
		
		//添加调度单
		Dispatch dispatch = new Dispatch();
		String dispid = addDisptchVo.getDispid();
		dispatch.setDispid(dispid);
		dispatch.setDate(addDisptchVo.getDate());
		dispatch.setFrom(from);
		dispatch.setTo(to);
		dispatch.setSfid(addDisptchVo.getSfid());
		dispatch.setMark(addDisptchVo.getMark());
		System.out.println(dispatch);
		dispatcherMapper.insertOnes(dispatch);
	
		//添加调度单项.处理父类订单截取+随机数,遍历添加
		List<GoodsVo> list = addDisptchVo.getList();
		if(list==null) {
			System.out.println("请添加调度商品");
			return;
		}
		for(int i=0;i<list.size();i++) {
			Dispitems items = new Dispitems();
			int rad = (int) (Math.random()*2000);
			String itemsId = addDisptchVo.getDispid().substring(4)+rad;//id
			items.setDitemid(itemsId);
			//设置数量
			items.setAmount(Integer.parseInt(list.get(i).getReals()));
			items.setDiid(list.get(i).getDiId());
			items.setDispid(dispid);
			dispitems.insert(items);
		}
		
		//插入日志表,多条，这里需要插入两条日志，从那出货，到那个仓库
		for(int i=0;i<list.size();i++) {
			String logId = UUID.randomUUID().toString().replaceAll("-", "");
			Logdetail logdetail = new Logdetail();
			logdetail.setLogid(logId);
			logdetail.setBatch("2316468");
			logdetail.setDiid(list.get(i).getDiId());
			logdetail.setTradeid(dispid);
			logdetail.setTradetime(addDisptchVo.getDate());
			//设置出入量
			logdetail.setOutqty(0);
			logdetail.setInqty(Integer.parseInt(list.get(i).getReals()));
			//插入到那个仓库
			logdetail.setWid(addDisptchVo.getTo());
			logdetail.setExpire(addDisptchVo.getDate());
			logdetail.setSupplier(list.get(i).getManufacturer());
			logdetail.setSfid(addDisptchVo.getSfid());
			
			
			List<Warehouse> allWarehouse = warehouseMapper.selectByExample(null);
		for (Warehouse warehouse : allWarehouse) {
			if(warehouse.getWid().equals(addDisptchVo.getFrom())) {
				from = warehouse.getWname();
			}
			if(warehouse.getWid().equals(addDisptchVo.getTo())) {
				to = warehouse.getWname();
			}
		}
		
		//插入到那个仓库
			logdetail.setInfo(from+"调度到"+to);
			logdetailMapper.insert(logdetail);
			//来自哪个仓库，对应仓库减少量
			logdetail.setOutqty(Integer.parseInt(list.get(i).getReals()));
			logdetail.setInqty(0);
			logdetail.setWid(addDisptchVo.getFrom());//来自的仓库id
			String logIdFrom = UUID.randomUUID().toString().replaceAll("-", "");
			logdetail.setLogid(logIdFrom);
			logdetailMapper.insert(logdetail);
		}
		
	}
	/**
	 * 获取所有调度单
	 * 之前不明白total有什么用，用于识别需不需要分页
	 */
	@Override
	public void getAllDisptchers(StockPageBean<ShowDispatchVo> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		 List<ShowDispatchVo> allDispatcher = dispatcherMapper.getAllDispatcher(pageCriteria);
		 int total = dispatcherMapper.getToals(pageCriteria);
		 
		 //赋值
		 pageBean.setTotal(total);
		 pageBean.setData(allDispatcher);
	}
	/**
	 * 由调度单获取所有详细
	 */
	@Override
	public void getAllDisptchersDetailById(StockPageBean<DispatchDetailVo> pageBean) {
		PageCriterias pageCriteria = pageBean.getPageCriteria();
		List<DispatchDetailVo> data = dispatcherMapper.getDispatcherDetailById(pageCriteria);
		 int total = dispatcherMapper.totalDetailEntry(pageCriteria);
		 //赋值
		 pageBean.setTotal(total);
		 pageBean.setData(data);
	}
	

}
