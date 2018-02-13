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
     
    <form id="drugForm" method="post" style="border:solid 1px #aaa;padding:3px;">
        <input name="diid" class="mini-hidden" />
        <div style="padding-left:11px;padding-bottom:5px;">
            <table style="table-layout:fixed;">
                <tr>
                    <td >药品编号：</td>
                    <td >    
                        <input name="diid" class="mini-textbox" required="true"  emptyText="请输入编号"/>
                    </td>
                    <td >所属分类：</td>
                    <td style="height: 50px;">    
                        <input id="drugTotal" name="dtid" class="mini-combobox" valueField="dtid" textField="dtname" 
                            url="${pageContext.request.contextPath }/drugMC/showDrugTotal.action"
                            onvaluechanged="onDrugTotalChanged" required="true"
                             emptyText="请选择一级分类"
                            />
                        <input id="drugDetail" name="ddid" class="mini-combobox" valueField="ddid" textField="ddname" 
                             required="true"
                             emptyText="请选择所属分类"
                            />
                    </td>
                </tr>
                <tr>
                    <td >药品名称：</td>
                    <td >    
                        <input name="diname" class="mini-textbox" required="true"/>
                    </td>
                    <td >药品条码：</td>
                    <td >    
                        <input name="barcode" class="mini-textbox"/>
                    </td>
                </tr>
               
                <tr>
                    <td >单位（计量）：</td>
                    <td >    
                        <input name="drugunit" class="mini-combobox" valueField="name" textField="name" url="${pageContext.request.contextPath }/json/drugsunit.json" />
                    </td>
                    <td >产品规格：</td>
                    <td >    
                        <input name="specification" class="mini-textbox" />
                    </td>
                </tr>           
                <tr>
                    <td >药剂类型：</td>
                    <td >    
                        <input name="drugtype" class="mini-textbox"/>
                    </td>
                    <td >药品简码：</td>
                    <td >    
                        <input name="commonname" class="mini-textbox" />
                    </td>
                </tr>           
                <tr>
                    <td >批准文号：</td>
                    <td >    
                        <input name="approval" class="mini-textbox"/>
                    </td>
                    <td >最低库存：</td>
                    <td >    
                        <input name="ministock" class="mini-textbox" />
                    </td>
                </tr>           
                <tr>
                    <td >预设售价：</td>
                    <td >    
                        <input name="singelprice" class="mini-textbox"/>
                    </td>
                    <td >采购单价：</td>
                    <td >    
                        <input name="price" class="mini-textbox" />
                    </td>
                </tr>           
                <tr>
                    <td >特价售价：</td>
                    <td >    
                        <input name="bargainprice" class="mini-textbox"/>
                    </td>
                    <td >生产厂商：</td>
                    <td >    
                        <input name="manufacturer" class="mini-textbox" />
                    </td>
                </tr>           
                <tr>
                    <td >是否含麻黄碱：</td>
                    <td > 
                    	<div id="isephedrine" name="isephedrine" class="mini-radiobuttonlist" repeatItems="2" repeatLayout="table" 
                    	repeatDirection="textalign"
						    textField="text" valueField="id" value="0"
						    url="${pageContext.request.contextPath }/json/radio.json" >
						</div>    
                       	<!-- 是<input name="isephedrine" type="radio" value="0"/>
                                                否<input name="isephedrine" type="radio" value="1"/> -->
                    </td>
                    <td >注册证号：</td>
                    <td >    
                        <input name="registered" class="mini-textbox" />
                    </td>
                </tr>           
                <tr>
                    <td >禁用标识：</td>
                    <td > 
                    	<div id="disable" name="disable" class="mini-radiobuttonlist" repeatItems="2" repeatLayout="table" 
                    	repeatDirection="textalign"
						    textField="text" valueField="id" value="0"
						    url="${pageContext.request.contextPath }/json/radio.json" >
						</div>    
                     	<!-- 是<input name="disable" type="radio" value="0"/>
                       	否<input name="disable" type="radio" value="1"/> -->
                    </td>
                    <td >电子监管标识：</td>
                    <td >    
                    	<div id="supervision" name="supervision" class="mini-radiobuttonlist" repeatItems="2" repeatLayout="table" 
                    	repeatDirection="textalign"
						    textField="text" valueField="id" value="0"
						    url="${pageContext.request.contextPath }/json/radio.json" >
						</div> 
                		<!--   是<input name="supervision" type="radio" value="0"/>
                                                否<input name="supervision" type="radio" value="1"/> -->
                    </td>
                </tr>           
                <tr>
                    <td>备注：</td>
                    <td></td>
                    <td></td>
                    <td></td>
                </tr>           
                <tr>
                    <td colspan="4" >    
                        <input name="drugremarks" class="mini-textarea" style="width: 400px;height: 80px;"/>
                    </td>
                </tr>           
            </table>
        </div>
    </form>
        <div style="text-align:center;margin-top: 20px;">               
            <a class="mini-button" onclick="onOk" style="width:60px;margin-right:20px;">确定</a>       
            <a class="mini-button" onclick="onCancel" style="width:60px;">取消</a>       
        </div>
    <script type="text/javascript">
        mini.parse();

        var form = new mini.Form("drugForm");

        function SaveData() {
            var o = form.getData();            
            var json = mini.encode(o);   //序列化成JSON
            $.ajax({
                url: "${pageContext.request.contextPath }/drugMC/addDrug.action",
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
                    url: "${pageContext.request.contextPath }/drugMC/updateDrug.action?diid=" + data.diid,
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

      //药品 一级 二级 联动
        function onDrugTotalChanged(e) {
        var dtid = mini.get("drugTotal").getValue();
        mini.get("drugDetail").setValue("");
        var url = "${pageContext.request.contextPath }/drugMC/showDrugDetail.action?dtid=" + dtid;
        mini.get("drugDetail").setUrl(url);            
        mini.get("drugDetail").select(0);
      	}
      
    </script>
</body>
</html>