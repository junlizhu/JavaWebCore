<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		long start = session.getCreationTime();
		long end = session.getLastAccessedTime();
		long time = (end-start)/1000;
		/* out.println(start)/1000;
		out.println(end)/1000;  */
		response.setHeader("refresh","1");
	%>
	<%-- <h3>你开始时间为<%=start %>秒!</h3>
	<h3>你结束时间为<%=end %>秒!</h3> --%>
	<h3>你已经停留了<%=time %>秒!</h3>
</body>
</html>