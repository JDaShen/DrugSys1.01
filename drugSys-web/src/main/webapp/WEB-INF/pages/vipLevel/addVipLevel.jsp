<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Form</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />

    
    <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
    


</head>
<body>
    <h1>添加VIP等级</h1>      

    <form id="form1" method="post">
        
        
        <fieldset style="border:solid 1px #aaa;padding:3px;">
            <legend >基本信息</legend>
            <div style="padding:5px;">
        <table>
            <tr>
                <td style="width:72px;text-align: right;">等级编号：</td>
                <td  colspan="3" >    
                    <input name="levelid" class="mini-textbox" required="true"/>
                </td>
                
            </tr>
            <tr>
                <td style="width:70px;text-align: right;">名称：</td>
                <td style="width:200px;">    
                    <input name="vipname" class="mini-textbox" required="true"/>
                </td>
                <td style="width:72px;text-align: right;">优惠力度：</td>
                <td >    
                    <input name="discount" class="mini-textbox" vtype="range:0,1;rangeLength:1,4" required="true"/>
                </td>
            </tr>           
        </table>            
            </div>
        </fieldset>
        <div style="text-align:center;padding:10px;">               
            <a class="mini-button" onclick="onOk" style="width:60px;margin-right:20px;">确定</a>       
            <a class="mini-button" onclick="onCancel" style="width:60px;">取消</a>       
        </div>        
    </form>
    <script type="text/javascript">
        mini.parse();

        var form = new mini.Form("form1");

        function SaveData() {
            var o = form.getData();            
            var json = mini.encode(o);   //序列化成JSON

            $.ajax({
                url: "${pageContext.request.contextPath }/addVipLeve.action",
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