<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%> 
 <%@ page import="java.util.ArrayList"%>  
 <%@ page import="com.training.web.model.User"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name = (String)request.getAttribute("name"); %> <!-- Sriptlet -->
<h1>Hello <%=name %> From JSP!!</h1>

<% List<User> userList = (ArrayList<User>)request.getAttribute("users"); %>

<table>
    <tr>
    	<th>NAME</th>
    	<th>PASSWORD</th>
    	<th>EMAIL</th>
    </tr>
    <c:forEach items="${users}" var = "user"> 
    	<tr>
    		<td><c:out value="${user.getUserName()}"/></td>
    		<td><c:out value="${user.getPassword()}"/></td>
    		<td><c:out value="${user.getEmail()}"/></td>
    	</tr>
    </c:forEach>
    
    <!-- 
	
		for(User user: userList){%>
			<tr>
				<td> </td>
				<td>  </td>
				<td> </td>
		    </tr>		
	
	 -->
</table>

</body>
</html>
<!-- Implicit jsp objects -->
<!-- jstl JSP Tag library -->
