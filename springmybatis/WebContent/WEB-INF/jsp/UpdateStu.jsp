<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath }/bootstrap3/css/bootstrap-theme.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/bootstrap3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<%request.setCharacterEncoding("utf-8"); %>
<body>
	<h1>修改学生信息</h1>
	<form class="form-inline" action="${pageContext.request.contextPath }/login/updateStu.do" method="post">
		<input  type="hidden" name="sno" value="${stu.sno }">
		学生编号：${stu.sno }<br>
		学生姓名：<input class="form-control" type="text" name="sname" value="${stu.sname }"><br>
		学生年龄：<input class="form-control" type="text" name="age" value="${stu.age }"><br>
		学生班级：${stu.stuClass.scname }<br>
		<input type="submit" value="修 改" class="btn btn-danger">
	</form>
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/bootstrap.min.js"></script>

</html>