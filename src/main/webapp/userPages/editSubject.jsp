<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 20.03.2021
  Time: 0:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Subject</title>
    <link rel="stylesheet" href="style1.css" type="text/css">
    <style>
        body {
            background: url("https://media.istockphoto.com/vectors/flat-illustration_1_of-subjects-and-girls-on-school-subject-education-vector-id1012889118?s=612x612");
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
            background-color: gold;
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

<h1 align="center" color="blue"><strong>Edit Subject</strong></h1>
<br/>
<br/>

<form method="post" align="center" autocomplete="off">
    <div class="form-group">
        <input type="hidden" value="${subject.id}" name="id"/>

        <label><b>Nazvanie</b></label>
        <input name="name" pattern="[a-zA-z_ ]{4,}" placeholder="Enter subject name" value="${subject.sname}" required/>
        <br/>
        <br/>
        <label><b>Category</b></label>
        <input name="categories_id" placeholder="Enter category" value="${subject.categories_id}" required/>
        <br/>
        <br/>
    </div>
    <br/>

    <p class="fig">
        <img src="https://gradeacomputerscience.com/wp-content/uploads/2016/12/wordle-300x179.png"
             height="200px" width="250px" border="2px" alt=""/>
    </p>

    <br/>

    <input type="submit" value="Send"/>
    <br/>

</form>

<div id="myButton2" align="center">
    <button><a href='<c:url value="/adminController"/>'><strong>Back</strong></a></button>
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
