<%@page import="java.util.ArrayList"%>
<%@page import="com.jsppractice.ch06.vo.Board"%>
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
<meta name="viewport" content="width=device-width, intial-scale=1">
<title>JSP페이지에서 데이터베이스에 접속해 데이터 읽어오기</title>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container">
		<!-- 헤더 -->
		<div class="row border-bottom border-primary">
			<!-- 임시 이미지 -->
			<div class="col-4 ">
				<img src="https://via.placeholder.com/200X100">
			</div>
			<!-- 네브바 -->
			<div class="col-8">				
				<div class="row">
					<div class="col">
						<ul class="nav justify-content-end">
							<li class="nav-item"><a class="nav-link active"
								aria-current="page" href="#">로그인</a></li>
							<li class="nav-item"><a class="nav-link" href="boardList">게시글
									리스트</a></li>
							<li class="nav-item"><a class="nav-link" href="#">회원 가입</a></li>
							<li class="nav-item"><a class="nav-link" href="#">주문/배송조회</a></li>
							<li class="nav-item"><a class="nav-link" href="#">고객센터</a></li>
						</ul>
					</div>
				</div>
				<div class="row">
					<div class="col text-end">로그인시 인사말 출력</div>
				</div>

			</div>
		</div>
		<!-- 헤더끝 -->
		
		<!-- 타이틀 -->
		<div class="row my-5">
			<div class="col text-center">
				<h1 class="fw-bolder fst-italic fs-2">게시 글 리스트</h1>
			</div>
		</div>

		<!-- 검색폼  -->
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
				<input type="submit" class="btn btn-danger" value="검색" />
			</div>
		</form>

		<!-- 글쓰기 버튼 -->
		<div class="row">
			<div class="col text-end">
				<a href="writeForm" class="btn btn-outline-secondary">글쓰기</a>
			</div>
		</div>

		<!-- 테이블 -->
		<div class="row my-3">
			<div class="col">
				<table class="table table-striped ">
					<thead>
						<tr class="table-success">
							<td>no</td>
							<td>제목</td>
							<td>작성자</td>
							<td>작성일</td>
							<td>조회수</td>
						</tr>
					</thead>

					<tbody class="table table-Secondary		">
						<c:if test="${not empty bList }">
							<!-- items에 스크립틀릿에서 정의한 boardList를 표현식으로 지정할 수 있다. -->
							<c:forEach var="board" items="${bList }">
								<tr>
									<td>${ board.no }</td>
									<td>${ board.title }</td>
									<td>${ board.writer }</td>
									<td>${ board.regDate }</td>
									<td>${ board.readCount }</td>
								</tr>
							</c:forEach>
						</c:if>
						<c:if test="${empty bList }">
							<tr>
								<td colspan="5">게시물이 존재하지 않습니다.</td>
							</tr>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
		
		<!-- 푸터 -->
		<div class="row my-5 border-top border-primary" id="global-footer">
			<div class="col text-center py-3">
				<p>
					고객상담 전화주문 : 1234-5678 사업자 등록 번호 : 111-11-123456 대표이사 : 홍길동 통신판매업 서울
					제0000000호<br> 개인정보관리책임자 : 임꺽정 분쟁조정기관표시 : 소비자보호원, 전자거래분쟁중재위원회<br>
					Copyright (c) 2023 JSP2U Corp. All right Reserved.
			</div>
		</div>
		<!-- 푸터끝 -->
	</div>
	<script src="bootstrap/bootstrap.bundle.min.js"></script>
</body>
</html>