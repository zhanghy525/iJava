<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/register.do" method="post">
		用户姓名:<input type="text" name="username" />
		<br/>
		密码:<input type="password" name="password" />
		<br/>
		性别:<input type="radio" name="gender" value="1" />男
		<input type="radio" name="gender" value="2" />女
		<br/>
		生日:
		<select name="birthday">
			<option value="1990-01-01">1990-01-01</option>
			<option value="1990-01-02">1990-01-02</option>
			<option value="1990-01-03">1990-01-03</option>
		</select>
		<br/>爱好:
		<input type="checkbox" name="hobby" value="1" />游泳
		<input type="checkbox" name="hobby" value="2" />泡吧
		<input type="checkbox" name="hobby" value="3" />篮球
		<input type="checkbox" name="hobby" value="4" />足球
		<br />
		<input type="submit" value="提交" />
	</form>
</body>
</html>