﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>DataGrid 数据表格</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
    <!-- 导入css -->
    <link href="${pageContext.request.contextPath }/css/demo.css" rel="stylesheet" type="text/css" />
    <!-- 导入js -->
    <script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script>
    <!-- jquery核心 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/scripts/jquery.min.js"></script>
</head>
<body>
    <h1>DataGrid 数据表格</h1>      
<!-- 数据表工具栏 -->
    <div style="width:800px;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="add()">增加</a>
                        <a class="mini-button" iconCls="icon-add" onclick="edit()">编辑</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="remove()">删除</a>       
                    </td>
                    <td style="white-space:nowrap;">
                        <input id="key" class="mini-textbox" emptyText="请输入姓名" style="width:150px;" onenter="onKeyEnter"/>   
                        <a class="mini-button" onclick="search()">查询</a>
                    </td>
                </tr>
            </table>           
        </div>
    </div>
    <!-- 数据表请求数据地址url -->
    <div id="datagrid1" class="mini-datagrid" style="width:800px;height:280px;" allowResize="true"
        url="../data/AjaxService.jsp?method=SearchEmployees"  idField="id" multiSelect="true" 
    >
        <div property="columns">
            <!--<div type="indexcolumn"></div>        -->
            <div type="checkcolumn" ></div>        
            <div field="loginname" width="120" headerAlign="center" allowSort="true">员工帐号</div>    
            <div field="name" width="120" headerAlign="center" allowSort="true">姓名</div>    
            <div header="工作信息">
                <div property="columns">
                    <div field="dept_name" width="120">所属部门</div>
                    <div field="position_name" width="100">职位</div>
                    <div field="salary" dataType="currency" currencyUnit="￥" align="right" width="100" allowSort="true">薪资</div>
                </div>
            </div>
            <div field="createtime" width="100" headerAlign="center" dateFormat="yyyy-MM-dd" allowSort="true">创建日期</div>    
            <div header="基本信息">
                <div property="columns">
                    <div field="gender" width="100" renderer="onGenderRenderer">性别</div>
                    <div field="age" width="100" allowSort="true">年龄</div>
                    <div field="birthday" width="100" renderer="onBirthdayRenderer">出生日期</div>
                    <div field="married" width="100" align="center" renderer="onMarriedRenderer">婚否</div>
                    <div field="email" width="100">邮箱</div>
                </div>
            </div>
            <div header="学历信息">
                <div property="columns">
                    <div field="educational_name" width="100">学历</div>
                    <div field="school" width="120">毕业院校</div>
                </div>
            </div>                     
        </div>
    </div>
    

    <script type="text/javascript">
   /*  1.mini.parse()是将html解析成miniui控件对象。虽然我们内部也会自动解析，但是还是建议用户在页面上在使用控件对象的时候，也加上这句，这句话不会重复去解析已经解析完毕的控件，所以不会产生性能开销
	    2.var grid = mini.get("datagrid1");  是获取id为datagrid1的表格
	    3.grid.load(); 表格进行数据的加载，只是给到url="..."是不够的，还需要load()一下 */
        mini.parse();

        var grid = mini.get("datagrid1");
        grid.load();
        grid.sortBy("createtime", "desc");

        //添加事件函数
        function add() {
            //打开新窗口，直接写页面地址
            mini.open({
                url: "/drugSys-web/EmployeeWindow.jsp",
                title: "新增员工", width: 600, height: 400,
                //加载数据
                onload: function () {
                    var iframe = this.getIFrameEl();
                    var data = { action: "new"};
                    iframe.contentWindow.SetData(data);
                },
              
                ondestroy: function (action) {
					//操作完成重新加载数据
                    grid.reload();
                }
            });
        }
        function edit() {
         
            var row = grid.getSelected();
            if (row) {
                mini.open({
                    url: "/miniUi/EmployeeWindow.jsp",
                    title: "编辑员工", width: 600, height: 400,
                    onload: function () {
                        var iframe = this.getIFrameEl();
                        var data = { action: "edit", id: row.id };
                        iframe.contentWindow.SetData(data);
                        
                    },
                    ondestroy: function (action) {
                        grid.reload();
                        
                    }
                });
                
            } else {
                alert("请选中一条记录");
            }
            
        }
        function remove() {
            
            var rows = grid.getSelecteds();
            if (rows.length > 0) {
                if (confirm("确定删除选中记录？")) {
                    var ids = [];
                    for (var i = 0, l = rows.length; i < l; i++) {
                        var r = rows[i];
                        ids.push(r.id);
                    }
                    var id = ids.join(',');
                    grid.loading("操作中，请稍后......");
                    $.ajax({
                        url: "../data/AjaxService.jsp?method=RemoveEmployees&id=" +id,
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
        function search() {
            var key = mini.get("key").getValue();
            grid.load({ key: key });
        }
        function onKeyEnter(e) {
            search();
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

    <div class="description">
        <h3>Description</h3>
        
    </div>
</body>
</html>