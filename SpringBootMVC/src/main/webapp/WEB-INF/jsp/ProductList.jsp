<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ include file = "header.jsp" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Product Id</th>
<th>Product CompanyName</th>
<th>Product Name</th>
<th>Product Quantity</th>
<th>Product Price(per item)</th>

</tr>
<a:forEach items="${emps}" var="t">
<tr>
<td>${t.id}</td>
<td>${t.companyname}</td>
<td>${t.name}</td>
<td>${t.quantity}</td>
<td>${t.price}</td>
<td><a href="invoice">Add To Cart</a></td>
</tr>
</a:forEach>
</table>
</body>
</html>