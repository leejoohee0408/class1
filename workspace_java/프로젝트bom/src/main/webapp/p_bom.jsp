<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>BOM</title>
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
    <h1>◎ BOM</h1>
    <span>* 모두 기입</span>
    <form method="post" action="p_sku" class="form">
        <div class="form-fields">
            <div class="form-row">
                <label for="상품코드">상품코드<span>*</span></label>
                <input type="text" name="p_sku" id="skuCode">
                <label for="상품명">상품명<span>*</span></label>
                <input type="text" name="p_sku1" id="skuName">
            </div>
            <div class="form-row">
                <label for="규격">규격<span>*</span></label>
                <input type="text" name="p_sku2" id="skuSize">
                <label for="업체명">업체명<span>*</span></label>
                <input type="text" name="p_sku3" id="vendorName">
            </div>
            <div class="form-row">
                <label for="단가">단가<span>*</span></label>
                <input type="text" name="p_sku4" id="price">
                <label for="제품분류">제품분류<span>*</span></label>
                <input type="text" name="p_sku5" id="skuCategory">
            </div>
        </div>
        <div>
            <input type="submit" value="등록" class="buttons">
            <input type="button" value="조회" class="buttons" onclick="searchSkus()"> 
            <button type="button" class="buttons" id="editSelectedButton">수정</button> 
            <button type="button" class="buttons" id="updateButton" style="display: none;" onclick="updateSku()">수정 완료</button>
            <button type="button" class="buttons" id="cancelButton" style="display: none;">취소</button>
            <input type="submit" value="삭제" class="buttons" name="action">
        </div>
        
    </form>
		<div>
        조회할것 입력해주세요
        <input type="text" name="searchKeyword" id="searchKeyword">
        </div>
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
        <c:forEach var="dto" items="${resultList}">
            <tr>
                <td><input type="checkbox" name="check" value="${dto.sku_id}"></td>
                <td>${dto.sku_id}</td>
                <td>${dto.sku_code}</td>
                <td>${dto.sku_name}</td>
                <td>${dto.sku_size}</td>
                <td>${dto.vendor_name}</td>
                <td>${dto.price}</td>
                <td>${dto.create_date}</td>
                <td>${dto.modify_date}</td>
                <td>${dto.sku_category}</td>
                
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

// 조회버튼
function searchSkus() {
    var searchKeyword = document.getElementById('searchKeyword').value;
    if (searchKeyword.trim() === "") {
        // 검색어가 없을 경우 전체 목록 조회
        window.location.href = "p_sku";
    } else {
        // 검색어가 있을 경우 검색 결과 조회
        window.location.href = "p_sku?searchKeyword=" + searchKeyword;
    }
}


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

    // 수정 버튼 클릭 이벤트
     // 선택 수정 버튼 클릭 이벤트
    document.getElementById('editSelectedButton').addEventListener('click', function() {
        var selectedChecks = [];
        var checkboxes = document.querySelectorAll('input[name="check"]:checked');
        checkboxes.forEach(function(checkbox) {
            selectedChecks.push(checkbox.value);
        });

        if (selectedChecks.length === 1) { // 하나만 선택했을 경우
            var skuId = selectedChecks[0];
            var selectedRow = document.querySelector('input[name="check"][value="' + skuId + '"]').closest('tr');

            // 선택된 행의 데이터 가져오기
            var skuCode = selectedRow.querySelectorAll('td')[2].textContent;
            var skuName = selectedRow.querySelectorAll('td')[3].textContent;
            var skuSize = selectedRow.querySelectorAll('td')[4].textContent;
            var vendorName = selectedRow.querySelectorAll('td')[5].textContent;
            var price = selectedRow.querySelectorAll('td')[6].textContent;
            var skuCategory = selectedRow.querySelectorAll('td')[9].textContent;

            // 입력 필드에 데이터 표시
            document.getElementById('skuCode').value = skuCode;
            document.getElementById('skuName').value = skuName;
            document.getElementById('skuSize').value = skuSize;
            document.getElementById('vendorName').value = vendorName;
            document.getElementById('price').value = price;
            document.getElementById('skuCategory').value = skuCategory;

            // 수정 버튼 및 취소 버튼 표시
            document.getElementById('updateButton').style.display = 'inline-block';
            document.getElementById('cancelButton').style.display = 'inline-block';

            // 수정 모드 설정 (수정 완료 시 필요한 정보)
            document.getElementById('updateButton').dataset.skuId = skuId;
        } else if (selectedChecks.length > 1){
            alert("수정시 하나의 항목만 선택해주세요.");
        }else {
            alert("선택된 항목이 없습니다.");
        }
    });

    // 수정 완료 함수
    function updateSku() {
        const skuId = document.getElementById('updateButton').dataset.skuId;
        const skuCode = document.getElementById('skuCode').value;
        const skuName = document.getElementById('skuName').value;
        const skuSize = document.getElementById('skuSize').value;
        const vendorName = document.getElementById('vendorName').value;
        const price = document.getElementById('price').value;
        const skuCategory = document.getElementById('skuCategory').value;

        // AJAX 요청을 사용하여 서버에 수정된 상품 정보 전송
        fetch('p_sku', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded',
            },
            body: new URLSearchParams({
                action1: '수정',
                skuId: skuId,
                p_sku: skuCode,
                p_sku1: skuName,
                p_sku2: skuSize,
                p_sku3: vendorName,
                p_sku4: price,
                p_sku5: skuCategory,
            }),
        })
            .then((response) => response.text())
            .then((data) => {
                // 상품 목록 테이블 다시 표시, 수정 폼 숨김
                location.reload(); // 페이지 새로고침 또는 테이블 업데이트
            })
            .catch((error) => {
                console.error('수정 오류:', error);
            });
    }
</script>
</body>
</html>