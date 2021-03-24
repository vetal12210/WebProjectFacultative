<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 13.02.2021
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Page not found</title>
    <style>
        body {
            background-color: chocolate;
        }

        .fig {
            text-align: center;
        }
    </style>
</head>
<body>
<h2 align="center">Page not found</h2>

<p class="fig">
    <img src="https://img3.goodfon.ru/wallpaper/nbig/8/ef/404-not-found-error-404.jpg"
         height="800px" width="900px" border="2px" alt=""/>
</p>

<br/>
<br/>

<div align="center">
    <button><a href='<c:url value="/"/>'><strong>Back</strong></a></button>
</div>

</body>
</html>
