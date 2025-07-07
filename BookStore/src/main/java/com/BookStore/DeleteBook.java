package com.BookStore;

import com.BookStore.model.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DeleteServlet")
public class DeleteBook extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String id = req.getParameter("bookId");

        HttpSession session = req.getSession();

        if(id == null || id.isEmpty())
            resp.sendRedirect("http://localhost:8080/BookStore/index.html");

        int bookId = 0;
        bookId = Integer.parseInt(id);

        try{
            if(bookId<= 0){
                resp.sendRedirect("http://localhost:8080/BookStore/index.html");
            }
        } catch(RuntimeException e){
            resp.sendRedirect("http://localhost:8080/BookStore/index.html");
        }
        BookDAOImpl bookDAO = new BookDAOImpl();
        int res = bookDAO.delete(bookId);
        out.println("<h2> " + res + " book(s) deleted<h2>");
        out.println("<h3> <a href = http://localhost:8080/BookStore/index.html> Home<br></a>");
    }
}
