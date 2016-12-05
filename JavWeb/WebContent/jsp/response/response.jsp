<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>response</title>
</head>
<body>
	<%!
		int count = 3;
	%>
	<%-- <%
		response.setHeader("refresh", "0.1");
	%>
	<h3>
		你已经访问<%=count++ %>次
	</h3> --%>
	<h3>3秒后跳转至更精彩的页面，如果没有跳转，请点击<a href="http://wan.360.cn/?src=hao-mz-top01">这里</a>
	</h3>
	<%
	response.setHeader("refresh", "3;URL=http://wan.360.cn/?src=hao-mz-top01");
	%>
	<h3>还有<%=--count%>秒 </h3>
</body>
</html>