package com.service.imp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.domain.Drugdetailed;
import com.domain.DrugdetailedExample;
import com.domain.Druginfo;
import com.domain.DruginfoExample;
import com.domain.Drugtotal;
import com.mapper.DrugdetailedMapper;
import com.mapper.DruginfoMapper;
import com.mapper.DrugtotalMapper;
import com.service.DrugMCService;

@Service
@Transactional
public class DrugMCServiceImpl implements DrugMCService {
	
	@Autowired
	private DruginfoMapper druginfoMapper;
	@Autowired
	private DrugtotalMapper drugtotalMapper;
	@Autowired
	private DrugdetailedMapper drugdetailedMapper;

	/**
	 * 显示一级树菜单
	 */
	public List<Drugtotal> showTree1() {
		List<Drugtotal> drugtotals = drugtotalMapper.selectByExample(null);
		return drugtotals;
	}

	/**
	 * 分页查询二级分类下的所有药品信息
	 */
	public List<Druginfo> getDrugsByPage(Integer pageIndex, Integer pageSize, String ddid,String diname,String diid) {
		List<Druginfo> drugList = druginfoMapper.getDrugsByPage(pageIndex,pageSize,ddid,diname,diid);
		return drugList;
	}

	/**
	 * 获取 药品 数目
	 */
	public Integer getDrugsCount(String ddid, String diid, String diname) {
		Integer total = druginfoMapper.getDrugsCount(ddid,diname,diid);
		return total;
	}

	/**
	 * 获取所有药品,分页
	 */
	public List<Druginfo> showAllDrugs(Integer pageIndex, Integer pageSize, String diname, String ddid) {
		Integer startIndex = pageIndex * pageSize;
		List<Druginfo> allDrugs = druginfoMapper.showAllDrugs(startIndex,pageSize,diname,ddid);
		return allDrugs;
	}

	/**
	 * 查询所有药品二级分类
	 */
	public List<Drugdetailed> showDrugDetail(String dtid) {
		DrugdetailedExample example = new DrugdetailedExample();
		example.createCriteria().andDtidLike(dtid);
		List<Drugdetailed> ddList = drugdetailedMapper.selectByExample(example);
		return ddList;
	}

	/**
	 * 添加新药品
	 */
	public void addDrug(Druginfo druginfo) {
		druginfoMapper.insert(druginfo);
	}

	/**
	 * 添加类别
	 */
	public void addDetail(Drugdetailed drugdetailed) {
		drugdetailedMapper.insert(drugdetailed);
	} 
	
	/**
	 * 根据id查询 druginfo 对象，药品信息
	 */
	public Druginfo getDrugById(String diid) {
		Druginfo druginfo = druginfoMapper.getDrugById(diid);
		return druginfo;
	}

	/**
	 * 修改药品信息
	 */
	public void updateDrug(Druginfo druginfo) {
		druginfoMapper.updateByPrimaryKeySelective(druginfo);
	}

	/**
	 * 批量删除药品
	 */
	public void deleteDrug(String diids) {
		String[] ids = diids.split("-");
		for (int i = 0; i < ids.length; i++) {
			druginfoMapper.deleteByPrimaryKey(ids[i]);
		}
	}

	/**
	 * 根据 dtid 查询 二级分类
	 */
	public List<Drugdetailed> getDrugDetail(String dtid) {
		DrugdetailedExample dExample = new DrugdetailedExample();
		dExample.createCriteria().andDtidEqualTo(dtid);
		List<Drugdetailed> ddList = drugdetailedMapper.selectByExample(dExample);
		return ddList;
	}

	/**
	 * 查询 所有药品 分类
	 */
	public List<Drugdetailed> showAllDetails(Integer pageIndex, Integer pageSize, String name) {
		Integer startIndex = pageIndex * pageSize;
		List<Drugdetailed> details = drugdetailedMapper.showAllDetails(startIndex,pageSize,name);
		return details;
	}

	/**
	 * 查询 所有药品 分类 数量
	 */
	public Integer getDetailCount(String name) {
		Integer total = drugdetailedMapper.getDetailCount(name);
		return total;
	}

	/**
	 * 获取Detailed对象
	 */
	public Drugdetailed getDetailById(String ddid) {
		Drugdetailed drugdetailed = drugdetailedMapper.selectByPrimaryKey(ddid);
		return drugdetailed;
	}

	/**
	 * 修改类别
	 */
	public void updateDetail(Drugdetailed drugdetailed) {
		drugdetailedMapper.updateByPrimaryKeySelective(drugdetailed);
	}

	/**
	 * 批量删除类别
	 */
	public boolean deleteDetail(String ids) {
		String[] ddids = ids.split("-");
		for (int i = 0; i < ddids.length; i++) {
			DruginfoExample example = new DruginfoExample();
			example.createCriteria().andDdidEqualTo(ddids[i]);
			List<Druginfo> di = druginfoMapper.selectByExample(example);
			if (di.size() > 0) {
				//说明该类下有药品信息
				return false;
			}
		}
		drugdetailedMapper.deleteDetail(ddids);
		return true;
	}

	
}
