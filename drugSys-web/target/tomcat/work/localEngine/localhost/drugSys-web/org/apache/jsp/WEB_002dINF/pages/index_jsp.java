package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>药品管理</title>\r\n");
      out.write("<!-- 引入样式 -->\r\n");
      out.write(" \t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/core.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write(" \t<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/demo.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write(" \t <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/scripts/boot.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/core.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/scripts/tongji.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<!-- jquery核心 -->\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/scripts/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("    body{\r\n");
      out.write("        margin:0;padding:0;border:0;width:100%;height:100%;overflow:hidden;\r\n");
      out.write("    }    \r\n");
      out.write("    .header\r\n");
      out.write("    {\r\n");
      out.write("        background:url(../header.gif) repeat-x 0 -1px;\r\n");
      out.write("    }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!--Layout-->\r\n");
      out.write("\t<div id=\"layout1\" class=\"mini-layout\" style=\"width:100%;height:100%;\">\r\n");
      out.write("\t    <div class=\"header\" region=\"north\" height=\"70\" showSplit=\"false\" showHeader=\"false\">\r\n");
      out.write("\t        <h1 style=\"margin:0;padding:15px;cursor:default;font-family:微软雅黑,黑体,宋体;\">益恒大药房药品管理系统 V0</h1>\r\n");
      out.write("\t        <div style=\"position:absolute;top:18px;right:10px;\">\r\n");
      out.write("   \t \t\t\t<a href=\"../index.html#quickstart\"></a>|\r\n");
      out.write("    \t\t\t<a href=\"../index.html#tutorial\"></a> \r\n");
      out.write("\t        </div>\r\n");
      out.write("\t        \r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div title=\"south\" region=\"south\" showSplit=\"false\" showHeader=\"false\" height=\"30\" >\r\n");
      out.write("\t        <div style=\"line-height:28px;text-align:center;cursor:default\">Copyright ©  </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div title=\"center\" region=\"center\" style=\"border:0;\" bodyStyle=\"overflow:hidden;\">\r\n");
      out.write("\t        <!--Splitter-->\r\n");
      out.write("\t        <div class=\"mini-splitter\" style=\"width:100%;height:100%;\" borderStyle=\"border:0;\">\r\n");
      out.write("\t            <div size=\"180\" maxSize=\"250\" minSize=\"100\" showCollapseButton=\"true\" style=\"border:0;\">\r\n");
      out.write("\t                <!--OutlookTree-->\r\n");
      out.write("\t                <div id=\"leftTree\" class=\"mini-outlooktree\" url=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/drugMC/showTree.action\" onnodeclick=\"onNodeSelect\"\r\n");
      out.write("\t                    textField=\"name\" idField=\"id\" parentField=\"pid\"                      \r\n");
      out.write("\t                >\r\n");
      out.write("\t                </div>\r\n");
      out.write("\t                \r\n");
      out.write("\t            </div>\r\n");
      out.write("\t            <div showCollapseButton=\"false\" style=\"border:0;\">\r\n");
      out.write("\t                <!--Tabs-->\r\n");
      out.write("\t                <div id=\"mainTabs\" class=\"mini-tabs\" activeIndex=\"2\" style=\"width:100%;height:100%;\"      \r\n");
      out.write("\t                     plain=\"false\" onactivechanged=\"onTabsActiveChanged\"\r\n");
      out.write("\t                >\r\n");
      out.write("\t                   \r\n");
      out.write("\t                </div>\r\n");
      out.write("\t            </div>        \r\n");
      out.write("\t        </div>\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        mini.parse();\r\n");
      out.write("\r\n");
      out.write("        var tree = mini.get(\"leftTree\");\r\n");
      out.write("\t\t\r\n");
      out.write("        function showTab(node) {\r\n");
      out.write("            var tabs = mini.get(\"mainTabs\");\r\n");
      out.write("            var id = \"tab$\" + node.id;\r\n");
      out.write("            var tab = tabs.getTab(id);\r\n");
      out.write("            if (!tab) {\r\n");
      out.write("                tab = {};\r\n");
      out.write("                tab._nodeid = node.id;\r\n");
      out.write("                tab.name = id;\r\n");
      out.write("                tab.title = node.name;\r\n");
      out.write("                tab.showCloseButton = true;\r\n");
      out.write("                //这里拼接了url，实际项目，应该从后台直接获得完整的url地址\r\n");
      out.write("                //tab.url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/drugMC/toShowDrugs.action?ddid=\" + node.id;\r\n");
      out.write("                tab.url = node.page + node.id;\r\n");
      out.write("                //tab.url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/drugMC/toShowDrugs.action?ddid=\" + node.id;\r\n");
      out.write("\r\n");
      out.write("                tabs.addTab(tab);\r\n");
      out.write("            }\r\n");
      out.write("            tabs.activeTab(tab);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function onNodeSelect(e) {\r\n");
      out.write("            var node = e.node;\r\n");
      out.write("            var isLeaf = e.isLeaf;\r\n");
      out.write("\t\t\tvar ddid = node.id;\r\n");
      out.write("            if (isLeaf) {\r\n");
      out.write("               \tshowTab(node);\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function onClick(e) {\r\n");
      out.write("            var text = this.getText();\r\n");
      out.write("            alert(text);\r\n");
      out.write("        }\r\n");
      out.write("        function onQuickClick(e) {\r\n");
      out.write("            tree.expandPath(\"datagrid\");\r\n");
      out.write("            tree.selectNode(\"datagrid\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function onTabsActiveChanged(e) {\r\n");
      out.write("            var tabs = e.sender;\r\n");
      out.write("            var tab = tabs.getActiveTab();\r\n");
      out.write("            if (tab && tab._nodeid) {\r\n");
      out.write("                \r\n");
      out.write("                var node = tree.getNode(tab._nodeid);\r\n");
      out.write("                if (node && !tree.isSelectedNode(node)) {\r\n");
      out.write("                    tree.selectNode(node);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("//树结代码，关键控件是onBeforeExpand\r\n");
      out.write("    mini.parse();\r\n");
      out.write("    function onBeforeExpand(e) {\r\n");
      out.write("        var tree = e.sender;\r\n");
      out.write("        var nowNode = e.node;\r\n");
      out.write("        var level = tree.getLevel(nowNode);\r\n");
      out.write("\r\n");
      out.write("        var root = tree.getRootNode();        \r\n");
      out.write("        tree.cascadeChild(root, function (node) {\r\n");
      out.write("            if (tree.isExpandedNode(node)) {\r\n");
      out.write("                var level2 = tree.getLevel(node);\r\n");
      out.write("                if (node != nowNode && !tree.isAncestor(node, nowNode) && level == level2) {\r\n");
      out.write("                    tree.collapseNode(node, true);\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    }\r\n");
      out.write("   \tfunction onNodeClick(){\r\n");
      out.write("        var tree=mini.get(\"drugsTree\");\r\n");
      out.write("        node = tree.getSelectedNode();\r\n");
      out.write("    \tvar url =\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/drugMC/toShowDrugs.action\";\r\n");
      out.write("   \t\tvar data = {};\r\n");
      out.write("   \t\tddid = node.id;\r\n");
      out.write("   \t\talert(ddid);\r\n");
      out.write("    \t$.post(url,data,function(text){\r\n");
      out.write("   \t\talert(12345);\r\n");
      out.write("    \t\talert(text);\r\n");
      out.write("    \t\tif (\"success\" == text) {\r\n");
      out.write("    \t\t location.href = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/test1.jsp\";\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("    \t\t\r\n");
      out.write("    \t},\"text\");\r\n");
      out.write("          \r\n");
      out.write("    \t}\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
