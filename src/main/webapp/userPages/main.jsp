<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 16.02.2021
  Time: 1:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Categories</title>
    <link rel="stylesheet" href="style1.css" type="text/css"/>
    <style>
        .thumb div, img, input {
            border: 2px solid #55c5e9; /* Рамка вокруг фотографии */
            padding: 15px; /* Расстояние от картинки до рамки */
            background: #666; /* Цвет фона */
            margin-right: 25px; /* Отступ справа */
            margin-bottom: 25px; /* Отступ снизу */
            float: left;
        }

        #myButton2 button {
            align-content: center;
            margin-bottom: 100px;
            border-radius: 5px;
            background-color: orangered;
        }

        body {
            background-color: paleturquoise;
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

<article>

    <p align="center"><font size="10" color="red" face="Arial"><strong>CATEGORIES</strong></font></p>
    <br/>
    <br/>

    <div class="thumb">
        <input type="checkbox" name="function" value="1"/><a href="category1.jsp">Computer programming</a><br/>

        <img src="https://static.javatpoint.com/computer/images/what-is-computer-programming.png"
             height="500px" width="550px" alt="Photo1">

    </div>
    <div class="thumb">
        <input type="checkbox" name="function" value="2"/><a href="category2.jsp">Automation and Robotics</a><br/>

        <img src="https://themanufacturer-cdn-1.s3.eu-west-2.amazonaws.com/wp-content/uploads/2020/01/14113254/By-adopting-Robotic-Process-Automation-RPA-manufacturers-can-reduce-human-errors-and-increase-productivity-image-courtesy-of-Atos.png"
             height="500px" width="550px" alt="Photo2">
    </div>

    <div class="thumb">
        <input type="checkbox" name="function" value="3"/><a href="category3.jsp">Cybersecurity</a><br/>

        <img src="https://i.crn.com/sites/default/files/ckfinderimages/userfiles/images/crn/misc/cybersecurity-week-19.jpg"
             height="500px" width="550px" alt="Photo3">
    </div>

    <div class="thumb">
        <input type="checkbox" name="function" value="4"/><a href="category4.jsp">Web design</a><br/>

        <img src="https://www.pnetform.com/wp-content/uploads/2018/10/Web-Design-Trend-in-2019-2.jpg"
             height="500px" width="550px" alt="Photo4">

    </div>

    <div class="thumb">
        <input type="checkbox" name="function" value="5"/><a href="category5.jsp">Computer Architecture</a><br/>

        <img src="https://cdn.educba.com/academy/wp-content/uploads/2020/01/Types-of-Computer-Architecture.jpg"
             height="500px" width="550px" alt="Photo5">
    </div>

</article>
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
