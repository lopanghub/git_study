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
<title>Insert title here</title>
<style>
	table {
		border: 1px solid blue;
		border-collapse: collapse;
	}
	th, td {
		border: 1px dotted blue;
		padding: 5px 10px;
	}
</style>
</head>
<body>
	<h1>게시 글 리스트</h1>
	<table>
		<tr>
			<th>no</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>			
		</tr>
		<!-- 게시 글이 있는 경우 - 비어있지 않는 경우 -->
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
	</table>

</body>
</html>


