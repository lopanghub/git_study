<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#box{
		height: 700px;
		border: 1px solid red;
		display:flex;
		flex-direction: column;
		align-items: center;
	}
	.item{
		
		
		border: 1px solid blue;
		width:200px;
		height:100px;
		background-color:orange;
	}
</style>
</head>
<body>
	<div id = "box">
		<div class="item">1</div>
		<div class="item">2</div>
		<div class="item">3</div>
	</div>
</body>
</html>