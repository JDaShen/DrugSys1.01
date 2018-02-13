
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title></title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />
     <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
    
    <style type="text/css">
    html,body
    {
        padding:0;
        margin:0;
        border:0;     
        width:100%;
        height:100%;
        overflow:hidden;   
    }
    </style> 
</head>
<body>
     <div class="mini-toolbar" style="text-align:center;line-height:30px;" borderStyle="border:0;">
          <label >选择仓库：</label>
         	<input id="combo1" class="mini-combobox" name="from"  style="width:150px;" textField="wname" valueField="wid" emptyText="请选择..."
					   onvaluechanged="search" url="${pageContext.request.contextPath }/warehouse/getWarehouse.action" value="..."  required="true" allowInput="true" showNullItem="true" nullItemText="请选择..."/>
    </div> 
    <!-- 去查询库存详细信息表，自己写一个包装类，来处理，与查询统计库存使用统一个方法 -->
    <div class="mini-fit">
		<!-- miniui数据表和工具栏 -->
        <div id="grid1" class="mini-datagrid" style="width:100%;height:100%;" 
            idField="id" allowResize="true"
            borderStyle="border-left:0;border-right:0;"
            multiSelect="true" 
        >
            <div property="columns">
            	<!-- 开启复选框栏，不用的话可以使用js选择器选中获取值得到id数组 -->
                <div type="checkcolumn" ></div>
                <div field="diid" width="120" headerAlign="center" allowSort="true">商品编号</div>    
                <div field="diname" width="100%" headerAlign="center" allowSort="true">商品名称</div>
                <div field="tradeid" width="100%" headerAlign="center" allowSort="true">单据号</div>
                <div field="manufacturer" width="100%" headerAlign="center" allowSort="true">供应商</div> 
	             <div field="commonname" width="80" headerAlign="center" >通用名</div> 
	              <div field="drugtype" width="80" headerAlign="center" >药物类型</div>                                            
	             <div field="drugunit" width="80" headerAlign="center" >单位</div>                                            
	             <div field="specification" width="80" headerAlign="center" >规格</div> 
	             <div field="singelprice" width="80" headerAlign="center" numberFormat="¥#,0.00" >单价</div> 
	             <div field="manufacturer" width="80" headerAlign="center" >制造商</div> 
	            <div field="wid" width="80" headerAlign="center" renderer="onGenderRenderer">所在仓库</div>                                                  
            </div>
        </div>
    
    </div>                
    <div class="mini-toolbar" style="text-align:center;padding-top:8px;padding-bottom:8px;" borderStyle="border:0;">
        <a class="mini-button" style="width:60px;" onclick="onOk()">确定</a>
        <span style="display:inline-block;width:25px;"></span>
        <a class="mini-button" style="width:60px;" onclick="onCancel()">取消</a>
    </div>

</body>
<script type="text/javascript">
    mini.parse();
    var Genders = [{ id: 1, text: '主仓库' }, { id: 2, text: '副仓库'}, { id: 3, text: '酒库'}];
    function onGenderRenderer(e) {
        for (var i = 0, l = Genders.length; i < l; i++) {
            var g = Genders[i];
            if (g.id == e.value) return g.text;
        }
        return "";
    }
    var grid = mini.get("grid1");
	var url = "${pageContext.request.contextPath}/check/getAllPendCheckGoods.action";
    //动态设置URL，在使用load方法来加载数据
    grid.setUrl(url);
    //也可以动态设置列 grid.setColumns([]);
    grid.load();


    ////////////////////////////////////////////////////////////////////////////////
//数据加载时发生
    grid.on("load", function (e) {

        if (firstLoad) {
            firstLoad = false;
            if (initIds) {
            	//通过行id选中值
                selectRowsByIds(initIds);
            }
        }
    });

    var firstLoad = true;
    var initIds;                   //存放初始数据id，这个作为选中数据。获取选购中的id
	//通过ids数组选择行数据0.1.2
    function selectRowsByIds(ids) {
        if (ids) {
        	  console.log(ids)
            var rows = [];
            //遍历选择
            for (var i = 0, l = ids.length; i < l; i++) {
                var o = grid.getRow(ids[i]);
                if (o) rows.push(o);
            }//将选择的数据写在rows中
            grid.selects(rows);
            console.log(rows)
        }
    }
	//处理选中的ids是字符串，需要处理为数组，给  initIds = ids;赋值
    function SetData(ids) {

        if (typeof ids == "string") {
            ids = ids.split(",");     //"1,2" => [1, 2]
        }
        initIds = ids;
    }

    function GetSelecteds() {
        var rows = grid.getSelecteds();
        return rows;
    }
    function GetData() {  
    	
    	//页面关闭时的回掉函数，用于发送跨页数据
        var rows = grid.getSelecteds();
        console.log(rows)
        var ids = [], texts = [];
        for (var i = 0, l = rows.length; i < l; i++) {
            var row = rows[i];
            //ids为数组,存放id，texts存放文本值
            ids.push(row.diId);
            texts.push(row.diName);
        }
        var data = {};
        //使用join方法将数组分离为字符串，在存储到data中
        data.id = ids.join(",");
        data.text = texts.join(",");
        console.log(data)
        return rows;
    }
//按商品名查询
    /* function search() {
        var key = mini.get("combo1").getValue();
        grid.load({ wid: key });
    } */
    function search(e) {
        var key = mini.get("combo1").getValue();
        grid.load({ wid: key });
    }
    //回车触发事件
    function onKeyEnter(e) {
    	//调用search函数
        search();
    }
    //////////////////////////////////
    function CloseWindow(action) {
        if (window.CloseOwnerWindow) return window.CloseOwnerWindow(action);
        else window.close();
    }

    function onOk() {
    	 var grid = mini.get("grid1");
    	 var rows = grid.getSelecteds();
         console.log(rows)
        CloseWindow("ok");
    }
    function onCancel() {
    	
        CloseWindow("cancel");
    }

    
</script>
</html>
