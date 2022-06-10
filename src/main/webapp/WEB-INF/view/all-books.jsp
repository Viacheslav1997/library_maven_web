<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Viacheslav
  Date: 10.06.2022
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Библиотека</title>
</head>
<body>

<center><h2>Библиотека</h2></center>
<br>
<center>Здесь вы можете просмотреть список имеющихся в библиотеке книг, </center>

<center>а также доступное их количество. </center>
<br>
<center>Вы можете взять или вернуть книгу, а так же удалить книгу из доступа. </center>
<br>
<center><table border="1">

    <tr>
        <th> Id: </th>
        <th> Название книги: </th>
        <th> Автор: </th>
        <th> Год издания: </th>
        <th> Доступно: </th>
        <th>  </th>
    </tr>

    <c:forEach var="book" items = "${allBooks}">

        <c:url var = "returnButton" value="/returnBook">
            <c:param name="bookId" value = "${book.id}"/>
        </c:url>

        <c:url var = "takeButton" value="/takeBook">
            <c:param name="bookId" value = "${book.id}"/>
        </c:url>

        <c:url var = "deleteButton" value="/deleteBook">
            <c:param name="bookId" value = "${book.id}"/>
        </c:url>

        <tr>
            <td> ${book.id} </td>
            <td> ${book.book} </td>
            <td> ${book.author} </td>
            <td> ${book.year} </td>
            <td> ${book.quantity} </td>
            <td>

                <input type="button" value="Вернуть" c
            onclick="window.location.href = '${returnButton}'"/>

                <input type="button" value="Взять"
                       onclick="window.location.href = '${takeButton}'"/>

                <input type="button" value="Удалить"
                       onclick="window.location.href = '${deleteButton}'"/>

            </td>
        </tr>

    </c:forEach>

</table></center>


</body>
</html>
