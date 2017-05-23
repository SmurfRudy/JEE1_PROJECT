<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>

<jsp:useBean id="myUser" scope="session" class="beans.UserBean"> 	
	<!-- INITIALISATION -->
	<jsp:setProperty name="myUser" property="name" value="none" />
	<jsp:setProperty name="myUser" property="surname" value="none" />
	<jsp:setProperty name="myUser" property="age" value="0" />
	<jsp:setProperty name="myUser" property="preference“ value="Prference Null" />
</jsp:useBean>

<jsp:setProperty name="myUser" property="name" /> <jsp:setProperty name="myUser" property="surname"/> <jsp:setProperty name="myUser" property="age"/>
</head>

<body>
<form action="register.jsp" method="post">
Put your name <input type="text" name="name" />
Put your surname <input type="text" name="surname" /> <input type="submit" value="GO!">
</form>
Current
Current
Current
Current
name <jsp:getProperty name="myUser" property="name"/> 
surname<jsp:getProperty name="myUser" property="surname"/> 
age<jsp:getProperty name="myUser" property="age"/> 
preference<jsp:getProperty name="myUser" property="preference"/>
</body>

</html>