<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
table {
	text-align: center;
	border: 1px solid black;
}

th, td {
	padding: 10px;
}

input[type=submit] {
	background-color: #fff;
	border: none;
	color: #000;
	padding: 10px 16px;
	margin: 4px 2px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<h1>Hotel Booking Application</h1>
	<form >
		<table>
			<tr bgcolor="#B5CAF4">
				<th>Id</th>
				<th>Name</th>
				<th>Rating</th>
				<th>Rate</th>
				<th>AvailableRooms</th>
			</tr>
			<a:forEach var="hotel" items="${hotel}">
				<tr>
					<td>${hotel.id}</td>
					<td><a href="booking?name=${hotel.name }">${hotel.name }</a></td>
					<td>${hotel.rating}</td>
					<td>${hotel.rate}</td>
					<td>${hotel.availablerooms}</td>
				</tr>
			</a:forEach>
		</table>
	</form>
</body>
</html>