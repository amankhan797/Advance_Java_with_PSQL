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
		int sum=0;
		for(int i=1; i<num; i++){
			if(num%i==0){
				sum=sum+i;
			}
		}
		if(sum==num){
			out.print("Number is perfect");
		}else{
			out.print("Number is not perfect");
		}
	%>
</body>
</html>