<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<!-- 引入样式 -->
	<link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/css/bootstrap-theme.css" rel="stylesheet" type="text/css" />
    <!-- 导入js -->
    <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath }/js/scripts/miniui/miniui.js" type="text/javascript"></script>
    <!-- jquery核心 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/scripts/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/scripts/bootstrap.min.js"></script>

</head>
<body >
	<div style="width:100%;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="add()">增加</a>
                        <a class="mini-button" iconCls="icon-add" onclick="edit()">编辑</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="remove()">删除</a>             
                    </td>
                    <td style="white-space:nowrap;">
                    	<span>药品类名：</span><input type="text" id="key" placeholder="支持模糊查询" />
                        <input type="button" value="查找" onclick="search()"/>
                    </td>
                </tr>
            </table>           
        </div>
    </div>
    <div id="allDetails" class="mini-datagrid" align="center" style="width:100%;height:500px;" 
	    url="${pageContext.request.contextPath }/drugMC/showAllDetails.action" idField="ddid" multiSelect="true" allowResize="true"
	    sizeList="[10,20,30,50]" pageSize="10" 
	>
	    <div property="columns">
	        <div type="checkcolumn" ></div>
	        <div type="indexcolumn" headerAlign="center" >序号</div>
	        <div field="ddid" width="40" headerAlign="center" allowSort="true">类别编号</div>    
	        <div field="ddname" width="80" headerAlign="center" allowSort="true">类别名称</div>                            
	        <div field="dtname" width="60" headerAlign="center" allowSort="true">所属大类</div>
	    </div>
	</div>




    <script type="text/javascript">
        
        mini.parse();
        
        var grid = mini.get("allDetails");

        grid.load();

        function search() {
            var name = document.getElementById("key").value;
            grid.load({ name: name });
        }
        $("#key").bind("keydown", function (e) {
            if (e.keyCode == 13) {
                search();
            }
        });
        
        //添加新药品
        function add() {

            mini.open({
                targetWindow: window,

                  url: "${pageContext.request.contextPath }/drugMC/toAddDetail.action",
               // url: bootPATH + "${pageContext.request.contextPath }/WEB-INF/pages/drugManage/addDrugs.jsp",
                title: "新增类别", width: 600, height: 300,
                onload: function () {
                    var iframe = this.getIFrameEl();
                    var data = { action: "new" };
                    iframe.contentWindow.SetData(data);
                },
                ondestroy: function (action) {

                    grid.reload();
                }
            });
        }

        //修改药品信息
        function edit() {
         	//获取选择的行数据
            var row = grid.getSelected();
            if (row) {
                mini.open({
                	url: "${pageContext.request.contextPath }/drugMC/toUpdateDetail.action",
                    title: "修改类别", width: 600, height: 300,
                    onload: function () {
                        var iframe = this.getIFrameEl();
                        var data = { action: "edit", ddid: row.ddid };
                        iframe.contentWindow.SetData(data);

                    },
                    ondestroy: function (action) {
                        //var iframe = this.getIFrameEl();

                        grid.reload();

                    }
                });
                
            } else {
                alert("请选中一条记录");
            }
            
        }
        
        //批量删除
        function remove() {
            
            var rows = grid.getSelecteds();
            if (rows.length > 0) {
                if (confirm("确定删除选中记录？")) {
                    var ddids = [];
                    for (var i = 0, l = rows.length; i < l; i++) {
                        var r = rows[i];
                        ddids.push(r.ddid);
                    }
                    var ids = ddids.join('-');
                    grid.loading("操作中，请稍后......");
                    $.ajax({
                        url: "${pageContext.request.contextPath }/drugMC/deleteDetail.action?ids=" + ids,
                        success: function (text) {
                            grid.reload();
                        },
                        error: function () {
                        }
                    });
                }
            } else {
                alert("请选中一条记录");
            }
        }
        
        /////////////////////////////////////////////////
        function onBirthdayRenderer(e) {
            var value = e.value;
            if (value) return mini.formatDate(value, 'yyyy-MM-dd');
            return "";
        }
    </script>


  

</body>
</html>