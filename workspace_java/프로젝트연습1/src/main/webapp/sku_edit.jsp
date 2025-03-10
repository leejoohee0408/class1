<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="프로젝트연습.P_skuDTO" %>
<% P_skuDTO sku = (P_skuDTO) request.getAttribute("sku"); %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>상품 정보 수정</title>
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
        <h1>상품 정보 수정</h1>
        <form action="/sku?action=update" method="post">
            <input type="hidden" name="skuId" value="<%= sku.getSkuId() %>">
            <label for="skuCode">상품 코드:</label>
            <input type="text" id="skuCode" name="skuCode" value="<%= sku.getSkuCode() %>">
            <label for="skuName">상품명:</label>
            <input type="text" id="skuName" name="skuName" value="<%= sku.getSkuName() %>">
            <label for="skuSize">규격:</label>
            <input type="text" id="skuSize" name="skuSize" value="<%= sku.getSkuSize() %>">
            <label for="vendorName">업체명:</label>
            <select id="vendorName" name="vendorName">
                <option value="준규회사" <%= "준규회사".equals(sku.getVendorName()) ? "selected" : "" %>>준규회사</option>
                <option value="수완이형회사" <%= "수완이형회사".equals(sku.getVendorName()) ? "selected" : "" %>>수완이형회사</option>
            </select>
            