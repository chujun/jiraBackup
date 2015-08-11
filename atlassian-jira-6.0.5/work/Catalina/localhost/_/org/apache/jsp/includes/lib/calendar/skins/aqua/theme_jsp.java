/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.29
 * Generated at: 2015-07-23 06:25:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.includes.lib.calendar.skins.aqua;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class theme_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/css");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

 response.setContentType("text/css"); 
      out.write("\n");
      out.write("/* Distributed as part of The Coolest DHTML Calendar\n");
      out.write("   Author: Mihai Bazon, www.bazon.net/mishoo\n");
      out.write("   Copyright Dynarch.com 2005, www.dynarch.com\n");
      out.write("*/\n");
      out.write("\n");

    String path = request.getContextPath() + "/includes/js/calendar/skins/aqua";

      out.write("\n");
      out.write("/* The main calendar widget.  DIV containing a table. */\n");
      out.write("div.calendar {padding:2px;position:relative;-moz-box-shadow: 3px 3px 3px #666;-webkit-box-shadow: 3px 3px 3px #666;box-shadow: 3px 3px 3px #666;}\n");
      out.write(".calendar,\n");
      out.write(".calendar table {background-color:#fff;cursor:default;font-size:12px;}\n");
      out.write(".calendar table .wn {background-color:#ccc;color:#666;padding: 2px 4px 2px 2px;}\n");
      out.write(".calendar {border: 1px solid #bbb;}\n");
      out.write("\n");
      out.write("/* buttons */\n");
      out.write("/* \"<<\", \"<\", \">\", \">>\" buttons have this class */\n");
      out.write(".calendar thead td {font-weight:700;padding:2px;text-align:center;}\n");
      out.write(".calendar .nav div {background:transparent url(\"");
      out.print( path );
      out.write("/menuarrow.gif\") no-repeat 100% 60%;}\n");
      out.write("\n");
      out.write("/* Header part -- contains navigation buttons and day names. */\n");
      out.write("    .calendar .headrow {background-color:#f2f2f2;}\n");
      out.write("    .calendar .headrow td {border-top:1px solid #bbb;}\n");
      out.write("    .calendar .daynames td {background-color:#3C78B5;color:#fff}\n");
      out.write("    .calendar .daynames td.wn {background-color:#ccc;color:#888;}\n");
      out.write("    .calendar thead .name {font-weight:400;}\n");
      out.write("\n");
      out.write("     /* buttons hover */\n");
      out.write("    .calendar td.hilite,\n");
      out.write("    .calendar .combo .hilite,\n");
      out.write("    .calendar td.time span.hilite {background-color:#99B5DF;}\n");
      out.write("     /* active (pressed) buttons */\n");
      out.write("    .calendar td.active,\n");
      out.write("    .calendar .combo .active,\n");
      out.write("    .calendar td.time span.active{background-color:#369;color:#fff;}\n");
      out.write("    /* row hover */\n");
      out.write("    .calendar .rowhilite,\n");
      out.write("    .calendar .rowhilite .wn {background-color:#f7f7f7;}\n");
      out.write("\n");
      out.write("/* Combo boxes (menus that display months/years for direct selection) */\n");
      out.write(".calendar .combo {background-color:#fff;border:1px solid #bbb;border-top:none;cursor: default;display: none;left: 0;position: absolute;top: 0;width: 4em;z-index: 100;}\n");
      out.write("    .calendar .combo .label,\n");
      out.write("    .calendar .combo .label-IEfix {text-align:center;padding:2px;}\n");
      out.write("\n");
      out.write("/* The body part -- contains all the days in month. */\n");
      out.write("    .calendar tbody .day {padding:2px 4px 2px 2px;text-align:right;width:2em;}\n");
      out.write("    ");
      out.write("\n");
      out.write("    .calendar tbody .day.othermonth.oweekend {color:#f99;}\n");
      out.write("    .calendar tbody td.today {font-weight:700;}\n");
      out.write("    .calendar tbody td.weekend {color:#c44;}\n");
      out.write("    /* Cell showing selected date */\n");
      out.write("    .calendar tbody td.selected {background-color:#3C78B5;color:#fff;font-weight:700;}\n");
      out.write("    .calendar tbody .disabled {color:#999;}\n");
      out.write("    .calendar tbody .emptycell {visibility:hidden;}\n");
      out.write("    .calendar tbody .emptyrow {display:none;}\n");
      out.write("\n");
      out.write("/* time related */\n");
      out.write(".calendar td.time {background-color:#f2f2f2;border-top:1px solid #bbb;padding:2px;text-align:center;}\n");
      out.write("    .calendar td.time span {background-color:#fff;font-weight:700;padding:2px 5px 2px 6px;}\n");
      out.write("    .calendar td.time .colon {background-color:#f2f2f2;}\n");
      out.write("\n");
      out.write("/* The footer part -- status bar and \"Close\" button */\n");
      out.write("    .calendar tfoot .footrow {text-align:center;}\n");
      out.write("    .calendar tfoot .ttip {border-top:1px solid #bbb;padding:2px;}\n");
      out.write("    /* Hover style for buttons in footer - is this even used?*/\n");
      out.write("    .calendar tfoot .hilite {background: #afa;border: 1px solid #084;color: #000;padding: 1px;}\n");
      out.write("    /* Active (pressed) style for buttons in footer - is this even used?*/\n");
      out.write("    .calendar tfoot .active {background: #7c7;padding: 2px 0 0 2px;}");
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
}