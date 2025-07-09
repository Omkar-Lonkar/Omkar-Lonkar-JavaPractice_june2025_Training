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

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String bookName = req.getParameter("bookName");
        String price = req.getParameter("price");

        HttpSession session = req.getSession();

        if(bookName == null || price == null || bookName.isEmpty() || price.isEmpty())
            resp.sendRedirect("http://localhost:8080/BookStore/index.html");

        float bookPrice = 0;
        bookPrice = Float.parseFloat(price);
        try{
            if(bookPrice <= 0){
                resp.sendRedirect("http://localhost:8080/BookStore/index.html");
            }
        } catch(RuntimeException e){
            resp.sendRedirect("http://localhost:8080/BookStore/index.html");
        }
        BookDAOImpl bookDAO = new BookDAOImpl();
        int res = bookDAO.insert(new Book(0, bookName, bookPrice));
        out.println("<h2> " + res + " book(s) inserted<h2>");
        out.println("<h3> <a href = http://localhost:8080/BookStore/index.html> Home<br></a>");
    }
}
