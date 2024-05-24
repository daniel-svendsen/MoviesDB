<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>${appName} - Update Actor</title>
</head>
<body>
<h1>${appName}</h1>
<h2>Update Actor</h2>
<form action="updateActor/${form.id}" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" value="${form.name}" required>
    <button type="submit">Update Name</button>
</form>
</body>
</html>
