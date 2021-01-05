package controllers;

import database.DBManager;
import entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentPerfomanceController", urlPatterns = "/student-perfomance")
public class StudentPerfomanceController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("perfomanceStudHidden");
        Student student = DBManager.getStudentById(id);
        req.setAttribute("student",student);

        req.setAttribute("currentPage", "student-perfomance.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req,resp);
    }
}
