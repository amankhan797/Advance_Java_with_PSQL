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
	int flag=0;
	for(int i=2; i<=num; i++){
		if(num%i==0){
			out.print("Number is not prime");
			flag=1;
			break;
		}
		if(flag==0){
			out.print("Number is prime");
			break;
		}	
	}
	%>
</body>
</html>