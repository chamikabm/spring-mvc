<%--
  Created by IntelliJ IDEA.
  User: chamikab
  Date: 11/19/18
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Helloworld - Input Form</title>
</head>
<body>
    <form action="/hello/processFormV2" method="GET">
        <input type="text" name="studentName" placeholder="What's your name?"/>
        <input type="submit"/>
    </form>
</body>
</html>
