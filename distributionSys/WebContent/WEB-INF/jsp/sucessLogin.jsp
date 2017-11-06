<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>${mesg.username }登录成功</b>
	选择操作的对象
	<select name="">
		<option value="-1">--请选择要操作的对象--</option>
		<c:forEach>
			<option>${ }</option>
		</c:forEach>
	</select>
</body>
</html>