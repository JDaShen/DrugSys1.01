package com.domain;

import java.util.List;

public class StockPageBean<T> {
		private List<T> data;//easyui是响应rows，miniui是响应data
		private PageCriterias  pageCriteria;
		private Integer total;//响应total
		
		public List<T> getData() {
			return data;
		}
		public void setData(List<T> data) {
			this.data = data;
		}
		public PageCriterias getPageCriteria() {
			return pageCriteria;
		}
		public void setPageCriteria(PageCriterias pageCriteria) {
			this.pageCriteria = pageCriteria;
		}
		public Integer getTotal() {
			return total;
		}
		public void setTotal(Integer total) {
			this.total = total;
		}
		
}
