package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Druginfo;
import com.domain.DruginfoExample;

public interface DruginfoMapper {
    int countByExample(DruginfoExample example);

    int deleteByExample(DruginfoExample example);

    int deleteByPrimaryKey(String diid);

    int insert(Druginfo record);

    int insertSelective(Druginfo record);

    List<Druginfo> selectByExample(DruginfoExample example);

    Druginfo selectByPrimaryKey(String diid);

    int updateByExampleSelective(@Param("record") Druginfo record, @Param("example") DruginfoExample example);

    int updateByExample(@Param("record") Druginfo record, @Param("example") DruginfoExample example);

    int updateByPrimaryKeySelective(Druginfo record);

    int updateByPrimaryKey(Druginfo record);

    /**
     * 分页查询二级分类下的所有药品信息
     * @param pageIndex
     * @param pageSize
     * @param ddid
     * @param diid 
     * @param diname 
     * @return
     */
	List<Druginfo> getDrugsByPage(@Param("pageIndex") Integer pageIndex,@Param("pageSize") Integer pageSize,
			@Param("ddid") String ddid,@Param("diname") String diname,@Param("diid") String diid);

	/**
	 * 获取 药品 数目
	 * @param ddid
	 * @param diid 
	 * @param diname 
	 * @return
	 */
	Integer getDrugsCount(@Param("ddid") String ddid,@Param("diname") String diname,@Param("diid") String diid);

	/**
	 * 获取所有药品,分页
	 * @param startIndex
	 * @param pageSize
	 * @param diname
	 * @param ddid 
	 * @return
	 */
	List<Druginfo> showAllDrugs(@Param("startIndex") Integer startIndex,@Param("pageSize") Integer pageSize,
			@Param("diname") String diname,@Param("ddid") String ddid);

	/**
	 * 根据id查询药品信息
	 * @param diid
	 * @return
	 */
	Druginfo getDrugById(String diid);
	
	
	
	
	
	
	
	
	
}