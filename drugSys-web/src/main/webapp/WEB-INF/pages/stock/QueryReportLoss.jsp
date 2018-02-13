<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>报损情况</title>
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
	 <h4>报损单信息</h4>      
	 <div class="mini-toolbar" style="text-align:center;line-height:30px;" borderStyle="border:0;">
          <label >选择时间段：</label>
          <!-- 通过id选择器获取值发送请求 -->
            <input id="date1" class="mini-datepicker" value=""/>
	至  <input id="date2" class="mini-datepicker" value=""/>
	
          <a class="mini-button" style="width:60px;" onclick="search()">查询</a><!-- 调用分页那个方法，用pageCriterial查询 -->
    </div>
    <div id="dept_grid" class="mini-datagrid" style="width:100%;height:100%;" 
        url="${pageContext.request.contextPath }/report/getAllReports.action"  idField="id"
        onselectionchanged="onSelectionChanged" 
        selectOnLoad="true"
    >
        <div property="columns">    <!-- 查询3张表 -->        
            <div field="rid" width="160" headerAlign="center" >报损单号</div>  
             <div field="time" width="80" headerAlign="center" dateFormat="yyyy-MM-dd">报损时间</div>                                            
            <div field="wid" width="80" headerAlign="center" renderer="onGenderRenderer">仓库名称</div>                                        
            <div field="sfname" width="120" headerAlign="left" >经办人</div>          
            <div field="mark" width="120" headerAlign="left" >备注</div>          
        </div>
    </div> 
  <h4>调度单详细</h4>  
    <div id="employee_grid" class="mini-datagrid" style="width:100%;height:100%;margin-top:0px" 
        url="${pageContext.request.contextPath }/report/getReportDetail.action" 
        
    >
   
        <div property="columns">            
            <div field="diid" width="120" headerAlign="center" allowSort="true">商品编号</div>                
            <div field="diname" width="100" allowSort="true"  align="center" headerAlign="center">商品名称</div>            
            <div field="drugunit" width="100" allowSort="true"  align="center" headerAlign="center">单位</div>            
            <div field="amount" width="100" allowSort="true">数量</div>
             <div field="manufacturer" width="100" allowSort="true"  align="center" headerAlign="center">生产厂商</div>            
        </div>
    </div>      
   
    

    <script type="text/javascript">
        var Genders = [{ id: 1, text: '主仓库' }, { id: 2, text: '副仓库'}, { id: 3, text: '酒库'}];

        mini.parse();

        var dept_grid = mini.get("dept_grid");
        var employee_grid = mini.get("employee_grid");

        dept_grid.load();

        ///////////////////////////////////////////////////////       
        
        function onGenderRenderer(e) {
            for (var i = 0, l = Genders.length; i < l; i++) {
                var g = Genders[i];
                if (g.id == e.value) return g.text;
            }
            return "";
        }

		//当鼠标选择改变时触发，去查询详细信息
        function onSelectionChanged(e) {
        
            var grid = e.sender;//？？什么东西
            var record = grid.getSelected();
            if (record) {
                employee_grid.load({ rid: record.rid });
            }
        }
        
    	//按时间段查询
    	function search(){
    			  var begin = mini.get("date1").getValue();
    	            var end= mini.get("date2").getValue();
    	            //好用这个加载
    	            dept_grid.load({beginDate:begin,endDate:end});
    	     //通过什么方式发送，这个条件，form表单还是ajax
    	}        
    </script>

</body>
</html>