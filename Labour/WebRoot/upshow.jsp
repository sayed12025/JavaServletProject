<%@ page language="java" import="java.util.*,CLS.User" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'upshow.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <p><% 
    User uj=new User();  
    uj=(User)request.getAttribute("tab"); 
    %></p>
    <form action='up2' method="post">
    Name :<input type="text" name="name" value="<%=uj.getName()%>"><br>
    <input type="hidden" name="id" value="<%=uj.getId()%>"><br>
    Pass :<input type="text" name="pass" value="<%=uj.getPass()%>"><br>
    Mobile :<input type="text" name="mob" value="<%=uj.getMob()%>"><br>
    Wage :<input type="text" name="wag" value="<%=uj.getW()%>"><br>
     <input type="submit" value="UPDATE">
     </form>
  </body>
</html>
