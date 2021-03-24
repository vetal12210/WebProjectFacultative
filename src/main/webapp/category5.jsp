<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.02.2021
  Time: 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Computer architecture</title>
    <style>
        body {
            background:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNcJzQoEObwqEm8bT3R09Qb5flP7dBvj5K0Q&usqp=CAU");
        }
    </style>
</head>
<body>

<table align="center" border="3" width="800px" height="1000px">
    <tr>
        <td>1</td>
        <td bgcolor="#dc143c">Computer electronics</td>
        <td bgcolor="orange">25 lectures</td>
        <td bgcolor="lime">10 practices</td>
        <td bgcolor="#b22222">700$</td>
    </tr>

    <tr>
        <td>2</td>
        <td bgcolor="#9932cc">Computer periphery</td>
        <td bgcolor="#00ffff">20 lectures</td>
        <td bgcolor="#556b2f">5 practices</td>
        <td bgcolor="#7fff00">600$</td>
    </tr>

    <tr>
        <td>3</td>
        <td bgcolor="lime">Circuit design</td>
        <td bgcolor="#ff69b4">20 lectures</td>
        <td bgcolor="#faebd7">10 practices</td>
        <td bgcolor="#9932cc">700$</td>
    </tr>
</table>

<br/>
<br/>

<div align="center">
    <button><a href='<c:url value="/chooseSubjects"/>'><strong>choose</strong></a></button>
</div>

<br/>
<br/>

<div align="center">
    <button><a href='<c:url value="/userPages/main.jsp"/>'><strong>Back</strong></a></button>
</div>

</body>
</html>
