<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>益恒大药房</title>
</head>
<body>

</body>
</html>

<script src="${pageContext.request.contextPath }/js/scripts/boot.js" type="text/javascript"></script> 
    <style type="text/css">
    html, body{
        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;
        
    }    
    </style>


<script src="${pageContext.request.contextPath }/desktopjs/DeskTop.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/desktopjs/Window.js" type="text/javascript"></script>
<link href="${pageContext.request.contextPath }/desktopjs/desktop.css" rel="stylesheet" type="text/css" />

<!-- windows -->
<script src="${pageContext.request.contextPath }/desktopjs/windows/IFrameWindow.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/desktopjs/windows/GridWindow.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/desktopjs/windows/TabsWindow.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/desktopjs/windows/SplitterWindow.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/desktopjs/windows/MapWindow.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath }/desktopjs/windows/ChartWindow.js" type="text/javascript"></script>

<!--map-->
<script type="text/javascript" src="http://api.map.baidu.com/api?key=&v=1.1&services=true"></script>

<!--chart-->
<script src="../open-flash-chart/open-flash-chart/swfobject.js" type="text/javascript"></script>

<script type="text/javascript">
    var modules = [
        { name: "iframe", text: "Index", iconCls: "desk-window", title: "", type: "ux.iframewindow", url: "${pageContext.request.contextPath }/page/indexPage.action" }

    ];
    /////////////////////////////////////////////////

    //desktop
    var desk = new mini.ux.DeskTop();
    desk.render(document.body);

    
    //desk.addHTML('<div style="position:absolute;right:10px;top:10px;width:200px;height:200px;background:red;"></div>');

    //modules
    desk.setModules(modules);

    //module click
    desk.on("moduleclick", function (e) {
        var module = e.module;

        var win = module.single;
        if (!win) {
            win = module.single = desk.createWindow(module.type);
            if (win) {
                if (win.type == "ux.iframewindow") {
                    win.setUrl(module.url);
                }
            }
        }
        if (win) {
            desk.showWindow(win);

        }
    });
</script>