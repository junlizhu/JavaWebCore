<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="value" scope="page" />
	${'${'}name}:${name}<br/>
	<c:set var="name"  scope="page" >100</c:set>
	${'${'}name}:${name}<br/>
	<c:remove var="name"/>
	${'${'}name}:${name}<br/>
	<hr/>
	<c:out value="china"></c:out>
	<hr/>
	<p>c:out value="" escapeXml="true/flase"</p>
	<c:out value="<b><i>china</i></b>" escapeXml="true"></c:out><br/>
	<c:out value="<b><i>china</i></b>" escapeXml="flase"></c:out><br/>
	<hr/>
	<p>c:out value="" default="default value" </p>
	<c:out value="${aaa}" default="如果value的值为空，则显示default的值"/><br/>
	<c:out value="${aaa}" >如果value的值为空，则显示default的值</c:out><br/>
	<hr/>
	<p>c:catch:内部异常输出</p>
	<c:catch var="error">
	  <%
	  // ${param.a+1 } 
	   int result = 10/0;
	   %> 
	</c:catch>
	<%-- <c:out value="${error }"></c:out> --%>
	<h3>异常输出:${error }</h3>
</body>
</html>