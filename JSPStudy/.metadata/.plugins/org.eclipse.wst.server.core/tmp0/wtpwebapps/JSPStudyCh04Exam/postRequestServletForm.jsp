<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post 방식 요청처리</title>
</head>
<body>
	<h1>회원 가입</h1>
	<form name="f1" action="postRequest" method="post">
		이름 : <input type="text" name="name" /><br>
		나이 : <input type="text" name="age" /><br>
		성별 : <input type="radio" name="gender" value="male"/>남성 
		<input type="radio" name="gender" value="female"/>여성 <br>
		주소 : <input type="text" name="addr" style="width:350px;"/><br>
		<input type="reset" value="다시쓰기"/>
		<input type="submit" value="전송하기" />
	</form>
	
	
</body>
</html>