/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2015-07-24 05:24:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.template.aui.dropdown;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/tld/webwork.tld", Long.valueOf(1374535548000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fdeclare_0026_005fvalue_005fid;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fescape_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue_005fstatus;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fid_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fww_005fdeclare_0026_005fvalue_005fid = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fescape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue_005fstatus = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fid_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fww_005fdeclare_0026_005fvalue_005fid.release();
    _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fescape_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue_005fstatus.release();
    _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue.release();
    _005fjspx_005ftagPool_005fww_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fid_005fnobody.release();
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

      out.write('\n');
      out.write('\n');
      if (_jspx_meth_ww_005fdeclare_005f0(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_ww_005fif_005f1(_jspx_page_context))
        return;
      out.write('\n');
      if (_jspx_meth_ww_005fproperty_005f7(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_ww_005fdeclare_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:declare
    webwork.view.taglib.DeclareTag _jspx_th_ww_005fdeclare_005f0 = (webwork.view.taglib.DeclareTag) _005fjspx_005ftagPool_005fww_005fdeclare_0026_005fvalue_005fid.get(webwork.view.taglib.DeclareTag.class);
    _jspx_th_ww_005fdeclare_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fdeclare_005f0.setParent(null);
    // /template/aui/dropdown/cog.jsp(7,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fdeclare_005f0.setId("varId");
    // /template/aui/dropdown/cog.jsp(7,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fdeclare_005f0.setValue("parameters['id']");
    int _jspx_eval_ww_005fdeclare_005f0 = _jspx_th_ww_005fdeclare_005f0.doStartTag();
    if (_jspx_eval_ww_005fdeclare_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ww_005fdeclare_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ww_005fdeclare_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ww_005fdeclare_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_ww_005fif_005f0(_jspx_th_ww_005fdeclare_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_ww_005fdeclare_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ww_005fdeclare_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ww_005fdeclare_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fdeclare_0026_005fvalue_005fid.reuse(_jspx_th_ww_005fdeclare_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fdeclare_0026_005fvalue_005fid.reuse(_jspx_th_ww_005fdeclare_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fdeclare_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f0 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fdeclare_005f0);
    // /template/aui/dropdown/cog.jsp(7,48) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f0.setTest(".");
    int _jspx_eval_ww_005fif_005f0 = _jspx_th_ww_005fif_005f0.doStartTag();
    if (_jspx_eval_ww_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" id=\"");
        if (_jspx_meth_ww_005fproperty_005f0(_jspx_th_ww_005fif_005f0, _jspx_page_context))
          return true;
        out.write('"');
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

  private boolean _jspx_meth_ww_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f0 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f0);
    // /template/aui/dropdown/cog.jsp(7,69) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f0.setValue(".");
    int _jspx_eval_ww_005fproperty_005f0 = _jspx_th_ww_005fproperty_005f0.doStartTag();
    if (_jspx_th_ww_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f0);
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
    // /template/aui/dropdown/cog.jsp(8,0) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f1.setTest("parameters['model']/totalItems > 0");
    int _jspx_eval_ww_005fif_005f1 = _jspx_th_ww_005fif_005f1.doStartTag();
    if (_jspx_eval_ww_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    <div class=\"aui-dd-parent\">\n");
        out.write("        <a class=\"aui-dd-link cog-dd js-default-dropdown\" href=\"#\" ");
        if (_jspx_meth_ww_005fproperty_005f1(_jspx_th_ww_005fif_005f1, _jspx_page_context))
          return true;
        out.write(" >\n");
        out.write("        <span>\n");
        out.write("            ");
        if (_jspx_meth_ww_005fproperty_005f2(_jspx_th_ww_005fif_005f1, _jspx_page_context))
          return true;
        out.write(' ');
        out.write("\n");
        out.write("        </span>\n");
        out.write("        </a>\n");
        out.write("        <div class=\"aui-list hidden\">\n");
        out.write("            ");
        if (_jspx_meth_ww_005fiterator_005f0(_jspx_th_ww_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        </div>\n");
        out.write("    </div>\n");
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

  private boolean _jspx_meth_ww_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f1 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fescape_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /template/aui/dropdown/cog.jsp(10,67) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setValue("@varId");
    // /template/aui/dropdown/cog.jsp(10,67) name = escape type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f1.setEscape(false);
    int _jspx_eval_ww_005fproperty_005f1 = _jspx_th_ww_005fproperty_005f1.doStartTag();
    if (_jspx_th_ww_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fescape_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fescape_005fnobody.reuse(_jspx_th_ww_005fproperty_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f2 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /template/aui/dropdown/cog.jsp(12,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f2.setValue("parameters['model']/topText");
    int _jspx_eval_ww_005fproperty_005f2 = _jspx_th_ww_005fproperty_005f2.doStartTag();
    if (_jspx_th_ww_005fproperty_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f2);
    return false;
  }

  private boolean _jspx_meth_ww_005fiterator_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fif_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:iterator
    webwork.view.taglib.IteratorTag _jspx_th_ww_005fiterator_005f0 = (webwork.view.taglib.IteratorTag) _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue_005fstatus.get(webwork.view.taglib.IteratorTag.class);
    _jspx_th_ww_005fiterator_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fiterator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fif_005f1);
    // /template/aui/dropdown/cog.jsp(16,12) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fiterator_005f0.setValue("parameters['model']/sections");
    // /template/aui/dropdown/cog.jsp(16,12) name = status type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fiterator_005f0.setStatus("'status'");
    int _jspx_eval_ww_005fiterator_005f0 = _jspx_th_ww_005fiterator_005f0.doStartTag();
    if (_jspx_eval_ww_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ww_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ww_005fiterator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ww_005fiterator_005f0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                <ul class=\"aui-list-section ");
        if (_jspx_meth_ww_005fif_005f2(_jspx_th_ww_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write(' ');
        if (_jspx_meth_ww_005fif_005f3(_jspx_th_ww_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\">\n");
        out.write("                    ");
        if (_jspx_meth_ww_005fiterator_005f1(_jspx_th_ww_005fiterator_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                </ul>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_ww_005fiterator_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ww_005fiterator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ww_005fiterator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_ww_005fiterator_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue_005fstatus.reuse(_jspx_th_ww_005fiterator_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fif_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f2 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f0);
    // /template/aui/dropdown/cog.jsp(17,44) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f2.setTest("@status/first == true");
    int _jspx_eval_ww_005fif_005f2 = _jspx_th_ww_005fif_005f2.doStartTag();
    if (_jspx_eval_ww_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("aui-first");
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

  private boolean _jspx_meth_ww_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:if
    webwork.view.taglib.IfTag _jspx_th_ww_005fif_005f3 = (webwork.view.taglib.IfTag) _005fjspx_005ftagPool_005fww_005fif_0026_005ftest.get(webwork.view.taglib.IfTag.class);
    _jspx_th_ww_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f0);
    // /template/aui/dropdown/cog.jsp(17,98) name = test type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fif_005f3.setTest("@status/last == true");
    int _jspx_eval_ww_005fif_005f3 = _jspx_th_ww_005fif_005f3.doStartTag();
    if (_jspx_eval_ww_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("aui-last");
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

  private boolean _jspx_meth_ww_005fiterator_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:iterator
    webwork.view.taglib.IteratorTag _jspx_th_ww_005fiterator_005f1 = (webwork.view.taglib.IteratorTag) _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue.get(webwork.view.taglib.IteratorTag.class);
    _jspx_th_ww_005fiterator_005f1.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fiterator_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f0);
    // /template/aui/dropdown/cog.jsp(18,20) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fiterator_005f1.setValue("./items");
    int _jspx_eval_ww_005fiterator_005f1 = _jspx_th_ww_005fiterator_005f1.doStartTag();
    if (_jspx_eval_ww_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ww_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ww_005fiterator_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ww_005fiterator_005f1.doInitBody();
      }
      do {
        out.write("\n");
        out.write("                        <li class=\"aui-list-item\">\n");
        out.write("                            <a class=\"aui-list-item-link ");
        if (_jspx_meth_ww_005fproperty_005f3(_jspx_th_ww_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("\" href=\"");
        if (_jspx_meth_ww_005furl_005f0(_jspx_th_ww_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write('"');
        out.write(' ');
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_ww_005fiterator_005f2(_jspx_th_ww_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write(">\n");
        out.write("                                ");
        if (_jspx_meth_ww_005fproperty_005f6(_jspx_th_ww_005fiterator_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            </a>\n");
        out.write("                        </li>\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_ww_005fiterator_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ww_005fiterator_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ww_005fiterator_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue.reuse(_jspx_th_ww_005fiterator_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue.reuse(_jspx_th_ww_005fiterator_005f1);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f3 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f3.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f1);
    // /template/aui/dropdown/cog.jsp(20,57) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f3.setValue("./attrAndRemove('class')");
    int _jspx_eval_ww_005fproperty_005f3 = _jspx_th_ww_005fproperty_005f3.doStartTag();
    if (_jspx_th_ww_005fproperty_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f3);
    return false;
  }

  private boolean _jspx_meth_ww_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:url
    com.atlassian.jira.web.tags.URLTag _jspx_th_ww_005furl_005f0 = (com.atlassian.jira.web.tags.URLTag) _005fjspx_005ftagPool_005fww_005furl_0026_005fvalue_005fnobody.get(com.atlassian.jira.web.tags.URLTag.class);
    _jspx_th_ww_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_ww_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f1);
    // /template/aui/dropdown/cog.jsp(20,112) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005furl_005f0.setValue("./attrAndRemove('href')");
    int _jspx_eval_ww_005furl_005f0 = _jspx_th_ww_005furl_005f0.doStartTag();
    if (_jspx_th_ww_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_ww_005fiterator_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:iterator
    webwork.view.taglib.IteratorTag _jspx_th_ww_005fiterator_005f2 = (webwork.view.taglib.IteratorTag) _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue.get(webwork.view.taglib.IteratorTag.class);
    _jspx_th_ww_005fiterator_005f2.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fiterator_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f1);
    // /template/aui/dropdown/cog.jsp(21,28) name = value type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fiterator_005f2.setValue("./attrs");
    int _jspx_eval_ww_005fiterator_005f2 = _jspx_th_ww_005fiterator_005f2.doStartTag();
    if (_jspx_eval_ww_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_ww_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_ww_005fiterator_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_ww_005fiterator_005f2.doInitBody();
      }
      do {
        if (_jspx_meth_ww_005fproperty_005f4(_jspx_th_ww_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write('=');
        out.write('"');
        if (_jspx_meth_ww_005fproperty_005f5(_jspx_th_ww_005fiterator_005f2, _jspx_page_context))
          return true;
        out.write('"');
        int evalDoAfterBody = _jspx_th_ww_005fiterator_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_ww_005fiterator_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_ww_005fiterator_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue.reuse(_jspx_th_ww_005fiterator_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fiterator_0026_005fvalue.reuse(_jspx_th_ww_005fiterator_005f2);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f4 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f4.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f2);
    // /template/aui/dropdown/cog.jsp(21,57) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f4.setValue(".");
    int _jspx_eval_ww_005fproperty_005f4 = _jspx_th_ww_005fproperty_005f4.doStartTag();
    if (_jspx_th_ww_005fproperty_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f4);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f2, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f5 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f5.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f2);
    // /template/aui/dropdown/cog.jsp(21,83) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f5.setValue("../attr(.)");
    int _jspx_eval_ww_005fproperty_005f5 = _jspx_th_ww_005fproperty_005f5.doStartTag();
    if (_jspx_th_ww_005fproperty_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f5);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_ww_005fiterator_005f1, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f6 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f6.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_ww_005fiterator_005f1);
    // /template/aui/dropdown/cog.jsp(22,32) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f6.setValue("./text");
    int _jspx_eval_ww_005fproperty_005f6 = _jspx_th_ww_005fproperty_005f6.doStartTag();
    if (_jspx_th_ww_005fproperty_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_ww_005fproperty_005f6);
    return false;
  }

  private boolean _jspx_meth_ww_005fproperty_005f7(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  ww:property
    webwork.view.taglib.PropertyTag _jspx_th_ww_005fproperty_005f7 = (webwork.view.taglib.PropertyTag) _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fid_005fnobody.get(webwork.view.taglib.PropertyTag.class);
    _jspx_th_ww_005fproperty_005f7.setPageContext(_jspx_page_context);
    _jspx_th_ww_005fproperty_005f7.setParent(null);
    // /template/aui/dropdown/cog.jsp(31,0) name = id type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f7.setId("varId");
    // /template/aui/dropdown/cog.jsp(31,0) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_ww_005fproperty_005f7.setValue("''");
    int _jspx_eval_ww_005fproperty_005f7 = _jspx_th_ww_005fproperty_005f7.doStartTag();
    if (_jspx_th_ww_005fproperty_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fid_005fnobody.reuse(_jspx_th_ww_005fproperty_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fww_005fproperty_0026_005fvalue_005fid_005fnobody.reuse(_jspx_th_ww_005fproperty_005f7);
    return false;
  }
}
