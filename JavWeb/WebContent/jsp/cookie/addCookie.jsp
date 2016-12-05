<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie c1 = new Cookie("name", "guozong");
		Cookie c2 = new Cookie("age", "18");
		c1.setMaxAge(5);
		c2.setMaxAge(5);
		response.addCookie(c1);
		response.addCookie(c2);
	%>
</body>
</html>