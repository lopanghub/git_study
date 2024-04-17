/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-04-16 02:52:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1713148870479L));
    _jspx_dependants.put("/session/../pages/header.jsp", Long.valueOf(1713233713256L));
    _jspx_dependants.put("jar:file:/D:/05/JSPStudy/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/JSPClassCh08/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/session/../pages/footer.jsp", Long.valueOf(1713148870477L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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

      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <title>세션을 이용한 사용자 로그인 유지하기</title>\r\n");
      out.write("    <link href=\"../bootstrap/bootstrap.min.css\" rel=\"stylesheet\" >\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  	<div class=\"container\">	\r\n");
      out.write("		<!-- header -->\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- header  -->\r\n");
      out.write("<div class=\"row border-bottom border-primary\">\r\n");
      out.write("	<div class=\"col-4\">\r\n");
      out.write("		<p><img src=\"https://via.placeholder.com/200x100\"></p>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"col-8\">\r\n");
      out.write("		<div class=\"row mt1\">\r\n");
      out.write("			<div class=\"col\">\r\n");
      out.write("				<ul class=\"nav justify-content-end\">\r\n");
      out.write("					<li class=\"nav-item\">\r\n");
      out.write("						<a class=\"nav-link\" \r\n");
      out.write("						href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.isLogin ? \"logout.jsp\" : \"loginForm.jsp\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.isLogin ? \"로그아웃\" : \"로그인\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("						</a>\r\n");
      out.write("						\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\">\r\n");
      out.write("						");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("						\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\">\r\n");
      out.write("						<a class=\"nav-link\" href=\"\">게시 글 리스트</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\">\r\n");
      out.write("						<a class=\"nav-link\" href=\"#\">주문/배송조회</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li class=\"nav-item\">\r\n");
      out.write("						<a class=\"nav-link\" href=\"#\">고객센터</a>\r\n");
      out.write("					</li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col text-end\">&nbsp;</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col pe-5 text-end text-primary\">\r\n");
      out.write("				");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("  		<!-- content -->\r\n");
      out.write("  		<div class=\"row my-5 text-center\" id=\"global-content\">\r\n");
      out.write("  			<div class=\"col\">\r\n");
      out.write("		  		<div class=\"row\">\r\n");
      out.write("		  			<div class=\"col\">\r\n");
      out.write("		  				<h2 class=\"fs-3 fw-bold\">게시 글 리스트</h2>\r\n");
      out.write("		  			</div>\r\n");
      out.write("		  		</div>  		\r\n");
      out.write("				<form name=\"searchForm\" id=\"searchForm\" action=\"#\" \r\n");
      out.write("					class=\"row justify-content-center my-3\">\r\n");
      out.write("					<div class=\"col-auto\">\r\n");
      out.write("						<select name=\"type\" class=\"form-select\">\r\n");
      out.write("							<option value=\"title\">제목</option>\r\n");
      out.write("							<option value=\"writer\">작성자</option>\r\n");
      out.write("							<option value=\"content\">내용</option>\r\n");
      out.write("						</select>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-4\">\r\n");
      out.write("						<input type=\"text\" name=\"keyword\" class=\"form-control\"/>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-auto\">\r\n");
      out.write("						<input type=\"submit\" value=\"검 색\" class=\"btn btn-primary\"/>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>  		\r\n");
      out.write("		  		<div class=\"row\">\r\n");
      out.write("		  			<div class=\"col text-end\">\r\n");
      out.write("		  				<a href=\"#\" class=\"btn btn-outline-success\">글쓰기</a>\r\n");
      out.write("		  			</div>\r\n");
      out.write("		  		</div>\r\n");
      out.write("		  		<div class=\"row my-3\">  			\r\n");
      out.write("		  			<div class=\"col\">\r\n");
      out.write("		  				<table class=\"table table-hover\">\r\n");
      out.write("		  					<thead>\r\n");
      out.write("			 					<tr class=\"table-dark\">\r\n");
      out.write("									<th>NO</th>\r\n");
      out.write("									<th>제목</th>\r\n");
      out.write("									<th>작성자</th>\r\n");
      out.write("									<th>작성일</th>\r\n");
      out.write("									<th>조회수</th>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody class=\"text-secondary\">\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>200</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">감사합니다.</a></td>\r\n");
      out.write("									<td>회원1</td>\r\n");
      out.write("									<td>2023-04-27 05:44:32</td>\r\n");
      out.write("									<td>162</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>199</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">궁금한게 해결 되었네요</a></td>\r\n");
      out.write("									<td>회원8</td>\r\n");
      out.write("									<td>2023-04-27 05:50:21</td>\r\n");
      out.write("									<td>77</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>198</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">저두 궁금했는데</a></td>\r\n");
      out.write("									<td>회원7</td>\r\n");
      out.write("									<td>2023-04-27 05:44:32</td>\r\n");
      out.write("									<td>81</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>197</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">아 줄 바꿈 문제 해결 했습니다.</a></td>\r\n");
      out.write("									<td>관리자</td>\r\n");
      out.write("									<td>2023-04-27 04:58:45</td>\r\n");
      out.write("									<td>35</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>196</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">감사합니다.</a></td>\r\n");
      out.write("									<td>관리자</td>\r\n");
      out.write("									<td>2023-04-27 03:40:43</td>\r\n");
      out.write("									<td>16</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>195</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">그러게요</a></td>\r\n");
      out.write("									<td>회원3</td>\r\n");
      out.write("									<td>2023-04-27 04:59:15</td>\r\n");
      out.write("									<td>46</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>194</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">회원이면 당연한 것을...</a></td>\r\n");
      out.write("									<td>회원3</td>\r\n");
      out.write("									<td>2023-04-27 05:44:32</td>\r\n");
      out.write("									<td>38</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>13</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">별 말씀을 다하시네요</a></td>\r\n");
      out.write("									<td>회원1</td>\r\n");
      out.write("									<td>2023-04-27 05:44:32</td>\r\n");
      out.write("									<td>79</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>192</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">당연하죠~</a></td>\r\n");
      out.write("									<td>회원6</td>\r\n");
      out.write("									<td>2023-04-27 05:44:32</td>\r\n");
      out.write("									<td>9</td>\r\n");
      out.write("								</tr>						\r\n");
      out.write("								<tr>\r\n");
      out.write("									<td>191</td>							\r\n");
      out.write("									<td><a href=\"#\" class=\"text-decoration-none link-secondary\">저두요~</a></td>\r\n");
      out.write("									<td>회원5</td>\r\n");
      out.write("									<td>2023-04-27 05:44:32</td>\r\n");
      out.write("									<td>15</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("		  				</table>\r\n");
      out.write("		  			</div>  			\r\n");
      out.write("		  		</div>\r\n");
      out.write("		  		<!-- 페이지 네이션 -->\r\n");
      out.write("				<div class=\"row\">\r\n");
      out.write("					<div class=\"col\">\r\n");
      out.write("						<nav aria-label=\"Page navigation\">\r\n");
      out.write("						  <ul class=\"pagination justify-content-center\">	\r\n");
      out.write("						    	<li class=\"page-item active\" aria-current=\"page\">\r\n");
      out.write("						    		<span class=\"page-link\">1</span>\r\n");
      out.write("						    	</li>	\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>	\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">4</a></li>	\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">5</a></li>	\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">6</a></li>	\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">7</a></li>	\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">8</a></li>	\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">9</a></li>	\r\n");
      out.write("						    	<li class=\"page-item\"><a class=\"page-link\" href=\"#\">10</a></li>	\r\n");
      out.write("							    <li class=\"page-item\">\r\n");
      out.write("							      <a class=\"page-link\" href=\"#\">Next</a>\r\n");
      out.write("							    </li>						  	\r\n");
      out.write("						  </ul>\r\n");
      out.write("						</nav>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>		  		\r\n");
      out.write("		  	</div>\r\n");
      out.write("		</div>			  		\r\n");
      out.write("		<!-- footer -->\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("<div class=\"row border-top border-primary my-5\" id=\"global-footer\">\r\n");
      out.write("	<div class=\"col text-center py-3\">\r\n");
      out.write("		<p>고객상담 전화주문:1234-5678 사업자등록번호 :111-11-123456  \r\n");
      out.write("  	대표이사: 홍길동  통신판매업 서울 제 000000호<br/>\r\n");
      out.write("  	개인정보관리책임자:임꺽정 분쟁조정기관표시 : 소비자보호원, 전자거래분쟁중재위원회<br/>      	\r\n");
      out.write("  	Copyright (c) 2023 JSP2U Corp. All right Reserved.	\r\n");
      out.write("		</p>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("    <script src=\"../bootstrap/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /session/../pages/header.jsp(21,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not sessionScope.isLogin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<a class=\"nav-link\" href=\"#\">회원가입</a>						\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /session/../pages/header.jsp(24,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.isLogin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<a class=\"nav-link\" href=\"#\">정보수정</a>\r\n");
          out.write("						");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /session/../pages/header.jsp(45,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.isLogin }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<span>안녕하세요 ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("님</span>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
