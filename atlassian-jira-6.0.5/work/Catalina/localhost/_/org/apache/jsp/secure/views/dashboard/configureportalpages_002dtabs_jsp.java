/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2015-07-23 09:16:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.secure.views.dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class configureportalpages_002dtabs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tld/webwork.tld", Long.valueOf(1374535548000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.release();
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
      out.write("<ul id=\"filter_type_table\" class=\"vertical tabs\">\n");
      out.write("    <li id=\"md_fav_li\" class=\"");
      if (_jspx_meth_ww_005fif_005f0(_jspx_page_context))
        return;
      out.write("first\"><a id=\"favourite-dash-tab\" title=\"");
      if (_jspx_meth_ww_005ftext_005f0(_jspx_page_context))
        return;
      out.write("\" href=\"");
      out.print( request.getContextPath() );
      out.write("/secure/ConfigurePortalPages!default.jspa?view=favourites\"><strong>");
      if (_jspx_meth_ww_005ftext_005f1(_jspx_page_context))
        return;
      out.write("</strong></a></li>\n");
      out.write("    <li id=\"md_my_li\" ");
      if (_jspx_meth_ww_005fif_005f1(_jspx_page_context))
        return;
      out.write("><a id=\"my-dash-tab\" title=\"");
      if (_jspx_meth_ww_005ftext_005f2(_jspx_page_context))
        return;
      out.write("\" href=\"");
      out.print( request.getContextPath() );
      out.write("/secure/ConfigurePortalPages!default.jspa?view=my\"><strong>");
      if (_jspx_meth_ww_005ftext_005f3(_jspx_page_context))
        return;
      out.write("</strong></a></li>\n");
      out.write("    <li id=\"md_popular_li\" ");
      if (_jspx_meth_ww_005fif_005f2(_jspx_page_context))
        return;
      out.write("><a id=\"popular-dash-tab\" title=\"");
      if (_jspx_meth_ww_005ftext_005f4(_jspx_page_context))
        return;
      out.write("\" href=\"");
      out.print( request.getContextPath() );
      out.write("/secure/ConfigurePortalPages!default.jspa?view=popular\"><strong>");
      if (_jspx_meth_ww_005ftext_005f5(_jspx_page_context))
        return;
      out.write("</strong></a></li>\n");
      out.write("    <li id=\"md_search_li\" ");
      if (_jspx_meth_ww_005fif_005f3(_jspx_page_context))
        return;
      out.write("><a id=\"search-dash-tab\" title=\"");
      if (_jspx_meth_ww_005ftext_005f6(_jspx_page_context))
        return;
      out.write("\" href=\"");
      out.print( request.getContextPath() );
      out.write("/secure/ConfigurePortalPages!default.jspa?view=search\"><strong>");
      if (_jspx_meth_ww_005ftext_005f7(_jspx_page_context))
        return;
      out.write("</strong></a></li>\n");
      out.write("</ul>\n");
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

  private boolean _jspx_meth_ww_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f0 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f0.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(3,30) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f0.setTest("/view == 'favourites'");
    int _jspx_eval_ww_005fif_005f0 = _jspx_th_ww_005fif_005f0.doStartTag();
    if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("active ");
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

  private boolean _jspx_meth_ww_005ftext_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f0 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f0.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(3,122) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f0.setName("'configureportalpages.favourite.desc'");
    int _jspx_eval_ww_005ftext_005f0 = _jspx_th_ww_005ftext_005f0.doStartTag();
    if (_jspx_th_ww_005ftext_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f0);
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
    // /secure/views/dashboard/configureportalpages-tabs.jsp(3,283) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f1.setName("'common.favourites.favourites'");
    int _jspx_eval_ww_005ftext_005f1 = _jspx_th_ww_005ftext_005f1.doStartTag();
    if (_jspx_th_ww_005ftext_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f1 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f1.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(4,22) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f1.setTest("/view == 'my'");
    int _jspx_eval_ww_005fif_005f1 = _jspx_th_ww_005fif_005f1.doStartTag();
    if (_jspx_eval_ww_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"active\"");
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

  private boolean _jspx_meth_ww_005ftext_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f2 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f2.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(4,100) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f2.setName("'configureportalpages.my.desc'");
    int _jspx_eval_ww_005ftext_005f2 = _jspx_th_ww_005ftext_005f2.doStartTag();
    if (_jspx_th_ww_005ftext_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f2);
    return false;
  }

  private boolean _jspx_meth_ww_005ftext_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f3 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f3.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(4,246) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f3.setName("'common.concepts.my'");
    int _jspx_eval_ww_005ftext_005f3 = _jspx_th_ww_005ftext_005f3.doStartTag();
    if (_jspx_th_ww_005ftext_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f3);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f2 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f2.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(5,27) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f2.setTest("/view == 'popular'");
    int _jspx_eval_ww_005fif_005f2 = _jspx_th_ww_005fif_005f2.doStartTag();
    if (_jspx_eval_ww_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"active\"");
        int evalDoAfterBody = _jspx_th_ww_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_ww_005ftext_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f4 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f4.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f4.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(5,115) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f4.setName("'configureportalpages.popular.desc'");
    int _jspx_eval_ww_005ftext_005f4 = _jspx_th_ww_005ftext_005f4.doStartTag();
    if (_jspx_th_ww_005ftext_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f4);
    return false;
  }

  private boolean _jspx_meth_ww_005ftext_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f5 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f5.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f5.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(5,271) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f5.setName("'common.concepts.popular'");
    int _jspx_eval_ww_005ftext_005f5 = _jspx_th_ww_005ftext_005f5.doStartTag();
    if (_jspx_th_ww_005ftext_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f5);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f3 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f3.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(6,26) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f3.setTest("/view == 'search'");
    int _jspx_eval_ww_005fif_005f3 = _jspx_th_ww_005fif_005f3.doStartTag();
    if (_jspx_eval_ww_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"active\"");
        int evalDoAfterBody = _jspx_th_ww_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_ww_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.reuse(_jspx_th_ww_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_ww_005ftext_005f6(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f6 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f6.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f6.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(6,112) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f6.setName("'configureportalpages.search.desc'");
    int _jspx_eval_ww_005ftext_005f6 = _jspx_th_ww_005ftext_005f6.doStartTag();
    if (_jspx_th_ww_005ftext_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f6);
    return false;
  }

  private boolean _jspx_meth_ww_005ftext_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:text
    com.atlassian.jira.web.tags.TextTag _jspx_th_ww_005ftext_005f7 = (com.atlassian.jira.web.tags.TextTag) _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.get(com.atlassian.jira.web.tags.TextTag.class);
    _jspx_th_ww_005ftext_005f7.setPageContext(_jspx_page_context);
    _jspx_th_ww_005ftext_005f7.setParent(null);
    // /secure/views/dashboard/configureportalpages-tabs.jsp(6,266) name = name type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005ftext_005f7.setName("'common.concepts.search'");
    int _jspx_eval_ww_005ftext_005f7 = _jspx_th_ww_005ftext_005f7.doStartTag();
    if (_jspx_th_ww_005ftext_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005ftext_0026_005fname_005fnobody.reuse(_jspx_th_ww_005ftext_005f7);
    return false;
  }
}
