<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

<title>更新页面</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet"
	href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>


<style>
body {

	margin: 100px;
	padding: 0px;
}
</style>

<body>
<h1><span class="label label-info">修改公告</span></h1>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">


            <form method="post" action="ann/upd.html">
                <input type="hidden"   id="id" name="id"
                       value="${announcementInfo.id}"><br />

                <div class="form-group">
                    <label for="">发布者</label> <input type="text" class="form-control"
                                                     id="" name="publisher"
                                                     value="${announcementInfo.publisher}"/>
                </div>

                <div class="form-group">
                    <label for="">公告标题</label> <input type="text" class="form-control"
                                                      id="" name="title"  value="${announcementInfo.title}"
                        />
                </div>

                <div class="form-group">
                    <label for="">公告内容</label> <input type="text" class="form-control"
                                                      id="" name="content"    value="${announcementInfo.content}"  />
                </div>
              


                <input type="submit" id="btnSubmit" name="btnSubmit" value="更新">
                <input type="reset"  id="btnReset" name="btnReset" value="返回">


            </form>

        </div>
    </div>
</div>

</body>
</html>
