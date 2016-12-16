<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="html.css" type="text/css">
</head>
<style type="text/css">
body {
	background-image: url("111.jpg");
}
</style>
<body>
<h2>请输入用户信息</h2>
	<br />
	<center>
	<form method="get"
		action="<%=request.getContextPath()%>/servlet/GeRenZhuYe" >
		<span>用户名:</span><input type="text" name="username"><br />
		<span>密&nbsp;&nbsp;码:</span><input type="password" name="password"><br />
	    <input type="submit" value="提交">
	</form>
	</center>
</body>
</html>