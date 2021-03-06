
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Студенты</title>
</head>
<body>
<div class="link_container">
    <table>
        <tr>
            <td><a href="/home">На главную</a></td>
        </tr>
    </table>
</div>

<div class="student_list_container">

    <table>
        <tr>
            <td>
                <input onclick="perfomanceStudent()" type="submit" id="button_long_name" name="progress"
                       value="Просмотреть успеваемость выбранного студента"></td>
<c:if test="${idRole ==1}">
<form method="get" action="/student-create">
<td style="padding-left: 20px">
    <input type="submit" id="button_short_name" value="Создать студента" name="creating"></td></form>
            <td style="padding-top: 20px"><input onclick="modifyStudent()" type="submit"
                                                 value="Модифицировать выбранного студетна..." id="button_long_name"></td>

            <td style="padding-left: 20px; padding-top: 20px"><input onclick="deleteStudent()"
                    type="submit" value="Удалить выбранных студентов" id="button_short_name"></td>
    </c:if>
        </tr>
    </table>
<table style="margin-top: 30px" width="100%">
    <tr>
        <td align="left" style="font-size: large;">Список студентов</td>
    </tr>
    <tr>
        <td><table border="2" cellspacing="0" cellpadding="4"
                   id="student_list_table">
            <tr bgcolor="#DCDCDC" valign="bottom" align="left"
                style="border-color: #838B83">
                <th width="10%" height="100px">&nbsp;</th>
                <th width="30%" style="padding-bottom: 20px">Фамилия</th>
                <th width="30%" style="padding-bottom: 20px">Имя</th>
                <th width="15%" style="padding-bottom: 20px">Группа</th>
                <th width="15%" style="padding-bottom: 20px">Дата поступления</th>
            </tr>


                <c:forEach items="${students}" var="s">
                    <tr>
                        <td height="80px" style="padding-bottom: 20px" align="center"><input type="checkbox" value="${s.id}"></td>
                        <td style="padding-bottom: 20px">${s.sername}</td>
                        <td style="padding-bottom: 20px">${s.name}</td>
                        <td style="padding-bottom: 20px">${s.group}</td>
                        <td style="padding-bottom: 20px">${s.date}</td>

                    </tr>
                </c:forEach>
            </table>
        </td>
</body>
</html>

</div>
<form action="/students" method="post" id="deleteStudForm">
    <input type="hidden" id="deleteStudHidden" name="deleteStudHidden">
</form>

<form action="/student-modify" method="get" id="modifyStudForm">
    <input type="hidden" id="modifyStudHidden" name="modifyStudHidden">
</form>

<form action="/student-perfomance" method="get" id="perfomanceStudForm">
    <input type="hidden" id="perfomanceStudHidden" name="perfomanceStudHidden">
</form>




