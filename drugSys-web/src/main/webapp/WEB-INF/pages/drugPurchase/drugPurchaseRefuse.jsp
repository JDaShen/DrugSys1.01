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
	<h1>采购退货</h1>

	<div style="width: 780px;">
		<div class="mini-toolbar" style="border-bottom: 0; padding: 0px;">
		<table style="width: 100%;">
				<tr>
					<td style="width: 100%;"><a class="mini-button"
						iconCls="icon-ok" onclick="edit()">确认退货</a> </td>
				</tr>
			</table>
		</div>
	</div>
	<div id="datagrid1" class="mini-datagrid"
		style="width: 780px; height: 280px;" allowResize="true"
		url="${pageContext.request.contextPath }/drugPurchase/drugPurchaseNeedToDo.action" idField="id"
		multiSelect="true">
		<div property="columns">
			<div type="checkcolumn"></div>
			<!--<div type="indexcolumn"></div> -->
			<div id="tradeid" name="tradeid" field="tradeid" width="120" headerAlign="center" allowSort="true">订单ID</div>
			<div field="tradetime" width="100" headerAlign="center" dateFormat="yyyy-MM-dd" allowSort="true">下单日期</div>
			<div field="sfid" width="120" headerAlign="center" allowSort="true" renderer="onsfidRenderer">经办人</div>
			<div field="totalprice" width="60" headerAlign="center" allowSort="true">交易总价</div>
			<div field="tradetype" width="60" headerAlign="center" allowSort="true" renderer="onTradetypeRenderer">采购类型</div>
			<!-- <div field="wid" width="60" headerAlign="center" allowSort="true">联系仓库</div>
			<div field="splid" width="80" headerAlign="center" allowSort="true">供应商</div> -->
			<div field="state" width="60" headerAlign="center" allowSort="true" renderer="onStateRenderer">订单状态</div>
		</div>
	</div>


	<script type="text/javascript">
		mini.parse();
		var grid = mini.get("datagrid1");
		grid.load();
		
		var states = [{ id: 0, text: '进货中' }, { id: 1, text: '已入库'},{ id: 2, text: '退货'}];
	    function onStateRenderer(e){
	    	for (var i = 0, l = states.length; i < l; i++) {
	            var g = states[i];
	            if (g.id == e.value) return g.text;
	        }
	        return "";
	    }
	    
	    var tradetypes = [{ id: 1, text: '进货' }, { id: 2, text: '退货'}];
	    function onTradetypeRenderer(e) {
	        for (var i = 0, l = tradetypes.length; i < l; i++) {
	            var g = tradetypes[i];
	            if (g.id == e.value) return g.text;
	        }
	        return "";
	    }
	    
	    var sfids = [{ id: 1, text: '小丽' }, { id: 3, text: '梅梅'}, { id: 2, text: '大丽'}];
	    function onsfidRenderer(e) {
	        for (var i = 0, l = sfids.length; i < l; i++) {
	            var g = sfids[i];
	            if (g.id == e.value) return g.text;
	        }
	        return "";
	    }
		
		function edit() {
            //var row = grid.getSelected();
            //var r = row.tradeid;
            var rows = grid.getSelecteds();
            if (rows.length > 0) {
                if (confirm("确定删除选中记录？")) {
                    var ids = [];
                    for (var i = 0, l = rows.length; i < l; i++) {
                        var r = rows[i];
                        ids.push(r.tradeid);
                    }
                    alert(ids);
                    var id = ids.join(',');
                    var data = {"ids":id};
                    grid.loading("操作中，请稍后......");
                    $.ajax({
                        url: "${pageContext.request.contextPath }/drugPurchase/drugPurchaseRefuse.action",
                        data:data,
                        type:"POST",
                        success:function(text){
                        	grid.reload();
                        }
                    });
                }
            } else {
                alert("请选中一条记录");
            }
        }
	</script>
</body>
</html>