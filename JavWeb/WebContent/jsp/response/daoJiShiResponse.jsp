<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新安人才网</title>
</head>
<body>
	<script type="text/javascript">
		var time = 11;

		function returnUrlByTime() {

			window.setTimeout('returnUrlByTime()', 1000);

			time = time - 1;

			document.getElementById("layer").innerHTML = time;
		}
	</script>
</head>

<body onload="returnUrlByTime()">

	<h3>请勿重复提交您的信息！谢谢！</h3>

	<!-- 	<b><span id="layer">3</span>秒后，转入输入界面。</b> -->
	<!--  <h3>3秒后跳转至更精彩的页面，如果没有跳转，请点击<a href="http://wan.360.cn/?src=hao-mz-top01">这里</a>
	</h3> -->
	<b> <span id="layer">10</span>秒后，转入输入界面。如果没有跳转，请点击
	 <a href="http://wan.360.cn/?src=hao-mz-top01">这里</a></b>

	<%
		//转向语句  
		response.setHeader("Refresh", "10;URL=http://wan.360.cn/?src=hao-mz-top01");
	%>
</body>


</html>