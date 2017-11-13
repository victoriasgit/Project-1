<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 09.11.2017
  Time: 12:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../css/admin.css?version=1">
    <meta name="robots" content="noindex, nofollow">
    <link rel="shortcut icon" href="../images/icons/adminfavicon.png">
    <script src="../scripts/jquery-min.js"></script>
    <script src="../scripts/admin/texthighlighter/rangy-core.js"></script>
    <script src="../scripts/admin/texthighlighter/jquery.texthighlighter.js"></script>
    <script src="../scripts/admin/mediadescription.js"></script>
    <script src="../scripts/admin/error.js"></script>
    <script src="../scripts/admin/tags.js"></script>
    <script src="../scripts/admin/aliasmaker.js"></script>
    <script src="../scripts/admin/click-actions.js?version=1"></script>
    <script src="../scripts/admin/images-actions.js?version=1"></script>
    <script src="../scripts/admin/articles.js?version=1"></script>
    <link rel="stylesheet" href="../../css/admin.css">
    <link rel="stylesheet" href="../../css/bootstrap.css">
    <link rel="stylesheet" href="../../css/font-awesome.min.css">
    <link rel="stylesheet" href="../../css/admin.css">
    <title>Create Article</title>
</head>
<body>

<%--<jsp:include page="_header.jsp"></jsp:include>--%>
<%--<jsp:include page="_menu.jsp"></jsp:include>--%>

<h3>Create Article</h3>

<p style="color: red;">${errorString}</p>

<form method="POST" action="${pageContext.request.contextPath}/createArticle">
    <table border="0">
        <tr>
            <td>Id</td>
            <td><input type="text" name="code" value="${Article.id}" /></td>
        </tr>
        <tr>
            <td>Title</td>
            <td><input type="text" name="name" value="${Article.title}" /></td>
        </tr>
        <tr>
            <td>Date</td>
            <td><input type="text" name="price" value="${Article.date}" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit" />
                <a href="articleList">Cancel</a>
            </td>
        </tr>
    </table>
</form>

<%--<jsp:include page="_footer.jsp"></jsp:include>--%>

</body>
</html>
