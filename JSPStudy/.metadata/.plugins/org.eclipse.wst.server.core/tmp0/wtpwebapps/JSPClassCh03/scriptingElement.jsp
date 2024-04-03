<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!//선언부 - 전역 변수, 메서드를 정의하는곳 
	private int add(int a, int b){
		return a+b;
}

%>
<!DOCTYPE html>
<html>
<head>
<!-- HTML주석 (서버에 보임)-->
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%//스크립틀릿(scriptlet) - 자바 처리 코드를 작성하는 곳
	int sum = 0;
	for(int i=0;i<=100;i++){
		sum += i;
	}
%>

				<%--표현식(Expression) 변수 객체를 출력하는 곳 --%>
 1~100 합 : <%=sum %>
 <ul>
 <%
 	for(int i =0; i<=10;i++){			
 %>
 		<li><%=i %><br></li>
 <%
 	}
 	sum=0;
 %>
 </ul>
 
 sum :<%= sum %><br>
 10+20 <%= add(10,20) %>
</body>
</html>