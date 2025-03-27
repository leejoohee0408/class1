<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹툰연습</title>
<style>
.pp {
	/* border: 1px solid red; */
	width: 100px;
	height: 100px;
}
</style>
</head>
<body>
	<h1>이달의 신작</h1>
	<form method="post" action="practice.do">
		<input type="submit" value="추가"> <input type="submit"
			value="조회">
	</form>
	<h1>웹툰 추가 결과</h1>
	<c:forEach var="webtoon" items="${webtoonList}">
		<tr>
		<td>파일: <img class="pp" src="${webtoon.image}" alt="이미지설명"><br>
		<td>제목: ${webtoon.title}</td><br>
		<td>작가: ${webtoon.author}</td><br>
		<td>내용: ${webtoon.detail}</td><br>
		</tr>
	</c:forEach>



</body>
</html>