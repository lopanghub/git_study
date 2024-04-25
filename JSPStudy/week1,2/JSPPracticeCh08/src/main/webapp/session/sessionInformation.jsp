<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setMaxInactiveInterval(60);
	Calendar ca = Calendar.getInstance();
	SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 정보 출력하기</title>
</head>
<body>
	새로운 세션 여부 : <%=session.isNew() %><br>
	세션 ID : <%=session.getId() %><br>
	<%ca.setTimeInMillis(session.getCreationTime()); %>
	세션 생성시간 :
	<%= String.format("%TY년 %Tm월 %Td일 %TT", ca, ca, ca, ca) %><br>
	<%ca.setTimeInMillis(session.getLastAccessedTime()); %>
</body>
</html>