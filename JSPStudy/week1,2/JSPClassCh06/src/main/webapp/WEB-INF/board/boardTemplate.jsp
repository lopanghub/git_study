<%@page import="java.util.ArrayList"%>
<%@page import="com.jspstudy.ch06.vo.Board"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<!-- header -->
		<%@ include file="../pages/header.jsp" %>
		<!-- 메인 시작 -->
		<!-- 타이틀 -->
		<div class="row my-5">						
			<div class="col text-center">
				<h2 class=" fw-bold fs-3">게시 글 리스트</h2>
			</div>
		</div>
		
		
		
			
		
		<!-- footer -->
		<%@ include file="../pages/footer.jsp" %>
	</div>
	<script src="bootstrap/bootstrap.bundle.min.js">		
	</script>
</body>
</html>