<%-- 
	EL과 JSTL을 이용해 로또 당첨 번호 리스트 출력
	table 태그를 사용하지 말 것  
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL과 JSTL을 이용해 로또 당첨 번호 리스트 출력</title>
</head>
<body>	
	<h2>로또 당첨 번호 리스트(JSTL)</h2>
	<container>
		<c:forEach var ="lottoNum" items="${lottoList}">
			<div class=lotto_line>
			
				<span class=lotto_times>${lottoNum.times }</span>
				<img src =./images/lotto_img/ball_${lottoNum.num1 }.png>
				<img src =./images/lotto_img/ball_${lottoNum.num2 }.png>
				<img src =./images/lotto_img/ball_${lottoNum.num3 }.png>
				<img src =./images/lotto_img/ball_${lottoNum.num4 }.png>
				<img src =./images/lotto_img/ball_${lottoNum.num5 }.png>
				<img src =./images/lotto_img/ball_${lottoNum.num6 }.png>
				<span class=bonus_num>보너스 번호</span>
				<img src =./images/lotto_img/ball_${lottoNum.bonusNum }.png>
				
			</div>
		</c:forEach>
		<a href =#>도서리스트#1</a>
		<a href =#>도서리스트#2</a>
		<a href =#>로또 당첨 번호 리스트#1</a>
		<a href =#>로또 당첨 번호 리스트#2</a>
	</container>
</body>
</html>