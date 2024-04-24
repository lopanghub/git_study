<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get방식과 post방식 요청 정보 보기</title>
</head>
<body>
	<a href="requestInformation.jsp?num1=100&num2=200">요청정보 보기</a>
	<br><br>
	<form action="requestInformation.jsp" method="post">
		이름 :<input type="text" name="name"/><br>
		비밀번호 : <input type="password" name="pass"/><br>
		<input type="submit" value="전송"/>
	</form>
</body>
</html>