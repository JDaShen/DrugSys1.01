<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<!-- 引入样式 -->
<link href="${pageContext.request.contextPath }/docs/core.css"
	rel="stylesheet" type="text/css" />
<script src="${pageContext.request.contextPath }/js/scripts/boot.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/core.js"
	type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/js/scripts/tongji.js"
	type="text/javascript"></script>
<!-- jquery核心 -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/scripts/jquery.min.js"></script>
</head>
<body>
	<h1>销售流水</h1>

	<div style="width: 800px;">
		<div class="mini-toolbar" style="border-bottom: 0; padding: 0px;">
		</div>
	</div>
	<div id="datagrid1" class="mini-datagrid"
		style="width: 800px; height: 280px;" allowResize="true"
		url="${pageContext.request.contextPath }/drugSale/drugSaleInfo.action" idField="id"
		multiSelect="true">
		<div property="columns">
			<!--<div type="indexcolumn"></div>        -->
			<div field="tradeid" width="120" headerAlign="center" allowSort="true">订单ID</div>
			<div field="tradetime" width="100" headerAlign="center" dateFormat="yyyy-MM-dd" allowSort="true">下单日期</div>
			<div field="sfid" width="80" headerAlign="center" allowSort="true" renderer="onsfidRenderer">经办人</div>
			<div field="total" width="60" headerAlign="center" allowSort="true">交易总价</div>
			<div field="integral" width="60" headerAlign="center" allowSort="true">积分</div>
			<!-- <div field="wid" width="60" headerAlign="center" allowSort="true">联系仓库</div> -->			
			<div field="tradetype" width="80" headerAlign="center" allowSort="true" renderer="onTradetypeRenderer">订单类型</div>
		</div>
	</div>


	<script type="text/javascript">
		mini.parse();
		var grid = mini.get("datagrid1");
		grid.load();
		
		 var sfids = [{ id: 1, text: '小丽' }, { id: 3, text: '梅梅'}, { id: 2, text: '东东 '}];
		    function onsfidRenderer(e) {
		        for (var i = 0, l = sfids.length; i < l; i++) {
		            var g = sfids[i];
		            if (g.id == e.value) return g.text;
		        }
		        return "";
		    }
		 var tradetypes = [{ id: 2, text: '已退货' }, { id: 1, text: '已销售'}];
		 function onTradetypeRenderer(e) {
		     for (var i = 0, l = tradetypes.length; i < l; i++) {
		         var g = tradetypes[i];
		         if (g.id == e.value) return g.text;
		     }
		     return "";
		 }
	</script>
</body>
</html>
