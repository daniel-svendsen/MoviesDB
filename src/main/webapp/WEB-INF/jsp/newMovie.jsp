<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>${appName} - New Movie</title>
</head>
<body>
    <h1>${appName}</h1>
    <h2>New Movie</h2>
    <form action="newMovie.html" method="post">
        <label for="title">Title:</label>
        <input type="text" id="title" name="title" required>
        <button type="submit">Save Movie</button>
    </form>
</body>
</html>
