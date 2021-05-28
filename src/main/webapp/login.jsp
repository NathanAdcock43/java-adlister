<%--
  Created by IntelliJ IDEA.
  User: nathanadcock
  Date: 5/27/21
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import = " java.util.* " %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="sign in form" action = "login.jsp" method="post">
    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <%= request.getParameter("username")%>
    <br>
    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <%= request.getParameter("password")%>
    <br>
    <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        System.out.println(("Name: " + username + " Password: " + password));
    %>
    <input type="submit" value="Submit Details">
    <c:choose>
        <c:when test="${ param.('username') == 'admin' && param.('password')== 'password'}">
        request.getRequestDispatcher("/profile.js").forward(request, response);
        </c:when>
        <c:otherwise>
            <p>Sorry you entry was invalid</p>
        </c:otherwise>
    </c:choose>
</form>
</body>
</html>
