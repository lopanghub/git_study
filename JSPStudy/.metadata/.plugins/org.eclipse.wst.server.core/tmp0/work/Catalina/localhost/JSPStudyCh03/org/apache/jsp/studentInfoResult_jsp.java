/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-02 07:36:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.jspstudy.ch03.vo.Student;

public final class studentInfoResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(1);
    _jspx_imports_classes.add("com.jspstudy.ch03.vo.Student");
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
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("\r\n");

	/* JSP 페이지로 부터 포워딩되어 넘어온 request 영역의 속성에 저장된 데이터를 읽는다.
	 * Object 타입으로 넘어오기 때문에 다운 캐스팅이 필요하다. 
	 * 아래에서 request.getAttribute("student")를 호출했을 때 request 내장객체의
	 * 속성에 student 라는 이름을 가진 객체가 존재하지 않으면 null을 반환한다.
	 **/
	 Student s = (Student) request.getAttribute("student");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>	\r\n");
      out.write("<title>표현식과 EL을 이용해 학생정보 출력하기</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<!-- \r\n");
      out.write("		위쪽의 스크립틀릿에서 request 내장객체의 속성 값을 읽어서 변수에 \r\n");
      out.write("		저장하고 그 변수의 값을 아래와 같이 표현식을 이용해 출력할 수 있다.\r\n");
      out.write("		\r\n");
      out.write("		studentInfo.jsp 페이지를 실행해서 현재 페이지로 forward 되어야\r\n");
      out.write("		아래에 데이터가 제대로 출력된다. 만약 studentInfo.jsp 페이지를\r\n");
      out.write("		실행하지 않고 현재 페이지만 실행하게 되면 위쪽의 스크립틀릿에서 request\r\n");
      out.write("		영역의 속성을 읽어 올 때 null 값을 받으므로 NullPointerException이 발생한다.\r\n");
      out.write("		그러므로 studentInfo.jsp를 실행하여 그 페이지에서 Student 클래스의\r\n");
      out.write("		인스턴스가 생성되고 request 내장객체의 속성에 student 라는 이름으로 객체가\r\n");
      out.write("		저장되어 이 페이지로 포워딩 될 수 있도록 studentInfo.jsp를 먼저 실행해야 한다.\r\n");
      out.write("	-->\r\n");
      out.write("	<h2>학생정보 출력하기 - 표현식(Expression)</h2>\r\n");
      out.write("	이 름 : ");
      out.print( s.getName() );
      out.write("<br/>\r\n");
      out.write("	나 이 : ");
      out.print( s.getAge() );
      out.write("<br/>\r\n");
      out.write("	성 별 : ");
      out.print( s.getGender() );
      out.write("<br/><br/><br/>\r\n");
      out.write("	\r\n");
      out.write("	<!-- \r\n");
      out.write("		표현언어(EL)를 사용해 내장객체의 속성 명을 지정해 값을 읽어 올 수 있다.\r\n");
      out.write("		스크립팅요소를 사용하는 것에 비해 간단히 내장객체 영역에 저장된 속성의 값을\r\n");
      out.write("		읽을 수 있다. 내장객체의 속성에 객체가 저장되어 있으면 내장객체의 속성명과\r\n");
      out.write("		dot 연자자(.)를 사용해 객체의 프로퍼티 값을 읽어 올 수 있다.\r\n");
      out.write("		표현언어(EL)로 객체의 프로퍼티를 읽기 위해서는 그 객체의 클래스에 읽어 올 \r\n");
      out.write("		프로퍼티에 대한 getter 메서드가 반드시 존재해야 한다. \r\n");
      out.write("		그렇지 않으면 JasperException이 발생한다.\r\n");
      out.write("		\r\n");
      out.write("		이 JSP 페이지만 실행하면 request 내장객체의 속성에서 읽어올 것이 없으므로\r\n");
      out.write("		null 값이 되지만 표현 언어(EL)를 사용하면 NullPointerException은\r\n");
      out.write("		발생하지 않고 화면에 아무것도 출력되지 않는다.\r\n");
      out.write("		\r\n");
      out.write("		아래는 이전 studentInfo.jsp에서 request 영역의 속성에 student 라는\r\n");
      out.write("		이름으로 Student 클래스의 인스턴스를 저장하였으므로 스크립틀릿을 사용하지\r\n");
      out.write("		않아도 표현언어(EL)을 이용해 request 영역의 속성에 바로 접근할 수 있다.\r\n");
      out.write("		이렇게 표현언어는 pageContext, request, session, application 내장 객체의\r\n");
      out.write("		속성에 차례로 접근해 지정한 이름의 속성 이름이 있는지 탐색하여 데이터가\r\n");
      out.write("		존재하면 그 데이터를 읽어 출력하고 데이터가 없으면 아무것도 출력되지 않는다. \r\n");
      out.write("	-->\r\n");
      out.write("	<h2>학생정보 출력하기 - 표현 언어(Expression Language)</h2>\r\n");
      out.write("	이 름 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ student.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\r\n");
      out.write("	나 이 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ student.age }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\r\n");
      out.write("	성 별 : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ student.gender }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br/>\r\n");
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
