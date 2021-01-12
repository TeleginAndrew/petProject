package controllers;

import database.DBManager;
import entity.Term;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "TermController", urlPatterns = "/term")
public class TermController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Term> terms = DBManager.getAllActiveTerms();
        req.setAttribute("terms",terms);
        req.setAttribute("currentPage", "term.jsp");
        req.getRequestDispatcher("WEB-INF/jsp/template.jsp").forward(req,resp);
    }
}
