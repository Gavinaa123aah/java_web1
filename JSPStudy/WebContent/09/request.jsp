<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
%>
<form action="" method="post">
	<input type="text" name="userName">
	<input type="submit" value="提交">
</form>

请求的方法名：<%= request.getMethod() %><br/>
请求的资源：<%= request.getRequestURI() %><br/>
请求的协议：<%= request.getProtocol() %><br/>
请求的服务器的名称：<%= request.getServerName() %><br/>
表单数据：<%= request.getParameter("userName") %>
</body>
</html>