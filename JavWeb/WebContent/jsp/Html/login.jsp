<%@page import="javax.websocket.SendHandler"%>
<%@page import="javax.websocket.SendResult"%>
<%@page import="org.apache.catalina.ha.backend.Sender"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>


</head>
<body style="background-image:url('image/1.jpg');background-repeat:repeat;background-size:100% ">

	<center>
	<h1><b>欢迎登录</b></h1>
		<form action="login.jsp" method="post">
			<span>用户名:</span><input type="text" name="uname"><br /> 
			<span>密&nbsp;码:</span><input type="password" name="upass" ><br /> 
			<input type="submit"value="提交" border-radius: 25px;> <input type="reset" value="重置">
		</form>
	</center>
	<%
		String name = request.getParameter("uname");
		String password = request.getParameter("upass");
		if (!(name == null || "".equals(name) || password == null || "".equals(password))) {
			if ("aa".equals(name) && "12".equals(password)) {
				
				response.setHeader("refresh", "0;URL=welcome.jsp"); //定时跳转
				
	%>
	
	<%
		} else {
	
	
	   response.setHeader("refresh", "0;URL=login.jsp"); 
	
		}
		}
	%>

</body>
</html>