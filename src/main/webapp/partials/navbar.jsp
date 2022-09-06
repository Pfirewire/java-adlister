<%--
  Created by IntelliJ IDEA.
  User: pfirewire
  Date: 9/6/22
  Time: 8:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<nav class="navbar sticky-top navbar-dark bg-dark">
  <div class="container-fluid">
    <div class="d-flex justify-content-start">
      <a class="navbar-brand" href="#">Test Header</a>
      <a class="nav-item nav-link active mx-0" href="#">Admin Actions</a>
      <a class="nav-item nav-link mx-0" href="#">Lists and Stuff</a>
      <input class="nav-item ms-0" type="text" placeholder="Search for Things">
      <button type="button" class="nav-items btn btn-outline-primary ms-1">Do Some Actions</button>
    </div>
    <div class="d-flex justify-content-end">
      <div class="nav-item mx-2 pt-1" for="signup"><i class="bi bi-person-circle"></i></div>
      <input class="nav-item" id="signup" type="text" placeholder="More Admin Actions">
    </div>
  </div>
</nav>
