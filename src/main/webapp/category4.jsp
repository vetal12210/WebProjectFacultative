<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.02.2021
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Web design</title>
    <style>
        body {
            background:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQTOv9OdPMO3Wht6jRWgLb9LpCzXeLBj8imyw&usqp=CAU");
        }
    </style>
</head>
<body>

<table align="center" border="5px" width="1000px" height="1000px">
    <tr>
        <td>1</td>
        <td bgcolor="#483d8b">HTML + CSS</td>
        <td bgcolor="orange">25 lectures</td>
        <td bgcolor="#b22222">10 practices</td>
        <td bgcolor="#a52a2a">700$</td>
    </tr>

    <tr>
        <td>2</td>
        <td bgcolor="#dc143c">JS with ReactJS</td>
        <td bgcolor="#d2691e">20 lectures</td>
        <td bgcolor="#8a2be2">5 practices</td>
        <td bgcolor="#dc143c">680$</td>
    </tr>

    <tr>
        <td>3</td>
        <td bgcolor="#cd853f">Polygraphy</td>
        <td bgcolor="#556b2f">30 lectures</td>
        <td bgcolor="#00ffff">10 practices</td>
        <td bgcolor="#4b0082">800$</td>
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
