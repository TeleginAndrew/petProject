package controllers;

import database.DBManager;
import entity.Discipline;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentModifyController", urlPatterns = "/student-modify")
public class StudentModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("modifyStudHidden");
        Student student = DBManager.getStudentById(id);
        req.setAttribute("student",student);

        req.setAttribute("isCreate", "0");
        req.setAttribute("currentPage", "student-create.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello");
        String id = req.getParameter("idStud");
        String sername = req.getParameter("newSername");
        String name = req.getParameter("newName");
        String group = req.getParameter("newGroup");
        String date = req.getParameter("newDate");
        DBManager.modifyStud(id,sername,name,group,date);
        resp.sendRedirect("/students");
    }
}
