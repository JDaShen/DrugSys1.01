<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>药品管理</title>
<!-- 引入样式 -->
 	<link href="${pageContext.request.contextPath }/css/core.css" rel="stylesheet" type="text/css" />
 	<link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />
 	 <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>

    <script src="${pageContext.request.contextPath }/js/core.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath }/js/scripts/tongji.js" type="text/javascript"></script>
	<!-- jquery核心 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/scripts/jquery.min.js"></script>

    <style type="text/css">
    body{
        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
    }    
    .header
    {
        background:url(../header.gif) repeat-x 0 -1px;
    }
    </style>
</head>
<body>
	<!--Layout-->
	<div id="layout1" class="mini-layout" style="width:100%;height:100%;">
	    <div class="header" region="north" height="70" showSplit="false" showHeader="false">
	        <h1 style="margin:0;padding:15px;cursor:default;font-family:微软雅黑,黑体,宋体;">益恒大药房药品管理系统 V0</h1>
	        <div style="position:absolute;top:18px;right:10px;">
   	 			<a href="../index.html#quickstart"></a>|
    			<a href="../index.html#tutorial"></a> 
	        </div>
	        
	    </div>
	    <div title="south" region="south" showSplit="false" showHeader="false" height="30" >
	        <div style="line-height:28px;text-align:center;cursor:default">Copyright ©  </div>
	    </div>
	    <div title="center" region="center" style="border:0;" bodyStyle="overflow:hidden;">
	        <!--Splitter-->
	        <div class="mini-splitter" style="width:100%;height:100%;" borderStyle="border:0;">
	            <div size="180" maxSize="250" minSize="100" showCollapseButton="true" style="border:0;">
	                <!--OutlookTree-->
	                <div id="leftTree" class="mini-outlooktree" url="${pageContext.request.contextPath }/drugMC/showTree.action" onnodeclick="onNodeSelect"
	                    textField="name" idField="id" parentField="pid"                      
	                >
	                </div>
	                
	            </div>
	            <div showCollapseButton="false" style="border:0;">
	                <!--Tabs-->
	                <div id="mainTabs" class="mini-tabs" activeIndex="2" style="width:100%;height:100%;"      
	                     plain="false" onactivechanged="onTabsActiveChanged"
	                >
	                   
	                </div>
	            </div>        
	        </div>
	    </div>
	</div>

    

    <script type="text/javascript">
        mini.parse();

        var tree = mini.get("leftTree");
		
        function showTab(node) {
            var tabs = mini.get("mainTabs");
            var id = "tab$" + node.id;
            var tab = tabs.getTab(id);
            if (!tab) {
                tab = {};
                tab._nodeid = node.id;
                tab.name = id;
                tab.title = node.name;
                tab.showCloseButton = true;
                //这里拼接了url，实际项目，应该从后台直接获得完整的url地址
                //tab.url = "${pageContext.request.contextPath }/drugMC/toShowDrugs.action?ddid=" + node.id;
                tab.url = node.page + node.id;
                //tab.url = "${pageContext.request.contextPath }/drugMC/toShowDrugs.action?ddid=" + node.id;

                tabs.addTab(tab);
            }
            tabs.activeTab(tab);
        }

        function onNodeSelect(e) {
            var node = e.node;
            var isLeaf = e.isLeaf;
			var ddid = node.id;
            if (isLeaf) {
               	showTab(node);
            }
        }

        function onClick(e) {
            var text = this.getText();
            alert(text);
        }
        function onQuickClick(e) {
            tree.expandPath("datagrid");
            tree.selectNode("datagrid");
        }

        function onTabsActiveChanged(e) {
            var tabs = e.sender;
            var tab = tabs.getActiveTab();
            if (tab && tab._nodeid) {
                
                var node = tree.getNode(tab._nodeid);
                if (node && !tree.isSelectedNode(node)) {
                    tree.selectNode(node);
                }
            }
        }
    </script>

</body>
</body>
<script type="text/javascript">
//树结代码，关键控件是onBeforeExpand
    mini.parse();
    function onBeforeExpand(e) {
        var tree = e.sender;
        var nowNode = e.node;
        var level = tree.getLevel(nowNode);

        var root = tree.getRootNode();        
        tree.cascadeChild(root, function (node) {
            if (tree.isExpandedNode(node)) {
                var level2 = tree.getLevel(node);
                if (node != nowNode && !tree.isAncestor(node, nowNode) && level == level2) {
                    tree.collapseNode(node, true);
                }
            }
        });

    }
   	function onNodeClick(){
        var tree=mini.get("drugsTree");
        node = tree.getSelectedNode();
    	var url ="${pageContext.request.contextPath }/drugMC/toShowDrugs.action";
   		var data = {};
   		ddid = node.id;
   		alert(ddid);
    	$.post(url,data,function(text){
   		alert(12345);
    		alert(text);
    		if ("success" == text) {
    		 location.href = "${pageContext.request.contextPath }/test1.jsp";
				
			}
    		
    	},"text");
          
    	}
</script>
</html>