<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to The Pizza Divider</title>
</head>
<body>
<h1>Pizza Divider</h1>

<form action="getPizzaServlet" method="post">
Enter how many slices you have:
<input type="text" name="userPizza" size="10">
<input type="submit" value="Calculate Slices" />
</form>

<form action="getMadLibServlet" method="post">
Enter a name:
<input type="text" name="userName" size="10">
<input type="submit" value="Enter MadLib" /> <br>
<input type="button" value="Go Back" onclick="history.back()">
</form>

</body>
</html>