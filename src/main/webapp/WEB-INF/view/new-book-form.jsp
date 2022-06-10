<%--
  Created by IntelliJ IDEA.
  User: Viacheslav
  Date: 10.06.2022
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Добавить книгу</title>
</head>
<body>

<h2>Добавить новую книгу</h2>
<br>


<form:form action="newBook" modelAttribute="book">

    Название:    <form:input path="book" /> <br><br>
    Автор:       <form:input path="author" /><br><br>
    Год издания: <form:input path="year" /><br><br>
    Количество:  <form:input path="quantity" /><br><br>
    <input type="submit" value="OK">

</form:form>


</body>
</html>
