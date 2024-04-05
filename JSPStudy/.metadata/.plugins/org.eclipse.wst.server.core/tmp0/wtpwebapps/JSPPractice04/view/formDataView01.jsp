<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 기본 정보</title>
</head>
<body>
	<h2>회원 기본 정보</h2>
	이 름:${user.name.equals("")?"null":user.name }<br>
	아이디:${user.id }<br>
	비밀번호:${user.pass }<br>
	성 별:${user.gender }<br>
	공지메일:${user.nMail }<br>
	광고메일:${user.aMail }<br>
	정보메일:${user.iMail }<br>
	직 업:${user.job }<br>
</body>
</html>