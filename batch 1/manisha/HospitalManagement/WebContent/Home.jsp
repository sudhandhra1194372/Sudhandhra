<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hospital Management</title>
<style>
body {
    background-image: url("Banner.jpg");
    background-repeat: no-repeat;
}
.button {
    background-color: #1E90FF;
    border: none;
    color: white;
    padding: 10px 12px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
</head>
<body>

<form action="Controller.java" method="post" onSubmit=return validate() >

<header><h1><center><b>Hospital Management</b></center></h1></header>
<center>
<table align="center">
<tr>
<td>
<font size="3" color="pink">User Name:</font></td>
<td>
<input type="text" name="username"  required/></td>
</tr>
<br>
<br>
<tr>
<td>
<font size="3" color="pink">Password:</font></td>
<td>
<input type="password" name="password" required /><br /></td></tr>
<br />
</table><br>





<input type="submit" value="Login" name="submit" >
<a href="Register.jsp" >SIGN UP</a>
<input type="hidden" value="home" name="action" >


<br>
<br />

</center>

</form>

</body>
</html>