<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示学生信息</title>
<link
	href="${pageContext.request.contextPath }/bootstrap3/css/bootstrap-theme.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath }/bootstrap3/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<style>
#main {
	background-color: #eee;
	width: 600px;
	height: auto;
	margin: 0 auto;
}

.head {
	width: %60;
	height: auto;
	padding: 10px;
	margin-left: 50px
	/* border: 1px solid #000; */
}

.search {
	height: auto;
	padding: 10px;
	margin-left: 50px;
	/* border: 1px solid #000; */
}

.list {
	height: 200px;
	padding: 10px;
	
}

#inputText {
	width: 160px;
	margin-right: 5px 30px;
}
</style>
<body>

	<!-- <div  style=" margin:0 auto; text-align:center"> -->
	<%-- 	<h1>首页</h1>
	<div> <a href="${pageContext.request.contextPath}/preAddStu.do">增加学生 </a> <br>
	<h3>查询学生</h3>
	<div>
		<form action="${pageContext.request.contextPath }/showAll.do" method="post" id="info">
			<input name="sno" type="text" placeholder="输入学号" value="${stu.sno }">
			<input name="sname" type="text" placeholder="输入姓名" value="${stu.sname }"><br>
			<input name="age" type="text" placeholder="输入年龄" value="${stu.age }">
			<!-- <input name="stuClass.scno" type="" placeholder="输入班级"> -->
			<select name="stuClass.scno">
				<option value="-1">选择班级</option>
				<c:forEach var="cls" items="${classes}">
					<option value="${cls.scno }" ${stu.stuClass.scno==cls.scno?"selected=selected":"" }> ${cls.scname} </option>
				</c:forEach>
				
				
			</select>
			<input name="nowPageNum" type="hidden" value="${page.nowPageNum }" id="pageNow">
			<input type="submit" value="查  询" id="search" onclick="submitInfo()">
		</form>
	</div>
	</div> --%>
	<%-- <div style="margin:0 auto;text-align:center; padding:10px">
    	<table style="border:solid 2px; font-size:18px; padding:3px;margin:0 auto;text-align:center" border="1px" >
        	<tr style="border:solid 2px; font-size:18px; padding:3px;">
            	<td style="padding:5px 15px"> 编号</td>
                <td style="padding:5px 15px"> 姓名</td>
                <td style="padding:5px 15px"> 年龄</td>
                <td style="padding:5px 50px"> 班级</td>
                <td style="padding:5px 50px"> 操作</td>
            </tr>
            <c:forEach var="lists" items="${StuList }">
            	<tr>
            	<td> ${lists.sno }</td>
                <td> ${lists.sname }</td>
                <td> ${lists.age }</td>
                <td> ${lists.stuClass.scname }</td>
                <td>
                	<a href="${pageContext.request.contextPath }/deleteBySno.do?sno=${lists.sno}">删除 </a>
                    <a href="${pageContext.request.contextPath }/preUpdateStu.do?sno=${lists.sno}">修改 </a>
                    <a href="${pageContext.request.contextPath }/showBySno.do?sno=${lists.sno }">详情 </a>
                </td>
            </tr>
            </c:forEach>
            
        </table>
    </div> --%>
	<%-- <div> <p>共有${page.pageNum }，${page.rowNum }条数据，当前为第${page.nowPageNum }页</p>
    <a href="#" style="margin:0 10px;" onclick="firstPageAndSubmit()">首页</a>
    <a style="margin:0 10px;" href="#" onclick="subPageAndSubmit()" >上一页</a>
    <a style="margin:0 10px;" href="#" onclick="addPageAndSubmit()" >下一页</a>
    <a style="margin:0 10px;" href="#" onclick="lastPageAndSubmit()" >最后一页</a>
    <!--  ${pageContext.request.contextPath }/showAll.do?nowPageNum=${page.nowPageNum+1 }-->
    </div> --%>
	<!-- </div> -->



	<div id="main">
		<div class="head">
			<h1>学生管理系统</h1>
			<a href="${pageContext.request.contextPath}/login/preAddStu.do" class="btn btn-danger">增加学生 </a> <br>
		</div>
		<div class="search">
			<form action="${pageContext.request.contextPath }/showAll.do"
				method="post" id="info" class="form-inline">
				<input class="form-control" name="sno" type="text" placeholder="输入学号" value="${stu.sno }"
					id="inputText"> 
				<input class="form-control" name="sname" type="text"
					placeholder="输入姓名" value="${stu.sname}" id="inputText"><br>
				<br> <input class="form-control" name="age" type="text" placeholder="输入年龄"
					value="${stu.age }" id="inputText">
				<!-- <input name="stuClass.scno" type="" placeholder="输入班级"> -->
				<select class="form-control" name="stuClass.scno" id="inputText">
					<option value="-1">选择班级</option>
					<c:forEach var="cls" items="${classes}">
						<option value="${cls.scno }"
							${stu.stuClass.scno==cls.scno?"selected=selected":"" }>
							${cls.scname}</option>
					</c:forEach>


				</select> <input name="nowPageNum" type="hidden" value="${page.nowPageNum }"
					id="pageNow"> <input type="submit" value="查  询" id="search"
					onclick="submitInfo()" class="btn btn-danger">
			</form>
			
		</div>
		<div class="list">
			<div style="margin: 0 auto; text-align: center; padding: 10px">
				<table class="table table-hover"
					style="font-size: 18px; padding: 3px; margin: 0 auto; text-align: center">
					<tr style="font-size: 18px; padding: 3px;">
						<td style="padding: 5px 15px">编号</td>
						<td style="padding: 5px 15px">姓名</td>
						<td style="padding: 5px 15px">年龄</td>
						<td style="padding: 5px 50px">班级</td>
						<td style="padding: 5px 50px">操作</td>
					</tr>
					<c:forEach var="lists" items="${StuList }">
						<tr>
							<td>${lists.sno }</td>
							<td>${lists.sname }</td>
							<td>${lists.age }</td>
							<td>${lists.stuClass.scname }</td>
							<td><a
								href="${pageContext.request.contextPath }/login/deleteBySno.do?sno=${lists.sno}">删除
							</a> <a
								href="${pageContext.request.contextPath }/login/preUpdateStu.do?sno=${lists.sno}">修改
							</a> <a
								href="${pageContext.request.contextPath }/login/showBySno.do?sno=${lists.sno }">详情
							</a></td>
						</tr>
					</c:forEach>

				</table>
			</div>

		</div>
		<div style="text-align: center; padding-bottom: 50px">
			<p>共有${page.pageNum }页，共查询出${page.rowNum }条数据，当前为第${page.nowPageNum }页</p>
			<a href="#" style="margin: 0 10px;" onclick="firstPageAndSubmit()" class="btn btn-danger">首页</a>
			<a style="margin: 0 10px;" href="#" onclick="subPageAndSubmit()" class="btn btn-danger">上一页</a>
			<a style="margin: 0 10px;" href="#" onclick="addPageAndSubmit()" class="btn btn-danger">下一页</a>
			<a style="margin: 0 10px;" href="#" onclick="lastPageAndSubmit()" class="btn btn-danger">最后一页</a>
			<!--  ${pageContext.request.contextPath }/showAll.do?nowPageNum=${page.nowPageNum+1 }-->
		</div>
	</div>


</body>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/bootstrap3/js/bootstrap.min.js"></script>
<script>
	function subPageAndSubmit() {
		/* alert("上一页"); */
		var form = document.getElementById("info");
		var element = document.getElementById("pageNow");
		element.value = element.value * 1 - 1;
		form.submit();
	}

	function addPageAndSubmit() {
	/* 	alert("下一页"); */
		var form = document.getElementById("info");
		var element = document.getElementById("pageNow");
		var a = element.value;
		element.value = a * 1 + 1;
		/* alert(element.value); */
		form.submit();

	}

	function firstPageAndSubmit() {
		/* alert("第一页"); */
		var form = document.getElementById("info");
		var element = document.getElementById("pageNow");
		element.value = 1;
		form.submit();
	}

	function lastPageAndSubmit() {
	/* 	alert("最后一页"); */
		var form = document.getElementById("info");
		var element = document.getElementById("pageNow");
		element.value = ${page.pageNum};
		form.submit();
	}

	function submitInfo() {
		var element = document.getElementById("pageNow");
		element.value = 1;
	}
</script>

</html>