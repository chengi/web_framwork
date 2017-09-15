<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax练习</title>
<script type="text/javascript" src="js/jquery-3.0.0.js"></script>
<script type="text/javascript">
	$(function(){
		
		$("#returnMsg").click(function(){
			
			alert("点击了连接");
			$.ajax({
				url:"/AjaxStudy/ReturnMsg",
				type:"get",
				success:function(result){
					
					$("#showReturn").html(result);
					
				}
			});
			
		});
		
		$("#showListBt").click(function(){
			
			$.ajax({
				url:"/AjaxStudy/ReturnJson",
				type:"get",
				dataType:"json",
				success:function(result){
					var list = result;
					for(var i=0;i<list.length;i++){
						var name = list[i].name;
						var s_li = '<li>'+name+'</li>';
						var $li = $(s_li);
						$("#list").append($li);	
						
					}
					
				}
				
			});
			
		});
		
	});

</script>
</head>
<body>
	<input type="text" id="username" onblur="checkUsername()"><span id="username_msg"></span>
	<a href="#" onclick="getXhr()">测试函数</a>
	<p>其他的新闻</p>
	<p>其他的新闻</p>
	<p>其他的新闻</p>
	<p>其他的新闻</p>
	<p>其他的新闻</p>
	<p>其他的新闻</p>
	<a id="returnMsg" href="#">局部返回数据</a><span id="showReturn"></span>
	<input  type="button" id="showListBt" value="显示城市列表">
	<ul id="list"></ul>
</body>
<script type="text/javascript">
	function getXhr(){
		var xhr = new XMLHttpRequest();
		alert(xhr);
		return xhr;
	};
	
	function checkUsername(){
		
		var xhr = getXhr();
		var name = document.getElementById("username").value;
		xhr.open("get","/AjaxStudy/CheckUserName?name="+name);
		//回调函数
		xhr.onreadystatechange = function(){
			if(xhr.readyState==4 && xhr.status==200){
				var msg = xhr.responseText;
				alert(msg);
				document.getElementById("username_msg").innerHTML=msg;
			}	
		};
		xhr.send(null);
	};
	
	

</script>
</html>