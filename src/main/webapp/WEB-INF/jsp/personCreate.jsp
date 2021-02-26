<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ page import="com.demo.Person"%>
<!DOCTYPE html>
<html>
<head>

<link ref="stylesheet"
	href="<%=request.getContextPath()%>/resources/css/main.css"
	type="text/css" />

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>

</head>
<body>

	<div id="main">
		<div class="newcontainer" id="person_intro">
			<form name="mainForm"
				action="<%=request.getContextPath()%>/person/save" method="post">
				輸入用戶id：<input type="text" id="personId" name="personId"><br>
				<input type="submit" value="提交">
			</form>
		</div>
	</div>

</body>
</html>