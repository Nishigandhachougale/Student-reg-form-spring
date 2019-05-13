<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2 align="center">STUDENT REGISTRATION FORM</h2>
<form action="addStudent">
<h3 align="center">
Student ID:      <input type="text" name="id"><br>
Student Name:    <input type="text" name="name"><br>
Student Age:     <input type="text" name="age"><br>
Student Address: <input type="text" name="address"><br>
Technology:      <input type="text" name="tech"><br>
          <input type="submit"><br>
</h3>
</form>


<form action="getStudent">
<h3 align="center">
Search By ID:<input type="text" name="id"><br>
<input type="submit">
</h3>
</form>


<form action="delStudent">
<h3 align="center">
Delete By ID:<input type="text" name="id"><br>
<input type="submit">
</h3>
</form>

</body>
</html>