<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>666</title>


</head>
<body style="background-image:url('image/1.jpg');background-repeat:repeat;background-size:100% ">

	<center>
	<h1><b>欢迎登录</b></h1>
		<form action="<%=request.getContextPath()%>/servlet/MyLoginServlet4" method="post">
			<span>用户名:</span><input type="text" name="username"><br /> 
			<span>密&nbsp;码:</span><input type="password" name="password" ><br /> 
			<input type="submit"value="提交" border-radius: 25px;> <input type="reset" value="重置">
		</form>
	</center>
	<%-- <%
		
		String username = request.getParameter("username");
		String userpwd = request.getParameter("password");
		if (!(username == null || "".equals(username) || userpwd == null || "".equals(userpwd))) {
			if ("aa".equals(username) && "12".equals(userpwd)) {
				response.setHeader("refresh", "5;URL=welcome.jsp"); //定时跳转
				session.setAttribute("userid", username);
	%>
	<h3 align="center">用户登录成功，五秒钟后跳转到欢迎页！</h3>
	<h3 align="center">
		如果没有跳转，请点击<a href="welcome.jsp">这里</a>
	</h3>
	<%
		} else {
	%>
	<h3 align="center">登录失败哦!错误的用户名或密码!!!</h3>
	<%
		}
		}
	%> --%>

</body>
</html>