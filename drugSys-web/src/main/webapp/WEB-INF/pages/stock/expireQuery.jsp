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
<body >
	 <h3>商品过期信息</h3>      
    <div id="expireGrid" class="mini-datagrid" style="width:100%;height:200px;" 
        url="${pageContext.request.contextPath }/report/expireQuery.action"  idField="id"
        selectOnLoad="true"
    >
        <div property="columns">    <!-- 查询3张表 -->        
            <div field="diid" width="160" headerAlign="center" >商品编号</div>  
             <div field="diname" width="80" headerAlign="center" >商品名称</div>                                            
             <div field="commonname" width="80" headerAlign="center" >通用名</div> 
              <div field="drugtype" width="80" headerAlign="center" >药物类型</div>                                            
             <div field="drugunit" width="80" headerAlign="center" >单位</div>                                            
             <div field="specification" width="80" headerAlign="center" >规格</div> 
             <div field="amount" width="80" headerAlign="center" >库存量</div> 
             <div field="singelprice" width="80" headerAlign="center" numberFormat="¥#,0.00" >单价</div> 
             <div field="total" width="80" headerAlign="center" numberFormat="¥#,0.00"  >库存总值</div> 
             <div field="manufacturer" width="80" headerAlign="center" >制造商</div> 
             <div field="time" width="80" headerAlign="center" dateFormat="yyyy-MM-dd">有效期至</div> 
            <div field="wid" width="80" headerAlign="center" renderer="onGenderRenderer">所在仓库</div>                                        
        </div>
    </div> 
   
    

    <script type="text/javascript">
  //打开页面加载数据
	
        var Genders = [{ id: 1, text: '主仓库' }, { id: 2, text: '副仓库'}, { id: 3, text: '酒库'}];
        mini.parse();

        ///////////////////////////////////////////////////////       
        
        function onGenderRenderer(e) {
            for (var i = 0, l = Genders.length; i < l; i++) {
                var g = Genders[i];
                if (g.id == e.value) 
                	return g.text;
            }
            return "";
        }
      
	
    </script>
</body>
  <script type="text/javascript">
        window.onload=function(){
        	var expireGrid = mini.get("expireGrid");
        	//window.location.href = "${pageContext.request.contextPath }/report/expireQuery.action";
        	expireGrid.load();
        }
        </script>
</html>