<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 23.03.2021
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>User page</title>

    <style>

        body {
            background: url("https://regionorel.ru/upload/iblock/521/5211f6e7c6613cc4628c7d056713cb68.jpg");
        }

        .fig {
            text-align: center;
        }

        .myButton {
            position: absolute;
            top: 20px;
            right: 15px;
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
<h1 align="center"><font size="10" color="red" face="Arial"><strong>The choice is made</strong></font></h1>
<br/>
<div class="myButton">
    <p><a href='<c:url value="/"/>'><strong>Logout</strong></a></p>
</div>
<br/>
<br/>

<p class="fig">
    <img src="https://lh3.googleusercontent.com/proxy/m8t3KbtiRaimw2YWnVEIa0q6mjPemnOa176OQb57Icfcg3JTry8tUXOf2SVbaa95On1Z1i-Sq1DbhLHagYTpCkLc_AEzjQh-EDQqAgdVQ3Qy0IakAYEneA1CHOg"
         height="400px" width="500px" border="2px" alt=""/>
</p>

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
