<%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 20.02.2021
  Time: 18:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New subject</title>
    <link rel="stylesheet" href="style1.css" type="text/css"/>
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
            width: 140px;
            display: inline-block;
        }

        .form-group input {
            width: 190px;
            padding: 5px;
        }

        #myButton2 button {
            align-content: center;
            margin-bottom: 100px;
            border-radius: 5px;
            background-color: orangered;
        }

    </style>

</head>
<body>

<h1 align="center"><b>Subjects</b></h1>
<br/>
<br/>

<form method="post" align="center" autocomplete="off">
    <div class="form-group">
        <label><b>Subject name:</b></label>
        <input name="name" pattern="[a-zA-z_ ]{4,}" placeholder="Enter subject" required/>

        <br/>
        <br/>

        <label><b>Category</b></label>
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

    <input type="submit" value="Save"/>

</form>

<br/>
<br/>

<div id="myButton2" align="center">
    <button><a href='<c:url value="/teachController"/>'><strong>Back</strong></a></button>
</div>


</body>
</html>
