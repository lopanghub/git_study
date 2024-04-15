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
<script
  src="https://code.jquery.com/jquery-3.7.1.js"
  integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4="
  crossorigin="anonymous"></script>
<script src="js/formCheck02.js"></script> 
</head>
<body>
	<div class="container">
		<!-- header -->
		<%@ include file="../pages/header.jsp"%>
		<!-- 메인 시작 -->
		<!-- 타이틀 -->
		<div class="row my-5">
			<div class="col text-center">
				<h2 class=" fw-bold fs-3">게시 글 쓰기</h2>
			</div>
		</div>
		<form name="writeForm" id="writeForm" action="writeProcess"
			method="post" class="row border-primary g-3 my-3" 
			enctype="multipart/form-data">
			<div class="col-4 offset-2">
				<label for="writer" class="form-label">글쓴이</label> <input
					type="text" class="form-control" id="writer" name="writer"
					placeholder="작성자를 입력해주세요">
			</div>
			<div class="col-4">
				<label for="pass" class="form-label">비밀번호</label> <input
					type="password" class="form-control" id="pass" name="pass">
			</div>
			<div class="col-8 offset-2">
				<label for="title" class="form-label">제 목 </label> <input
					type="text" class="form-control" id="title" name="title">
			</div>
			<div class="col-8 offset-2">
				<label for="content" class="form-label">내 용 </label> 
				<textarea class="form-control" id="content" name="content"></textarea>
			</div>
			<div class="col-8 offset-2">
				<label for="content" class="form-label">파 일 </label> 
				<input type="file" class ="form-control" name="file1" id="file1"></textarea>
			</div>
			<div class="col-8 offset-2">
				<input type="submit" value="등록하기" class="btn btn-primary"/>
				&nbsp;&nbsp;
				<input type="button" value="목록보기" class="btn btn-primary" onclick="location.href='boardList'"/>
				
			</div>
		</form>
	
		<!-- footer -->
		<%@ include file="../pages/footer.jsp"%>
	</div>
	
	<script src="bootstrap/bootstrap.bundle.min.js"></script>
</body>
</html>