<%--
  Created by IntelliJ IDEA.
  User: pfirewire
  Date: 9/6/22
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>

    <form action="pickcolor" method="POST">
        <label for="color">Pick a Color: </label>
        <input id="color" name="color" type="text">
        <input type="submit" value="Submit">
    </form>
</body>
</html>
