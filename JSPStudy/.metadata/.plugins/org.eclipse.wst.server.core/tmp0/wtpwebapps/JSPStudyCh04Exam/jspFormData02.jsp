<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>4-3 연습문제</title>
</head>
<body>
	<h1>학생 등록 정보</h1>
	<form name="fStudent" action="formData02" method="post">
		<p>
			학&nbsp;생&nbsp;명 : <input type="text" name="name" />
		</p>
		<p>
			성&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;별 : <input type="radio" name="gender" value="male" checked/> 남 <input
				type="radio" name="gender" value="female" />여
		</p>
		<p>
			연&nbsp;락&nbsp;처 : <select name="tel1">
				<option>010</option>
				<option>011</option>
			</select>- <input type="tel" name="tel2" style="width:100px;"/>-<input type="tel" name="tel3" style="width:100px;"/>
		</p>
		<p>
			희망 취업 분야 : <br><input type="checkbox" name="job" value="si" checked /> SI업체 <input
				type="checkbox" name="job" value="sm" checked /> SM업체 <input type="checkbox"
				name="job" value="solution" checked /> 솔루션업체
		</p>
		<p>
			관심분야 : <select name="subject" size="4" multiple>
				<option value="Android" >안드로이드</option>
				<option value="javaScript" >자바스크립트</option>
				<option value="spring" selected>스프링</option>
				<option value="jQuery" selected>제이쿼리</option>
			</select>
		</p>
		<p>
			<input type="reset" value="다시쓰기" /> <input type="submit" value="학생등록" />
		</p>
	</form>
</body>
</html>