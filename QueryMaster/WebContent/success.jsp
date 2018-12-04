<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="for" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<for:form action="update" modelAttribute="my" method="post">
<h1>Gear Technical Forum</h1><br>
<h2>Query Details</h2>
<a href="all">Home</a>
<table>
<tr>
<td><label>Query Id:</label><for:input path="query_id" value="${querydata.query_id}" readonly="readonly"/></td>
</tr>

<tr>
<td><label>Technology:</label><for:input path="technology" value="${querydata.technology}" readonly="readonly"/></td>
</tr>

<tr>
<td><label>Query:</label><for:input path="query" value="${querydata.query}" readonly="readonly"/></td>
</tr>

<tr>
<td><label>Query Raised By:</label><for:input path="query_raised_by" value="${querydata.query_raised_by}" readonly="readonly"/></td>
</tr>

<tr>
<td><label>Solution:</label><for:textarea path="solutions" required="required"></for:textarea>
</td>
<td><for:errors path="solutions"></for:errors></td>
</tr>

<tr>
<td><label>Answer Given By:</label>
   <for:select path="solutionGivenBy" items="${solutionGiven}"></for:select>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Update">
</td>
</tr>
</table>
</for:form>
</body>
</html>