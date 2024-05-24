<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>All Actors</title>
</head>
<body>
<h1>Actors</h1>
<ul>
    <c:forEach var="actor" items="${actors}">
        <li>${actor.name} - Age: ${actor.age != null ? actor.age : 'unknown'}</li>
    </c:forEach>
</ul>

<a href="/home.html">Go home</a>
</body>
</html>
