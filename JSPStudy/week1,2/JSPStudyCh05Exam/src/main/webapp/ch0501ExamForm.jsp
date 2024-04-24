<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>5-1 연습문제 </title>
</head>
<body>
	<h2>선호도 테스트 </h2>
	<form name="favorite" action="postRequest" method="post">
		이 름 : <input type="text" name="name"/><br><br>
		좋아하는 색 : <input type="radio" name="color" value="red" checked/>빨간색
		 <input type="radio" name="color" value="green"/>초록색
		 <input type="radio" name="color" value="blue"/>파란색<br><br>
	 	좋아하는 음식 : 
	 		<select name="food">
	 			<option value="food1" selected>짜장면</option>
	 			<option value="food2">짬뽕</option>
	 			<option value="food3">탕수육</option>
	 		</select><br><br>
 		좋아하는 동물(모두 고르시오) : <br>
 			<input type="checkbox" name="animal" value="ham" checked/>햄스터
 			<input type="checkbox" name="animal" value="cat" checked/>고양이
 			<input type="checkbox" name="animal" value="tiger"/>호랑이 
 			<input type="checkbox" name="animal" value="lion"/>사자 
 			<input type="checkbox" name="animal" value="dog"/>개 <br><br>
		취미 (모두 고르시오) :
			<select name="hobby" multiple>
				<option value="game" selected>게임 </option>
				<option value="travel" selected>여행 </option>
				<option value="book" selected>독서 </option>
				<option value="fish">낚시 </option>
			</select><br><br>
		<input type="reset" value="다시 쓰기 "/>
		<input type="submit" value="제출 하기 "/>
 			
	</form>
</body>
</html>