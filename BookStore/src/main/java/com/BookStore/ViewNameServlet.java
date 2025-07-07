package com.BookStore;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ViewNameServlet")
public class ViewNameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("bookName");

        if(name == null || name.isEmpty())
            resp.sendRedirect("http://localhost:8080/BookStore/index.html");

        BookDAO bookDAO = new BookDAOImpl();
        out.println("<h2>" + bookDAO.view(name) + "</h2>");
        out.println("<h3> <a href = http://localhost:8080/BookStore/index.html> Home<br></a>");
    }
}