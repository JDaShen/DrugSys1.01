<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>供应商</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <!-- 导入css -->
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
<body>
    
    
    
    
 

   <!-- 数据展示区begin -->
   <!--
   			1.跨页选择数据确定后，把数据发送到中继站，重新加载数据表
   			2.在加载后的表格修改，再次发送到中继站
   			3.修改完成后提交，批量增加
     -->
    <div style="width:95%;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
            <table style="width:100%;height: 30px;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="addRow()" plain="true" tooltip="增加...">增加</a>
                        <a class="mini-button" iconCls="icon-edit" onclick="edit()" plain="true">修改</a>  
                        <a class="mini-button" iconCls="icon-remove" onclick="removeRow()" plain="true">删除</a>          
                    </td>
                    <td style="white-space:nowrap;">
                        <input id="querysplname" class="mini-textbox" emptyText="请输入供应商名称" style="width:150px;" onenter="onKeyEnter" name="querysplname"/>
                        <input id="querycontact" class="mini-textbox" emptyText="请输入联系人姓名" style="width:150px;" onenter="onKeyEnter" name="querycontact"/>      
                        <a class="mini-button" onclick="search()">查询</a>
                    </td>
                </tr>
            </table>           
        </div>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:95%;height:auto;" 
        url="${pageContext.request.contextPath }/getSupplierPageBean.action" idField="id" onselectionchanged="onSelectionChanged" 
        allowResize="true" pageSize="5" sizeList="[3,5,10]" multiSelect="true" >
        <div property="columns">
            <div type="checkcolumn"></div>
            <div field="splid" headerAlign="center" allowSort="true" width="150" >供应商编号
                <input property="editor" class="mini-textbox" style="width:100%;" minWidth="200" />
            </div>
            <div field="splname" headerAlign="center" allowSort="true" width="150" >供应商名称
                <input property="editor" class="mini-textbox" style="width:100%;" minWidth="200" />
            </div>
            <div field="contact" width="100" allowSort="true" >联系人
                <input property="editor" class="mini-textbox"  minValue="0" maxValue="200" value="25" style="width:100%;"/>
            </div>            
            <div field="splphoneno" width="100" allowSort="true" >联系电话
                <input property="editor" class="mini-textbox" style="width:100%;"/>
            </div>  
             <div field="spladdress" width="120" headerAlign="center" allowSort="true">联系地址
                <input property="editor" class="mini-textbox" style="width:200px;" minWidth="200" minHeight="50"/>
            </div>  
            <div field="spltype" width="120" headerAlign="center" allowSort="true">类型
                <input property="editor" class="mini-textbox" style="width:200px;" minWidth="200" minHeight="50"/>
            </div>
            <div field="region" width="120" headerAlign="center" allowSort="true">所属地区
                <input property="editor" class="mini-textbox" style="width:200px;" minWidth="200" minHeight="50"/>
            </div>
    </div>
    </div>
   

    <div class="description">
        <h3>Description</h3>
        
    </div>
    
     <div id="order_grid" class="mini-datagrid" style="width:700px;height:250px;" 
        url="${pageContext.request.contextPath }/drugPurchase/getPgrInfoByCriterias.action" 
        pageSize="5" sizeList="[3,5,10]"
        >
        <div property="columns">            
            <div field="tradeid" width="120" headerAlign="center" allowSort="true">订单ID</div>
            <div field="showTradetime" width="120" headerAlign="center" allowSort="true">下单日期</div> 
            <div field="sfName" width="120" headerAlign="center" allowSort="true">经办人</div>
            <div field="totalprice" width="120" headerAlign="center" allowSort="true">交易总价</div>
            <div field="tradetype" width="120" headerAlign="center" allowSort="true" renderer="onTradetypeRenderer" >采购类型</div>  
            <div field="state" width="120" headerAlign="center" allowSort="true" renderer="onStateRenderer" >订单状态</div>                                     
        </div>
    </div> 
    
    
     <!-- end -->
     <script type="text/javascript">
        mini.parse();
        var grid = mini.get("datagrid1");
        var order_grid = mini.get("order_grid");
        grid.load();

 
        //============================
        	//添加事件函数
        function addRow() {
            //打开新窗口，直接写页面地址
            mini.open({
            	   url: "${pageContext.request.contextPath }/page/addSupplier.action",                          
                   title: "添加供应商",
                   width: 650,
                   height: 380,
                   //回调函数，这个也可以写在这个外面
                   ondestroy: function (action) {
                	   grid.reload();                 
                   }
            });
        }
        
        //查询
        function search() {
            var querysplname = mini.get("querysplname").getValue();
            var querycontact = mini.get("querycontact").getValue();

            grid.load({querysplname : querysplname ,querycontact : querycontact});
            
        }
        
        //删除
        function removeRow(){
        	   var rows = grid.getSelecteds();
        	   
               if (rows.length > 0) {
                   if (confirm("确定删除选中记录？")) {
                       var array = new Array();
                       for (var i = 0, l = rows.length; i < l; i++) {
                           var r = rows[i];
                           array.push(r.splid);
                       }
						var ids = array.join(",");
						var data = {"splIds":ids};
                       grid.loading("操作中，请稍后......");
                      
                       
                       $.ajax({
                           url: "${pageContext.request.contextPath }/deleteSupplier.action",
                           type: "post",
                           data: data,
                           success: function (text) {
                         	 if(text=="success"){
                         		 grid.reload();
                         	 }                        	 
                           }	
                       });
                   }
               } else {
                   alert("请选中一条记录");
               }
        	
        }
      
        
        function edit() {
        	 var row = grid.getSelected();
             if (row) {
                 mini.open({
                     url: "${pageContext.request.contextPath }/page/updateSupplier.action?splid="+row.splid,
                     title: "编辑供货商", width: 600, height: 400,
                     onload: function () {
                         var iframe = this.getIFrameEl();
                         var data = { action: "edit", id: row.splid };
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
        
        //表格联动
        function onSelectionChanged(e) {
            
            var grid = e.sender;
            var record = grid.getSelected();
            if (record) {
            	order_grid.load({ splid: record.splid });
            }
          
        }
        
        //
        var tradetypes = [{ id: 0, text: '进货' }, { id: 1, text: '退货'}];
        function onTradetypeRenderer(e) {
            for (var i = 0, l = tradetypes.length; i < l; i++) {
                var g = tradetypes[i];
                if (g.id == e.value) return g.text;
            }
            return "";
        }
        
        var states = [{ id: 0, text: '进货中' }, { id: 1, text: '已入库'},{ id: 2, text: '退货'}];
        function onStateRenderer(e){
        	for (var i = 0, l = states.length; i < l; i++) {
                var g = states[i];
                if (g.id == e.value) return g.text;
            }
            return "";
        }
 
    </script>
</body>

</html>