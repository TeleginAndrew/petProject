﻿function deleteDisciplines() {
    var items = $("input[type=checkbox]:checked");
    if (items.length == 0) {
        alert("Выберите хотя бы одну дисциплину");
        return;
    }


    var ids;

    for (var i = 0; i < items.length; i++) {
        if (ids == null) {
            ids = "'" + $(items[i]).attr("value");
        } else {
            ids = ids + "','" + $(items[i]).attr("value");
        }
        if (i == items.length - 1) {
            ids = ids + "'"
        }
    }

    $('#deleteDiscHidden').val(ids);
    $('#deleteDiscForm').submit();
}

function modifyDiscipline() {
    var items = $("input[type=checkbox]:checked");
    if (items.length == 0) {
        alert("Выберите одну дисциплину");
        return;
    }
    if (items.length > 1) {
        alert("Выберите только одну дисциплину");
        return;
    }


    var ids;

    for (var i = 0; i < items.length; i++) {
        if (ids == null) {
            ids = "'" + $(items[i]).attr("value");
        } else {
            ids = ids + "','" + $(items[i]).attr("value");
        }
        if (i == items.length - 1) {
            ids = ids + "'"
        }
    }

    $('#modifyDiscHidden').val(ids);
    $('#modifyDiscForm').submit();
}

function deleteStudent() {
    var items = $("input[type=checkbox]:checked");
    if (items.length == 0) {
        alert("Выберите хотя бы одного студента!");
        return;
    }


    var ids;

    for (var i = 0; i < items.length; i++) {
        if (ids == null) {
            ids = "'" + $(items[i]).attr("value");
        } else {
            ids = ids + "','" + $(items[i]).attr("value");
        }
        if (i == items.length - 1) {
            ids = ids + "'"
        }
    }


$('#deleteStudHidden').val(ids);
$('#deleteStudForm').submit();
}

function modifyStudent() {
    var items = $("input[type=checkbox]:checked");
    if (items.length == 0) {
        alert("Выберите одного студента");
        return;
    }
    if (items.length > 1) {
        alert("Выберите только одого студента");
        return;
    }


    var ids;

    for (var i = 0; i < items.length; i++) {
        if (ids == null) {
            ids = "'" + $(items[i]).attr("value");
        } else {
            ids = ids + "','" + $(items[i]).attr("value");
        }
        if (i == items.length - 1) {
            ids = ids + "'"
        }
    }

    $('#modifyStudHidden').val(ids);
    $('#modifyStudForm').submit();
}

function perfomanceStudent() {
    var items = $("input[type=checkbox]:checked");
    if (items.length == 0) {
        alert("Выберите одного студента");
        return;
    }
    if (items.length > 1) {
        alert("Выберите только одого студента");
        return;
    }


    var ids;

    for (var i = 0; i < items.length; i++) {
        if (ids == null) {
            ids = "'" + $(items[i]).attr("value");
        } else {
            ids = ids + "','" + $(items[i]).attr("value");
        }
        if (i == items.length - 1) {
            ids = ids + "'"
        }
    }

    $('#perfomanceStudHidden').val(ids);
    $('#perfomanceStudForm').submit();
}