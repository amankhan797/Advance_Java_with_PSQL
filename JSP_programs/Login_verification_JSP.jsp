<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	//Original Username
	String name="Aman";
	int pass=1234;
	 
	String username = request.getParameter("username");
	int password = Integer.parseInt(request.getParameter("pass"));
	
	if(username.equals(name) && password==pass){
		response.sendRedirect("login.html");
	}else{
		response.sendRedirect("error.html");
	}
	%>
</body>
</html>