<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
        <title>${appName} - New Director</title>
</head>
<body>
    <h1>${appName}</h1>
    <h2>New Director</h2>
    <form action="newDirector.html" method="post">
        <label for="name">Name: </label>
        <input type="text" id="name" name="name" required>
        <button type="submit">Save Director</button>
    </form>
</body>
</html>