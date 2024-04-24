<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 리스트</title>
</head>
<body>
	<div class ="container">
		<hgroup>
			<h1 style="text-center">상품 리스트</h1>
		</hgroup>
	</div>
	
	<main>
		<table>
			<thead>
				<tr>
					<th>상품명</th>
					<th>가격</th>
					<th>상품코드</th>
					<th>제조사</th>
				</tr>			
			</thead>
			<tbody>
				<c:forEach var="washer" items="${washerList }">
				<tr>
					<td><a href="washerDetail?no=${washer.no }">${washer.name }</a></td>
					<td>${washer.price }</td>
					<td>${washer.productCode }</td>
					<td>${washer.manufacturer }</td>
				</tr>
				</c:forEach>
			</tbody>	
		</table>
	</main>
</body>
</html>