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
    <h1>添加业务员</h1>      

    <form id="form1" method="post">
        
        
        <fieldset style="border:solid 1px #aaa;padding:3px;">
            <legend >基本信息</legend>
            <div style="padding:5px;">
        <table>           
            <tr>
                <td style="width:72px;text-align: right;">编号：</td>
                <td >    
                    <input name="ctid" class="mini-textbox" required="true"/>
                </td>
                <td style="width:72px;text-align: right;">姓名：</td>   
            	<td >    
                    <input name="ctname" class="mini-textbox"  required="true"/>
                </td>
            </tr> 
            <tr>
                <td style="width:72px;text-align: right;">等级：</td>
                <td style="width:150px;">    
                        <input name="levelid" class="mini-combobox" valueField="levelid" textField="vipname" 
                            url="${pageContext.request.contextPath }/getAllVipLeve.action"
                            onvaluechanged="onDeptChanged" required="true"
                             emptyText="请选择等级"
                            />
                 </td>
                <td style="width:72px;text-align: right;">积分：</td>
                <td >    
                    <input name="integral" class="mini-textbox"  required="true"/>
                </td>
            </tr>
            <tr>
                <td style="width:72px;text-align: right;">总消费：</td>
                <td >    
                    <input name="consume" class="mini-textbox"  required="true"/>
                </td>
                <td style="width:72px;text-align: right;">消费次数：</td>
                <td >    
                    <input name="times" class="mini-textbox"  required="true"/>
                </td>
            </tr>  
             <tr>
                <td style="width:72px;text-align: right;">卡内余额：</td>
                <td colspan="3">    
                    <input name="balance" class="mini-textbox" required="true" style="width:100%;"/>
                </td>
            </tr>
            <td style="width:72px;">状态：</td>
                <td colspan="3">                        
                    <select name="ctstate" class="mini-radiobuttonlist">
                        <option value="0">未激活</option>
                        <option value="1">正常</option>
                        <option value="2">冻结</option>
                    </select>
                </td>
            
                     
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
                url: "${pageContext.request.contextPath }/updateCustomer.action",
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
		
        function SetData(data) {
            if (data.action == "edit") {
                //跨页面传递的数据对象，克隆后才可以安全使用
                data = mini.clone(data);

                $.ajax({
                    url: "${pageContext.request.contextPath }/getCustomerById.action?ctid=" + data.id,
                    cache: false,
                    success: function (text) {
                        var o = mini.decode(text);
                        form.setData(o);
                        form.setChanged(false);

                        onDeptChanged();
                        
                    }
                });
            }
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