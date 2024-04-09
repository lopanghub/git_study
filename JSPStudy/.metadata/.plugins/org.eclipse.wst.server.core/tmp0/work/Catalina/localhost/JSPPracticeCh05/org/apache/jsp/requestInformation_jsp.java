/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-09 07:46:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class requestInformation_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>request 내장 객체</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>");
      out.print(request.getMethod());
      out.write("방칙 요청 정보\r\n");
      out.write("	</h1>\r\n");
      out.write("	<h2>서버 정보</h2>\r\n");
      out.write("	<ul>\r\n");
      out.write("		<li>서버 이름 : ");
      out.print(request.getServerName());
      out.write("</li>\r\n");
      out.write("		<li>서버 포트 : ");
      out.print(request.getServerPort());
      out.write("</li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	<h2>요청 정보</h2>\r\n");
      out.write("	<ul>\r\n");
      out.write("		<li>요청방식 : ");
      out.print(request.getMethod());
      out.write("</li>\r\n");
      out.write("		<li>프로토콜 : ");
      out.print(request.getProtocol());
      out.write("</li>\r\n");
      out.write("		<li>요청URL: ");
      out.print(request.getRequestURL());
      out.write("</li>\r\n");
      out.write("		<li>요청URI: ");
      out.print(request.getRequestURI());
      out.write("</li>\r\n");
      out.write("		<li>컨텍스트경로 : ");
      out.print(request.getContextPath());
      out.write("</li>\r\n");
      out.write("		<li>컨텐트타입 : ");
      out.print(request.getContentType());
      out.write("</li>\r\n");
      out.write("		<li>컨텐트 길이 : ");
      out.print(request.getContentLength());
      out.write("</li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	<h2>클라이언트 정보</h2>\r\n");
      out.write("	<ol>\r\n");
      out.write("		<li>클라이언트 이름 : ");
      out.print(request.getRemoteHost());
      out.write("</li>\r\n");
      out.write("		<li>클라이언트 주소 : ");
      out.print(request.getRemoteAddr());
      out.write("</li>\r\n");
      out.write("		<li>클라이언트 포트 : ");
      out.print(request.getRemotePort());
      out.write("</li>\r\n");
      out.write("		<li>클라이언트 유저 : ");
      out.print(request.getRemoteUser());
      out.write("</li>\r\n");
      out.write("		<li>웹 브라우저와 클라이언트의 시스템 정보 보기 :<br /> ");
      out.print(request.getHeader("User-Agent"));
      out.write("</li>\r\n");
      out.write("		<li>브라우저 지원 FileType : ");
      out.print(request.getHeader("Accept"));
      out.write("</li>\r\n");
      out.write("		<li>바로이전 URL : ");
      out.print(request.getHeader("referer"));
      out.write("</li>\r\n");
      out.write("	</ol>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
