<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
</head>
<body>
<p>The world famous chef ${userPizzaBox.getChefName()} made this pizza <br />
</p>

<input type="button" value="Go back!" onclick="history.back()">

</body>
</html>