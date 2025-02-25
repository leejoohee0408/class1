<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 컨트롤 + 시프트 + c 하면 주석이 된다 -->
<!-- 	<form method="get" action="http://127.0.0.1:8080/proj2_calc/req"> -->
		<!-- 절대주소 -->
<!-- <form method="get" action="/proj2_calc/req"> -->
	<!-- 상대주소 -->
	<form method="get" action="req">
		<input type="text" name="num1"> 
		<input type="submit" value="get 전송">
	</form>
</body>
</html>