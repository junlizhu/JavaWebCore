<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新安人才网</title>
</head>
<body>
	<%
		String username = (String) application.getAttribute("name");
		Date userbirthday = (Date) application.getAttribute("birthday");
	%>
	<p>
		姓名:<%=username%></p>
	<p>
		生日:<%=userbirthday%></p>
</body>
</html>