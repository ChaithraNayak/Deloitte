<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>


<html>
<head>
<title>Customer Form</title>
<body bgcolor="black" text="lime">
	

	<hr color="red" />
	<f:form action="searchCustomerById.do" >
		<table cellspacing="10" cellpadding="10" align="center">
			<tr>
				<td>customerID</td>
				<td><f:input type="text" path="customerId" id="customerId" name="customerId"></f:input></td>
				
			<tr>
			<tr>
				<td><input type="submit" value="search"></td>
				<td><input type="reset" value="clear"></td>
			</tr>
			<tr>
				<td>customer Name</td>
				<td><f:input type="text" path="customerName" id="customerName" name="customerName"></f:input></td>
			</tr>
			<tr>
				<td>customer Address</td>
				<td><f:input type="text" path="customerAddress" id="customerAddress" name="customerAddress"></f:input></td>
			</tr>
			
			<tr>
				<td>Bill amount</td>
				<td><f:input type="text" path="billAmount" id="billAmount" name="billAmount"></f:input></td>
			</tr>
			
			<tr>
				<td><input type="submit"></td>
				<td><input type="reset"></td>
			</tr>
		</table>
	</f:form>


	</map>
</body>
</head>
</html>