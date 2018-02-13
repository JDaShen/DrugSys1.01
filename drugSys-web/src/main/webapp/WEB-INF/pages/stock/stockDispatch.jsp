<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>存库调度</title>
<!-- 引入样式 -->
 	<link href="${pageContext.request.contextPath }/css/core.css" rel="stylesheet" type="text/css" />
 	<link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />
 	 <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/core.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/scripts/tongji.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/scripts/miniui/miniui.js" type="text/javascript"></script>
	<!-- jquery核心 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/scripts/jquery.min.js"></script>
</head>
<body>
<body>
     <div class="header" >        
    </div>
    <div id="Tabs" class="mini-tabs" activeIndex="0" style="width:100%;height:800px;" 
            		onactivechanged="onTabsActiveChanged" 
        >
            <div title="库存调拨单">
            		<!-- 绑定事件，双击查看商品明细表，具体走向，还需要一个页面 -->
                <iframe  src="${pageContext.request.contextPath }/page/addDispatche.action" id="mainframe" frameborder="0" name="main" style="width:100%;height:100%;" border="0"></iframe>
            </div>
            <div title="库存调拨情况">
            	<!-- 使用标签加载页面 -->
                <iframe src="${pageContext.request.contextPath }/page/dispatcherQuery.action" frameborder="0"  style="width:100%;height:100%;" border="0"></iframe>
            </div>
        </div>      
</body>

</html>