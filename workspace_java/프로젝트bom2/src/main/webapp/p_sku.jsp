<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
	margin: 0;
	padding: 0;
	background-color: #f9f9f9;
	font-family: Arial, sans-serif;
}

.container {
	width: 95%;
	margin: auto;
	background: white;
	padding: 20px;
	border-radius: 10px;
	box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
}

h1 {
	margin-bottom: 20px;
	border: 1px solid black;
	padding: 10px;
}

.form {
	display: flex;
	flex-wrap: wrap;
	gap: 20px;
	margin-bottom: 20px;
}

.form-fields {
	flex: 1;
	display: flex;
	flex-direction: column;
	gap: 15px;
}

.form-row {
	display: flex;
	flex-wrap: wrap;
	align-items: center;
	gap: 10px;
}

label {
	min-width: 80px;
}

input {
	padding: 8px;
	border: 1px solid #ccc;
	border-radius: 5px;
	/* flex잠시 지운거임 등록버튼 커져서 다시 확인하기 */
	/* flex: 1; */  
}

.button {
	display: flex;
	flex-direction: column;
	gap: 10px;
}

.button {
	padding: 10px 15px;
	background-color: #4a90e2;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

.button:hover {
	background-color: #0056b3;
}

button {
	padding: 10px 15px;
	background-color: #4a90e2;
	color: white;
	border: none;
	border-radius: 5px;
	cursor: pointer;
}

button:hover {
	background-color: #0056b3;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

table th, table td {
	border: 1px solid #ccc;
	padding: 10px;
	text-align: center;
}

.pagination {
	margin-top: 20px;
	display: flex;
	justify-content: center;
	gap: 5px;
}

.pagination button {
	padding: 5px 10px;
	border-radius: 5px;
}

@media screen and (max-width: 800px) {
	.form-row {
		flex-direction: column;
		align-items: stretch;
		gap: 5px !important;
		/* 모바일에서 간격 조정 */
		width: auto .buttons{
                    flex-direction: row;
		justify-content: center;
		margin-top: 10px;
	}
	button {
		width: auto;
	}
}

.edit-buttons {
	margin-top: 10px;
}

.active {
	background-color: #0056b3;
}

}
.active {
	background-color: #0056b3;
}

span {
	color: red;
}
</style>
</head>
<body>
	<div class="container">
		<h1>◎ 상품정보관리</h1>
		<span>* 모두 기입</span>
		<form method="post" action="p_sku" class="form">
			<div class="form-fields">
				<div class="form-row">
					<label for="상품코드">상품코드<span>*</span></label> 
					<input type="text" name="p_sku"> 
					<label for="상품명">상품명<span>*</span></label> 
					<input type="text" name="p_sku1">
				</div>


				<div class="form-row">
					<label for="규격">규격<span>*</span></label> 
					<input type="text" name="p_sku2"> 
					<label for="업체명">업체명<span>*</span></label>
					<input type="text" name="p_sku3">

				</div>


				<div class="form-row">
					<label for="단가">단가<span>*</span></label> 
					<input type="text" name="p_sku4"> 
					<label for="제품분류">제품분류<span>*</span></label>
					<input type="text" name="p_sku5">
				</div>
			</div>
			<input type="submit" value="등록" class="button">
		</form>




		<table border=1>
			<thead>
				<tr>
				<th><input type="checkbox" id="체크박스"></th>
					<th>상품고유번호</th>
					<th>상품코드</th>
					<th>상품명</th>
					<th>규격</th>
					<th>업체명</th>
					<th>단가</th>
					<th>등록날짜</th>
					<th>수정날짜</th>
					<th>제품분류</th>
				</tr>


			</thead>
			
			<!-- 여기는 데이터베이스의 테이블에 저장된것을 화면에 보여주는곳 -->
			<!-- 근데 지금 타입이랑 이름을 넣고 -->
			<!-- <input type="hidden" name="command" value="update">
				 <input type="submit" value="수정"> -->
			<!-- 위에것을 해서 수정을 만들었음  -->	
			<!-- <form method="post" action="p_sku">으로도 감싸야함 --> 
			<!-- 그리고 컨트롤로 넘어가서 작업해야함 -->
			<c:forEach var="dto" items="${resultList }">
				<tr>
				<form method="post" action="p_sku">
					<td><input type="checkbox" id="체크박스" name="done" value="Y"></td>
					<td>${dto.sku_id }</td>
					<td>
					<input type="hidden" value="${dto.sku_code }" name="sku_code">
					</td>
					<td>
					<input type="hidden" value="${dto.sku_name }" name="sku_name">
					</td>
					<td>
					<input type="hidden" value="${dto.sku_size }" name="sku_size">
					</td>
					<td>
					<input type="hidden" value="${dto.vendor_name }" name="vendor_name">
					</td>
					<td>
					<input type="hidden" value="${dto.price }" name="price">
					</td>
					<td>${dto.create_date }</td>
					<td>
					<input type="hidden" value="${dto.modify_date }" name="modify_date">
					</td>
					<td>
					<input type="hidden" value="${dto.category }" name="category">
					</td>
					<td>
					<input type="hidden" name="command" value="update">
					<input type="submit" value="수정">
					</td>
					</form>
				</tr>
			</c:forEach>
		</table>

		<div class="pagination">
			<button>&lt;</button>
			<button>1</button>
			<button>2</button>
			<button>3</button>
			<button>4</button>
			<button>5</button>
			<button>6</button>
			<button>7</button>
			<button>8</button>
			<button>9</button>
			<button>10</button>
			<button>&gt;</button>
		</div>
	</div>
</body>
</html>