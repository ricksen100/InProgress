<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
<th>Product CompanyName</th>
<th>Product Name</th>
<th>Product Quantity</th>
<th>Product Price(per item)</th>
<th>Product Discount</th>
<th>Total Price</th>
</tr>
<a:forEach items="${emps}" var="t">
<tr>
<td>${t.companyname}</td>
<td>${t.name}</td>
<td>${t.quantity}</td>
<td>${t.price}</td>
<td>${t.discount}</td>
<td>${t.totalprice}</td>
</tr>
</a:forEach>
<form>
<input type="button" id ="btnPayment" value = "Make Payment">
</form>
</table>
</body>
</html>