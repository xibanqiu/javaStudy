<%@page language="java" contentType="text/html; UTF-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL Demo</title>
</head>
<body>
<table cellpadding=0 cellspacing=0 border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>UserName</th>
        <th>Name</th>
        <th>Age</th>
    </tr>
    </thead>

    <tbody>

    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id} </td>
            <td>${user.username} </td>
            <td>${user.name} </td>
            <td>${user.age} </td>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
</html>


