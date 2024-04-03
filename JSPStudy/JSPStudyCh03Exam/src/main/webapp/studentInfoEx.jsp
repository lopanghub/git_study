<%@page import="com.jspstudy.ch03.vo.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Student s1 = new Student("이순신", 23, "남성");
	Student s2 = new Student("어머나", 21, "여성");
	Student s3 = new Student("왕호감", 22, "남성");
	Student s4 = new Student("왕빛나", 23, "여성");
	Student s5 = new Student();
	
	s5.setName("이나래");
	s5.setAge(25);
	s5.setGender("여성");
	
	Student [] s = {s1,s2,s3,s4,s5};
	
	request.setAttribute("s", s);
	
	
	pageContext.forward("studentInfoResultEx.jsp");	
	
%>