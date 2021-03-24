<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.02.2021
  Time: 8:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Computer programming</title>
    <style>
        body {
            background: url("https://www.pentasia.com/rails/active_storage/blobs/eyJfcmFpbHMiOnsibWVzc2FnZSI6IkJBaHBBaXhwIiwiZXhwIjpudWxsLCJwdXIiOiJibG9iX2lkIn19--9b531a296e23edbb0ae0d85e4160a44a71b44f8e/1662_original.jpg");
        }
    </style>
</head>
<body>

<table align="center" border="5px" width="1000px" height="1000px">
    <tr>
        <td>1</td>
        <td bgcolor="green">Java programming</td>
        <td bgcolor="#7fff00">30 lectures</td>
        <td bgcolor="#dc143c">10 practices</td>
        <td bgcolor="#fff8dc">800$</td>
    </tr>

    <tr>
        <td>2</td>
        <td bgcolor="#ff6347">C# programming</td>
        <td bgcolor="green">25 lectures</td>
        <td bgcolor="#7fff00">10 practices</td>
        <td bgcolor="#dc143c">750$</td>
    </tr>

    <tr>
        <td>3</td>
        <td bgcolor="#4b0082">Python programming</td>
        <td bgcolor="#f0ffff">20 lectures</td>
        <td bgcolor="#90ee90">6 practices</td>
        <td bgcolor="#00ff7f">600$</td>
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
