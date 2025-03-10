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
</head>
<body>
<form method="post" action="p_sku">
	상품코드 : <input type="text" name="p_sku">
	상품명 : <input type="text" name="p_sku1">
	규격 : <input type="text" name="p_sku2">
	업체명 : <input type="text" name="p_sku3">
	단가 : <input type="text" name="p_sku4">
	제품분류 : <input type="text" name="p_sku5">
	<input type="submit" value="등록">
</form>
</body>
</html>