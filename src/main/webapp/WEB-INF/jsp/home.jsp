<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>MovieDB - Welcome</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">
    <link rel="stylesheet" href="style.css">
    <style>
        :root {
            --background-color: #1a1a1a;
            --header-background-color: #333;
            --header-text-color: #fff;
            --main-text-color: #9fcaaa;
            --link-color: #e74c3c;
            --link-hover-color: #c0392b;
            --font-family-main: 'Arial', sans-serif;
            --font-family-header: 'Georgia', serif;
        }
        body {
            font-family: var(--font-family-main);
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            background-color: var(--background-color);
            color: var(--main-text-color);
        }
        header {
            background-color: var(--header-background-color);
            color: var(--header-text-color);
            padding: 1rem;
            width: 100%;
            text-align: center;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
        }
        h1 {
            font-family: var(--font-family-header);
            margin: 0.5rem 0;
        }
        main {
            width: 80%;
            max-width: 1200px;
            margin: 2rem 0;
            background-color: #222;
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
        }
        nav ul, ul {
            list-style-type: none;
            padding: 0;
        }
        nav ul li, ul li {
            margin: 1rem 0;
        }
        nav ul li a, ul li a {
            text-decoration: none;
            color: var(--link-color);
            font-size: 1.2rem;
            display: flex;
            align-items: center;
        }
        nav ul li a:hover, ul li a:hover {
            color: var(--link-hover-color);
        }
        .date-and-time {
            margin: 1rem 0;
            font-weight: bold;
            text-align: center;
        }
        .icon {
            margin-right: 0.5rem;
        }
        h3 {
            margin-top: 2rem;
            color: #ecf0f1;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to MovieDB</h1>
    </header>
    <main>
        <div class="date-and-time">${dateAndTime}</div>
        <h3>See all...</h3>
        <nav>
            <ul aria-label="See all">
                <li><a href="website/movies/list.html"><i class="fas fa-film icon"></i>Movies</a></li>
                <li><a href="website/actors/list.html"><i class="fas fa-user icon"></i>Actors</a></li>
                <li><a href="website/directors/list.html"><i class="fas fa-video icon"></i>Directors</a></li>
            </ul>
        </nav>

        <h3>Create...</h3>
        <ul aria-label="Create">
            <li><a href="website/movies/newMovie.html"><i class="fas fa-plus icon"></i>New Movie</a></li>
            <li><a href="website/actors/addActor.html"><i class="fas fa-plus icon"></i>New Actor</a></li>
            <li><a href="website/directors/newDirector.html"><i class="fas fa-plus icon"></i>New Director</a></li>
        </ul>
    </main>
</body>
</html>
