<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title>${appName} - Actor Info</title>
        
    </head>

    <body>
        <h1>${appName}</h1>
        <h2>Actor Info</h2>
        <p>Name: ${actor.name}</p>
        <br>
        <p>Age: ${actor.age}</p>
        <a href="/website/home.html" class="back-button"><i class="fas fa-arrow-left icon"></i>Back to Home</a>
    </body>

    </html>
    