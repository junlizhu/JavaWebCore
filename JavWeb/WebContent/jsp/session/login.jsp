<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login.jsp</title>
</head>
<body>

	<form action="login.jsp" method="post">
		<span>用户名:</span><input type="text" name="uname"><br />
		<span>密&nbsp;码:</span><input type="password" name="upass"><br /> 
		<input type="submit"value="提交"> 
		<input type="reset" value="重置">
	</form>

	<% //用户名：谢少锋    密码：123456
		String name = request.getParameter("uname");
		String password = request.getParameter("upass");
		if (!(name == null || "".equals(name) || password == null || "".equals(password))) {
			if ("xieshaofeng".equals(name) && "123456".equals(password)) {
				response.setHeader("refresh", "5;URL=welcome.jsp");     //定时跳转
				session.setAttribute("userid", name);
	%>
	<h3>用户登录成功，五秒钟后跳转到欢迎页！</h3>
	<h3>
		如果没有跳转，请点击<a href="welcome.jsp">这里</a>
	</h3>
	<%
		} else {
	%>
	<h3>登录失败哦!错误的用户名或密码!!!</h3>
	<%
		}
		}
	%>

</body>
</html>