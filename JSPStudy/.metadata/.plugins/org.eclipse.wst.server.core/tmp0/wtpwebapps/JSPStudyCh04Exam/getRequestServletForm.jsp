<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4-2 GET방식 처리</title>
</head>
<body>
	<h1>숫자1과 숫자2 사이의 합 구하기</h1>
	<form name="f1" action="getRequest">
		숫자 1 :<input type="number" name="num1" min="1"/><br>
		숫자 2 :<input type="number" name="num2" min="1"/><br><br>
		<input type ="reset" value ="다시쓰기"/>
		<input type ="submit" value ="계산결과 보기"/>
	</form>
</body>
</html>