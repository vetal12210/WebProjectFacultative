<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.02.2021
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Authorization Page</title>
    <link rel="stylesheet" href="style1.css" type="text/css">
    <style>
        .fig {
            text-align: center;
        }

        #new p {
            background: -moz-linear-gradient(#00BBD6, #EBFFFF);
            padding: 3px 7px;
            color: #008000;
            border-radius: 5px;
            border: 1px solid #666;
        }

        body {
            background: url("https://static-cse.canva.com/blob/194906/Swirling-Stars-and-Space-Video-Zoom-Virtual-Background-1.jpg");
            font-family: sans-serif;
            font-size: 13px;
        }

        h1 {
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

        /*Selection footer*/
        footer {
            color: white;
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
<h1 align="center"><font size="10" color="#483d8b" face="Arial">IT-school<b>
    <ins>HiTech</ins>
</b>welcomes you!</font></h1>

<br/>

<h2 align="center">Verify user</h2>
<br/>
<br/>

<form method="post" align="center" autocomplete="off">
    <div class="form-group">
        <label><b>Your login:</b></label>
        <input name="login" pattern="[a-zA-Z0-9]{5,10}" type="login" placeholder="Enter your login" required/>
    </div>
    <div class="form-group">
        <label for="password"><b>Your password:</b></label>
        <input name="password" pattern="[a-zA-Z0-9]{7}" id="password" type="password" placeholder="Enter your password" required/>
    </div>
    <div class="form-group">
        <a href="#" id="s-h-pass">Show pass</a>
    </div>
    <br/>
    <br/>
    <br/>
    <br/>

    <p class="fig">
        <img src="https://betanews.com/wp-content/uploads/2015/09/identity-verification-600x400.jpg"
             height="200px" width="250px" border="2px" alt=""/>
    </p>
    <br/>
    <br/>
    <input type="submit" value="Input" align="center">
</form>


<br/>
<br/>

<br/>
<br/>


<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
<script>
    $(document).ready(function () {
        $('#s-h-pass').click(function () {
            var type = $('#password').attr('type') == "text" ? "password" : 'text',
                c = $(this).text() == "Hide pass" ? "Show pass" : "Hide pass";
            $(this).text(c);
            $('#password').prop('type', type);
        });
    });
</script>

<br/>
<br/>

<p align="center"><a href='<c:url value="/register"/>'><strong>Registration</strong></a></p>

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
