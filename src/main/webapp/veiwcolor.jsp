<%--
  Created by IntelliJ IDEA.
  User: nathanadcock
  Date: 6/1/21
  Time: 8:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Here is your color!</title>
    <style>
        body{
            background-color: $(ColorChoice);
        }
    </style>
</head>
<body>
<%= request.getParameter("ColorChoice")%>
</body>
</html>
