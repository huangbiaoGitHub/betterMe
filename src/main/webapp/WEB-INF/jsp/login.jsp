<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<base href="<%=basePath %>">

<script type="text/javascript" src="./public/js/jquery-1.12.3.js"></script>
<script type="text/javascript" src="./public/js/wap.js"></script>
<script type="text/javascript" src="./public/js/public.js"></script>

<title>Login Page</title>
</head>
<body>
	<div class="main">
		<div class="warpper">
			<div class="inputDiv">
				<div class="loginDiv">
					<span class="titleSpan">login:</span> <input type="text" id="account" value="">
				</div>
				<div class="inputDiv">
					<div class="passwordDiv">
						<span class="titleSpan">password:</span> <input type="password"
							id="password" value="">
					</div>
				</div>
				<div class="buttonDiv">
					<button onclick="loginFun();">login</button>
					<button onclick="clearFun();">cancel</button>
				</div>
			</div>
		</div>
	</div>
</body>

<script type="text/javascript">
	$(function() {
		
	})
	
	function loginFun() {
		var url = "loginLogic";
		var obj = {};
		obj.account = $("#account").val();
		obj.passowrd = $("#password").val();
		
		ajaxPost(url, obj, redFun)
	}
	
	function clearFun() {
		$("#account").val("");
		$("#password").val("");
	}
</script>

</html>