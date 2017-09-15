<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%request.setCharacterEncoding("utf-8"); %>
<body>
	<h1>修改学生信息</h1>
	<form action="${pageContext.request.contextPath }/updateStu.do" method="post">
		<input type="hidden" name="sno" value="${stu.sno }">
		学生编号：${stu.sno }<br>
		学生姓名：<input type="text" name="sname" value="${stu.sname }"><br>
		学生年龄：<input type="text" name="age" value="${stu.age }"><br>
		学生班级：${stu.stuClass.scname }<br>
		<input type="submit" value="修 改">
	</form>
</body>
</html>