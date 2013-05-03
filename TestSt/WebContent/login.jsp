<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %> 
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK" />
		<title> Login </title>
	</head>

	<body>
		<form action="login" method="post">
		<table>
			<caption>用户登陆</caption>
			<tr>
				<td>
					用户名: <input type="text" name="username" >
				</td>
			</tr>
			<tr>
				<td>
					密码: <input type="text" name="password">	
				</td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="登陆" />
					<input type="submit" value="reset"/>
				</td>
			</tr>
		</table>
		</form>	
	
	</body>


</html>