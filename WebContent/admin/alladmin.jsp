<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
    
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">


<script type="text/javascript">
	function del() {
		if(!confirm("您确定要删除吗")) {
			return false;
		}
		var qx = ${qx};
		if(qx !=2) {
			alert("您的权限不够");
			return false;
		}
	}
	
	function update() {
		var qx = ${qx} ;
		if(qx != 2) {
			alert("您权限不够");
			return false;
		}
	}
</script>
<title>All Admin</title>
</head>
<body>
	<ul>
		<li class="category" align="center" > <s:text name="UserName"></s:text></li>
		<li class="category" align="center" > <s:text name="PassWord"></s:text></li>
		<li class="category" align="center" > <s:text name="Name"></s:text></li>
		<li class="category" align="center" > <s:text name="qx"></s:text></li>
		<li class="category" align="center" > <s:text name="Update"></s:text></li>
		<li class="category" align="center" > <s:text name="Delete"></s:text></li>
	</ul>
	
	<s:iterator value="list" >
		<ul onmouseover="this.className='highlight'" onmouseout="this.className=''">
			<li align="center"> <s:property value="username"/></li>
			<li align="center"> <s:property value="password"/></li>
			<li align="center"> <s:property value="name"/></li>
			<li align="center"> <s:property value="qx"/></li>
			<li align="center"> <s:a href="findadmin.action? id=${id} }" onclick="return update();">
			<s:text name="Update"></s:text> </s:a></li>
			<li align="center"> <s:a href="deleteadmin.action? id=${id} }" onclick="return del();">
			<s:text name="delete"></s:text> </s:a></li>
			
		</ul>
	</s:iterator>
	
</body>
</html>