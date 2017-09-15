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

</head>
<body class="container">
	<h1>学生列表</h1>
	<form class="form-inline"
		action="${pageContext.request.contextPath }/student/getAllStudents.action"
		method="post" onsubmit="return validate() ">
		<div class="form-group">
			<label class="sr-only" for="sname">学生姓名 </label> <input
				class="form-control" id="sname1" name="sname" type="text"
				placeholder="学生姓名" value="${stu.sname }">
		</div>
		<div class="form-group">
			<label class="sr-only" for="age">Password</label> <input
				class="form-control" name="age" id="age" type="number"
				placeholder="学生年龄" value="${stu.age }">
		</div>
		<div class="form-group">
			<select class="form-control" name="classes.cid">
				<option value="-1">---请选择所属班级---</option>
				<c:forEach items="${classesList }" var="classes">
					<option value="${classes.cid}"
						${stu.classes.cid==classes.cid?"selected=selected":"" }>${classes.cname }</option>
				</c:forEach>
			</select>
		</div>
		<button id="submitBtn" type="submit" class="btn btn-danger">查询</button>
		<a href="${pageContext.request.contextPath }/student/addPre.action"
			class="btn btn-danger">添加学生</a>
		<table class="table table-hover">
			<thead>
				<tr>
					<th>编号</th>
					<th>姓名</th>
					<th>年龄</th>
					<th>年级</th>
					<th>操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${pageInfo.studentsList }" var="stu">
					<tr>
						<td>${stu.sid }</td>
						<td>${stu.sname }</td>
						<td>${stu.age }</td>
						<td>${stu.classes.cname }</td>
						<td><a
							onclick="javascript:if(!confirm('确定要删除此记录吗?')) { return false; }"
							href="${pageContext.request.contextPath}/student/delete.action?sid=${stu.sid}">删除</a>&nbsp;
							<a
							href="${pageContext.request.contextPath}/student/updatePre.action?sid=${stu.sid}">修改</a>&nbsp;
							<%-- <a
							href="${pageContext.request.contextPath}/student/detail.action?sid=${stu.sid}">详情</a> --%>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<input type="hidden" name="pageNum" value="${pageInfo.pageNum }" />
		共${pageInfo.totalRecord }条记录&nbsp;
		<c:choose>
			<c:when test="${pageInfo.pageNum > 1 }">
				<a id="fir" href="javascript:void(0)" class="btn btn-danger">首页</a>&nbsp;
				<a id="pre" href="javascript:void(0)" class="btn btn-danger">上一页</a>&nbsp;
			</c:when>
			<c:otherwise>
				<a id="fir" href="javascript:void(0)"
					class="btn btn-danger disabled">首页</a>&nbsp;
				<a id="pre" href="javascript:void(0)"
					class="btn btn-danger disabled">上一页</a>&nbsp;
			</c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${pageInfo.totalPage < 10 }">
				<c:set var="begin" value="1"></c:set>
				<c:set var="end" value="${pageInfo.totalPage }"></c:set>
			</c:when>
			<c:otherwise>
				<c:set var="begin" value="${pageInfo.pageNum - 5 }"></c:set>
				<c:set var="end" value="${pageInfo.pageNum + 4 }"></c:set>
				<c:if test="${begin < 1 }">
					<c:set var="begin" value="1"></c:set>
					<c:set var="end" value="10"></c:set>
				</c:if>
				<c:if test="${end > pageInfo.totalPage }">
					<c:set var="begin" value="${pageInfo.totalPage - 9 }"></c:set>
					<c:set var="end" value="${pageInfo.totalPage }"></c:set>
				</c:if>
			</c:otherwise>
		</c:choose>
		<c:forEach var="i" begin="${begin }" end="${end }">
			<c:choose>
				<c:when test="${pageInfo.pageNum eq i }">
					<font color="red" size="5"><c:out value="${i }" /></font>
				</c:when>
				<c:otherwise>
					<a href='javascript:void(0)' onclick="submitA(${i })">[<c:out
							value="${i }" />]
					</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:choose>
			<c:when test="${pageInfo.pageNum < pageInfo.totalPage }">
				<a id="next" href="javascript:void(0)" class="btn btn-danger">下一页</a>&nbsp;
				<a id="last" href="javascript:void(0)" class="btn btn-danger">尾页</a>&nbsp;
			</c:when>
			<c:otherwise>
				<a id="next" href="javascript:void(0)" class="btn btn-danger disabled">下一页</a>&nbsp;
				<a id="last" href="javascript:void(0)" class="btn btn-danger disabled">尾页</a>&nbsp;
			</c:otherwise>
		</c:choose>
		当前第${pageInfo.pageNum }页/共${pageInfo.totalPage }页
	</form>
</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#fir").click(function() {
			$("[name='pageNum']").val(1);
			$("form:first").submit();
		});
		$("#pre").click(function() {
			$("[name='pageNum']").val($("[name='pageNum']").val() - 1);
			$("form:first").submit();
		});
		$("#next").click(function() {
			$("[name='pageNum']").val($("[name='pageNum']").val() * 1 + 1);
			$("form:first").submit();
		});
		$("#last").click(function() {
			$("[name='pageNum']").val(${pageInfo.totalPage});
			$("form:first").submit();
		});
		$("#submitBtn").click(function() {
			$("[name='pageNum']").val(1);
		});
	});
	function validate() {
		var age = $("#age").val();
		if(age.length != 0) {
			if(isNaN(age)) {
				alert("学生年龄必须为数字");
				return false;
			}
		}
		return true;
	}
	function submitA(i) {
		$("[name='pageNum']").val(i);
		$("form:first").submit();
	}
</script>
</html>