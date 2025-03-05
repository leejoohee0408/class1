<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<header>
		<div>이거 해더임</div>
		<div>로고 here</div>
		<div>${param.id}님환영합니다</div>


		<c:if test="${ not empty param.msg }">
			<div class="msg">
			${param.msg}
			</div>
		</c:if>
	</header>
	
<script>
	const msg = '${param.msg}'
	let a = dom.value;
	
	
</script>









</body>
</html>