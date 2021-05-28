<%--
  Created by IntelliJ IDEA.
  User: nathanadcock
  Date: 5/28/21
  Time: 9:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Test JSP</title>
<%@ include file="partials/head.jsp"%>
</head>
<body>
<%@ include file="partials/TopBanner.jsp"%>
<div class="form-container">
    <form class="form-2">
        <div class="inner-form">
            <h3 class="form-titles">Search for a type of coffee</h3>
            <label for="roast-selection"></label>
            <select class="selector" id="roast-selection">
                <option>All</option>
                <option>light</option>
                <option>medium</option>
                <option>dark</option>
            </select>
            <input class="selector" id="searchBox" type="text" placeholder="Search">
            <input class="selector myButton" id="submit" type="submit"/>
        </div>
    </form>
    <hr>
    <form class="form-1">
        <h3 class="form-titles">Add your own coffee!</h3>
        <label for="input-roast"></label>
        <h3 class="sub-titles">Select a type of roast: </h3>
        <div class="inner-form">
            <select class="selector" id="input-roast">
                <option>light</option>
                <option>medium</option>
                <option>dark</option>
            </select>
        </div>
        <h3 class="sub-titles">Name your Java!</h3>
        <div class="inner-form">
            <input class="selector" id="input-name" type="text" placeholder="Coffee Name">
            <input class="selector myButton" id="input-submit" type="button" value="Add Coffee"/>
        </div>
    </form>
</div>
<div class="pic-block" id="pic-1">
</div>
</div>
<div class="sections">
    <div class="pic-block" id="pic-2">
    </div>
    <div class="form-container">
        <h3 class="form-titles">Your coffee list</h3>
        <div class="coffee-list">
            <div id="coffees"></div>
        </div>
    </div>
</div>
<footer class="banner-top" id="flip"></footer>
<script src="main.js"></script>
</body>
</html>
