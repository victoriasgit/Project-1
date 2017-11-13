<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 12.11.2017
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<head>
    <title>Ещё раз о пользе криосауны</title>
    <meta charset="UTF-8">
    <meta name="description" content="Ещё раз о пользе криосауны">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="og:image" content="../images/socialimage.png">
    <meta name="robots" content="index, follow">
    <link rel="stylesheet" href="../../css/main.css">
    <link rel="stylesheet" href="../../css/bootstrap.css">
    <link rel="stylesheet" href="../../css/font-awesome.min.css">
    <link rel="stylesheet" href="../../css/main.css">
</head>
<body>
<div class="page-wrapper">
    <main role="main">
        <div class="article-wrapper">
            <!-- Статья -->
            <article>
                <div class="details">
                    <div class="secondary">
                        <span class="date">Добавлена: ${article.date}</span>
                    </div>
                    <a href="article?id=${article.id}">
                        <h1>${article.articleTitle}</h1>
                    </a></span>
                    ${article.articleDescription}
                    <br> </br>
                    ${article.text}
                </div>
            </article>
            <!-- Статья КОНЕЦ -->
        </div>
    </main>
    <!-- Скролл вверх -->
    <div class="scrolltop"></div>
    <!-- Скролл вверх КОНЕЦ -->
</div>
<!-- Подключение скриптов -->
<script src="/scripts/jquery-min.js"></script>
<script src="/scripts/client/main.js"></script>
<!-- Подключение скриптов КОНЕЦ -->
</body>
</html>
