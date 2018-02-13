<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>存库调度</title>
<!-- 引入样式 -->
 	<link href="${pageContext.request.contextPath }/css/core.css" rel="stylesheet" type="text/css" />
 	 <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/core.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/scripts/tongji.js" type="text/javascript"></script>
	<!-- jquery核心 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/scripts/jquery.min.js"></script>
</head>
<body>
	 <div id="mainTabs" class="mini-tabs" activeIndex="0" style="width:100%;height:700px;" 
            		onactivechanged="onTabsActiveChanged" 
        >
            <div title="盘点列表">
            		<!-- 绑定事件 -->
                <iframe onload="onIFrameLoad()" src="${pageContext.request.contextPath }/page/toAddCheck.action" id="mainframe" frameborder="0" name="main" style="width:100%;height:100%;" border="0"></iframe>
            </div>
            <div title="历史盘点查询">
            	<!-- 使用标签加载页面 -->
                <iframe src="${pageContext.request.contextPath }/page/toQueryCheck.action" frameborder="0" name="code" style="width:100%;height:100%;" border="0"></iframe>
            </div>
             <div title="未盘点查询">
            	<!-- 使用标签加载页面 -->
                <iframe src="${pageContext.request.contextPath }/page/toPendCheck.action" frameborder="0" name="code" style="width:100%;height:100%;" border="0"></iframe>
            </div>
        </div>      
</body>
</html>