<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>业务员</title>
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
    <h1>业务员管理</h1>      

    <div style="width:95%;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="add()">增加</a>
                        <a class="mini-button" iconCls="icon-add" onclick="edit()">编辑</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="remove()">删除</a>       
                    </td>
                    <td style="white-space:nowrap;">
                        <input id="querysfName" name="querysfName" class="mini-textbox" emptyText="请输入姓名" style="width:150px;" onenter="onKeyEnter"/>
                        <input id="querysfAddress" name="querysfAddress" class="mini-textbox" emptyText="请输入地址" style="width:150px;" onenter="onKeyEnter"/>
                        <select id="querysfState" name="querysfState" class="mini-radiobuttonlist">
                        	 <option value="">全部</option>
	                        <option value="0">休假</option>
	                        <option value="1">正常</option>
                    	</select>  
                        <a class="mini-button" onclick="search()">查询</a>
                    </td>
                </tr>
            </table>           
        </div>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:95%;height:auto;" allowResize="true"
        url="${pageContext.request.contextPath }/getAllStaffPageBean.action"  idField="id" multiSelect="true" 
    >
    	 
        <div property="columns">
            <!--<div type="indexcolumn"></div>        -->
            <div type="checkcolumn" ></div>
            <div field="sfid" width="10%" headerAlign="center" allowSort="true">业务员编号</div>
            <div header="基本信息">
	            <div property="columns">      
		            <div field="sfname" width="10%" headerAlign="center" allowSort="true">姓名</div>
		            <div field="sfBirthday" width="10%" headerAlign="center" allowSort="true"  >生日</div>
		            
		            <div field="sfphoneno" width="10%" headerAlign="center" allowSort="true">电话</div>
		            <div field="sfaddress" width="15%" headerAlign="center" allowSort="true">地址</div>
		        </div>
            </div>
            <div header="工作信息">
	            <div property="columns">   
		            <div field="jobName" width="10%" headerAlign="center" allowSort="true">职位</div>
		            <div field="salary" width="10%" headerAlign="center" allowSort="true">底薪</div>                                        
		            <div field="sfstate" width="10%" headerAlign="center" allowSort="true" renderer="onStateRenderer">状态</div>
                </div>
            </div>
            <div field="sfremarks" width="15%" headerAlign="center" allowSort="true">备注</div>     
         </div>  
    </div>
    

    <script type="text/javascript">
        mini.parse();

        var grid = mini.get("datagrid1");
        grid.load();


        function add() {

            mini.open({
                targetWindow: window,

                url:"${pageContext.request.contextPath }/page/addStaff.action",
                title: "新增职位", width: 600, height: 400,
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

        function edit() {
         
            var row = grid.getSelected();
            if (row) {
                mini.open({
                    url: "${pageContext.request.contextPath }/page/updateStaff.action",
                    title: "编辑员工", width: 600, height: 400,
                    onload: function () {
                        var iframe = this.getIFrameEl();
                        var data = { action: "edit", id: row.sfid };
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
        function remove() {
            
        	  var rows = grid.getSelecteds();
          	   
              if (rows.length > 0) {
                  if (confirm("确定删除选中记录？")) {
                      var array = new Array();
                      for (var i = 0, l = rows.length; i < l; i++) {
                          var r = rows[i];
                          array.push(r.sfid);
                      }
						var ids = array.join(",");
						var data = {"sfIds":ids};
                      grid.loading("操作中，请稍后......");
                     
                      
                      $.ajax({
                          url: "${pageContext.request.contextPath }/deleteStaff.action",
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
        function search() {
            
            var querysfName = mini.get("querysfName").getValue();
            var querysfAddress = mini.get("querysfAddress").getValue();
            var querysfState = mini.get("querysfState").getValue();

            grid.load({querysfName : querysfName ,querysfAddress : querysfAddress ,querysfState : querysfState});
            
        }
        function onKeyEnter(e) {
            search();
        }
        /////////////////////////////////////////////////
        function onBirthdayRenderer(e) {
            var value = "2017-12-16T11:22";
            alert(value);
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
        var StaffState = [{ id: 0, text: '休假' }, { id: 1, text: '正常'}]; 
		function onStateRenderer(e){
			for (var i = 0, l = StaffState.length; i < l; i++) {
                var s = StaffState[i];
                if (s.id == e.value) return s.text;
            }
            return "";
		}



    </script>

    <div class="description">
        <h3>Description</h3>
        
    </div>
</body>
</html>