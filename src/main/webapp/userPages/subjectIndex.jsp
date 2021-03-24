<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 23.03.2021
  Time: 0:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Subjects</title>
    <style>
        body {
            background-color: tomato;
        }

        p.fug {
            text-align: center;
        }

        #myButton2 button {
            align-content: center;
            margin-bottom: 100px;
            border-radius: 5px;
            background-color: orangered;
        }

        /*Selection footer*/
        footer {
            color: #000000;
            border-top: 2px solid silver;
            margin-top: 5px;
            padding: 1%;
            padding-bottom: 1%;
            align: center;
        }

        footer img {
            width: 30px;
            height: 30px;
            margin-right: 5px;
            transition: all 1s ease-out;
        }

        footer img:hover {
            width: 40px;
            height: 40px;
        }

    </style>
</head>

<body>

<h2 align="center">Subjects List</h2>
<p class="fug">
    <img src="https://www.how-to-study.com/images/study-skills-assessments.jpg"
         height="300px" width="500px" border="2px" alt=""/>
</p>
<br/>
<br/>
<table>
    <tr>
        <th>name</th>
        <th>categories_id</th>
        <th></th>
    </tr>
    <c:forEach var="subject" items="${subjects}">
        <tr>
            <td>${subject.sname}</td>
            <td>${subject.categories_id}</td>
            <td>
                <a href='<c:url value="/editSubject?id=${subject.id}" />'>Edit</a>
                <form method="post" action='<c:url value="/deleteSubject" />' style="display:inline;">
                    <input type="hidden" name="id" value="${subject.id}">
                    <input type="submit" value="Delete">
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

<br/>
<br/>
<br/>

<div id="myButton2" align="center">
    <button><a href='<c:url value="/"/>'><strong>Back</strong></a></button>
</div>

<br/>
<br/>

<footer>
    <div align="center">
        <span align="center"><strong>Все права защищены &copy; 2021</strong></span>
        <span class="right">
    <a><img src="https://pngicon.ru/file/uploads/instagram.png" alt="Instagram" title="Instagram"></a>
    <a><img src="https://pngicon.ru/file/uploads/telegram.png" alt="Telegram" title="Telegram"></a>
    <a><img src="https://img1.freepng.ru/20180330/kee/kisspng-gmail-computer-icons-logo-email-gmail-5abe0b09687ec1.346349251522404105428.jpg"
            alt="Gmail" title="Gmail"></a>
</span>
    </div>
</footer>

</body>
</html>
