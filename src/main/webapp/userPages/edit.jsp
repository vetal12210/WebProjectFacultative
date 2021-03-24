<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.02.2021
  Time: 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Page</title>
    <link rel="stylesheet" href="style1.css" type="text/css">
    <style>
        body {
            background: url("https://www.awicons.com/stock-icons/xp-artistic/preview/doc-edit.png");
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
            background-color: green;
        }

        /*Selection footer*/
        footer {
            color: #000000;
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

<h1 align="center">Edit Page</h1>
<br/>
<br/>

<form method="post" align="center" autocomplete="off">
    <div class="form-group">
        <input type="hidden" value="${user.id}" name="id"/>
        <label>Your name</label>
        <input name="firstname" pattern="[a-zA-z]{2,}" placeholder="Enter your firstname" value="${user.firstname}" required/>
        <br/>
        <br/>
        <label>Your lastname</label>
        <input name="lastname" pattern="[a-zA-z]{2,}" placeholder="Enter your lastname" value="${user.lastname}" required/>
        <br/>
        <br/>
        <label>Your login</label>
        <input name="login" pattern="[a-zA-Z0-9]{5,10}" placeholder="Enter your login" value="${user.login}" required/>
        <br/>
        <br/>
        <label>Your password</label>
        <input name="password" pattern="[a-zA-Z0-9]{7}" placeholder="Enter your password" value="${user.password}" required/>
        <br/>
        <br/>
        <label>Description</label>
        <input name="description" placeholder="Description" value="${user.description}"/>
        <br/>
        <br/>
        <label>Role</label>
        <input name="roles_id" placeholder="Enter your role value="${user.roles_id}" required/>
    </div>
    <br/>

    <p class="fig">
        <img src="https://static6.depositphotos.com/1006009/637/i/600/depositphotos_6377247-stock-photo-edit-word-in-letterpress-type.jpg"
             height="200px" width="250px" border="2px" alt=""/>
    </p>

    <br/>

    <input type="submit" value="Send"/>
    <br/>

</form>

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

