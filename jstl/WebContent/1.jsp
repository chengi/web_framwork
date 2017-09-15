<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/self_jstl"  prefix="my" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String ip = pageContext.getRequest().getRemoteAddr();
		pageContext.getResponse().setCharacterEncoding("UTF-8");
		out.write("你的ip是"+ip);
	%>
	<my:viewIP/>
</body>
</html>