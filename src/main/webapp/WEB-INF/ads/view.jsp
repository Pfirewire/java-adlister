<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <jsp:include page="/WEB-INF/partials/head.jsp">
    <jsp:param name="title" value="${ad.title}" />
  </jsp:include>
</head>
<body>
<div class="container">
  <h1>${ad.title}</h1>
  <p>${ad.description}</p>
  <br>
  <h2>${user.username}</h2>
</div>
</body>
</html>
