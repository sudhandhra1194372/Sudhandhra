<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>
<%@ page isErrorPage="true" %>  
 <html>
 <body>
<h3>Sorry an exception occured!</h3>  
  
Exception is: <%= exception %>  
<c:set var="salary" scope="session" value="${2000*2}"/>
<c:out value="${salary}"/>

</body>
</html>
</body>
</html>