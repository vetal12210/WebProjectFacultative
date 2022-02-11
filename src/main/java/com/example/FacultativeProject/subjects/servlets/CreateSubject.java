package com.example.FacultativeProject.subjects.servlets;

import com.example.FacultativeProject.subjects.jdbc.SubjectDB;
import com.example.FacultativeProject.subjects.entities.Subject;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * CreateSubject controller
 *
 * @author V.Dulsky
 */

@WebServlet("/createSubject")
public class CreateSubject extends HttpServlet {

    private static final Logger log = Logger.getLogger(CreateSubject.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/userPages/createSubjects.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("CreateSubject starts");

        try {
            HttpSession session = request.getSession();

            String name = request.getParameter("name");
            log.trace("Request parameter: name --> " + name);

            int categories_id = Integer.parseInt(request.getParameter("categories_id"));
            log.trace("Request parameter: categories_id --> " + categories_id);

            Subject subject = new Subject(name, categories_id);
            SubjectDB.insert(subject);

            response.sendRedirect(request.getContextPath() + "/teachController"); // PGR паттерн

            session.setAttribute("subject", subject);
            log.trace("Set the session attribute: subject --> " + subject);

            session.setAttribute("name", name);
            log.trace("Set the session attribute: name --> " + name);

            session.setAttribute("categories_id", categories_id);
            log.trace("Set the session attribute: categories_id --> " + categories_id);


        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

        log.debug("CreateSubject ends");

    }

}


