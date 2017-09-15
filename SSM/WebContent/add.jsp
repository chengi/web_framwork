<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.entity.AnnouncementInfo"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>增加公告信息</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="bootstrap/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="bootstrap/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="js/jquery-1.9.1.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>


<style>
body {
	margin: 100px;
	padding: 0px;
}
</style>
</head>
<body>
	<h1>
		<span class="label label-info">增加公告</span>
	</h1>
	<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<form role="form" action="ann/add" method="post">
					<input type="hidden" name="id" value="1" /><br />
					<div class="form-group">
						<label for="">发布者</label> <input type="text" class="form-control"
							id="" name="publisher" />
					</div>

					<div class="form-group">
						<label for="">公告标题</label> <input type="text" class="form-control"
							id="" name="title" />
					</div>

					<div class="form-group">
						<label for="">公告内容</label> <input type="text" class="form-control"
							id="" name="content" />
					</div>
					<button type="submit" class="btn btn-default">增加</button>

				</form>



			</div>
		</div>
	</div>

</body>
</html>
