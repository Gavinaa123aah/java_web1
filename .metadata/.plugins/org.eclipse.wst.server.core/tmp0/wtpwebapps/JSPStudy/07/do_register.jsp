<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注冊信息處理</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");
%>
<%

String username = request.getParameter("username");
String password = request.getParameter("password");

out.print(username);
out.print("<br/>");
out.print(password);
%>
<jsp:useBean id="user" class="com.jikexuyuan.entity.UserEntity"></jsp:useBean>
<jsp:setProperty property="username" name="user"/>
<jsp:setProperty property="password" name="user"/>
<jsp:getProperty property="username" name="user"/>
<jsp:getProperty property="password" name="user"/>
</body>
</html>