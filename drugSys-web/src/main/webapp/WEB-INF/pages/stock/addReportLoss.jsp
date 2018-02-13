<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品报损</title>
  <!-- 导入css -->
    <link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <!-- 导入js -->
    <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
</head>
<body>
	<!-- 数据表工具栏，使用bootstrap -->
	<!-- content begin background:#B0B0B0-->
			<div class="container" style="margin-top: 20px;box-shadow: 3px 3px 10px;width:800px;margin-left:30px">
					<div class="row">
							<table  class="table table-hover table-bordered" id="table" style="width:800px">
							<tr>
									<td>报损单号：</td>
									<td colspan="6"><span id="dId" style="color:red"><span id="orderId">BS2017111701</span></span></td>
									<td>      
									</td>
							</tr>
								<tr>
									<td>所在仓库：</td>	
									<td colspan="2">    
					<input id="combo1" class="mini-combobox" name="from"  style="width:150px;" textField="wname" valueField="wid" emptyText="请选择仓库"
					    url="${pageContext.request.contextPath }/warehouse/getWarehouse.action"   required="true" allowInput="true" showNullItem="true" nullItemText="请选择..."/>   </td>	
									<td colspan="3"></td>	
								
									<td>经办人：</td>	
									<td> <input id="combo3" class="mini-combobox" name="sfid" style="width:150px;" textField="sfname" valueField="sfid" emptyText="请选择..."
								    url="${pageContext.request.contextPath }/getAllStaff.action"  required="true" allowInput="true" showNullItem="true" nullItemText="请选择..."/>
								    </td>	
								</tr>
							</table>
					</div>
   </div>
   <!-- 数据展示区begin -->
   <!--
   			1.跨页选择数据确定后，把数据发送到中继站，重新加载数据表
   			2.在加载后的表格修改，再次发送到中继站
   			3.修改完成后提交，批量增加
     -->
     <div class="container" style="margin-top: 10px;width:800px;margin-left:16px">
    <div style="width:800px;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;margin-top:10px;margin:0">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="add()" plain="true" tooltip="增加...">增加</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="removeRow()" plain="true">删除</a>
                        <span class="separator"></span>
                        <a class="mini-button" iconCls="icon-ok" onclick="saveData()" plain="true">保存更改</a>    
                        <span class="separator"></span>
                        <a class="mini-button" iconCls="icon-save" onclick="doAdd()" plain="true">提交单子</a>          
                    </td>
                    <td style="white-space:nowrap;">
                    </td>
                </tr>
            </table>           
        </div>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:800px;height:280px;margin:0" 
        url="${pageContext.request.contextPath }/warehouse/loadItems.action" idField="id" 
        allowResize="true" pageSize="20" 
        allowCellEdit="true" allowCellSelect="true" multiSelect="true" 
        editNextOnEnterKey="true"  editNextRowCell="true"
    >
        <div property="columns">
            <div type="indexcolumn"></div>
            <div type="checkcolumn"></div>
            <div name="diId"  field="diId" headerAlign="center" allowSort="true" width="150" >商品编号
            </div>
            <div name="diName"  field="diName" headerAlign="center" allowSort="true" width="150" >商品名
            </div>
            <div field="reals" width="100" allowSort="true" >数量
                <input property="editor" class="mini-spinner"  minValue="0" maxValue="20000" value="25" style="width:100%;" emptyText="请填写报损数量"/>
            </div>  
           <div name="expire" field="time" width="100" allowSort="true" dateFormat="yyyy-MM-dd HH:mm:ss">有效期至
            </div>  
             <div field="manufacturer" width="120" headerAlign="center" allowSort="true">制造商
            </div>  
            <div field="wName" width="120" headerAlign="center" allowSort="true">所在仓库
            </div>
    </div>
    </div>
    	</div>
    <!-- end -->
    </script>
     <script type="text/javascript">
        mini.parse();
        var grid = mini.get("datagrid1");
             //============================
        	//添加事件函数
        function add() {
        	 //打开新窗口，要求先选择仓库，做判断,小心这里的校验，mini.get("combo1").getSelected().wid;这里不对，先判断对象在取值
            var from =mini.get("combo1").getSelected();
            if(from==null){
            	mini.alert("请先选择仓库！")
            }
            var fromW = from.wid;
            mini.open({
            		targetWindow: window,//关键所在，跨页必须写
            	   url: "${pageContext.request.contextPath }/page/multiSelectGridWindow.action",                          
                   title: "添加商品",
                   width: 650,
                   height: 380,
                 //跨页传递的数据
                   onload: function () {
                      var iframe = this.getIFrameEl();
                      var data = { action: "byWid", id: fromW };
                      //设置跨页参数
                      iframe.contentWindow.SetData(data);
                  },
                   //回调函数，这个也可以写在这个外面
                   ondestroy: function (action) {
                     
                       if (action == "ok") {
                           var iframe = this.getIFrameEl();
                           //下面这句使用iframe标签对象，获内容窗口调用内容窗口中定义好的getData方法，跨页面数据的关键所在
                           var data = iframe.contentWindow.GetData();
                           //现在的需求是直接获取选中的元素数组提交到当前页面
                           //修改直接调用获取选中的行数据，放回就行了
                           data = mini.clone(data);
                           console.log("获取数据")
                           console.log(data)
                           var item = JSON.stringify(data);
                         
                           console.log(item)
		                  $.ajax({
		                  url: "${pageContext.request.contextPath}/warehouse/relay.action",
		                  type: "POST",
		                  dataType:"json",//预期的服务器响应的数据类型
		                  contentType: "application/json; charset=utf-8",//发送数据到服务器时所使用的内容类型
		                  data: item,
		                 success: function(d){
		                	//注意这里不是同步的请求所以每次这么写都报错，都是为空，ajax的异步请求
		                	if(d){
		                		 grid.load();
		                	}
		              },
		               error: function(res){
		                    alert(res.responseText);
		                 }
		             });
                           
                           //数据得到了使用js计数将其写到当前页面的表格中,使用遍历添加delegate针对新元素
                          /*  $.each(data,function(i,e){
                        	   //写成表单形式的input
                        	   $("#table").append("<tr><td>"+e.diId+"</td><td>"+e.diName+"</td><td><input name='amount' type='number' value="+e.reals+"/></td><td>"+e.expire+"</td><td>"+e.manufacturer+"</td><td>"+0+"</td><td>"+0+"</td><td>"+0+"</td></tr>")
                           }) */
                       }
                   }
            });
        }
        //表单CURD，删除行数据(支持多行)
        function removeRow() {
        	 if(confirm("确认删除?")){
        		  var rows = grid.getSelecteds();
        		   if (rows.length > 0) {
                   	//判断为多行调用如下方法
                       grid.removeRows(rows, true);                
                   }
        	 }
        	 //删除后调用保存数据
        	 saveData();
        	 alert("删除成功！")
        }
        //保存数据
         function saveData() {            
            //很好的方法，只会获取修改过的数据提交，
            //若是删除，会将剩下的全部发送保存
           // var data = grid.getChanges();
            //使用选择所有来提交，到后台覆盖就行
            grid.selectAll();
           var data = grid.getSelecteds();
            var json = mini.encode(data);
            console.log(json+"测试")
            if(data.length==0){
            	alert("请选择需要保存的数据")
            	return;
            }
            $.ajax({
                url: "${pageContext.request.contextPath }/warehouse/saveChange.action",
                dataType:"json",//预期的服务器响应的数据类型
                contentType: "application/json; charset=utf-8",//发送数据到服务器时所使用的内容类型
                data:json,
                type: "post",
               success: function (text) {
            	   if(text){
            		   
                   	//修改后重新访问加载存在session中的数据
                       grid.reload();
            	   }
                },
                error: function (jqXHR, textStatus, errorThrown) {
                    alert(jqXHR.responseText);
                } 
            });
        }
        //时间处理
        Date.prototype.Format = function (fmt) { //author: meizz 
				    var o = {
				        "M+": this.getMonth() + 1, //月份 
				        "d+": this.getDate(), //日 
				        "h+": this.getHours(), //小时 
				        "m+": this.getMinutes(), //分 
				        "s+": this.getSeconds(), //秒 
				        "q+": Math.floor((this.getMonth() + 3) / 3), 
				        "S": this.getMilliseconds() //毫秒 
				    };
				    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
				    for (var k in o)
				    if (new RegExp("(" + k + ")").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
				    return fmt;
				}
       //根据时间自动生成单号
       var str;
         window.onload = function generateId(){
    	  //据时间自动生成单号
    	    var time2 = new Date().Format("BSyyyyMMddhhmmss");
    	  	str = time2+"";
    	    var md = $("#orderId").text(str);
         }
       
       //提交调度项，添加到数据库
       function doAdd(){
    	  var date =new Date(); 
    	   var wid =mini.get("combo1").getSelected().wid;
    	   var sfid =mini.get("combo3").getSelected().sfid;
    	 	//获取单号
    	 	var rid = str;
    	 	//var arr = '{"from":'+from+',"to":'+to+',"date":'+date+',"sfid":'+sfid+',"dispid":'+str+',"mark":".."}';
    	 	var arr = {"wid":wid,"date":date,"sfid":sfid,"rid":str,"mark":".."};
    	 	 var json = mini.encode(arr);
    	 	console.log(json)
    	    if(confirm("确认提交?")){
    		   //怎么获取表格中的值，先手动选中za============
    			    $.ajax({
                url: "${pageContext.request.contextPath }/report/addReport.action",
                dataType:"json",//预期的服务器响应的数据类型
                contentType: "application/json; charset=utf-8",//发送数据到服务器时所使用的内容类型
                data:json,
                type: "post",
               success: function (data) {
            	  
            	   if(data.flag){
            		  
            		   alert("添加成功！")
                   	//修改后重新访问加载存在session中的数据
                   		 var time2 = new Date().Format("BSyyyyMMddhhmmss");
				    	  	str = time2+"";
				    	    var md = $("#orderId").text(str);
                       grid.reload();
            	   }else{
            		   alert("请先添加商品！")
            	   }
                },
                error: function (data) {
                	alert("请先添加商品！")
                } 
            });
    		   
    		   ///============================
    	   } 
    	   //1.获取调度单元素
    	 
    	 	 //给控件赋值getNowFormatDate时
    	 	
    	   //2.获取数据表格的元素，添加一个提交按钮
       }
    </script>
</body>
</html>