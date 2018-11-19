<%--
  Created by IntelliJ IDEA.
  User: chamikab
  Date: 11/19/18
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student - Input Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">

        First Name : <form:input path="firstName"/>
        <br><br>
        Last Name : <form:input path="lastName"/>
        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
