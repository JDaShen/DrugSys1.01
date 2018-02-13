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
                    	<span>药品名称：</span><input type="text" id="key" placeholder="支持模糊查询" />
                        <input type="button" value="查找" onclick="search()"/>
                    </td>
                </tr>
            </table>           
        </div>
    </div>
    <div id="allDrugs" class="mini-datagrid" align="center" style="width:100%;height:500px;" 
	    url="${pageContext.request.contextPath }/drugMC/showAllDrugs.action?ddid=${ddid}" idField="diid" multiSelect="true" allowResize="true"
	    sizeList="[2,20,30,50]" pageSize="2" 
	>
	    <div property="columns">
	        <div type="checkcolumn" ></div>
	        <div type="indexcolumn" headerAlign="center">序号</div>
	        <div field="diid" width="40" headerAlign="center" allowSort="true">药品编号</div>    
	        <div field="diname" width="80" headerAlign="center" allowSort="true">药品名称</div>                            
	        <div field="commonname" width="60" headerAlign="center" allowSort="true">药品简码</div>
	        <div field="barcode" width="40" headerAlign="center" allowSort="true">药品条码</div>                                
	        <div field="drugunit" width="40" headerAlign="center" allowSort="true">计量单位</div>
	        <div field="specification" width="40" headerAlign="center" allowSort="true">产品规格</div>                
	        <div field="drugtype" width="40" headerAlign="center" allowSort="true">药剂类型</div>                
	        <div field="registered" width="40" headerAlign="center" allowSort="true">注册证号</div>                
	        <div field="approval" width="40" headerAlign="center" allowSort="true">批准文号</div>                
	        <div field="ministock" width="40" headerAlign="center" allowSort="true">最低库存</div>                
	        <div field="singelprice" width="40" headerAlign="center" allowSort="true">预设售价</div>                
	        <div field="bargainprice" width="40" headerAlign="center" allowSort="true">特价售价</div>                
	        <div field="manufacturer" width="40" headerAlign="center" allowSort="true">生产厂商</div>                
	        <div field="isephedrine" renderer="onIsephedrine" width="40" headerAlign="center" allowSort="true">是否含麻黄碱</div>                
	        <div field="supervision" renderer="onSupervision" width="40" headerAlign="center" allowSort="true">是否电子监管</div>                
	        <div field="disable" renderer="onDisable" width="40" headerAlign="center" allowSort="true">禁用标识</div>                
	        <div field="drugremarks" width="40" headerAlign="center" allowSort="true">备注</div>                
	    </div>
	</div>




    <script type="text/javascript">
        
        mini.parse();
        
        var grid = mini.get("allDrugs");

        grid.load();

       
        //对数值表示的状态进行中文格式转换
        var isephedrine = [{ id: 0, text: '是' }, { id: 1, text: '否'}];
        function onIsephedrine(e) {
            for (var i = 0, l = isephedrine.length; i < l; i++) {
                var g = isephedrine[i];
                if (g.id == e.value) return g.text;
            }
            return "";
        }
        var supervision = [{ id: 0, text: '是' }, { id: 1, text: '否'}];
        function onSupervision(e) {
            for (var i = 0, l = supervision.length; i < l; i++) {
                var g = supervision[i];
                if (g.id == e.value) return g.text;
            }
            return "";
        }
        var disable = [{ id: 0, text: '是' }, { id: 1, text: '否'}];
        function onDisable(e) {
            for (var i = 0, l = disable.length; i < l; i++) {
                var g = disable[i];
                if (g.id == e.value) return g.text;
            }
            return "";
        }
        
        //添加新药品
        function add() {

            mini.open({
                targetWindow: window,

                  url: "${pageContext.request.contextPath }/drugMC/toAddDrug.action",
               // url: bootPATH + "${pageContext.request.contextPath }/WEB-INF/pages/drugManage/addDrugs.jsp",
                title: "新增药品", width: 600, height: 580,
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
                	url: "${pageContext.request.contextPath }/drugMC/toUpdateDrug.action",
                    title: "修改药品信息", width: 600, height: 580,
                    onload: function () {
                        var iframe = this.getIFrameEl();
                        var data = { action: "edit", diid: row.diid };
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
        
        function search() {
            var diname = document.getElementById("key").value;
            grid.load({ diname: diname });
        }
        
        function onKeyEnter(e) {
            search();
        }
        
        //批量删除
        function remove() {
            
            var rows = grid.getSelecteds();
            if (rows.length > 0) {
                if (confirm("确定删除选中记录？")) {
                    var ids = [];
                    for (var i = 0, l = rows.length; i < l; i++) {
                        var r = rows[i];
                        ids.push(r.diid);
                    }
                    var diids = ids.join('-');
                    grid.loading("操作中，请稍后......");
                    $.ajax({
                        url: "${pageContext.request.contextPath }/drugMC/deleteDrug.action?diids=" + diids,
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
        function onMarriedRenderer(e) {
            if (e.value == 1) return "是";
            else return "否";
        }
        var Genders = [{ id: 1, text: '男' }, { id: 2, text: '女'}];        
        function onGenderRenderer(e) {
            for (var i = 0, l = Genders.length; i < l; i++) {
                var g = Genders[i];
                if (g.id == e.value) return g.text;
            }
            return "";
        }
    </script>


  

</body>
</html>