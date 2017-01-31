<%@ page language="java" import="java.util.*,CLS.User" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'ict.jsp' starting page</title>
    
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
    <p align="left"><u><b>YOUR INFORMATION</b></u></p>;
   <p><% 
    User uj=new User();  
    uj=(User)request.getAttribute("tab"); 
    %></p>
    <form action="Up" method="post">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Name : <input type="text" name="name" value="<%=uj.getName()%>">&nbsp; <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			ID&nbsp;&nbsp; : <input type="text" name="id" value="<%=uj.getId()%>">
			<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; Pass&nbsp;&nbsp;&nbsp; :  <input type="text" name="pass" value="<%=uj.getPass()%>"><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; MOBILE&nbsp;&nbsp;&nbsp; :<input type="text" name="mob" value="<%=uj.getMob()%>"><br>
			  <input type="submit" value="UPDATE YOUR INFORMATION">
   
     </form>
   
  </body>
</html>
