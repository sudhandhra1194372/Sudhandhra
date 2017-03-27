<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
.button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="bform" action="Controller" method="post"  >
<header><h1><center><b>Registration</b></center></h1></header>
<table align="center">

<tr>
<td>
Name:</td>
<td>
<input type="text" name="name" ><br><br></td>
</tr>
<tr>
<td>
Age: </td>
<td>
<input type="text" name="age" ><br><br></td>
</tr>
<tr>
<td>
Gender:<br></td>
<td>
<input type="radio" name="gender" value="male" checked> Male<br>
<input type="radio" name="gender" value="female"> Female<br>
<input type="radio" name="gender" value="other"> Other  <br><br>
</td>
</tr>
<tr>
<td>
Marital Status:</td>
<td><select name="marital_status">
<option value="select" selected>choose the status</option>
  <option value="Married">Married</option>
  <option value="UnMaried">UnMarried</option>
  <option value="Student">Student</option>
  </select></td>
  </tr>
  <tr>
  <td>
Phone No:</td>
<td>
<input type="text" name="phone_number" ></td>
</tr>
<tr>
<td>
Disease Type:<br></td>
<td>

<input type="checkbox" name="disease_type" value="Fever">Fever<br>
<input type="checkbox" name="disease_type" value="Cold">Cold<br>
<input type="checkbox" name="disease_type" value="Bp">Bp<br>
<input type="checkbox" name="disease_type" value="Sugar">Sugar<br>
<input type="checkbox" name="disease_type" value="Others"> Others<br></td>
</tr>
</table>
<input type="submit" class="button" value="Submit"  />
<input type="hidden" value="create" name="action" />
</form>
</body>
</html>