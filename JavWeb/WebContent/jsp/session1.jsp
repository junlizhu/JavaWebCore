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
		session.setAttribute("name", "xiezong");
		session.setAttribute("birthday", new Date());
	%>
<%-- 	<jsp:forward page="session2.jsp"></jsp:forward>
 --%>	
 <a href="session2.jsp">跳转</a>
</body>
</html>