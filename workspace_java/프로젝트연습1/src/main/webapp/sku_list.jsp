<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List, 프로젝트연습.P_skuDTO" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품 정보 관리</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f4;
        }
        .container {
            width: 80%;
            margin: auto;
            overflow: hidden;
            background: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: #333;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        .form-container {
            margin-bottom: 20px;
            padding: 15px;
            background-color: #e9ecef;
            border-radius: 5px;
        }
        .form-container label {
            display: block;
            margin-bottom: 5px;
        }
        .form-container input[type="text"],
        .form-container input[type="date"],
        .form-container select {
            width: calc(100% - 12px);
            padding: 6px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-container button {
            background-color: #007bff;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        .form-container button:hover {
            background-color: #0056b3;
        }
        .button-group {
            text-align: center;
            margin-top: 20px;
        }
        .button-group button {
            margin: 0 10px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>상품 정보 관리</h1>
        <div class="form-container">
            <label for="skuCode">상품 코드:</label>
            <input type="text" id="skuCode" name="skuCode">
            <label for="skuName">상품명:</label>
            <input type="text" id="skuName" name="skuName">
            <label for="skuSize">규격:</label>
            <input type="text" id="skuSize" name="skuSize">
            <label for="vendorName">업체명:</label>
            <select id="vendorName" name="vendorName">
                <option value="준규회사">준규회사</option>
                <option value="수완이형회사">수완이형회사</option>
            </select>
            <label for="price">단가:</label>
            <input type="text" id="price" name="price">
            <label for="createDate">등록 날짜:</label>
            <input type="date" id="createDate" name="createDate">
            <label for="modifyDate">수정 날짜:</label>
            <input type="date" id="modifyDate" name="modifyDate">
            <label for="category">제품 분류:</label>
            <select id="category" name="category">
                <option value="원자재">원자재</option>
                <option value="완제품">완제품</option>
            </select>
            <button id="등록">등록</button>
        </div>
        <div class="button-group">
            <button id="조회">조회</button>
            <button id="수정">수정</button>
            <button id="삭제">삭제</button>
        </div>
        <table>
            <thead>
                <tr>
                    <th><input type="checkbox" id="체크박스"></th>
                    <th>순번</th>
                    <th>상품 코드</th>
                    <th>상품명</th>
                    <th>규격</th>
                    <th>업체명</th>
                    <th>단가</th>
                    <th>등록 날짜</th>
                    <th>수정 날짜</th>
                    <th>제품 분류</th>
                    <th>수정</th>
                </tr>
            </thead>
            <tbody id="table-body">
                <%
                List<P_skuDTO> skus = (List<P_skuDTO>) request.getAttribute("skus");
                if (skus != null) {
                    for (int i = 0; i < skus.size(); i++) {
                        P_skuDTO sku = skus.get(i);
                %>
                <tr>
                    <td><input type="checkbox" value="<%= sku.getSkuId() %>"></td>
                    <td><%= i + 1 %></td>
                    <td><%= sku.getSkuCode() %></td>
                    <td><%= sku.getSkuName() %></td>
                    <td><%= sku.getSkuSize() %></td>
                    <td><%= sku.getVendorName() %></td>
                    <td><%= sku.getPrice() %></td>
                    <td><%= sku.getCreateDate() %></td>
                    <td><%= sku.getModifyDate() != null ? sku.getModifyDate() : "" %></td>
                    <td><%= sku.getCategory() %></td>
                    <td><button onclick="editSku(<%= sku.getSkuId() %>)">수정</button></td>
                </tr>
                <%
                    }
                }
                %>
            </tbody>
        </table>
    </div>
    <script>
    // 페이지 로드 시 상품 목록 조회
    window.onload = function() {
        fetch('/sku?action=list')
            .then(response => response.json())
            .then(data => {
                const tableBody = document.getElementById('table-body');
                tableBody.innerHTML = ''; // 기존 데이터 초기화
                data.forEach((sku, index) => {
                    const row = tableBody.insertRow();
                    row.innerHTML = `
                        <td><input type="checkbox" value="${sku.skuId}"></td>
                        <td>${index + 1}</td>
                        <td>${sku.skuCode}</td>
                        <td>${sku.skuName}</td>
                        <td>${sku.skuSize}</td>
                        <td>${sku.vendorName}</td>
                        <td>${sku.price}</td>
                        <td>${sku.createDate}</td>
                        <td>${sku.modifyDate || ''}</td>
                        <td>${sku.category}</td>
                        <td><button onclick="editSku(${sku.skuId})">수정</button></td>
                    `;
                });
            });
    };

    // 등록 버튼 클릭 이벤트
    document.getElementById("등록").addEventListener("click", function () {
        const skuCode = document.getElementById("상품코드").value;
        const skuName = document.getElementById("상품명").value;
        const skuSize = document.getElementById("규격").value;
        const vendorName = document.getElementById("업체명").value;
        const price = document.getElementById("단가").value;
        const createDate = document.getElementById("등록날짜").value;
        const modifyDate = document.getElementById("수정날짜").value;
        const category = document.getElementById("제품분류").value;

        fetch('/sku?action=insert', {
            method: 'POST',
            headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
            body: new URLSearchParams({ skuCode, skuName, skuSize, vendorName, price, createDate, modifyDate, category })
        }).then(() => window.location.reload()); // 페이지 새로고침
    });

    // 삭제 버튼 클릭 이벤트
    document.getElementById("삭제").addEventListener("click", function () {
        const checkedSkus = Array.from(document.querySelectorAll('#table-body input[type="checkbox"]:checked'))
            .map(checkbox => checkbox.value);
        checkedSkus.forEach(skuId => {
            fetch(`/sku?action=delete&skuId=${skuId}`, { method: 'POST' });
        });
        window.location.reload(); // 페이지 새로고침
    });

    // 수정 버튼 클릭 이벤트 (수정 폼으로 이동)
    function editSku(skuId) {
        window.location.href = `/sku?action=editForm&skuId=${skuId}`;
    }
</script>
</body>
</html>