<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 27.09.2017
  Time: 0:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Form_Servlet_Pain</title>
</head>
<body>
<h3>${reg_email}</h3>
<div>Your own time from 1970: ${reg_time}</div>
<form method="POST" action="">
    <input type="submit" value="change time to current">
</form>

${users_list}

</body>
</html>