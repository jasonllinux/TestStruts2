<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>All Users Jsp</title>
</head>
<body>
	<s:text name="find.allusers"></s:text>
	
	<ul>
		<li class="category"> <s:text name="UserName"></s:text> </li>
		<li class="category"> <s:text name="NickName"></s:text> </li>
		<li class="category"> <s:text name="Name"></s:text> </li>
		<li class="category"> <s:text name="look.details"></s:text> </li>
	</ul>
	
	<s:iterator value="list">
		<li><s:property value="username"/></li>
		<li><s:property value="nic"/></li>
		<li><s:property value="name"/></li>
		<li> <a href="<s:url action="selectinfo"/>"> <s:text name="look.detail"/> </a> 		</li>
	</s:iterator>
</body>
</html>