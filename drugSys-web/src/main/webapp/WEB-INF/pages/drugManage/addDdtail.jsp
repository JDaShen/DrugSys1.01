<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工面板</title>
    <!-- 导入js -->
    <link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
    <!-- jquery核心 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/scripts/jquery.min.js"></script>
    <style type="text/css">
    html, body
    {
        font-size:12px;
        padding:0px;
        margin:0;
        border:0;
        height:100%;
        overflow:hidden;
    }
    
    form table tr td{
	 	height: 30px;
	 	width: 100px;
	}
    </style>
</head>
<body>    
     
    <form id="detailForm" method="post" style="border:solid 1px #aaa;padding:3px;">
        <input name="diid" class="mini-hidden" />
        <div style="padding-left:11px;padding-bottom:5px;">
            <table style="table-layout:fixed;">
                <tr>
                    <td >类别编号：</td>
                    <td >    
                        <input name="ddid" class="mini-textbox" required="true"  emptyText="请输入编号"/>
                    </td>
                    <td >所属大类：</td>
                    <td style="height: 50px;">    
                        <input id="drugTotal" name="dtid" class="mini-combobox" valueField="dtid" textField="dtname" 
                            url="${pageContext.request.contextPath }/drugMC/showDrugTotal.action"
                            onvaluechanged="onDrugTotalChanged" required="true"
                             emptyText="请选择所属大类"
                            />
                    </td>
                </tr>
                <tr>
                    <td >类别名称：</td>
                    <td >    
                        <input name="ddname" class="mini-textbox" required="true"/>
                    </td>
                    <td ></td>
                    <td ></td>
                </tr>
               
            </table>
        </div>
    </form>
        <div style="text-align:center;margin-top: 80px;">               
            <a class="mini-button" onclick="onOk" style="width:60px;margin-right:20px;">确定</a>       
            <a class="mini-button" onclick="onCancel" style="width:60px;">取消</a>       
        </div>
    <script type="text/javascript">
        mini.parse();

        var form = new mini.Form("detailForm");

        function SaveData() {
            var o = form.getData();            
            var json = mini.encode(o);   //序列化成JSON
            $.ajax({
                url: "${pageContext.request.contextPath }/drugMC/addDetail.action",
                type: "post",
                data: json,
                contentType:'application/json;charset=utf-8',
                success: function (text) {
              	 if(text=="success"){
              		 CloseWindow("save");
              	 }                        	 
                }	
            });
        }


        ////////////////////
        //标准方法接口定义
        function SetData(data) {
            if (data.action == "edit") {
                //跨页面传递的数据对象，克隆后才可以安全使用
                data = mini.clone(data);

                $.ajax({
                    url: "${pageContext.request.contextPath }/drugMC/updatedetail.action?diid=" + data.ddid,
                    cache: false,
                    success: function (text) {
                        var o = mini.decode(text);
                        form.setData(o);
                        form.setChanged(false);

                        onDeptChanged();
                        mini.getbyName("position").setValue(o.position);
                    }
                });
            }
        }

        function GetData() {
            var o = form.getData();
            return o;
        }
        function CloseWindow(action) {            
            if (action == "close" && form.isChanged()) {
                if (confirm("数据被修改了，是否先保存？")) {
                    return false;
                }
            }
            if (window.CloseOwnerWindow) return window.CloseOwnerWindow(action);
            else window.close();            
        }
        function onOk(e) {
            SaveData();
        }
        function onCancel(e) {
            CloseWindow("cancel");
        }

      
      
    </script>
</body>
</html>