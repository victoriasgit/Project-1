<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.10.2017
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Регистрация</title>
    <%--<link rel="stylesheet" href="../../css/login.css" type="text/css">--%>
    <meta charset="UTF-8">
    <meta name="robots" content="noindex, nofollow">
    <link rel="stylesheet" href="../../css/admin.css?version=1">
    <link rel="stylesheet" href="../../css/main.css">
    <link rel="stylesheet" href="../../css/bootstrap.css">
    <link rel="stylesheet" href="../../css/font-awesome.min.css">
    <link rel="stylesheet" href="../../css/main.css">
    <script src="../scripts/jquery-min.js"></script>
    <script src="../scripts/admin/error.js"></script>
    <script src="../scripts/admin/login.js?version=1"></script>
</head>
<body>
<c:if test="${not empty message}">
    <h3>${message}</h3>
</c:if>
<form action="" method="POST">
    <fieldset class="data">
        <div>
            <label for="login">Email</label>
            <input id="login" name="login" class="field login" type="text"><span></span>
        </div>

        <div>
            <label for="pass">Пароль</label>
            <input id="pass" name="pass" class="field pass" type="password"><span></span>
        </div>

        <div>
            <label for="repeat pass">Повторите пароль</label>
            <input id="repeat pass" name="field repeat pass" class="field repeat pass" type="password"><span></span>
        </div>

        <div>
            <form action=" " method="post">
                <p><select size="3" multiple name="hero[]">
                    <option disabled>Выберите страну</option>
                    <option value="Россия">Россия</option>
                    <option value="Австрия">Австрия</option>
                    <option value="Италия">Италия</option>
                </select></p>
            </form>
        </div>

        <div class="radio">
            <span>Пол</span>
            <label>
                <input type="radio" name="sex" value="мужской">мужской
                <div class="radio-control male"></div>
            </label>
            <label>
                <input type="radio" name="sex" value="женский">женский
                <div class="radio-control female"></div>
            </label>
        </div>

        <p><input type="submit" value="Отправить"></p>
    </fieldset>
</form>
</body>
</html>