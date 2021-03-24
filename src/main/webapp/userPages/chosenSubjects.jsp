<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 20.02.2021
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Choose subjects</title>
    <style>
        body {
            background: url("https://static9.depositphotos.com/1559686/1228/i/600/depositphotos_12286955-stock-photo-technology-in-the-hands.jpg");
        }

        .fig {
            text-align: center;
        }

        .form-group {
            padding: 5px;
        }

        .form-group label {
            width: 105px;
            display: inline-block;
        }

        .form-group input {
            width: 165px;
            padding: 5px;
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

<h1 align="center"><b>Choosing subjects</b></h1>
<br/>
<br/>

<form method="post" align="center" autocomplete="off">
    <div class="form-group">
        <label>The name of choosing subject</label>
        <input name="name" list="subjects" required/>
        <datalist id="subjects">
            <option value="Java programming">
            <option value="C# programming">
            <option value="Python programming">
            <option value="Fundamentals of robotics">
            <option value="Computer-aided design system">
            <option value="Radioelectronics and microcontrollers">
            <option value="Cryptography">
            <option value="Cryptology">
            <option value="Network protection">
            <option value="HTML + CSS">
        </datalist>

        <br/>
        <br/>

        <label>The name of choosing category</label>
        <input name="categories_id" list="categories" required/>
        <datalist id="categories">
            <option value=1>
            <option value=2>
            <option value=3>
            <option value=4>
            <option value=5>
        </datalist>
    </div>
    <br/>
    <br/>


    <p class="fig">
        <img src="https://procurement-academy.com/wp-content/uploads/2020/08/category.jpg"
             height="200px" width="250px" border="2px" alt=""/>
    </p>
    <br/>
    <br/>

    <input type="submit" value="choose"/>

</form>

<br/>
<br/>

<div id="myButton2" align="center">
    <button><a href='<c:url value="/userPages/subjectIndex.jsp"/>'><strong>Back</strong></a></button>
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



