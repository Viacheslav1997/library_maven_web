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
    <%@ page isELIgnored="false" %>
<%--    //Нужно включить для отображения данных из модели--%>

</head>
<body>

<h2>Библиотека</h2>
<br>
Здесь вы можете просмотреть список имеющихся в библиотеке книг,

а также доступное их количество.
<br>
Вы можете взять или вернуть книгу, а так же удалить книгу из доступа или пополнить библиотеку новой книгой.

<br><br>



    <table border="1">

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

        <c:url var = "editButton" value="/updateBook">
            <c:param name="bookId" value = "${book.id}"/>
        </c:url>

        <tr>
            <td> ${book.id} </td>
            <td> ${book.book} </td>
            <td> ${book.author} </td>
            <td> ${book.year} </td>
            <td> ${book.quantity} </td>
            <td>

                <input type="button" value="Вернуть"
            onclick="window.location.href = '${returnButton}'"/>

                <input type="button" value="Взять"
                       onclick="window.location.href = '${takeButton}'"/>

                <input type="button" value="Удалить"
                       onclick="window.location.href = '${deleteButton}'"/>

                <input type="button" value="Редактировать"
                       onclick="window.location.href = '${editButton}'"/>


            </td>
        </tr>

    </c:forEach>

</table>
<br>
<c:url var = "newButton" value="/newBookForm"></c:url>
<input type="button" value="Добавить книгу"
       onclick="window.location.href = '${newButton}'"/> - открыть форму для поплнения базы библиотеки.

</body>
</html>
