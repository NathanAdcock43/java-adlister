<%--
  Created by IntelliJ IDEA.
  User: nathanadcock
  Date: 5/27/21
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import = " java.util.* " %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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

</form>
</body>
</html>
