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
	int num = Integer.parseInt(request.getParameter("num"));
	
	int firstDigit = num;
    while (firstDigit >= 10) {
        firstDigit /= 10;
    }
    int lastDigit = num % 10;
    int sum= firstDigit+lastDigit;
	%>
	<p style="color: red;">Sum of First and Last Digits: <%= sum %></p>
</body>
</html>