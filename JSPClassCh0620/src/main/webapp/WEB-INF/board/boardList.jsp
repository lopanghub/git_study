<%@page import="com.jspstudy.ch06.vo.Board"%>
<%@page import="java.util.*"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
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
		<div class="row border-bottom border-primary">
			<div class="col-4">
				<img src="https://via.placeholder.com/200x100" >
			</div>
			<div class="col-8">
				<div class="row">
					<div class="col">
						<ul class="nav justify-content-end">
						  <li class="nav-item">
						    <a class="nav-link" href="#">로그인</a>
						  </li>
						  <li class="nav-item">
						    <a class="nav-link" href="boardList">게시 글 리스트</a>
						  </li>
						  <li class="nav-item">
						    <a class="nav-link" href="#">회원가입</a>
						  </li>
						  <li class="nav-item">
						    <a class="nav-link" href="#">주문/배송조회</a>
						  </li>
						  <li class="nav-item">
						    <a class="nav-link" href="#">고객센터</a>
						  </li>
						</ul>
					</div>
				</div>
				<div class="row">
					<div class="col text-end">로그인시 인사말 출력</div>
				</div>
			</div>
		</div>
		<div class="row my-5">
			<div class="col">
				<h1 class="text-center fw-bold fs-3">게시 글 리스트</h1>
			</div>			
		</div> 
		<form name="searchForm" id="searchForm" action="#"
			class="row justify-content-center my-3">
			<div class="col-auto">
				<select name="type" class="form-select">
					<option value="title">제목</option>
					<option value="writer">작성자</option>
					<option value="content">내용</option>
				</select>
			</div>
			<div class="col-4">
				<input type="text" name="keyword" id="keyword" class="form-control">
			</div>
			<div class="col-auto">
				<input type="submit" value="검색" class="btn btn-primary">
			</div>
		</form>
		<div class="row">
			<div class="col text-end">
				<a href="writeForm" class="btn btn-outline-success">글쓰기</a>
			</div>
		</div>
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
					<!-- 게시 글이 있는 경우 - 비어있지 않는 경우 -->
					<tbody>
					<c:if test="${ not empty bList }">
						<c:forEach var="board" items="${ bList }">
						<tr>
							<td>${board.no}</td>
							<td>${board.title}</td>
							<td>${board.writer}</td>
							<td>${board.regDate}</td>
							<td>${board.readCount}</td>
						</tr>
						</c:forEach>
					</c:if>		
					<!-- 게시 글이 없는 경우 - 비어 있으면 -->
					<c:if test="${ empty bList }">
						<tr>
							<td colspan="5">게시 글이 존재하지 않음</td>
						</tr>
					</c:if>
					</tbody>
				</table>
			</div>
		</div>
		<div class="row my-5 border-top border-primary" id="global-footer">
			<div class="col text-center py-3">
				<p>
					고객상담 전화주문 : 1234-5678 사업자등록번호 : 111-11-123456
					대표이사 : 홍길동 통신판매업 서울 제 000000호<br>
					개인정보관리책입자 : 임꺽정 분쟁조정기관표시 : 소비자보호원, 전자거래분재중재위원회<br>
					Copyright (c) 2023 JSP2U Corp. All right Reserved.
				</p>
			</div>
		</div>		
		<script src="bootstrap/bootstrap.bundle.min.js"></script>
	</div>
</body>
</html>

