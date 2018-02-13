package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.domain.Job;
import com.domain.Supplier;
import com.service.JobService;
import com.service.StaffService;
import com.service.SupplierService;

@Controller
@RequestMapping(value="/page")
public class PageController {
	//============================index Begin==========================================
	
	@RequestMapping(value="indexPage.action")
	public String sendIndex() {
		return "/index";
	}
	
	//==========================index End=========================================
	
	//============================supplier Begin==========================================
	@Autowired
	private SupplierService supplierService;
	/**
	 * 供应商页面跳转
	 * @return
	 */
	@RequestMapping(value="supplierPage.action")
	public String sendSupplier() {		
		return "/supplier/supplier";
	}
	
	/**
	 * 添加供应商
	 * @return
	 */
	@RequestMapping(value="addSupplier.action")
	public String sendAddSupplier() {
		return "/supplier/addSupplier";
	}
	
	/**
	 * 修改供应商
	 * @return
	 */
	@RequestMapping(value="updateSupplier.action")
	public String sendUpdateSupplier(String splid,Model model) {
		Supplier supplier = supplierService.getSupplierById(splid);		
		model.addAttribute("supplier",supplier);
		return "forward:/WEB-INF/pages/supplier/updateSupplier.jsp";
	}
	
	//==========================supplier End=========================================
	
	//============================job Begin==========================================
	@Autowired
	private JobService jobService;
	/**
	 * 职位面跳转
	 * @return
	 */
	@RequestMapping(value="jobPage.action")
	public String sendJob() {		
		return "/job/job";
	}
	
	/**
	 * 添加职位
	 * @return
	 */
	@RequestMapping(value="addJob.action")
	public String sendAddJob() {
		return "/job/addJob";
	}
	
	/**
	 * 修改职位
	 * @return
	 */
	@RequestMapping(value="updateJob.action")
	public String sendUpdateJob(String jobid,Model model) {
		Job job = jobService.getJobById(jobid);		
		model.addAttribute("job",job);
		return "forward:/WEB-INF/pages/job/updateJob.jsp";
	}
	
	//==========================job End=========================================
	
	//============================staff Begin==========================================
	@Autowired
	private StaffService staffService;
	/**
	 * 职位面跳转
	 * @return
	 */
	@RequestMapping(value="staffPage.action")
	public String sendStaff() {		
		return "/staff/staff";
	}
	
	/**
	 * 添加业务员
	 * @return
	 */
	@RequestMapping(value="addStaff.action")
	public String sendAddStaff() {
		return "/staff/addStaff";
	}
	
	/**
	 * 修改业务员
	 * @return
	 */
	@RequestMapping(value="updateStaff.action")
	public String sendUpdateStaff() {
		return "/staff/updateStaff";
	}
	
	//==========================staff End=========================================
	
	//============================vipleve Begin==========================================

	/**
	 * 等级跳转
	 * @return
	 */
	@RequestMapping(value="vipLevelPage.action")
	public String sendVipLeve() {		
		return "/vipLevel/vipLevel";
	}
	
	/**
	 * 添加等级
	 * @return
	 */
	@RequestMapping(value="addVipLeve.action")
	public String sendAddVipLeve() {
		return "/vipLevel/addVipLevel";
	}
	
	/**
	 * 修改等级
	 * @return
	 */
	@RequestMapping(value="updateVipLeve.action")
	public String sendUpdateVipLeve() {
		
		return "/vipLevel/updateVipLevel";
	}
	
	//==========================vipleve End=========================================
	
	//============================customer Begin==========================================

	/**
	 * 客户页面跳转
	 * @return
	 */
	@RequestMapping(value="customerPage.action")
	public String sendCustomer() {		
		return "/customer/customer";
	}
	
	/**
	 * 添加客户
	 * @return
	 */
	@RequestMapping(value="addCustomer.action")
	public String sendAddCustomer() {
		return "/customer/addCustomer";
	}
	
	/**
	 * 修改客户
	 * @return
	 */
	@RequestMapping(value="updateCustomer.action")
	public String sendUpdateCustomer() {

		return "/customer/updateCustomer";
	}
	
	//==========================customer End=========================================
	
	//*************************************pgr*******************************************
		/**
		 * 采购模块
		 * @return
		 */
		@RequestMapping(value="/drugPurchase.action")
		public String sendToDrugPurchase() {
			return "/drugPurchase/drugPurchase";
		}
		@RequestMapping(value="/drugPurchaseConfirm.action")
		public String sendToDrugPurchaseConfirm() {
			return "/drugPurchase/drugPurchaseConfirm";
		}
		@RequestMapping(value="/drugPurchaseInfo.action")
		public String sendToDrugPurchaseInfo() {
			return "/drugPurchase/drugPurchaseInfo";
		}
		@RequestMapping(value="/drugPurchaseRefuse.action")
		public String sendToDrugPurchaseRefuse() {
			return "/drugPurchase/drugPurchaseRefuse";
		}
		
		/**
		 * 销售模块
		 */
		@RequestMapping(value="/drugSale.action")
		public String sendToDrugSale() {
			return "/drugSale/drugSale";
		}
		@RequestMapping(value="/drugSaleInfo.action")
		public String sendToDrugSaleInfo() {
			return "/drugSale/drugSaleInfo";
		}
		@RequestMapping(value="/drugSaleRefuse.action")
		public String sendToDrugSaleRefuse() {
			return "/drugSale/drugSaleRefuse";
		}
		//**************************************pgr******************************************
	
	//============================stock Begin==========================================
		/**
		 * 库存调拨
		 * @return
		 */
		@RequestMapping(value="/stockDispatch.action")
		public String toStockDispatch() {
			System.out.println("库存调度");
			return "/stock/stockDispatch";
		}
		/**
		 * 库存盘点
		 * @return
		 */
		@RequestMapping(value="/check.action")
		public String toCheck() {
			
			return "/stock/check";
		}
		/**
		 *库存报警
		 * @return
		 */
		@RequestMapping(value="/stockWarning.action")
		public String toStockWarning() {
			
			return "/stock/stockWarning";
		}
		/**
		 * 库存变动
		 * @return
		 */
		@RequestMapping(value="/stockChangeQuery.action")
		public String toStockChangeQuery() {
			
			return "/stock/stockChangeQuery";
		}
		/**
		 * 过期查询
		 * @return
		 */
		@RequestMapping(value="/expireQuery.action")
		public String expireQuery() {
			
			return "/stock/expireQuery";
		}
		/**
		 * 报损/报溢
		 * @return
		 */
		@RequestMapping(value="/reportLoss.action")
		public String toReportLoss() {
			
			return "/stock/reportLoss";
		}
		/**
		 * 到添加调度页面
		 * @return
		 */
		@RequestMapping(value="/addDispatche.action")
		public String toAddDispatche() {
			
			return "/stock/addDispatche";
		}
		/**
		 * 到多选页面
		 */
		@RequestMapping(value="/multiSelectGridWindow.action")
		public String toMultiSelectGridWindow() {
			
			return "/stock/MultiSelectGridWindow";
		}
		/**
		 * 到调度查询
		 * @return
		 */
		@RequestMapping(value="/dispatcherQuery.action")
		public String toaDispatcherQuery() {
			
			return "/stock/dispatcherQuery";
		}
		/**
		 * 到添加报损页面
		 * @return
		 */
		@RequestMapping("/addReportLoss.action")
		public String toAddReportLoss() {
			return "/stock/addReportLoss";
		}
		/**
		 * 到报损查询页面
		 * @return
		 */
		@RequestMapping("/QueryReportLoss.action")
		public String QueryReportLoss() {
			return "/stock/QueryReportLoss";
		}
		/**
		 * 到添加盘点页面
		 * @return
		 */
		@RequestMapping("/toAddCheck.action")
		public String toAddCheck() {
			return "/stock/addCheck";
		}
		/**
		 * 到盘点查询页面
		 * @return
		 */
		@RequestMapping("/toQueryCheck.action")
		public String toQueryCheck() {
			return "/stock/queryCheck";
		}
		/**
		 * 到未盘点页面
		 * @return
		 */
		@RequestMapping("/toPendCheck.action")
		public String toPendCheck() {
			return "/stock/pendCheck";
		}
		/**
		 * 到库存汇总页面
		 * @return
		 */
		@RequestMapping("/stockSummary.action")
		public String toStocksummary(){
			return "/stock/stockSummary";
		}
		
		//==========================stock End=========================================
}
