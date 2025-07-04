package com;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        HttpSession session = req.getSession(true);
        if(session.getAttribute("user") != null) {
            out.println("<h1>Welcome, " + session.getAttribute("user") + "</h1>");
        }
//        out.println("<h1>Your Password is: " + password + "</h1>");
    }
}

