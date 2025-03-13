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
            flex: 1;
        }

        .buttons {
            display: flex;
            flex-direction: column;
            gap: 10px;
        }

        .buttons {
            padding: 10px 15px;
            background-color: #4a90e2;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .buttons:hover {
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

        table th,
        table td {
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
                width:auto .buttons {
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

        span{
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
					<input type="text" name="p_sku" id=sku_code> 
					<label for="상품명">상품명<span>*</span></label> 
					<input type="text" name="p_sku1" id=sku_name>
				</div>


				<div class="form-row">
					<label for="규격">규격<span>*</span></label> 
					<input type="text" name="p_sku2" id=sku_size> 
					<label for="업체명">업체명<span>*</span></label>
					<input type="text" name="p_sku3" id=vendor_name>

				</div>


				<div class="form-row">
					<label for="단가">단가<span>*</span></label> 
					<input type="text" name="p_sku4" id=price> 
					<label for="제품분류">제품분류<span>*</span></label>
					<input type="text" name="p_sku5" id=sku_category>
				</div>
			</div>
			<div>
                    <c:otherwise>
                        <input type="submit" value="등록" class="buttons">
                        <input type="submit" value="조회" class="buttons">
                        <input type="submit" value="수정" class="buttons" id="수정">
                        <input type="submit" value="삭제" class="buttons" name="action">
                    </c:otherwise>
			</div>
		</form>



		<!-- 테이블 표시 -->
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
			
				<tbody>
			<c:forEach var="dto" items="${resultList }">
				<tr>
					<td><input type="checkbox"  name="check" value="${dto.sku_id }"></td>
					<td>${dto.sku_id }</td>
					<td>${dto.sku_code }</td>
					<td>${dto.sku_name }</td>
					<td>${dto.sku_size }</td>
					<td>${dto.vendor_name }</td>
					<td>${dto.price }</td>
					<td>${dto.create_date }</td>
					<td>${dto.modify_date }</td>
					<td>${dto.sku_category }</td>
					
				</tr>
			</c:forEach>
			</tbody>
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
	
<script>
//전체 선택/해제 체크박스 이벤트
document.getElementById('체크박스').addEventListener('change', function() {
    var checkboxes = document.querySelectorAll('input[name="check"]');
    checkboxes.forEach(function(checkbox) {
        checkbox.checked = document.getElementById('체크박스').checked;
    });
});

	// 삭제버튼 클릭 이벤트
    document.querySelector('input[value="삭제"]').addEventListener('click', function(event) {
        // 배열 초기화
    	var selectedChecks = [];
        // 체크된거 전체가져오기를 checkboxes에 담았다  
        var checkboxes = document.querySelectorAll('input[name="check"]:checked');
        // 선택된것들을 selectedChecks는 배열에 추가했다
        checkboxes.forEach(function(checkbox) {
        	selectedChecks.push(checkbox.value);
        });
		// 체크된거 1개 이상이면
        if (selectedChecks.length > 0) {
        	// 체크된 value="${dto.sku_id } 목록을 
        	// 새로운 입력 필드로 추가하여 서버에 전송
        	// 내가 만든 배열에 추가된거에 ,로 구분된 문자열로 결합
            var form = event.target.closest('form');
            var input = document.createElement('input');
            input.type = 'hidden';
            input.name = 'check';
            input.value = selectedChecks.join(',');
            form.appendChild(input);
        } else{
            alert("선택된 항목이 없습니다.");
            event.preventDefault(); // 폼 제출 방지
        }
    });
	// 수정 이벤트
    document.getElementById("수정").addEventListener("click", function () {
        const checkedRows = document.querySelectorAll("#table-body tr input[type='checkbox']:checked");
        if (checkedRows.length !== 1) {
            alert("수정할 항목을 하나만 선택해주세요.");
            return;
        }

        const row = checkedRows[0].closest('tr');
        const cells = row.cells;
        const skuId = cells[0].textContent;  // 예: 첫 번째 열에 sku_id가 있다고 가정

        // 입력 필드에 데이터 채우기
        document.getElementById("sku_code").value = cells[1].textContent;
        document.getElementById("sku_name").value = cells[2].textContent;
        document.getElementById("sku_size").value = cells[3].textContent;
        document.getElementById("vendor_name").value = cells[4].textContent;
        document.getElementById("price").value = cells[5].textContent;
        document.getElementById("sku_category").value = cells[6].textContent;

        // 수정 완료 버튼 클릭 시 해당 값을 서버로 전송
        document.getElementById("수정완료").addEventListener("click", function () {
            const form = document.getElementById("editForm");
            form.submit();  // 폼 제출하여 서버로 데이터 전송
        });
    });
</script>	

</body>
</html>