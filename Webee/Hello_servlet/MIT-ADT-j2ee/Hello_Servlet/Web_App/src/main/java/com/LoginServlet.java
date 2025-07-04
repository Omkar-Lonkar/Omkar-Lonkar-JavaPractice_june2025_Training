package com;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        HttpSession session = req.getSession(true);
//        System.out.println("Session Id = " + session.getId());
        if (username != null && !(username.isEmpty())) {
            session.setAttribute("user", username);
        }
//        if(password != null && !(password.isEmpty())){
//            session.setAttribute("password", password);
//        }

        out.println("<h1>Login successful, " + session.getAttribute("user") + " login successful</h1>");
//        out.println("<h1>Your Password is: " + password + "</h1>");
    }
}

