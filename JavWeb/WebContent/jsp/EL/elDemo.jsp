<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@page isELIgnored="true" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%pageContext.setAttribute("color","red" ); %>

</head>

<body bgcolor = ${pageScope.color} >

<% //设置page范围属性，基本数据类型自动转换为包装类
pageContext.setAttribute("num1", 11);
pageContext.setAttribute("num2", 12);
pageContext.setAttribute("num3", 13);
%>
<h3>empty操作:${empty info}</h3>
<h3>三目操作:${ num1 > num2 ? "大于":"小于"}</h3>
<h3>括号操作:${ num1 * ( num2 + num3 )}</h3>
<h3>测试</h3>
</body>
</html>