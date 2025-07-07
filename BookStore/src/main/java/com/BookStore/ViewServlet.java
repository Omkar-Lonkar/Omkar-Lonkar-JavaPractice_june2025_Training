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
import java.util.List;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        BookDAO bookDAO = new BookDAOImpl();
        List<Book> books = bookDAO.view();

        out.println("<h2 align=center> Books Table</h2>");
        out.println("<table border=1 width=60% align=center > ");
        out.println("<tr><th align=center>ID</th>");
        out.println("<th align=center>Name</th>");
        out.println("<th align=center>Price</th></tr>");
            for(Book book : books) {
            out.println("<td>");
            out.println("<td align=center>" + book.getId() + " </td>");
            out.println("<td align=center>" + book.getName() + " </td>");
            out.println("<td align=center>" + book.getPrice() + " </td>");
            out.println("</tr>");
        }
            out.println("</table>");
        out.println("<h3> <a href = http://localhost:8080/BookStore/index.html> Home<br></a>");
    }
}
