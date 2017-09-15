<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示学生信息</title>
</head>
<body>
	
	<div  style=" margin:0 auto; text-align:center">
	<h1>首页</h1>
	<div> <a href="${pageContext.request.contextPath}/preAddStu.do">增加学生 </a> <br>
	<h3>查询学生</h3>
	<div>
		<form action="" method="post" >
			<input name="sno" type="text" placeholder="输入学号">
			<input name="sno" type="text" placeholder="输入姓名">
			<input name="sno" type="text" placeholder="输入班级">
			<input type="submit" value="查  询">
		</form>
	</div>
	</div>
    <div style="margin:0 auto;text-align:center; padding:10px">
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
    </div>
    <div> <p>共有${page.pageNum }页，${page.rowNum }条数据，当前为第${page.nowPageNum }页</p>
    <a href="${pageContext.request.contextPath }/showAll.do?nowPageNum=1" style="margin:0 10px;">首页</a>
    <a style="margin:0 10px;" href="${pageContext.request.contextPath }/showAll.do?nowPageNum=${page.nowPageNum-1}">上一页</a>
    <a style="margin:0 10px;" href="${pageContext.request.contextPath }/showAll.do?nowPageNum=${page.nowPageNum+1 }">下一页</a>
    <a style="margin:0 10px;" href="${pageContext.request.contextPath }/showAll.do?nowPageNum=${page.pageNum }">最后一页</a>
    </div>
</div>
</body>
</html>