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
	String Name = request.getParameter("name");
	int Age = Integer.parseInt(request.getParameter("age"));
	
	if(Age>=18 && Age<130){
		out.print("Hello "+Name+", you are eligible for Vote !!");
	}
	else if(Age<=18 && Age>=1){
		out.print("Hello "+Name+", you are not eligible for Vote.");
	}
	else{
		out.print("Hello "+Name+", Enter valid Age.");
	}
	%>
</body>
</html>