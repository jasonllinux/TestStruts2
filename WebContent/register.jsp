<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Register</title>
</head>
<body>

<center>
	<h3>
		<s:text name="UserRegister"></s:text>
	</h3>
	<s:form action="register" method="pose">
		<s:textfield name="username" key="UserName"></s:textfield>
		<s:password name="password" key="PassWord"></s:password>
		<s:textfield name="name" key="Name"></s:textfield>
		<s:textfield name="nic" key="NickName"></s:textfield>
		<s:textfield name="sex" key="Sex"></s:textfield>
		<s:textfield name="age" key="Age"></s:textfield>
		<s:textfield name="email" key="Email"></s:textfield>
		<s:textfield name="phone" key="Phone"></s:textfield>
		<s:textfield name="selfshow" key="brief.indroduction"></s:textfield>
		
		<s:submit key="Register"></s:submit>
	</s:form>
	
</center>
</body>
</html>