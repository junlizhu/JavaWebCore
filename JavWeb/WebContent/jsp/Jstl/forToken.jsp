<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
String address="Beijing,shanghai!nanjing:guangzhou;shenzheng.hangzhou,hefei";
request.setAttribute("address", address);
%>
	<c:forTokens var="addr" items="${address }"  delims=",!;:."
		varStatus="a">
${a.index }、${addr }<br />
	</c:forTokens>
</body>
</html>