<%@page import="com.jspstudy.ch03.vo.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	
	Student []s = (Student[])request.getAttribute("s");
	
	String result = "";
%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연습문제 3</title>
</head>
<body>
	<h2>학생 정보 - 스크립틀릿과 표현식 사용</h2>
	<ul>
		<% 
			for(int i=0 ;i<s.length;i++){
				result = s[i].getName()+"("+s[i].getAge()+") - "+s[i].getGender(); %>
			
				<li><%=result %></li>
			<%
			}
		%>
		
	</ul>
	<br><br>
	<h2>학생 정보 - JSTL과 표현언어 이용</h2>
	<c:if test="${not empty s }">
		<ul>
			<c:forEach var ="student" items="${s }">
				<li>${student.name }(${student.age }) - ${student.gender }
				</li>
			</c:forEach>
		</ul>
	</c:if>	
</body>
</html>