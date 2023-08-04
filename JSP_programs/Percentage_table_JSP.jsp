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
	int rollno = Integer.parseInt(request.getParameter("rollno"));
	int sub1 = Integer.parseInt(request.getParameter("sub1"));
	int sub2 = Integer.parseInt(request.getParameter("sub2"));
	int sub3 = Integer.parseInt(request.getParameter("sub3"));
	int sub4 = Integer.parseInt(request.getParameter("sub4"));
	int sub5 = Integer.parseInt(request.getParameter("sub5"));
	double sum=sub1+sub2+sub3+sub4+sub5;
	double psg= (sum/500)*100;
	%>
	<table border="1">
    <tr>
        <th>Subject</th>
        <th>Marks</th>
    </tr>
    <tr>
        <td>Ruby</td>
        <td><%= sub1 %></td>
    </tr>
    <tr>
        <td>Rust</td>
        <td><%= sub2 %></td>
    </tr>
    <tr>
        <td>Java Script</td>
        <td><%= sub3 %></td>
    </tr>
    <tr>
        <td>React Native</td>
        <td><%= sub4 %></td>
    </tr>
    <tr>
        <td>Android</td>
        <td><%= sub5 %></td>
    </tr>
    <tr>
        <td>Percentage</td>
        <td><%= psg %></td>
    </tr>
</table>
</body>
</html>