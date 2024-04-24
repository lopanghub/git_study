<%@page import="com.jsppractice.ch08.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
 	request.setCharacterEncoding("utf-8");
 	
 	String name = request.getParameter("name");
 	String id= request.getParameter("id");
 	String pass = request.getParameter("pass");
 	String phone1= request.getParameter("phone1");
 	String phone2= request.getParameter("phone2");
 	String phone3= request.getParameter("phone3");
	String phone = phone1+"-"+phone2+"-"+phone3;
 	
	Member member =new Member();
	member.setName(name);
	member.setId(id);
	member.setPass(pass);
	member.setPhone(phone);
	
	session.setAttribute("member", member);
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 추가 입력</title>
</head>
<body>
	<h2>회원 정보 추가 입력</h2>
	<form action="sessionAttributeProcess.jsp" method="post">
		<p>성  별 : 
			<input type ="radio" name="gender" value="male"/>남
			<input type ="radio" name="gender" value="female"/>여</p>
		<p>나  이 : 
			<input type="text" name="age" size="3"/></p> 	
		<p>관심분야 : 
			<select name="interest">
				<option value="Android">안드로이드</option>
				<option value="JavaScript">자바스크립트</option>
				<option value="Spring" selected>스프링</option>
				<option value="jQuery">제이쿼리</option>
				<option value="Oracle">오라클</option>
			</select></p>
		<p>메일수신 : <br>
			<input type ="checkbox" name="noitceMail" value="true"/>공지메일 받음
			<input type ="checkbox" name="addMail" value="true"/>광고메일 받음
			<input type ="checkbox" name="infoMail" value="true"/>정보메일 받음</p>
		<p>직  업 : 
			<select name="job">
				<option>회사원</option>
				<option>취준생</option>
				<option>주부</option>
				<option>학생</option>
				<option>기타</option>
			</select></p>
		<p>
			<input type="reset" value="다시 쓰기"/>
			<input type="submit" value="가입 하기"/></p>
	</form>
</body>
</html>