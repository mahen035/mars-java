<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>PRODUCT DETAILS!</h2>
<table>
    <tr>
    	<th>Product ID</th>
    	<th>Product Name</th>
    	<th>Quantity</th>
    	<th>Category</th>
    	<th>Description</th>
    	<th>Price</th>
    </tr>
    <c:forEach items="${productDetail}" var = "prod"> 
    	<tr>
    		<td><c:out value="${prod.getProdId()}"/></td>
    		<td><c:out value="${prod.getProdName()}"/></td>
    		<td><c:out value="${prod.getQuantity()}"/></td>
    		<td><c:out value="${prod.getProdCategory()}"/></td>
    		<td><c:out value="${prod.getProdDesc()}"/></td>
    		<td><c:out value="${prod.getPrice()}"/></td>
    	</tr>
    </c:forEach>

</table>
</body>
</html>