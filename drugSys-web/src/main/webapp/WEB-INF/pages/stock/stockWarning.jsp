<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>库存变动</title>
<!-- 引入样式 -->
 	<link href="${pageContext.request.contextPath }/css/core.css" rel="stylesheet" type="text/css" />
 	 <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/core.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/scripts/tongji.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/scripts/miniui/miniui.js" type="text/javascript"></script>
	<!-- jquery核心 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/scripts/jquery.min.js"></script>
</head>
<body>
	 <h4><span style="font-family:"微软雅黑",Georgia,Serif">库存商品信息</span></h4>      
	 
    <div id="dept_grid" class="mini-datagrid" style="width:100%;height:200px;" 
         url="${pageContext.request.contextPath }/report/warning.action"  idField="id"
        onselectionchanged="onSelectionChanged" 
        selectOnLoad="true"
    >
       <div property="columns">    <!-- 查询3张表 -->        
            <div field="diid" width="160" headerAlign="center" >商品编号</div>  
             <div field="diname" width="80" headerAlign="center" >商品名称</div>
              <div field="ministock" width="80" headerAlign="center" >最低库存</div>                                             
              <div field="amount" width="80" headerAlign="center" >当前库存</div>                                             
             <div field="commonname" width="80" headerAlign="center" >通用名</div> 
              <div field="drugtype" width="80" headerAlign="center" >药物类型</div>                                            
             <div field="drugunit" width="80" headerAlign="center" >单位</div>                                            
             <div field="specification" width="80" headerAlign="center" >规格</div> 
             <div field="singelprice" numberFormat="¥#,0.00" width="80" headerAlign="center" >单价</div> 
             <div field="manufacturer" width="80" headerAlign="center" >制造商</div> 
             <div field="time" width="80" headerAlign="center" dateFormat="yyyy-MM-dd">有效期至</div> 
            <div field="wid" width="80" headerAlign="center" renderer="onGenderRenderer">所在仓库</div>                                        
        </div>
    </div> 
  <h4><span style="font-family:"微软雅黑",Georgia,Serif">变动明细</span></h4>  
    <div id="employee_grid" class="mini-datagrid" style="width:100%;height:300px;margin-top:0px" 
        url="${pageContext.request.contextPath }/summary/getSummaryDetail.action" 
        
    >
        <div property="columns">            
            <div field="time" width="120" headerAlign="center" allowSort="true">日期</div>                
            <div field="tradeid" width="100" allowSort="true"  align="center" headerAlign="center">单据号</div>            
            <div field="info" width="100" allowSort="true"  align="center" headerAlign="center">说明</div>            
            <div field="inqty" width="100" allowSort="true">入库数量</div>
            <div field="outqty" width="100" allowSort="true">出库数量</div>
            <div field="wid" width="80" headerAlign="center" renderer="onGenderRenderer">所在仓库</div>                   
            <div field="sfid" width="80" headerAlign="center" renderer="onStaffRenderer">经办人</div>                   
        </div>
    </div>      
   
    

    <script type="text/javascript">
        var Genders = [{ id: 1, text: '主仓库' }, { id: 2, text: '副仓库'}, { id: 3, text: '酒库'}];
		var staffs = [{ id:1, text: '张超' }, { id:2, text: '小明'}, { id:3, text: '小李'}, { id:4, text: '老王'}];
		console.log(staffs)
        mini.parse();

        var dept_grid = mini.get("dept_grid");
        var employee_grid = mini.get("employee_grid");

        dept_grid.load();

        ///////////////////////////////////////////////////////       
        
        function onGenderRenderer(e) {
            for (var i = 0, l = Genders.length; i < l; i++) {
                var g = Genders[i];
                if (g.id == e.value) 
                	return g.text;
            }
            return "";
        }
        //显示员工e表示输入值，遍历对比显示
        function onStaffRenderer(e) {
            for (var i = 0, l = staffs.length; i < l; i++) {
                var g = staffs[i];
                if (g.id == e.value) 
                	return g.text;
            }
            return "";
        }

		//当鼠标选择改变时触发，去查询详细信息
        function onSelectionChanged(e) {
        
            var grid = e.sender;//？？什么东西
            var record = grid.getSelected();
            if (record) {
                employee_grid.load({ diid: record.diid });
            }
        }
	//条件查询
	function search(){
		//获取参数--注意miniui取值都是用mini.get("key")
		 var key = mini.get("key").getValue();
		//combox取得的是对象json
		  var w =mini.get("combo1").getSelected().wid;
		  dept_grid.load({ diname: key,wid:w });
	}
        
    </script>

</body>
</html>