<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>Select User Info</title>
</head>
<body>


	<s:text name="show.info"></s:text>
	<s:form action="update" method="post">

		<s:textfield name="username" key="UserName" <s:property  value="${user.username} }"/> readonly="true"  />
		<s:textfield name="password" key="PassWord"   />
		<s:textfield name="nic" key="NicName"  />
		<s:textfield name="sex" key="Sex" />
		<s:textfield name="age" key="Age" />
		<s:textfield name="email" key="Email" />
		<s:textfield name="phone" key="Phonce" />
		<s:textarea name="selfshow" key="brief.introduction" />
		<s:hidden name="id" key="UserName" />
		
		<s:submit key="Update"></s:submit>
		-->
		
	</s:form>
</body>
</html>