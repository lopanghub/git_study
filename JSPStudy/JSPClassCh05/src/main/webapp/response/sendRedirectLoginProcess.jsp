<%-- response 내장객체의 sendRedirect()를 이용한 초간단 로그인 처리 폼 --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
<%
	
	//사용자 아이디 /비밀번호 읽기
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	
	//admin, 1234가 맞으면 로그인 성공 틀리면 로그인 실패
	if(id.equals("admin") && pass.equals("1234")){//로그인이 성공하면 sendRedirectLoginOk.jsp
		//요청한 정보가 이동했다고 주소를 알려주면서 응답을 한다
		response.sendRedirect("sendRedirectLoginOk.jsp?="+id);
	} else{ //틀리면 경고창+ 로그인 화면
%>
	<script>
		alert("아이디 또는 비밀 번호가 맞지 않습니다");
		location.href="sendRedirectLogin.jsp";
	</script>		
<%	}
	
	
%>