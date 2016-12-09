<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表达式实例</title>
</head>
<body bgcolor = '' >
<h3 align="center" style="color: black;">启用表达式语言</h3>
<center>
<form action="" method="post" >
<b>${"FirstName:" }<input type="text" value=" ${'请输入你的名字' }"/></b><br/>
<b>${"LasttName:" }<input type="text" value=" ${ '请输入你的姓氏' }"/></b><br/>
<input type="submit" name="submit" value=" ${ '提交表单' }">
<input type="reset"  value=" ${ '重置表单' }"/>
</form>
 <hr/>
<%
Cookie cookie1 = new Cookie("name","xiezong");
Cookie cookie2 = new Cookie("age","26");
cookie1.setMaxAge(5);
cookie2.setMaxAge(5);
response.addCookie(cookie1);
response.addCookie(cookie2);
%>
 <span>${'${cookie.name'}}:</span>${cookie.name.value};<br/>
 <span>${'${cookie.age}'}}:</span>${cookie.age.value};
 </center>
 <hr/>

<context-param>
<param-name>rri</param-name>
<param-value>1234</param-value>
</context-param>
 ${initParam.userid};
 <hr/>
queryString:${pageContext.request.queryString}<br/>
session.id:	${pageContext.request.session.id}<br/>
method:	${pageContext.request.method}<br/>
remoteUser:	${pageContext.request.remoteUser}<br/>
remoteAddr:	${pageContext.request.remoteAddr}<br/>



</body>
</html>