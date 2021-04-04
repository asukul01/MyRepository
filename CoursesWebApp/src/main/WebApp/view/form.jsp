<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customers</title>
</head>
<body>
	<form action="details" method="post">
		<table>
			<tbody>
				<tr>
					<td>Customer Id</td>
					<td>:</td>
					<td><input type="text" name="custId"></td>
				</tr>
				<tr>
					<td>Customer name</td>
					<td>:</td>
					<td><input type="text" name="custName"></td>
				</tr>
				<tr>
					<td>Customer Email</td>
					<td>:</td>
					<td><input type="text" name="custEmail"></td>
				</tr>
			</tbody>
		</table>
		<input type="submit"></br>
	</form>
</body>
</html>