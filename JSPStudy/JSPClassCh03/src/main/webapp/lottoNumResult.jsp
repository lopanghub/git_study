<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--jstl과 el를 이용하여 출력 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>로또 당첨 번호 리스트</h2>
	<%--로또리스트가 배용이 없거나 null이면 --%>
	<c:if test ="${empty lottoList }" >
		<div>로또 당첨 번호가 존재 하지 않습니다.</div>
	</c:if>
	
	<%--로또리스트가 내용이 있거나 null이 아니면 --%>
	<c:if test="${not empty lottoList }">
	<%--순서 없는 목록으로 출력 --%>
	<ul>
		<%--
			for(int i=0;i<10;i++){}
			<c:forEach var="i" begin="0" end="9" step="1">
			
			for(LottoNum lottoNum : lottoList)
		 --%>
		<c:forEach var ="lottoNum" items="${lottoList }">
		
		<li>${lottoNum.times }차-${lottoNum.num1 },${lottoNum.num2 },${lottoNum.num3 },
		${lottoNum.num4 },${lottoNum.num5 },${lottoNum.num6 }
		+<span>보너스 번호</span>${lottoNum.bonusNum }</li>
		
		</c:forEach>
	</ul>
	
	</c:if>
	
</body>
</html>