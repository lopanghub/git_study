<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post 방식 요청처리</title>
</head>
<body>
	<form name="f1" action="postRequest" method="post">
		이름 : <input type="text" name="name" /><br>
		주소 : <input type="text" name="address" /><br>
		<input type="submit" value="주소입력"/>
	</form>
	
	<a href="postRequest?name=홍길동&address=서울 관악구 봉천동">링크로 요청하기</a>
</body>
</html>