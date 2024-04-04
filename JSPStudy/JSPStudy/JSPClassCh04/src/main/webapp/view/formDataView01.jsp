<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사용자가 입력한 값 </h2>
	이름 : ${name }<br>
	아이디 : ${id }<br>
	비밀번호 : ${pass }<br>
	성별 : ${gender =="male" ?  "남성":"여성" }<br>
	공지메일 : ${nMail }<br>
	광고메일 : ${aMail }<br>
	정보메일 : ${iMail }<br>
	직업 : ${job }<br>
</body>
</html>