<%@page import="java.util.ArrayList"%>
<%@page import="com.jsppractice.ch06.vo.Board"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>JSP페이지에서 데이터베이스에 접속해 데이터 읽어오기</title>
<style type="text/css">
table {
	border: 1px solid blue;
	border-collapse: collapse;
}

td {
	border: 1px dotted blue;
	padding: 5px 10px;
}
</style>
</head>
<body>
	<h1>게시 글 리스트</h1>
	<table>
		<tr>
			<td>no</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
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
	</table>
</body>
</html>