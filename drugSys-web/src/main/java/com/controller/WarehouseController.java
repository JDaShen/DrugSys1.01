package com.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.domain.AddDisptchVo;
import com.domain.Dispatch;
import com.domain.DispatchDetailVo;
import com.domain.GoodsVo;
import com.domain.PageCriterias;
import com.domain.ShowDispatchVo;
import com.domain.StockPageBean;
import com.domain.Warehouse;
import com.service.WarehouseService;
/**
 * 仓库管理
 * @author zyg
 *
 */
@Controller
@RequestMapping(value="/warehouse")
public class WarehouseController {
	/*@ModelAttribute("itemList")
    public List<GoodsVo> getUserObject() {
		
        return new ArrayList<GoodsVo>();
    }*/
	@Autowired
	private WarehouseService warehouseService;
		
		/**
		 * 通过combox请求所有仓库
		 */
		@RequestMapping(value="/getWarehouse.action")
		public @ResponseBody List<Warehouse> getAllWarehouses() {
			List<Warehouse> warehouses = warehouseService.getAllWarehouse();
			System.out.println("测试仓库");
			return warehouses;
		}
		/**
		 * 分页查询统计所有商品
		 * @param pageCriterias
		 * @return
		 */
		@RequestMapping(value="getAllGoodsInfo.action")
		public @ResponseBody StockPageBean<GoodsVo> getAllGoodsInfo(PageCriterias pageCriterias){
			StockPageBean<GoodsVo> pageBean = new StockPageBean<>();
			pageBean.setPageCriteria(pageCriterias);
			warehouseService.getAllGoodsInfo(pageBean);
			return pageBean;
		}
		/**
		 * 添加调度信息
		 * 数据接收实验
		 * @param addDisptchVo
		 */
		@RequestMapping(value="/addDispatcheEntry.action")
		public void addDIspatch(AddDisptchVo addDisptchVo)  {
			System.out.println(addDisptchVo.getDate()+"..."+addDisptchVo.getMark());
			System.out.println("添加调度信息");
		}
	/**
	 * 接收json字符串，封装为一个数组
	 * 使用session来存储小巷
	 * @param list
	 * @param model
	 */
		@RequestMapping(value="/relay.action")
		public void  relayDispatch(@RequestBody List<GoodsVo>  itemList,HttpServletRequest req,HttpServletResponse response)   {
			/*
			 * 1.一次添加处理
			 */
			//明确每次发送都是一个数组，做信息比对
			HttpSession session = req.getSession();
			//判断是否是第一次访问
			List<GoodsVo> oldlist = (List<GoodsVo>) session.getAttribute("itemList");
			System.out.println("最新添加数据："+itemList);
			if(oldlist!=null&&oldlist.size()>0) {
				System.out.println("原数据"+oldlist+"原数据");
				//二次访问，添加判断,拿到一个新的list，遍历发送过来的集合，存在就不添加
				//使用list问题真多，还是使用map,这里逻辑没错？？？？有错误，只能看是否存在，不能这样对比，否则一定有不同的
				/*
				 * 改进：应该是一直比对，存在就跳出循环，否则就添加
				 * 找相同，找不到就添加，写在哪，使用计数来看是否存在
				 */
					for (int i=0;i<itemList.size();i++) {
						//
						String newDiid = itemList.get(i).getDiId();
						System.out.println("新"+newDiid);
						//标记看是否存在
						int flag =0;
						for (int m=0;m<oldlist.size();m++ ) {
						//不存在就添加
							String oldDiid = oldlist.get(m).getDiId();
							System.out.println("旧"+oldDiid);
							if(newDiid.equals(oldDiid)) {
								//更新信息
								oldlist.get(m).setReals(itemList.get(i).getReals());
								oldlist.get(m).setwName(itemList.get(i).getwName());
								flag++;
								break;
								//要是不同，继续走完，如果走完还没break就添加一条
							}
							/*if(newDiid.equals(oldDiid)) {
								//这样写也不对要是第一条不一样，那么这里就多了一条重复数据
								oldlist.add(itemList.get(i));
							}*/
						}
						if(flag==0) {
							oldlist.add(itemList.get(i));
						}
					}
					session.removeAttribute("itemList");
					session.setAttribute("itemList", oldlist);
					System.out.println(oldlist+"新数据");
			}else {
				//第一次访问
				session.setAttribute("itemList", itemList);
				System.out.println("第一次访问,,,,,,,,,,,,"+itemList);
			}
			String json = "{\"flag\":"+true+"}";
			try {
				response.setContentType("text/html;charset=utf-8");
				response.getWriter().write(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * 保存处理
		 * @param itemList
		 * @param req
		 * @return
		 */
		@RequestMapping(value="/saveChange.action")
		public void  saveChange(@RequestBody List<GoodsVo>  itemList,HttpServletRequest req,HttpServletResponse response)   {
			/*
			 * 2.一次修改后的保存处理
			 * 分开写一个报存,需要获取原来list，更新信息，就是
			 */
			//明确每次发送都是一个数组，做信息比对，
			HttpSession session = req.getSession();
			session.removeAttribute("itemList");
			session.setAttribute("itemList", itemList);
			String json = "{\"flag\":"+true+"}";
			try {
				response.setContentType("text/html;charset=utf-8");
				response.getWriter().write(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * 接收json字符串，封装为一个数组
		 * @param list
		 */
		@RequestMapping(value="/loadItems.action")
		public @ResponseBody StockPageBean<GoodsVo>  loadItems(HttpServletRequest req )   {
			HttpSession session = req.getSession();
			List<GoodsVo> list = (List<GoodsVo>) session.getAttribute("itemList");
			StockPageBean<GoodsVo> lists = new StockPageBean<GoodsVo>();
			if(list!=null) {
				lists.setData(list);
				lists.setTotal(list.size());
			}
			return lists;
		}
		
		/**
		 * 提交调度单子addDispatchers.action
		 * @throws ParseException 
		 */
		@RequestMapping(value="/addDispatchers.action")
		public  void addDispatchers(@RequestBody AddDisptchVo addDisptchVo,HttpServletRequest req,HttpServletResponse response ) throws ParseException   {
			HttpSession session = req.getSession();
			List<GoodsVo> list = (List<GoodsVo>) session.getAttribute("itemList");
			addDisptchVo.setList(list);
			//处理时间===============================
			/*java.sql.Date time= new java.sql.Date(new Date().getTime());
			System.out.println(time);
			addDisptchVo.setDate(time);*/
			//==========================
			//判断商品为空，提示添加商品
			boolean flag;
			if(list==null) {
				 flag = false;
			}else {
				flag = true;
				warehouseService.addDispatchers(addDisptchVo);
				session.removeAttribute("itemList");
			}
			//响应回页面
			String json = "{\"flag\":"+flag+"}";
			try {
				response.setContentType("text/html;charset=utf-8");
				response.getWriter().write(json);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		/**
		 * 获取所有调度单
		 */
		@RequestMapping("/getAllDisptchers.action")
		public @ResponseBody StockPageBean<ShowDispatchVo> getAllDisptchers(PageCriterias pageCriterias) {
			StockPageBean<ShowDispatchVo> pageBean = new StockPageBean<>();
			pageBean.setPageCriteria(pageCriterias);
			 warehouseService.getAllDisptchers(pageBean);
			return pageBean;
		}
		/**
		 * 获取所有调度当详细信息
		 */
		@RequestMapping("/getAllDisptchersDetail.action")
		public @ResponseBody StockPageBean<DispatchDetailVo> getAllDisptchersDetailById(PageCriterias pageCriterias){
			StockPageBean<DispatchDetailVo> pageBean = new StockPageBean<>();
			pageBean.setPageCriteria(pageCriterias);
			 warehouseService.getAllDisptchersDetailById(pageBean);
			 int total = pageBean.getData().size();
			 pageBean.setTotal(total);
				return pageBean;
		}
}
