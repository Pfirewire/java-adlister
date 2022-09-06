<%--
  Created by IntelliJ IDEA.
  User: pfirewire
  Date: 9/6/22
  Time: 11:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
    <form action="guess" method="POST">
        <label for="userGuess">Guess a number from 1 to 3</label>
        <input id="userGuess" name="userGuess" type="text">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
