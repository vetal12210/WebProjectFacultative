<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.02.2021
  Time: 8:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cybersecurity</title>
    <style>
        body {
            background:url("https://www.lockheedmartin.com/content/dam/lockheed-martin/rms/photo/cyber/Cyber-Kill-Chain.jpg");
        }
    </style>
</head>
<body>

<table align="center" border="5px" width="1000px" height="1000px">
    <tr>
        <td>1</td>
        <td bgcolor="#7cfc00">Cryptography and steganography</td>
        <td bgcolor="#d2691e">25 lectures</td>
        <td bgcolor="#7fff00">10 practices</td>
        <td bgcolor="#b8860b">800$</td>
    </tr>

    <tr>
        <td>2</td>
        <td bgcolor="#ff1493">Cryptology</td>
        <td bgcolor="#b22222">15 lectures</td>
        <td bgcolor="#ff69b4">5 practices</td>
        <td bgcolor="#f0e68c">500$</td>
    </tr>

    <tr>
        <td>3</td>
        <td bgcolor="#b8860b">Network protection</td>
        <td bgcolor="#a0522d">20 lectures</td>
        <td bgcolor="#2f4f4f">7 practices</td>
        <td bgcolor="orange">680$</td>
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
