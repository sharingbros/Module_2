<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="for" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="success" method="get">
		<h3>Gear Technical Forum</h3>
		<h4>Answer the query</h4>
		<table>
			<tr>
				<td><a href="all">Home</a></td>
			</tr>
			<tr>
				<td><label>Query Id:</label><input type="text" name="id"
					value="${data.query_Id}" readonly="readonly" /></td>
			</tr>
			<tr>
				<td><label>Select Technology:</label></td>
				<td><input type="text" name="technology"
					value="${data.technology}" readonly="readonly" /></td>
			</tr>
			<tr>
				<td><label>Question:</label></td>
				<td><input type="text" name="Question" value="${data.query}"
					readonly="readonly" /></td>
			</tr>
			<tr>
				<td><label>Question Raised By:</label></td>
				<td><input type="text" name="raisedBy"
					value="${data.query_Raised_By}" readonly="readonly" /></td>
			</tr>
			<tr>
				<td><label>Solution:</label></td>
				<td><textarea name="solution"></textarea></td>
			</tr>
			<tr>
				<td><label>Answered by:</label></td>
				
				<td><select name="name">
						<option>Uma</option>
						<option>Rahul</option>
						<option>Kavitha</option>
						<option>Hema</option>
				</select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Query"></td>
			</tr>
		</table>
	</form>
</body>
</html>