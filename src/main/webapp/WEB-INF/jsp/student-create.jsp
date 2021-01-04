<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Создать студента</title>
</head>
<body>
<div class="link_container">
    <table>
        <tr>
            <td><a href="">На
                главную</a></td>
            <td><a href="">Назад</a></td>
        </tr>
    </table>
</div>
<c:choose>
    <c:when test="${isCreate == 1}">
<div class="main_line">
    Для того что создать нового студента заполните все поля и нажмите кнопку "Создать"
</div>
    <form action="/student-create" method="post">
        </c:when>
        <c:otherwise>
        <div class="main_line">
            Для того чтобы модифицировать студента введите новое значение и нажмите кнопку "Применить"
        </div>
        <form action="/student-modify" method="post">
            </c:otherwise>
            </c:choose>

                <input type="hidden" value="${student.id}" name="idStud">


<tr>
    <td width="60px">Фамилия</td>
    <td style="padding-left: 30px"><input type="text" name="newSername"
                                          maxlength="50" size="35" class="text" value="${student.sername}"></td>
    <td width="60px">Имя</td>
    <td style="padding-left: 30px"><input type="text" name="newName"
                                          maxlength="50" size="35" class="text" value="${student.name}" ></td>
    <td width="60px">Группа</td>
    <td style="padding-left: 30px"><input type="text" name="newGroup"
                                          maxlength="50" size="35" class="text" value="${student.group}" ></td>
    <td width="60px">Дата поступления</td>
    <td style="padding-left: 30px"><input type="text" name = "newDate"
                                          maxlength="50" size="35" class="text" value="${student.date}"></td>
</tr>

<input type="submit" value="Создать">
</form>
</body>
</html>
