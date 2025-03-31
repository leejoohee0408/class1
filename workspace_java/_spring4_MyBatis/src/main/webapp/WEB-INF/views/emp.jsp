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
	<form method="get" action="addwebtoon.do">
		<input type="submit" value="추가">
	</form>
	<form method="get" action="emp">
		<input type="submit" value="조회">
	</form>


	<h1>웹툰 추가 결과</h1>
	<c:forEach var="webtoon" items="${webtoonList}">
		<tr>
			<td>파일: <img class="pp" src="${webtoon.image}" alt="이미지설명"><br>
			<td>제목: ${webtoon.title}</td>
			<br>
			<td>작가: ${webtoon.author}</td>
			<br>
			<td>내용: ${webtoon.detail}</td>
			<br>

		</tr>
	</c:forEach>

	<%-- <form method="post" action="emp">
		<input type="submit" value="emp테이블가져오기">
	</form>

	<c:forEach var="webtoon1" items="${webtoonList1}">
		<tr>
			<td>${webtoon1.empno};</td>
			<td>${webtoon1.ename};</td>
			<td>${webtoon1.job};</td>
			<td>${webtoon1.mgr};</td>
			<td>${webtoon1.hiredate};</td>
			<td>${webtoon1.sal};</td>
			<td>${webtoon1.comm};</td>
			<td>${webtoon1.deptno};</td>
		</tr>

	</c:forEach> --%>
	<tr>
		<td>${select.empno}</td>
	</tr>

	${select1.empno} ${select2.empno}

	<%-- ${select3[1].empno}  --%>
	<table border="1">
		<thead>
			<tr>
				<th>No.</th>
				<th>empno</th>
				<th>ename</th>
			</tr>
		</thead>
		<tbody></tbody>
		<c:forEach var="dto" items="${list}" varStatus="loop">
			<tr>
				<td>${loop.count}</td>
				<td>${dto.empno}</td>
				<!-- 클릭으로 empno의 줄에 내가emp99.jsp에 적었던거
				가져오기위한 것 <a href="emp99?empno=${dto.empno}">-->
				<td><a href="emp99?empno=${dto.empno}">${dto.ename}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>




</body>
</html>