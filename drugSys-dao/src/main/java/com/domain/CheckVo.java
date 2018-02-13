package com.domain;
/**
 * 接收盘点数据
 * @author zyg
 *
 */

import java.util.List;

public class CheckVo {
	private List<GoodsVo> cList ;
	private Check check;
	

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check check) {
		this.check = check;
	}

	public List<GoodsVo> getcList() {
		return cList;
	}

	public void setcList(List<GoodsVo> cList) {
		this.cList = cList;
	}
	
}
