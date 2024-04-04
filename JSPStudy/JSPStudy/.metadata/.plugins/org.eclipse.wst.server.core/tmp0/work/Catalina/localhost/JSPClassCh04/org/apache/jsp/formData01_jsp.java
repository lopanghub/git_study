/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-04 03:01:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formData01_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>회원 기본 정보 입력 폼</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h2>회원 기본 정보 입력</h2>	\r\n");
      out.write("	<!-- form 태그의 method 속성을 지정하지 않으면 GET 방식 요청이 된다. -->\r\n");
      out.write("	<form name=\"fMember1\" action=\"formData01\">	\r\n");
      out.write("		<p>이&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;름 : \r\n");
      out.write("			<input type=\"text\" name=\"name\" /></p>\r\n");
      out.write("		<p>아&nbsp;&nbsp;이&nbsp;&nbsp;디 : \r\n");
      out.write("			<input type=\"text\" name=\"id\" /></p>\r\n");
      out.write("		<p>비밀번호 : <input type=\"password\" name=\"pass\" /></p>		\r\n");
      out.write("		<!-- 라디오 버튼은 name 속성의 값을 동일하게 지정해야 그룹으로 묶인다. -->\r\n");
      out.write("		<p>성&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;별 :\r\n");
      out.write("			<input type=\"radio\" name=\"gender\" value=\"male\"/>남&nbsp;&nbsp;&nbsp;\r\n");
      out.write("			<input type=\"radio\" name=\"gender\" value=\"female\"/>여</p>		\r\n");
      out.write("		<!-- \r\n");
      out.write("			체크박스는 name 속성의 값을  각각 지정할 수도 있고\r\n");
      out.write("			동일하게 지정할 수도 있다.\r\n");
      out.write("		-->\r\n");
      out.write("		<p>메일수신 :\r\n");
      out.write("			<input type=\"checkbox\" name=\"nMail\"/>\r\n");
      out.write("				공지메일 받음&nbsp;&nbsp;&nbsp;\r\n");
      out.write("			<input type=\"checkbox\" name=\"aMail\"/>\r\n");
      out.write("				광고메일 받음&nbsp;&nbsp;&nbsp;\r\n");
      out.write("			<input type=\"checkbox\" name=\"iMail\"/>\r\n");
      out.write("				정보메일 받음&nbsp;&nbsp;&nbsp;</p>		\r\n");
      out.write("		<!-- \r\n");
      out.write("			<option> 태그에 value 속성을 지정하지 않으면 \r\n");
      out.write("			<option> 태그로 감싼 문자열이 value가 된다.\r\n");
      out.write("		-->\r\n");
      out.write("		<p>직&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;업 :	\r\n");
      out.write("			<select name=\"job\">\r\n");
      out.write("				<option>회사원</option>\r\n");
      out.write("				<option>학생</option>\r\n");
      out.write("				<option>주부</option>\r\n");
      out.write("				<option>기타</option>\r\n");
      out.write("			</select></p>			\r\n");
      out.write("		<!-- \r\n");
      out.write("			submit 버튼이 클릭되면 form 태그의 action 속성에서 \r\n");
      out.write("			지정한 URL로 무조건 폼 데이터를 전송한다.\r\n");
      out.write("		-->\r\n");
      out.write("		<p><input type=\"reset\" value=\"다시쓰기\" />\r\n");
      out.write("		<input type=\"submit\" value=\"가입하기\" /></p>\r\n");
      out.write("	</form>\r\n");
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
