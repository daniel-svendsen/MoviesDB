<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <title>${appName} - All Directors</title>
</head>
<body>
<h2>All Directors</h2>
<ul>
    <c:forEach var="director" items="${directors}">
        <li>${director.name}</li>
    </c:forEach>
</ul>
<a href="newDirector.html">Add New Director</a>
</body>
</html>