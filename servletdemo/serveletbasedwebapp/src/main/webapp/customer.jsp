<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="serveletbasedwebapp.model.Customer"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer JSP</title>
</head>
<body>
	<p>Customer JSP</p>
	<p>Add customer name</p>
	 <form action="/serveletbasedwebapp-0.0.1-SNAPSHOT/customer" method="post">
        <label for="customerId">Customer Id:</label>
        <input type="text" id="customerId" name="customerId" required><br>
		<label for="customerName">Customer Name:</label>
        <input type="text" id="customerName" name="customerName" required><br>
	
        <input type="submit" value="Submit">
    </form>
    <p>Customer added successfully details are :-  </p>
	<%
		Customer customer = (Customer)request.getAttribute("customer");%>
		<% if(customer != null){%>
			<%= customer%>
		<%}%>
		<% String message = (String )request.getAttribute("message");%>
		<% if(message != null){%>
				<%= message%>
		<%}%>
		
	
    
    
	
</body>
</html>