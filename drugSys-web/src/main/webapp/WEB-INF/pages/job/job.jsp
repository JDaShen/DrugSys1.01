<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>职务</title>
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
    <h1>职位管理</h1>      

    <div style="width:95%;">
        <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
            <table style="width:100%;">
                <tr>
                    <td style="width:100%;">
                        <a class="mini-button" iconCls="icon-add" onclick="add()">增加</a>
                        <a class="mini-button" iconCls="icon-add" onclick="edit()">编辑</a>
                        <a class="mini-button" iconCls="icon-remove" onclick="remove()">删除</a>       
                    </td>
                    
                </tr>
            </table>           
        </div>
    </div>
    <div id="datagrid1" class="mini-datagrid" style="width:95%;height:auto;" allowResize="true"
        url="${pageContext.request.contextPath }/getAllJob.action"  idField="id" multiSelect="true" 
    >
        <div property="columns">
            <!--<div type="indexcolumn"></div>        -->
            <div type="checkcolumn" ></div>
            <div field="jobid" width="20%" headerAlign="center" allowSort="true">职务编号</div>      
            <div field="jobname" width="70%" headerAlign="center" allowSort="true">名称</div>    
            <div field="commission" width="10%" headerAlign="center" allowSort="true" renderer="onCommissionRenderer">提成比例</div>    
         </div>  
    </div>
    

    <script type="text/javascript">
        mini.parse();

        var grid = mini.get("datagrid1");
        grid.load();


        function add() {

            mini.open({
                targetWindow: window,

                url:"${pageContext.request.contextPath }/page/addJob.action",
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
                    url: "${pageContext.request.contextPath }/page/updateJob.action?jobid="+row.jobid,
                    title: "编辑员工", width: 600, height: 400,
                    onload: function () {
                        var iframe = this.getIFrameEl();
                        var data = { action: "edit", id: row.jobid };
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
                          array.push(r.jobid);
                      }
						var ids = array.join(",");
						var data = {"jobIds":ids};
                      grid.loading("操作中，请稍后......");
                     
                      
                      $.ajax({
                          url: "${pageContext.request.contextPath }/deleteJob.action",
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

		function onCommissionRenderer(e){
			return e.value*100+"%"
		}



    </script>

    <div class="description">
        <h3>Description</h3>
        
    </div>
</body>
</html>