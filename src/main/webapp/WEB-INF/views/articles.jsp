<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11.11.2017
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ru" dir="ltr"><head>
    <title>Админ-панель</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../css/admin.css?version=1">
    <meta name="robots" content="noindex, nofollow">
    <link rel="shortcut icon" href="../images/icons/adminfavicon.png">
    <script src="../scripts/jquery-min.js"></script>
    <script src="../scripts/admin/error.js"></script>
    <script src="../scripts/admin/articles.js?version=1"></script>
    <link rel="stylesheet" href="../../css/admin.css">
    <link rel="stylesheet" href="../../css/bootstrap.css">
    <link rel="stylesheet" href="../../css/font-awesome.min.css">
    <link rel="stylesheet" href="../../css/admin.css">
<body>



<div class="holder type">
    <div class="options-header">
        <a href="editarticle.html" class="button green">Добавить статью +</a>
    </div>
    <div class="search padding20">
        <input type="text" id="search-article" placeholder="Введите название статьи">
    </div>
    <div class="articles v-list flex-full padding20">
        <!-- Статья -->
        <div class="v-item flex-row">
            <div class="title">Польза криосауны</div>
            <div class="created flex-col">
                <span>Создана: Вт, 31. Янв 2017, в 19:9</span>
                <span>Обновлена: Пт, 10. Фев 2017, в 16:56</span>
            </div>
            <div class="published">
                <span class="no">Не опубликована</span>
            </div>
            <div class="buttons">
                <a href="editarticle.html" class="button green">Редактор</a>
            </div>
        </div>
        <!-- Статья КОНЕЦ -->
        <div class="v-item flex-row">
            <div class="title">Противопоказания</div>
            <div class="created flex-col">
                <span>Создана: Пт, 27. Янв 2017, в 21:59</span>
                <span>Обновлена: Пн, 30. Янв 2017, в 18:40</span>
            </div>
            <div class="published">
                <span class="yes">Опубликована</span>
            </div>
            <div class="buttons">
                <a href="editarticle.html" class="button green">Редактор</a>
            </div>
        </div>
        <div class="v-item flex-row">
            <div class="title">Отзыв клиента</div>
            <div class="created flex-col">
                <span>Создана: Пт, 27. Янв 2017, в 21:59</span>
                <span>Обновлена: Пт, 27. Янв 2017, в 22:3</span>
            </div>
            <div class="published">
                <span class="yes">Опубликована</span>
            </div>
            <div class="buttons">
                <a href="editarticle.html" class="button green">Редактор</a>
            </div>
        </div>
        <div class="v-item flex-row">
            <div class="title">Советы врачей</div>
            <div class="created flex-col">
                <span>Создана: Пт, 27. Янв 2017, в 18:43</span>
                <span>Обновлена: Пт, 27. Янв 2017, в 21:46</span>
            </div>
            <div class="published">
                <span class="yes">Опубликована</span>
            </div>
            <div class="buttons">
                <a href="editarticle.html" class="button green">Редактор</a>
            </div>
        </div>
    </div>
</div>

</body>
</html>
