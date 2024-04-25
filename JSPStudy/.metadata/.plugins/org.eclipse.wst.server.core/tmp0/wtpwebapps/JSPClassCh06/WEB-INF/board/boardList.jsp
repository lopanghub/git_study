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
		
		<!-- 검색 폼 양식 -->
		<form name="searchForm" id="searchForm" action="#"
			class="row justify-content-center my-3">
			<div class="col-auto">
				<select name="type" class="form-select">
					<option value="title">제목</option>
					<option value="writer">작가</option>
					<option value="content">내용</option>
				</select>
			</div>
			<div class="col-4">
				<input type="text" name="keyword" id="keyword" class="form-control">
			</div>
			<div class="col-auto">
				<input type="submit" class="btn btn-primary" value="검색">
			</div>
		</form>
		
		<!--  글쓰기 버튼 -->
		<div class="row">
			<div class="col text-end">
				<a href="writeForm" class="btn btn-outline-success">글쓰기</a>
			</div>
		</div>
		
		<!-- 테이블 -->
		<div class="row my-3">
			<div class="col">
				<table class="table table-hover">
					<thead>
						<tr class="table-dark">
							<th>no</th>
							<th>제목</th>
							<th>작성자</th>
							<th>작성일</th>
							<th>조회수</th>
						</tr>
					</thead>
					<!-- 게시글이 있는 경우 -->
					<tbody>
						<c:if test="${not empty bList }">
							<c:forEach var="board" items="${bList }">
								<tr>
									<td>${board.no }</td>
									<td><a href="boardDetail?no=${board.no }">${board.title }</td>
									<td>${board.writer }</td>
									<td>${board.regDate }</td>
									<td>${board.readCount }</td>
								</tr>
							</c:forEach>
						</c:if>
						<!-- 게시글이 없는 경우 -->
						<c:if test="${empty bList }">
							<tr>
								<td colspan="5">게시 글이 존재하지 않습니다</td>

							</tr>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
		<!-- footer -->
		<%@ include file="../pages/footer.jsp" %>
	</div>
	<script src="bootstrap/bootstrap.bundle.min.js">		
	</script>
</body>
</html>