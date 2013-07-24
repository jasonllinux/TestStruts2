<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title> Admin</title>
</head>
<body>
	<s:text name="AdminLogin"></s:text>
	<s:property value="tip"/>
	
	<s:form action="adminLogin" method="post">
		<s:textfield name="username" key="UserName"></s:textfield>
		<s:password name="password" key="PassWord"></s:password>
		<s:submit key="Login"></s:submit>
	
	</s:form>

</body>
</html>