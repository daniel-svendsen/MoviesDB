<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Number List</title>
</head>
<body style="font-family: 'Yu Gothic'">
<h1 style="color: blue; font-family: 'Ink Free'">Welcome to MovieDB</h1>
<strong>${dateAndTime}</strong>
<h3>See all...</h3>

<nav>
<ul style="font-size: large">
    <li><a href="website/movies/list.html">Movies</a>
    </li>
    <li><a href="website/actors/list.html">Actors</a>
    </li>
    <li><a href="website/directors/list.html">Directors</a>
    </li>
</ul>
</nav>

<h3>Create...</h3>
<ul style="font-size: large">
    <li><a href="website/movies/newMovie.html">New Movie</a>
    </li>
    <li><a href="website/actors/addActor.html">New Actor</a>
    </li>
    <li><a href="#">New Director</a>
    </li>
</ul>

</body>
</html>
