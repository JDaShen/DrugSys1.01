<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	<h1>新的销售订单</h1>
	<form
		action="${pageContext.request.contextPath }/drugSale/drugSale.action"
		method="post">
		<fieldset
			style="width: 780px; border: solid 1px #aaa; position: relative;">
			<table style="width: 100%;">
				<tr>
					<td style="width: 80px;">订单号：</td>
					<td style="width: 150px;"><input name="saleOrder.tradeid"
						class="mini-textbox" /></td>
					<td style="width: 80px;">下单时间：</td>
					<td><input name="saleOrder.tradetime" class="mini-datepicker" /></td>
					<td style="width: 80px;">经办人：</td>
					<td style="width: 150px;">
						<input name="saleOrder.sfid" class="mini-combobox" valueField="sfid" textField="sfname" 
				            url="${pageContext.request.contextPath }/getStaffsByJob.action?jobId=1001"
				            onvaluechanged="onDeptChanged" required="true"
				             emptyText="请选经办人"/>
					</td>
				</tr>
				<tr>
					<td style="width: 80px;">出货仓库：</td>
					<td style="width: 150px;"><input name="saleOrder.wid"
						class="mini-textbox" /></td>
					<td style="width: 80px;">顾客：</td>
					<td style="width: 150px;"><input name="saleOrder.ctid"
						class="mini-textbox" /></td>
				</tr>
			</table>
		</fieldset>
		
	<h1>添加药品</h1>
	<div style="padding-top: 5px; padding-bottom: 5px;">
		<input type="button" value="添加" onclick="addRow()" /> 
		<input type="button" value="移除" onclick="removeRow()" /> 
	</div>


	<div id="datagrid1" class="mini-datagrid"
		style="width: 780px; height: 250px;"
		url="javaScrpt:" idField="id"
		multiSelect="true" allowResize="true">
		<div property="columns">
			<div type="checkcolumn"></div>
			<div field="saleOrderItem.soitemid" width="120" headerAlign="center"
				allowSort="true" name="saleOrderItem.soitemid">销售单项ID</div>
			<div field="saleOrderItem.diid" width="120" headerAlign="center"
				allowSort="true" name="saleOrderItem.diid">diid</div>
			<div field="saleOrderItem.amount" width="100" allowSort="true" 
				name="saleOrderItem.amount">数量</div>
			<div field="saleOrderItem.singelprice" width="120" headerAlign="center"
				allowSort="true" name="saleOrderItem.singelprice">单价</div>
			<div field="saleOrderItem.discount" width="120" headerAlign="center"
				allowSort="true" name="saleOrderItem.discount">折扣</div>
		</div>
	</div>
	<fieldset
		style="width: 700px; border: solid 1px #aaa; margin-top: 8px; position: relative;">
		<legend>药品详情</legend>
		<div id="editForm1" style="padding: 5px;">
			<input class="mini-hidden" name="id" />
			<table style="width: 100%;">
				<tr>
					<td style="width: 80px;">销售单项ID：</td>
					<td style="width: 150px;"><input id="saleOrderItem.soitemid"
						name="saleOrderItem.soitemid" class="mini-textbox" /></td>
					<td style="width: 80px;">diid：</td>
					<td style="width: 150px;"><input id="saleOrderItem.diid" name="saleOrderItem.diid"
						class="mini-textbox" /></td>
					<td style="width: 80px;">单价：</td>
					<td style="width: 150px;"><input id="saleOrderItem.singelprice" name="saleOrderItem.singelprice" 
						class="mini-textbox" /></td>
				</tr>
				<tr>
					<td>数量：</td>
					<td><input id="saleOrderItem.amount" name="saleOrderItem.amount" class="mini-spinner"
						minValue="0" maxValue="200" value="25" /></td>
					<td>折扣：</td>
					<td style="width: 150px;"><input id="saleOrderItem.discount" name="saleOrderItem.discount" 
						class="mini-textbox" /></td>
				</tr>
			</table>
		</div>
	</fieldset>
	
	<input type="submit" value="确认提交" />
</form>
	<script type="text/javascript">
		var Genders = [ {
			id : 1,
			text : '男'
		}, {
			id : 2,
			text : '女'
		} ];

		mini.parse();

		var grid = mini.get("datagrid1");
		//grid.load();

		//绑定表单
		var db = new mini.DataBinding();

		db.bindForm("editForm1", grid);

		///////////////////////////////////////////////////////
		function onGenderRenderer(e) {
			for (var i = 0, l = Genders.length; i < l; i++) {
				var g = Genders[i];
				if (g.id == e.value)
					return g.text;
			}
			return "";
		}

		//////////////////////////////////////////////////////
		function addRow() {
			var newRow = {
				name : "New Row"
			};
			grid.addRow(newRow, 0);

			grid.deselectAll();
			grid.select(newRow);
		}
		function removeRow() {
			var rows = grid.getSelecteds();
			if (rows.length > 0) {
				grid.removeRows(rows, true);
			}
		}
	</script>
</body>
</html>