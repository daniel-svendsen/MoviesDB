<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>${appName} - Update Movie</title>
</head>
<body>
    <h1>${appName}</h1>
    <h2>Update Movie</h2>
    <form action="updateMovie/${form.id}" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" value="${form.title}" required>
        <button type="submit">Update Movie</button>
    </form>
</body>
</html>
