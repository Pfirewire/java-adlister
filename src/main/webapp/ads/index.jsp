<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pfirewire
  Date: 9/7/22
  Time: 8:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="../partials/head.jsp">
      <jsp:param name="title" value="Ads Index Time!" />
    </jsp:include>
</head>
<body>
    <jsp:include page="../partials/navbar.jsp" />

    <h1>Herein Lies All the King's Ads:</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h3>${ad.title}</h3>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</body>
</html>
