<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<title>Insert title here</title>
</head>
<body>
<c:url value="http://www.baidu.com" var="loginUrl" scope="page">
<%-- <c:url value="admin/login.jsp" var="loginUrl" scope="page"> --%>
  <c:param name="name" value="zhangsan"></c:param>
  <c:param name="age" value="32"></c:param>

</c:url>
<a href="${loginUrl }">新的地址</a>
</body>
</html>