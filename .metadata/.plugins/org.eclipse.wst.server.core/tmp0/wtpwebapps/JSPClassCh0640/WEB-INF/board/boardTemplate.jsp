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
		<!-- header -->
		<%@ include file="../pages/header.jsp" %>
		
		<!-- content -->
		<div class="row my-5" id="global-content">
			<div class= "col">
				<div class="row">
					<div class="col">
						<h1 class="text-center fw-bold fs-3">게시 글 리스트</h1>
					</div>			
				</div> 
								

				
			</div>
		</div>
		<!-- footer -->
		<%@ include file="../pages/footer.jsp" %>	
		<script src="bootstrap/bootstrap.bundle.min.js"></script>
	</div>
</body>
</html>


