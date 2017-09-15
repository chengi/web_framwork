<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<body>
 	增加学生界面
   	<form class="form-inline" action="${pageContext.request.contextPath }/login/addStu.do" method="post">
   		请输入学生姓名：<input class="form-control" type="text" name="sname"><br><br>
   		请输入学生年龄：<input class="form-control" type="text" name="age"><br><br>
   		<select class="form-control" name="stuClass.scno">
		
		<c:forEach var="opts" items="${classes }">
			<option value="${opts.scno }">${opts.scname }</option>
		</c:forEach>
		
		
	
	</select>
	<input type="submit" value="增加" class="btn btn-danger">
   	</form>
  </body>
  <script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/bootstrap.min.js"></script>
</html>