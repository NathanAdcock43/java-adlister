<%--
  Created by IntelliJ IDEA.
  User: nathanadcock
  Date: 6/1/21
  Time: 8:46 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick a color</title>
</head>
<body>
<form name="ColorChoice" action = "pickcolor.jsp" method="post">
    <label for="ColorChoice">Choose a Color</label>
    <input id="ColorChoice" name="ColorChoice" type="text">
    <%= request.getParameter("ColorChoice")%>
    <br>
    <input type="submit" value="Submit Details">
</form>
</body>
</html>
