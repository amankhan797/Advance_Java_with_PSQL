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
	String username = request.getParameter("username");
	LocalTime obj=LocalTime.now();
	if(obj.getHour() < 12 && obj.getHour() > 1){
		out.print("Good morning "+username);
	}else if(obj.getHour() < 16 && obj.getHour() > 12){
		out.print("Good Afternoon "+username);
	}else if(obj.getHour() < 20 && obj.getHour() > 16){
		out.print("Good Evening "+username);
	}else{
		out.print("Good night "+username);
	}
	%>
</body>
</html>