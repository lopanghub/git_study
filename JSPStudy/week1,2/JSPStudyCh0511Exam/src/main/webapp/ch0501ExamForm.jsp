<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>선호도 테스트</h2>
	<form action="ch0501ExamProcess.jsp" >
		<p>이 름 : <input type="text" name="name" /></p>
		<p>좋아하는 색 : 
			<input type="radio" name="color" value="빨강색" />빨강색&nbsp;&nbsp;
			<input type="radio" name="color" value="초록색" />초록색&nbsp;&nbsp;
			<input type="radio" name="color" value="파랑색"/>파랑색</p>
		<p>좋아하는 음식 : 
			<select name="food">
				<option>불고기</option>
				<option>스파게티</option>
				<option>짜장면</option>
				<option>잡채</option>
				<option>탕수육</option>
			</select></p>
		<!-- 체크박스를 하나의 name 속성으로 지정하여 String 배열로 전송 -->
		<p>좋아하는 동물(모두 고르세요) :<br/>
			<input type="checkbox" name="animal" value="햄스터"/>햄스터&nbsp;&nbsp;
			<input type="checkbox" name="animal" value="고양이"/>고양이&nbsp;&nbsp;
			<input type="checkbox" name="animal" value="호랑이"/>호랑이&nbsp;&nbsp;
			<input type="checkbox" name="animal" value="사자"/>사자&nbsp;&nbsp;
			<input type="checkbox" name="animal" value="개"/>개&nbsp;&nbsp;</p>
		<p>취미(모두 고르세요) :<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			
			<!-- 선택박스를 multiple로 지정하면 다중 선택 모드가 된다. -->
			<select name="hobby" multiple size="4">
					<option>게임</option>
					<option>여행</option>
					<option>독서</option>
					<option>낚시</option>
					<option>인라인</option>
					<option>스키</option>
					<option>영화감상</option>
			</select></p>
		<p><input type="reset" value="다시쓰기"/>
			<input type="submit" value="전송하기"/></p>
	</form>
</body>
</html>