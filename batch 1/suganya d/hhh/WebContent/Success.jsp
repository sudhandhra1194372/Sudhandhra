<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.util.*, com.service.Service,com.beans.Hospital_Beans"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<%
Service s=new Service();

String uname=(String)request.getAttribute("user_name");
ArrayList<Hospital_Beans> alist=s.serviceSuccess(uname);%>
<c:if test="${alist.size()>0}">  


<table border="1">
<tr>
	<th>Registration Id:</th>
	<th>Name:</th>
	<th>Age:</th>
	<th>Gender:</th>
	<th>Marital Status:</th>
	<th>Phone No:</th>
	<th>Disease Type:</th>
	
<tr>

<c:forEach var="loop" items="${alist}">    
	<tr>
		<td><c:out value="${loop.getReference_id() }"/></td>
		<td><c:out value="${loop.getName()}"/></td>
		<td><c:out value="${loop.getAge()}"/></td>
		<td><c:out value="${loop.getGender()}"/></td>
		<td><c:out value="${loop.getMarital_status() }"/></td>
		<td><c:out value="${loop. getPhone_number()}"/></td>
		<td><c:out value="${loop.getDisease_type()}"/></td>
		
	</td>
</c:forEach> 

</table>
</c:if> 

You have successfully registered

</body>
</html>