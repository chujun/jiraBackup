/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2015-07-23 09:21:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.secure.views.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.atlassian.jira.ComponentManager;
import com.atlassian.plugin.webresource.WebResourceManager;

public final class viewprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/tld/atlassian-jira-tags.tld", Long.valueOf(1374535548000L));
    _jspx_dependants.put("/WEB-INF/tld/webwork.tld", Long.valueOf(1374535548000L));
    _jspx_dependants.put("/WEB-INF/tld/sitemesh-page.tld", Long.valueOf(1374535548000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fui_005fparam_0026_005fname;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fname = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.release();
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    ");

        WebResourceManager webResourceManager = ComponentManager.getInstance().getWebResourceManager();
        webResourceManager.requireResource("jira.webresources:jira-fields");
    
      out.write("\n");
      out.write("    <title>");
      if (_jspx_meth_ww_005ftext_005f0(_jspx_page_context))
        return;
      out.write(':');
      out.write(' ');
      if (_jspx_meth_ww_005fproperty_005f0(_jspx_page_context))
        return;
      out.write("</title>\n");
      out.write("    <script type=\"text/javascript\">window.dhtmlHistory.create();</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header class=\"aui-page-header\">\n");
      out.write("        <div class=\"aui-page-header-inner\">\n");
      out.write("            <div class=\"aui-page-header-image\">\n");
      out.write("                <div class=\"aui-avatar aui-avatar-large\">\n");
      out.write("                    <div class=\"aui-avatar-inner\">\n");
      out.write("                        <img alt=\"");
      if (_jspx_meth_ww_005fproperty_005f1(_jspx_page_context))
        return;
      out.write("\" src=\"");
      if (_jspx_meth_ww_005fproperty_005f2(_jspx_page_context))
        return;
      out.write("\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"aui-page-header-main\">\n");
      out.write("                <h1 id=\"up-user-title\">");
      if (_jspx_meth_ww_005ftext_005f1(_jspx_page_context))
        return;
      out.write(": <span id=\"up-user-title-name\">");
      if (_jspx_meth_ww_005fproperty_005f3(_jspx_page_context))
        return;
      out.write("</span>");
      if (_jspx_meth_ww_005fif_005f0(_jspx_page_context))
        return;
      out.write("</h1>\n");
      out.write("            </div>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profile/viewprofile-tools.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </header>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_ui_005fsoy_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_ww_005ftext_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f0 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f0.setParent(null);
    // /secure/views/user/viewprofile.jsp(14,11) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f0.setName("'user.profile'");
    int _jspx_eval_ww_005ftext_005f0 = _jspx_th_ww_005ftext_005f0.doStartTag();
    if (_jspx_th_ww_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f0 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f0.setParent(null);
    // /secure/views/user/viewprofile.jsp(14,45) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f0.setValue("user/displayName");
    int _jspx_eval_ww_005fproperty_005f0 = _jspx_th_ww_005fproperty_005f0.doStartTag();
    if (_jspx_th_ww_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f1 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f1.setParent(null);
    // /secure/views/user/viewprofile.jsp(23,34) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setValue("user/fullName");
    int _jspx_eval_ww_005fproperty_005f1 = _jspx_th_ww_005fproperty_005f1.doStartTag();
    if (_jspx_th_ww_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f2 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f2.setParent(null);
    // /secure/views/user/viewprofile.jsp(23,78) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f2.setValue("/avatarUrl(user)");
    int _jspx_eval_ww_005fproperty_005f2 = _jspx_th_ww_005fproperty_005f2.doStartTag();
    if (_jspx_th_ww_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_ww_005ftext_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f1 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f1.setParent(null);
    // /secure/views/user/viewprofile.jsp(28,39) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f1.setName("'common.concepts.profile'");
    int _jspx_eval_ww_005ftext_005f1 = _jspx_th_ww_005ftext_005f1.doStartTag();
    if (_jspx_th_ww_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f3 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f3.setParent(null);
    // /secure/views/user/viewprofile.jsp(28,114) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f3.setValue("user/displayName");
    int _jspx_eval_ww_005fproperty_005f3 = _jspx_th_ww_005fproperty_005f3.doStartTag();
    if (_jspx_th_ww_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f0 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f0.setParent(null);
    // /secure/views/user/viewprofile.jsp(28,160) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f0.setTest("user/active == false");
    int _jspx_eval_ww_005fif_005f0 = _jspx_th_ww_005fif_005f0.doStartTag();
    if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(' ');
        out.write('(');
        if (_jspx_meth_ww_005ftext_005f2(_jspx_th_ww_005fif_005f0, _jspx_page_context))
          return true;
        out.write(')');
        int evalDoAfterBody = _jspx_th_ww_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005ftext_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f2 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /secure/views/user/viewprofile.jsp(28,197) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f2.setName("'admin.common.words.inactive'");
    int _jspx_eval_ww_005ftext_005f2 = _jspx_th_ww_005ftext_005f2.doStartTag();
    if (_jspx_th_ww_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_ui_005fsoy_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  ui:soy
    com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f0 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
    _jspx_th_ui_005fsoy_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fsoy_005f0.setParent(null);
    // /secure/views/user/viewprofile.jsp(34,4) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fsoy_005f0.setModuleKey("'com.atlassian.auiplugin:aui-experimental-soy-templates'");
    // /secure/views/user/viewprofile.jsp(34,4) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fsoy_005f0.setTemplate("'aui.page.pagePanel'");
    int _jspx_eval_ui_005fsoy_005f0 = _jspx_th_ui_005fsoy_005f0.doStartTag();
    if (_jspx_eval_ui_005fsoy_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ui_005fsoy_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ui_005fsoy_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ui_005fsoy_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_ui_005fparam_005f0(_jspx_th_ui_005fsoy_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_ui_005fsoy_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ui_005fsoy_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ui_005fsoy_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f0);
    return false;
  }

  private boolean _jspx_meth_ui_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fsoy_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  ui:param
    webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f0 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.get(webwork.view.taglib.ParamTag.class);
    _jspx_th_ui_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f0);
    // /secure/views/user/viewprofile.jsp(35,8) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f0.setName("'content'");
    int _jspx_eval_ui_005fparam_005f0 = _jspx_th_ui_005fparam_005f0.doStartTag();
    if (_jspx_eval_ui_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ui_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ui_005fparam_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ui_005fparam_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_ww_005fif_005f1(_jspx_th_ui_005fparam_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_ui_005fsoy_005f2(_jspx_th_ui_005fparam_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_ui_005fparam_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ui_005fparam_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ui_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fparam_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f1 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fparam_005f0);
    // /secure/views/user/viewprofile.jsp(36,12) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f1.setTest("/hasMoreThanOneProfileTabs == true");
    int _jspx_eval_ww_005fif_005f1 = _jspx_th_ww_005fif_005f1.doStartTag();
    if (_jspx_eval_ww_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_ui_005fsoy_005f1(_jspx_th_ww_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_ww_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_ui_005fsoy_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  ui:soy
    com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f1 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
    _jspx_th_ui_005fsoy_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fsoy_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /secure/views/user/viewprofile.jsp(37,16) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fsoy_005f1.setModuleKey("'com.atlassian.auiplugin:aui-experimental-soy-templates'");
    // /secure/views/user/viewprofile.jsp(37,16) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fsoy_005f1.setTemplate("'aui.page.pagePanelNav'");
    int _jspx_eval_ui_005fsoy_005f1 = _jspx_th_ui_005fsoy_005f1.doStartTag();
    if (_jspx_eval_ui_005fsoy_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ui_005fsoy_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ui_005fsoy_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ui_005fsoy_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        if (_jspx_meth_ui_005fparam_005f1(_jspx_th_ui_005fsoy_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_ui_005fsoy_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ui_005fsoy_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ui_005fsoy_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f1);
    return false;
  }

  private boolean _jspx_meth_ui_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fsoy_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  ui:param
    webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f1 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.get(webwork.view.taglib.ParamTag.class);
    _jspx_th_ui_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f1);
    // /secure/views/user/viewprofile.jsp(38,20) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f1.setName("'content'");
    int _jspx_eval_ui_005fparam_005f1 = _jspx_th_ui_005fparam_005f1.doStartTag();
    if (_jspx_eval_ui_005fparam_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ui_005fparam_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ui_005fparam_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ui_005fparam_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profile/viewprofile-tabs.jsp", out, false);
        out.write("\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_ui_005fparam_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ui_005fparam_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ui_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_ui_005fsoy_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fparam_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  ui:soy
    com.atlassian.jira.web.tags.SoyTemplateTag _jspx_th_ui_005fsoy_005f2 = (com.atlassian.jira.web.tags.SoyTemplateTag) _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.get(com.atlassian.jira.web.tags.SoyTemplateTag.class);
    _jspx_th_ui_005fsoy_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fsoy_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fparam_005f0);
    // /secure/views/user/viewprofile.jsp(43,12) name = moduleKey type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fsoy_005f2.setModuleKey("'com.atlassian.auiplugin:aui-experimental-soy-templates'");
    // /secure/views/user/viewprofile.jsp(43,12) name = template type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fsoy_005f2.setTemplate("'aui.page.pagePanelContent'");
    int _jspx_eval_ui_005fsoy_005f2 = _jspx_th_ui_005fsoy_005f2.doStartTag();
    if (_jspx_eval_ui_005fsoy_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ui_005fsoy_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ui_005fsoy_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ui_005fsoy_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_ui_005fparam_005f2(_jspx_th_ui_005fsoy_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_ui_005fsoy_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ui_005fsoy_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ui_005fsoy_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fsoy_0026_005ftemplate_005fmoduleKey.reuse(_jspx_th_ui_005fsoy_005f2);
    return false;
  }

  private boolean _jspx_meth_ui_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ui_005fsoy_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    javax.servlet.http.HttpServletRequest request = (javax.servlet.http.HttpServletRequest)_jspx_page_context.getRequest();
    javax.servlet.http.HttpServletResponse response = (javax.servlet.http.HttpServletResponse)_jspx_page_context.getResponse();
    //  ui:param
    webwork.view.taglib.ParamTag _jspx_th_ui_005fparam_005f2 = (webwork.view.taglib.ParamTag) _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.get(webwork.view.taglib.ParamTag.class);
    _jspx_th_ui_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ui_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ui_005fsoy_005f2);
    // /secure/views/user/viewprofile.jsp(44,16) name = name type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ui_005fparam_005f2.setName("'content'");
    int _jspx_eval_ui_005fparam_005f2 = _jspx_th_ui_005fparam_005f2.doStartTag();
    if (_jspx_eval_ui_005fparam_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ui_005fparam_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ui_005fparam_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ui_005fparam_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                    ");
        org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profile/viewprofile-content.jsp", out, false);
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_ui_005fparam_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ui_005fparam_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ui_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fui_005fparam_0026_005fname.reuse(_jspx_th_ui_005fparam_005f2);
    return false;
  }
}
