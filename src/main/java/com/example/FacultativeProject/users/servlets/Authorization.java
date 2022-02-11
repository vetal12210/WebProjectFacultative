package com.example.FacultativeProject.users.servlets;

import com.example.FacultativeProject.users.jdbc.UserDB;
import com.example.FacultativeProject.users.entities.Role;
import com.example.FacultativeProject.users.entities.User;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * AuthorizationServlet controller
 *
 * @author V.Dulsky
 */

@WebServlet("/")
public class Authorization extends HttpServlet {

    private static final Logger log = Logger.getLogger(Authorization.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/userPages/authorization.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("AuthorizationServlet starts");

        try {
            HttpSession session = request.getSession();

            String login = request.getParameter("login");
            log.trace("Request parameter: login --> " + login);

            String password = request.getParameter("password");
            log.trace("Request parameter: password --> " + password);

            if (login == null || password == null || login.isEmpty() || password.isEmpty()) {
                String error = "Login/password cannot be empty";
                request.setAttribute("error", error);
                log.error("error --> " + error);
                getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
            }

            User user = new UserDB().selectOne(login);
            log.trace("Found in DB: user --> " + user);

            if (user == null || !password.equals(user.getPassword())) {
                String error = "Cannot find user with such login/password";
                request.setAttribute("error", error);
                log.error("error --> " + error);
                getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
            } else {
                Role userRole = Role.getRole(user);
                log.trace("userRole --> " + userRole);

                if (userRole == Role.ADMIN)
                    response.sendRedirect(request.getContextPath() + "/adminController"); // PRG паттерн
                if (userRole == Role.CLIENT)
                    getServletContext().getRequestDispatcher("/userPages/main.jsp").forward(request, response);
                if (userRole == Role.TEACHER)
                    response.sendRedirect(request.getContextPath() + "/teachController"); // PRG паттерн
            }

            session.setAttribute("user", user);
            log.trace("Set the session attribute: user --> " + user);

            session.setAttribute("login", login);
            log.trace("Set the session attribute: login --> " + login);

            session.setAttribute("password", password);
            log.trace("Set the session attribute: password --> " + password);

        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

        log.debug("AuthorizationServlet ends");
    }
}
