<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	if(id.equals("admin")&&pass.equals("1234")){
		response.sendRedirect("sendRedirectLoginOK.jsp?id=" + id);
	}else{ //틀리면 경고창+ 로그인 화면
		%>
		<script>
			alert("아이디 또는 비밀 번호가 맞지 않습니다");
			location.href="sendRedirectLoginForm.jsp";
		</script>		
	<%	}
		
%>    
    