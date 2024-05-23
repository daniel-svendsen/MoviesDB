<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>All Movies</title>
</head>
<body>
    <h2>All Movies</h2>
    <ul>
        <c:forEach var="movie" items="${movies}">
            <li>${movie.title}</li>
        </c:forEach>
    </ul>
    <a href="newMovie.html">Add New Movie</a>
</body>
</html>