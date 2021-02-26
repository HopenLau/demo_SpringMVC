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

	<h1>上傳附件</h1>
	<form method="post" action="doUpload" enctype="multipart/form-data">
		<input type="file" name="file" /><br>
		<input type="submit" value="上傳" />
	</form>

</body>
</html>