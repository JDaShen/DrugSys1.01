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
    <h1>修改业务员</h1>      

    <form id="form1" method="post">
        
        
        <fieldset style="border:solid 1px #aaa;padding:3px;">
            <legend >基本信息</legend>
            <div style="padding:5px;">
        <table>           
            <tr>
                <td style="width:72px;text-align: right;" >编号：</td>
                <td >    
                    <input name="sfid" class="mini-textbox" required="true" readonly="readonly"/>
                </td>
                <td style="width:72px;text-align: right;">姓名：</td>   
            	<td >    
                    <input name="sfname" class="mini-textbox"  required="true"/>
                </td>
            </tr> 
            <tr>
                <td style="width:72px;text-align: right;">职位：</td>
                <td style="width:150px;">    
                        <input name="jobid" class="mini-combobox" valueField="jobid" textField="jobname" 
                            url="${pageContext.request.contextPath }/getAllJob.action"
                            onvaluechanged="onDeptChanged" required="true"
                             emptyText="请选择职位"
                            />
                 </td>
                <td style="width:72px;text-align: right;">底薪：</td>
                <td >    
                    <input name="salary" class="mini-textbox"  required="true"/>
                </td>
            </tr>
            <tr>
                <td style="width:72px;text-align: right;">生日：</td>
                <td >    
                    <input name="sfBirthday" class="mini-datepicker" required="true" emptyText="请选择日期"/>
                </td>
                <td style="width:72px;text-align: right;">电话：</td>
                <td >    
                    <input name="sfphoneno" class="mini-textbox"  required="true"/>
                </td>
            </tr>  
             <tr>
                <td style="width:72px;text-align: right;">地址：</td>
                <td colspan="3">    
                    <input name="sfaddress" class="mini-textbox" required="true" style="width:100%;"/>
                </td>
            </tr>
            <td style="width:72px;">状态：</td>
                <td colspan="3">                        
                    <select name="sfstate" class="mini-radiobuttonlist">
                        <option value="0">休假</option>
                        <option value="1">正常</option>
                    </select>
                </td>
            <tr>
                <td style="width:72px;text-align: right;">备注：</td>
                <td colspan="3">    
                    <input name="sfremarks" class="mini-textarea" style="width:378px;" />
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
                url: "${pageContext.request.contextPath }/updateStaff.action",
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
                    url: "${pageContext.request.contextPath }/getStaffById.action?sfid=" + data.id,
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