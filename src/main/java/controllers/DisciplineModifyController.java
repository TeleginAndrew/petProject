package controllers;

import database.DBManager;
import entity.Discipline;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DisciplineModifyController", urlPatterns = "/disciplines-modify")
public class DisciplineModifyController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("modifyDiscHidden");
        Discipline discipline = DBManager.getDisciplineById(id);
        req.setAttribute("discipline",discipline);

        req.setAttribute("isCreate", "0");
        req.setAttribute("currentPage", "discipline-create.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String disc = req.getParameter("newDisc");
        String id = req.getParameter("idDisc");

        DBManager.modifyDisc(id,disc);
        resp.sendRedirect("/disciplines");

    }
}
