<%--
  Created by IntelliJ IDEA.
  User: pfirewire
  Date: 9/6/22
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>

    <form action="pizza-order" METHOD="POST" id="pizza-form">
        <label for="crust-type">Choose your Crust: </label>
        <select id="crust-type" name="crust-type">
            <option value="thin">Thin</option>
            <option value="hand-tossed">Hand Tossed</option>
            <option value="pan">Pan</option>
            <option value="stuffed">Stuffed</option>
        </select>
        <br>
        <label for="sauce-type">Choose your Sauce: </label>
        <select id="sauce-type" name="sauce-type">
            <option value="regular">Regular</option>
            <option value="ranch">Ranch</option>
            <option value="bbq">BBQ</option>
            <option value="alfredo">Alfredo</option>
        </select>
        <br>
        <label for="size">Choose your Size: </label>
        <select id="size" name="size">
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
            <option value="xl">Extra Large</option>
        </select>
        <br>
        <h4>Toppings:</h4>
        <input type="checkbox" id="topping1" name="topping1" value="sausage">
        <label for="topping1">Sausage</label><br>
        <input type="checkbox" id="topping2" name="topping2" value="pepperoni">
        <label for="topping2">Pepperoni</label><br>
        <input type="checkbox" id="topping3" name="topping3" value="bacon">
        <label for="topping3">Bacon</label><br>
        <input type="checkbox" id="topping4" name="topping4" value="pepper">
        <label for="topping4">Green Pepper</label><br>
        <input type="checkbox" id="topping5" name="topping5" value="onion">
        <label for="topping5">Red Onion</label><br>
        <label for="address">Enter your Address: </label>
        <input id="address" name="address" type="text"><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
