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

<title>公告列表页面</title>

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
<h1><span class="label label-info">公告详情</span></h1>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table">
                <thead>
                <tr>
                    <th>
                       发布者
                    </th>
                    <th>
                       公告标题
                    </th>
                    <th>
                       公告内容
                    </th>
                    <th>
                       更新日期
                    </th>
                    <th>
                      操作
                    </th>
                </tr>
                </thead>
                <tbody>

                <c:forEach var="annList" items="${announcementInfoList}">
                    <tr>
                        <td>${annList.publisher}</td>
                        <td>${annList.title}</td>
                        <td>${annList.content}</td>
                        <td>${annList.pub_dateStr}</td>
                        <td>
                            <a href="ann/del?id=${annList.id}">删除</a>&nbsp;&nbsp;
                            <a href="ann/selOne?id=${annList.id}">查看</a>&nbsp;&nbsp;
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
</html>
