<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/bootstrap.min.js"></script>
<script type="text/javascript">
	function validate() {
		var sname = $("#sname").val();
		var age = $("#age").val();
		if(sname.length == 0) {
			alert("学生姓名不能为空");
			return false;
		}
		if(age.length == 0) {
			alert("学生年龄不能为空");
			return false;
		}
		if(isNaN(age)) {
			alert("学生年龄必须为数字");
			return false;
		}
		if(age < 0 || age > 100) {
			alert("学生年龄要在0-100之间");
			return false;
		}
		return true;
	}

</script>
</head>
<body class="container">
	<h1>修改学生信息</h1>
	<form
		action="${pageContext.request.contextPath }/student/update.action"
		method="post" onsubmit="return validate()" class="form-horizontal">
		<input type="hidden" name="sid" value="${stu.sid }" />
		<div class="form-group">
			<label class="col-sm-2 control-label">学生编号：</label>
			<div class="col-sm-4">
				<p class="form-control-static">${stu.sid }</p>
			</div>
		</div>
		<div class="form-group">
			<label for="sname" class="col-sm-2 control-label">学生姓名：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="sname" name="sname"
					value="${stu.sname }">
			</div>
		</div>
		<div class="form-group">
			<label for="age" class="col-sm-2 control-label">学生年龄：</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="age" name="age"
					value="${stu.age }">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">所属班级：</label>
			<div class="col-sm-4">
				<select class="form-control" name="classes.cid">
					<c:forEach items="${classesList }" var="classes">
						<option value="${classes.cid}" ${stu.classes.cid==classes.cid?"selected=selected":"" }>${classes.cname }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-4">
				<button type="submit" class="btn btn-danger">修改</button>
				<a href="javascript:history.go(-1)" class="btn btn-danger">返回</a>
			</div>
		</div>
	</form>
</body>
</html>