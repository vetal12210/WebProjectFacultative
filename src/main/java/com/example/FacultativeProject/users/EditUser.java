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
 * EditServlet controller
 *
 * @author V.Dulsky
 */

@WebServlet("/edit")
public class EditUser extends HttpServlet {

    private static final Logger log = Logger.getLogger(EditUser.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("EditServlet starts");

        try {

            int id = Integer.parseInt(request.getParameter("id"));
            log.trace("Request parameter: id --> " + id);

            User user = UserDB.selectById(id);

            if (user != null) {
                request.setAttribute("user", user);
                log.trace("Request parameter: user --> " + user);
                getServletContext().getRequestDispatcher("/userPages/edit.jsp").forward(request, response);
            } else {
                getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
            }
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            HttpSession session = request.getSession();

            int id = Integer.parseInt(request.getParameter("id"));
            log.trace("Request parameter: id --> " + id);

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

            User user = new User(id, firstname, lastname, login, password, description, roles_id);

            response.sendRedirect(request.getContextPath() + "/adminController"); // PGR паттерн

            session.setAttribute("user", user);
            log.trace("Set the session attribute: user --> " + user);

            session.setAttribute("id", id);
            log.trace("Set the session attribute: id --> " + id);

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


            UserDB.update(user);

        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

        log.debug("EditServlet ends");

    }
}
