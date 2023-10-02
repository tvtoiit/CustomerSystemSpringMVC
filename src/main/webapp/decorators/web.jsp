<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/common/taglib.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang chủ</title>
<%-- <link href="<c:url value='../template/web/css/common.css'/>" rel="stylesheet" type="text/css">
<link href="/template/web/css/T001.css" rel="stylesheet" type="text/css">
<link href="<c:url value='../template/web/css/T002.css'/>" rel="stylesheet" type="text/css"> --%>
<style>
<%@ include file="/template/web/css/T001.css" %>
</style>
</head>
<body>
	<!-- Navigation -->
	<%@ include file="/common/web/header.jsp" %>

	<dec:body/>

	<!-- Footer -->
	<%@ include file="/common/web/footer.jsp" %>
</body>
</html>