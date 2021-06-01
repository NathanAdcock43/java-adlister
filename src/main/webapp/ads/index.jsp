<%--
  Created by IntelliJ IDEA.
  User: nathanadcock
  Date: 6/1/21
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ads</title>
</head>
<body>
<h1>Ads list</h1>
<c:forEach var="Ad" items="${Ads}">
    <div class="Ads">
        <h2>${Ad.title}</h2>
        <p>Description: ${Ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
