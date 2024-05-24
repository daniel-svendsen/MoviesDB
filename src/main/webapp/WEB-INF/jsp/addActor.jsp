<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>${appName} - New Actor</title>
</head>
<body>
<h1>${appName}</h1>
<h2>Add New Actor</h2>
<form action="/website/actors/addActor.html" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required><br>
    <label for="age">Age:</label>
    <input type="number" id="age" name="age" min="1"><br>
    <button type="submit">Save Actor</button>
</form>
<br>
<a href="/home.html">Go home</a>
</body>
</html>
