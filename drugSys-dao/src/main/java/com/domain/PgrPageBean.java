package com.domain;

import java.util.List;

public class PgrPageBean<T> {
		private List<T> data;//easyui是响应rows，miniui是响应data
		private PgrPageCriterias  pageCriteria;
		private Integer total;//响应total
		
		public List<T> getData() {
			return data;
		}
		public void setData(List<T> data) {
			this.data = data;
		}
		
		public PgrPageCriterias getPageCriteria() {
			return pageCriteria;
		}
		public void setPageCriteria(PgrPageCriterias pageCriteria) {
			this.pageCriteria = pageCriteria;
		}
		public Integer getTotal() {
			return total;
		}
		public void setTotal(Integer total) {
			this.total = total;
		}
		
}
