package com.example.FacultativeProject.users;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Registration controller
 *
 * @author V.Dulsky
 */

@WebServlet("/register")
public class Registration extends HttpServlet {

    private static final Logger log = Logger.getLogger(Registration.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/userPages/registration.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("RegistrationServlet starts");

        try {
            HttpSession session = request.getSession();

            String firstname = request.getParameter("firstname");
            log.trace("Request parameter: firstname --> " + firstname);

            String lastname = request.getParameter("lastname");
            log.trace("Request parameter: lastname --> " + lastname);

            String login = request.getParameter("login");
            log.trace("Request parameter: login --> " + login);

            String password = request.getParameter("password");
            log.trace("Request parameter: password --> " + password);

            String description = request.getParameter("description");
            log.trace("Request parameter: description --> " + description);

            int roles_id = Integer.parseInt(request.getParameter("roles_id"));
            log.trace("Request parameter: roles_id --> " + roles_id);

            User user = new User(firstname, lastname, login, password, description, roles_id);
            UserDB.insert(user);

            Role userRole = Role.getRole(user);
            log.trace("userRole --> " + userRole);


            if (userRole == Role.ADMIN)
                response.sendRedirect(request.getContextPath() + "/adminController"); // PGR паттерн
            if (userRole == Role.CLIENT)
                getServletContext().getRequestDispatcher("/userPages/main.jsp").forward(request, response);
            if (userRole == Role.TEACHER)
                response.sendRedirect(request.getContextPath() + "/teachController"); // PGR паттерн


            session.setAttribute("user", user);
            log.trace("Set the session attribute: user --> " + user);

            session.setAttribute("firstname", firstname);
            log.trace("Set the session attribute: firstname --> " + firstname);

            session.setAttribute("lastname", lastname);
            log.trace("Set the session attribute: lastname --> " + lastname);

            session.setAttribute("login", login);
            log.trace("Set the session attribute: login --> " + login);

            session.setAttribute("password", password);
            log.trace("Set the session attribute: password --> " + password);

            session.setAttribute("description", description);
            log.trace("Set the session attribute: description --> " + description);

            session.setAttribute("roles_id", roles_id);
            log.trace("Set the session attribute: roles_id --> " + roles_id);

        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

        log.debug("RegistrationServlet ends");

    }
}
