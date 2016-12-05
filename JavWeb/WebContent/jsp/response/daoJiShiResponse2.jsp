<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新安人才网</title>
</head>
<script language=javascript>
	function out(obj) {
		var i = obj;
		if (i == 0)
			document.location.href = "http://wan.360.cn/?src=hao-mz-top01";
		//document.body.innerHTML = i;
		document.getElementById("id").innerHTML = i;
		i--;
		setTimeout("out(" + i + ")", 1000);
	}
</script>
<body onload="out(11)">

	<h3>请勿重复提交您的信息！谢谢！</h3>
	<b> <span id="id">11</span>秒后，转入输入界面。如果没有跳转，请点击 <a
		href="http://wan.360.cn/?src=hao-mz-top01">这里</a></b>

	<%
		//转向语句  
		response.setHeader("Refresh", "11;URL=http://wan.360.cn/?src=hao-mz-top01");
	%>
</body>


</html>