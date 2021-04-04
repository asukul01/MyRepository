<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Details</title>
</head>
<body>
	<h1>Customer details are as follows</h1>
	<table>
		<tbody>
			<tr>
				<td>Customer Id</td>
				<td>:</td>
				<td>${custId}</td>
			</tr>
			<tr>
				<td>Customer name</td>
				<td>:</td>
				<td>${custName}</td>
			</tr>
			<tr>
				<td>Customer Email</td>
				<td>:</td>
				<td>${custEmail}</td>
			</tr>
		</tbody>
	</table>
</body>
</html>