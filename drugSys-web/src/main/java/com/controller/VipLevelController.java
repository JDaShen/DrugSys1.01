package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.domain.Supplier;
import com.domain.Viplevel;
import com.service.VipLevelService;

@Controller
public class VipLevelController {
	@Autowired
	private VipLevelService vipLevelService;
	
	
	/**
	 * 添加VIP等级
	 * @param supplier
	 * @throws IOException 
	 */
	@RequestMapping(value="/addVipLeve.action")
	public void addVipLeve(@RequestBody Viplevel viplevel,HttpServletResponse response) throws IOException {
		 boolean flag = vipLevelService.addVipLevel(viplevel);
		 if(flag) {
			 response.getWriter().write("success");
		 }else {
			 response.getWriter().write("loss");
		 }
	}

	/**
	 * 获取所有VIP等级
	 * @return
	 */
	@RequestMapping(value="/getAllVipLeve.action")
	public @ResponseBody List<Viplevel> getAllVipLeve(){
		List<Viplevel> viplevels = vipLevelService.getAllVipLevel();
		return viplevels;
	}
	
	/**
	 * 修改VIP等级
	 * @param supplier
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/updateVipLeve.action")
	public void updateVipLeve(@RequestBody Viplevel viplevel,HttpServletResponse response) throws IOException {
		 boolean flag = vipLevelService.updateVipLevel(viplevel);
		 if(flag) {
			 response.getWriter().write("success");
		 }else {
			 response.getWriter().write("loss");
		 }
	}
	
	/**
	 * 删除
	 * @param vipLeveIds
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping(value="/deleteVipLevel.action")
	public void deleteVipLeve(String vipLeveIds, HttpServletResponse response) throws IOException {
		boolean flag = vipLevelService.deleteVipLeve(vipLeveIds);
		if(flag) {
			 response.getWriter().write("success");
		 }else {
			 response.getWriter().write("loss");
		 }
	}
	
	/**
	 * 根据Id查询
	 * @param levelId
	 * @return
	 */
	@RequestMapping(value="/getLivelById.action")
	public @ResponseBody Viplevel getLivelById(String levelId){
		Viplevel viplevel = vipLevelService.getLivelById(levelId);
		return viplevel;
	}
}
