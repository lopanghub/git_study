<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 입력폼</title>
</head>
<body>
	<h2>회원 기본 정보 입력</h2>
	<form name="fMember1" action="formData01">
		<p>이름 : <input type="text" name="name"/></p>
		<p>아이디 : <input type="text" name ="id"/></p>
		<p>비밀번호 : <input type = "password" name="pass"/></p>
		<p>성별 : 
			<input type = "radio" name="gender" value ="male" checked/>남
			<input type = "radio" name="gender" value ="female"/>여</p>
		<p>메일수신 : 
			<input type="checkbox" name="nMail" checked/>공지메일		
			<input type="checkbox" name="aMail"/>광고메일		
			<input type="checkbox" name="iMail"/>정보메일	</p>
		<p>직업 : 
			<select name="job">
				<option>회사원</option>
				<option>학생</option>
				<option>주부</option>
				<option>기타</option>
			</select>	</p>
		<p>
			<input type="reset" value="다시쓰기"/>
			<input type="submit" value="가입하기"/></p>
	</form>
</body>
</html>