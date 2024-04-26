<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>블로그 메인</title>
<link href="bootstrap/bootstrap.min.css" rel="stylesheet" >
</head>
<body>
	<div class="container">
		<div class ="row bg-secondary">
		<!-- 사이드 부분은 헤더처럼 따로 페이지 뺄 예정 -->
		<aside class="col-md-3">
			<!--profile-->
			<div class="row border">
				<div class="col ">
					<p><img src="https://via.placeholder.com/200x100"></p>
					<p>Blog name</p>
					<p>introduce</p>					
					<p><a href="#">🏠main</a></p>
					<p><a href="#">❗announce️</a></p>
				</div>
			 </div> <!-- end profile -->
			 <!--category -->
			 <div class="row">
			 	<div class="col">
			 		<p>전체보기</p>
			 	</div>
			 </div><!-- category end -->
			 
			 <!-- popluar & recent -->
			 <div class="row">
			 	<div class="col">
			 		<p>최신글</p>
			 	</div>
			 </div>
			 <!-- 최신 댓글  -->
			 <div class="row">
			 	<div class="col">
			 		<p>최신 댓글</p>
			 	</div>
			 </div>
			 <!-- 방문자 수 체크-->
			 <div class="row">
			 	<div class="col">
			 		<p>전체 방문자수</p>
			 	</div>
			 </div>
		</aside>
		<!-- content -->
		<div class="col-md-9 bg-primary">
			<div class="row">
			<!-- 팀 공용 헤더 들어갈 자리 -->
				<header class="col ">
					<h1>우주최강팀 공용헤더(임시) </h1>
				</header>
			</div>
			<div class="row">
				<main class="col">
					
				</main>
			</div>
			<div class="row">
				<!-- 페이지 네이션 -->
			</div>
		</div>
		</div>
	</div>
	<script src="bootstrap/bootstrap.bundle.min.js"></script>
</body>
</html>