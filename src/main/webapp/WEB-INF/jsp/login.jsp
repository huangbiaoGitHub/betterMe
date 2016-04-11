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
					<button id="loginFun();">login</button>
					<button id="cancelFun();">cancel</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>