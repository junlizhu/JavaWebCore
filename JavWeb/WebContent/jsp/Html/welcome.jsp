<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome.jsp</title>
</head>
<body bgcolor="pink">
	<%
		if (session.getAttribute("userid") != null) {
	%>
	<h3 style="color: red;">欢迎<%=session.getAttribute("userid")%>登录本系统!!!<a
			href="loginOut.jsp">注销</a>!
	</h3>
	<%
		} else {
	%>
	<h3>
		请先进行系统的<a href="login.jsp">登录</a>!
	</h3>
	<%
		}
	%>



</body>
</html>