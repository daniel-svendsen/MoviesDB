<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>${appName} - Update Director</title>
</head>
<body>
<h1>${appName}</h1>
<h2>Update Director</h2>
<form action="updateDirector/${form.id}" method="post">
    <label for="name">Director:</label>
    <input type="text" id="name" name="name" value="${form.name}" required>
    <button type="submit">Update Director</button>
</form>
</body>
</html>
