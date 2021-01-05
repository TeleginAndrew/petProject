
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Создание семестра</title>
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

<div class="terms_list_container">


    <div class="main_line">

        Для создания семестра заполните следующие данные и нажмите кнопку "Создать".

    </div>





    <table class="under_main_table" style="font-family: cursive;">
        <tr>
            <td width="210px">Длительность (в неделях)</td>
            <td><input type="text" name="duration" class="text"
                       id="text" placeholder="24"></td>
        </tr>

        <tr>
            <td style="padding-top: 30px" valign="top">Дисциплины в семестре</td>
            <td style="padding-top: 30px">
                <table>
                    <tr>
                        <td style="padding: 0"><select multiple size="8"
                                                       id="multi_list" multiple="multiple" >

                            <option>ЛФЫТВ</option>

                        </select></td>
                    </tr>

                    <tr>
                        <td style="padding-top: 20px">

                            <input type="submit" value="Создать" id="button">
                        </td>
                    </tr>
                </table>


            </td>
        </tr>
    </table>


</div>

</body>
</html>
