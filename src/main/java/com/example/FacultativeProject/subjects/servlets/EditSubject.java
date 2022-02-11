package com.example.FacultativeProject.subjects.servlets;

import com.example.FacultativeProject.subjects.jdbc.SubjectDB;
import com.example.FacultativeProject.subjects.entities.Subject;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


/**
 * EditSubject controller
 *
 * @author V.Dulsky
 */

@WebServlet("/editSubject")
public class EditSubject extends HttpServlet {

    private static final Logger log = Logger.getLogger(EditSubject.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("EditSubject starts");

        try {

            String sname = request.getParameter("sname");
            log.trace("Request parameter: sname --> " + sname);

            Subject subject = SubjectDB.selectOne(sname);

            request.setAttribute("subject", subject);
            log.trace("Request parameter: subject --> " + subject);
            getServletContext().getRequestDispatcher("/userPages/editSubject.jsp").forward(request, response);

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

            String name = request.getParameter("name");
            log.trace("Request parameter: name --> " + name);

            int categories_id = Integer.parseInt(request.getParameter("categories_id"));
            log.trace("Request parameter: categories_id --> " + categories_id);

            Subject subject = new Subject(id, name, categories_id);

            response.sendRedirect(request.getContextPath() + "/teachController"); // PGR паттерн

            session.setAttribute("subject", subject);
            log.trace("Set the session attribute: subject --> " + subject);

            session.setAttribute("id", id);
            log.trace("Set the session attribute: id --> " + id);

            session.setAttribute("name", name);
            log.trace("Set the session attribute: name --> " + name);

            session.setAttribute("categories_id", categories_id);
            log.trace("Set the session attribute: categories_id --> " + categories_id);

            SubjectDB.update(subject);

        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

        log.debug("EditSubject starts");

    }
}
