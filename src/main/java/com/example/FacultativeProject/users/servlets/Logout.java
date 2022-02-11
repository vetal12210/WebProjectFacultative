package com.example.FacultativeProject.users.servlets;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Logout
 *
 * @author V.Dulsky
 */

@WebServlet("/logout")
public class Logout extends HttpServlet {

    private static final Logger log = Logger.getLogger(Logout.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.trace("Logout starts");

        getServletContext().getRequestDispatcher("/userPages/main.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session != null) {
            session.invalidate();
        }

        getServletContext().getRequestDispatcher("/userPages/authorization.jsp").forward(request, response);
        log.trace("Logout ends");

    }
}
