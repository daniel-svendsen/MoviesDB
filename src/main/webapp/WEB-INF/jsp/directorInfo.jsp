<!DOCTYPE html>
<html>
<head>
    <title>${appName} - Director Info</title>
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
    <h1>${appName}</h1>
    <h2>Director Info</h2>
    <p>Name: ${director.name}</p>
    <br>
    <a href="/home.html" class="back-button"><i class="fas fa-arrow-left icon"></i>Back to Home</a>
</body>
</html>
