<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	Calendar today = Calendar.getInstance();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	오늘은 <%=today.get(Calendar.YEAR) %>년
	<%= today.get(Calendar.MONTH)+1 %>월
	<%= today.get(Calendar.DAY_OF_MONTH) %>일입니다.<br>
</body>
</html>