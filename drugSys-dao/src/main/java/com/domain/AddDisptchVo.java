package com.domain;

import java.util.List;

/**
 * 接收调度信息的vo
 * @author zyg
 *
 */
public class AddDisptchVo extends Dispatch{
	List<GoodsVo> list;

	public List<GoodsVo> getList() {
		return list;
	}

	public void setList(List<GoodsVo> list) {
		this.list = list;
	}
	
}
