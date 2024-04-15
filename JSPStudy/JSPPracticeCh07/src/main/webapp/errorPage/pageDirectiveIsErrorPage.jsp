<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage ="true" %>    
<% response.setStatus(200); %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청 처리중 에러 발생</title>
</head>
<body>
	<h2>죄송합니다.</h2>
	<p>고객님의 요청을 처리하는 과정에서 아래와 같은 예외가 발생 하였습니다.</p>
	에러 메시지 : <%=exception.getMessage() %>
	에러 타입 : <%=exception.getClass().getName() %>
</body>
</html>