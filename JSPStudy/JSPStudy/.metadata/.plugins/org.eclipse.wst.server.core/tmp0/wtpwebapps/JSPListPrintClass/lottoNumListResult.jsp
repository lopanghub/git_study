<%-- 
	스크립틀릿과 표현식을 이용해 로또 당첨 번호 출력
	table 태그를 사용하지 말 것 
--%>
<%@page import="com.jspstudy.ch03.vo.LottoNum"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList <LottoNum> lottoList = (ArrayList)request.getAttribute("lottoList");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="lotto.css">
<title>스크립틀릿과 표현식을 사용한 로또 당첨번호 리스트</title>
</head>
<body>
	<h2>로또 당첨 번호 리스트(스크립틀릿)</h2>
	<container>
		<%for (LottoNum l:lottoList){%>
			<div class=lotto_line>
				<span class=lotto_times><%= l.getTimes()%></span>
				<img src =./images/lotto_img/ball_<%= l.getNum1()%>.png>
				<img src =./images/lotto_img/ball_<%= l.getNum2()%>.png>
				<img src =./images/lotto_img/ball_<%= l.getNum3()%>.png>
				<img src =./images/lotto_img/ball_<%= l.getNum4()%>.png>
				<img src =./images/lotto_img/ball_<%= l.getNum5()%>.png>
				<img src =./images/lotto_img/ball_<%= l.getNum6()%>.png>
				<span class=bonus_num>+ 보너스 번호</span>
				<img src =./images/lotto_img/ball_<%= l.getBonusNum()%>.png>
			</div>
		<%}%>
							
		<section>
		<a href =#>도서리스트#1</a>
		<a href =#>도서리스트#2</a>
		<a href =#>로또 당첨 번호 리스트#1</a>
		<a href =#>로또 당첨 번호 리스트#2</a>
		</section>
	</container>
</body>
</html>