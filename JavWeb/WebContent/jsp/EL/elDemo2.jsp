<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>常用运算</p>
<hr/>
<span>${'${'} 5+3 }:</span> ${ 5+3 }<br/>
<span>${'${'} 5-3 }:</span> ${ 5-3 }<br/>
<span>${'${'} 5*3 }:</span> ${ 5*3 }<br/>
<span>${'${'} 5/3 }:</span> ${ 5/3 }<br/>
<%-- <span>${'${'} 5 div 3 }:</span> ${ 5 div 3 }<br/> --%>
<span>${'${'} 5 % 3 }:</span> ${ 5 % 3 }<br/>
<span>${'${'} 5 mod 3 }:</span> ${ 5 mod 3 }<br/>
<hr/>
<p>关系运算</p>
<span>${'${'} 5>3 }:</span> ${ 5>3 }<br/>
<span>${'${'} 5 gt 3 }:</span> ${ 5 gt 3 }<br/>
<span>${'${'} 5<3 }:</span> ${ 5<3 }<br/>
<span>${'${'} 5 lt 3 }:</span> ${ 5 lt 3 }<br/>
<span>${'${'} 5<=3 }:</span> ${ 5<=3 }<br/>
<span>${'${'} 5 le 3 }:</span> ${ 5 le 3 }<br/>
<span>${'${'} 5>=3 }:</span> ${ 5>=3 }<br/>
<span>${'${'} 5 ge 3 }:</span> ${ 5 ge 3 }<br/>
<span>${'${'} 5==3 }:</span> ${ 5==3 }<br/>
<span>${'${'} 5 eq 3 }:</span> ${ 5 eq 3 }<br/>
<span>${'${'} 5!=3 }:</span> ${ 5!=3 }<br/>
<%-- <span>${'${'} 5 ne 3 }:</span> ${ 5 ne 3 }<br/> --%>
<hr/>
<p>三目运算</p>
<span>${'${'} A==0 ？0:1}:</span> ${ A==0 ? 0:1 }<br/>
<span>${'${'} A!=0 ？0:1}:</span> ${ A!= 0 ? 0:1 }<br/>
<%-- <span>${'${'} A =0 ？0:1}:</span> ${ A = 0 ? 0:1 }<br/> --%>
<span>${'${'} A =0 ？0:1}:</span> ${ A = flase ? 0:1 }<br/>
<hr/>
<p>empty运算</p>
<span>${'${empty'} A}}:</span>${empty A}<br/>
<hr/>
${header ["User-Agent"] }
</body>
</html>