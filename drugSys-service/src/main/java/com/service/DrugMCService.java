package com.service;

import java.util.List;

import com.domain.Drugdetailed;
import com.domain.Druginfo;
import com.domain.Drugtotal;

public interface DrugMCService {

	/**
	 * 显示一级树菜单
	 * @return
	 */
	List<Drugtotal> showTree1();

	/**
	 * 分页查询二级分类下的所有药品信息
	 * @param ddid 
	 * @param pageSize 
	 * @param pageIndex 
	 * @param diname 
	 * @param diid 
	 * @return
	 */
	List<Druginfo> getDrugsByPage(Integer pageIndex, Integer pageSize, String ddid, String diid, String diname);

	/**
	 * 获取 药品 数目
	 * @param ddid
	 * @param diname 
	 * @param diid 
	 * @return
	 */
	Integer getDrugsCount(String ddid, String diid, String diname);

	/**
	 * 获取所有药品
	 * @param diname 
	 * @param pageSize 
	 * @param pageIndex 
	 * @param ddid 
	 * @return
	 */
	List<Druginfo> showAllDrugs(Integer pageIndex, Integer pageSize, String diname, String ddid);

	/**
	 * 查询所有药品二级分类
	 * @param dtid 
	 * @return
	 */
	List<Drugdetailed> showDrugDetail(String dtid);

	/**
	 * 添加新药品
	 * @param druginfo
	 */
	void addDrug(Druginfo druginfo);

	/**
	 * 根据id查询 druginfo 对象，药品信息
	 * @param diid
	 * @return
	 */
	Druginfo getDrugById(String diid);

	/**
	 * 修改药品信息
	 * @param druginfo
	 */
	void updateDrug(Druginfo druginfo);

	/**
	 * 批量删除药品
	 * @param diids
	 */
	void deleteDrug(String diids);

	/**
	 * 根据 dtid 查询 二级分类
	 * @param dtid
	 * @return
	 */
	List<Drugdetailed> getDrugDetail(String dtid);

	/**
	 * 查询 所有药品 分类
	 * @param pageIndex
	 * @param pageSize
	 * @param name
	 * @return
	 */
	List<Drugdetailed> showAllDetails(Integer pageIndex, Integer pageSize, String name);

	/**
	 * 查询 所有药品 分类 数量
	 * @param name
	 * @return
	 */
	Integer getDetailCount(String name);

	/**
	 * 添加类别
	 * @param drugdetailed
	 */
	void addDetail(Drugdetailed drugdetailed);

	/**
	 * 获取Detailed对象
	 * @param ddid
	 * @return
	 */
	Drugdetailed getDetailById(String ddid);

	/**
	 * 修改类别
	 * @param drugdetailed
	 */
	void updateDetail(Drugdetailed drugdetailed);

	/**
	 * 批量删除类别
	 * @param ddids
	 * @return
	 */
	boolean deleteDetail(String ids);

}
