<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <c:choose>
        <c:when test="${sessionScope.user == null}">
            <jsp:include page="/WEB-INF/partials/navbar.jsp" />
        </c:when>
        <c:otherwise>
            <jsp:include page="/WEB-INF/partials/logged-in-navbar.jsp" />
        </c:otherwise>
    </c:choose>


    <div class="container">
        <h1>Welcome, ${sessionScope.user.username}!</h1>
    </div>
    <div class="container">
        <h2>Here are your active ads: </h2>

        <c:forEach var="ad" items="${userAds}">
            <div class="col-md-6">
                <h2><a href="/ads/view?id=${ad.id}">${ad.title}</a></h2>
                <p>${ad.description}</p>
            </div>
        </c:forEach>
    </div>
</body>
</html>
