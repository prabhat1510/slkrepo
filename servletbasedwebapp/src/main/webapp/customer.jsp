<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="servletbasedwebapp.entities.Customer"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer JSP</title>
</head>
<body>
	<p>Customer JSP</p>
	<p>Add customer name</p>
	 <form action="/servletbasedwebapp-0.0.1-SNAPSHOT/customer" method="post">
        <label for="customerName">Customer Name:</label>
        <input type="text" id="customerName" name="customerName" required><br>
        
        <input type="submit" value="Submit">
    </form>
    <p>Customer added successfully details are :-  </p>
	<%
		Customer customer = (Customer)request.getAttribute("customer");
	%>
    <%= customer%>
	
</body>
</html>