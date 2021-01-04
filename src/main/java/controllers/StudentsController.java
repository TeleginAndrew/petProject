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
import java.util.ArrayList;

@WebServlet(name = "StudentsController" ,urlPatterns = "/students")
public class StudentsController  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Student> students = DBManager.getAllActiveStudents();
        req.setAttribute("students", students);
        req.setAttribute("currentPage", "students.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String ids = req.getParameter("deleteStudHidden");
        System.out.println(ids);
        String[] idsStr = ids.split(",");
        for (String id : idsStr) {
            DBManager.deleteStud(id);
        }
        resp.sendRedirect("/students");
    }
}
