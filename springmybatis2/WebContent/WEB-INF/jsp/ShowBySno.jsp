<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示学生信息</title>
</head>
<body>
	<div style="margin:0 auto;display: inline-block;">
		<h1>学生信息</h1>
		<div style="margin:0 auto; display: inline-block;">
			学生学号：${stu.sno }<br/>
			学生姓名：${stu.sname }<br/>
			学生年龄：${stu.age }<br/>
			学生班级：${stu.stuClass.scname }<br/>
		</div>
	</div>
</body>
</html>