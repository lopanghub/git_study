<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage ="true" %>
<% response.setStatus(200); %>
<h2>죄송합니다</h2>
요청을 처리하는 중 다음과 같은 오류가 발생함<br>
에러 메시지 : <%=exception.getMessage()%><br>
에러 타입 : <%=exception.getClass().getName()%>