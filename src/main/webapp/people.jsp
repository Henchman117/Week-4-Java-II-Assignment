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
<form action="getPeopleServlet" method="post">
Enter how many people to split:
<input type="text" name="userPeople" size="10">
<input type="submit" value="Calculate Slices" />
</form>
<input type="button" value="Go back!" onclick="history.back()">
</body>
</html>