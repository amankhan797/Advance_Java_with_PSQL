<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalTime" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	int num = Integer.parseInt(request.getParameter("num"));
	int sum=0;
	for(int i=1; i<=num; i++){
		sum+=i;
	}
	%>
	<p style="color: rgb(115, 255, 0);">Sum of Digits: <%= sum %></p>
</body>
</html>