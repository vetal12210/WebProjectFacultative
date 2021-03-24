package com.example.FacultativeProject.subjects;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * ChooseSubjects controller
 *
 * @author V.Dulsky
 */

@WebServlet("/chooseSubjects")
public class ChooseSubjects extends HttpServlet {

    private static final Logger log = Logger.getLogger(ChooseSubjects.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/userPages/chosenSubjects.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("ChooseSubjects starts");

        try {
            HttpSession session = request.getSession();

            String sname = request.getParameter("sname");
            log.trace("Request parameter: sname --> " + sname);

            int categories_id = Integer.parseInt(request.getParameter("categories_id"));
            log.trace("Request parameter: categories_id --> " + categories_id);

            Subject subject = new SubjectDB().selectOne(sname);
            log.trace("Found in DB: subject --> " + subject);

            session.setAttribute("subject", subject);
            log.trace("Set the session attribute: subject --> " + subject);

            session.setAttribute("sname", sname);
            log.trace("Set the session attribute: sname --> " + sname);

            session.setAttribute("categories_id", categories_id);
            log.trace("Set the session attribute: categories_id --> " + categories_id);


            getServletContext().getRequestDispatcher("/userPages/userPage.jsp").forward(request, response);

        } catch (Exception ex) {

            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

        log.debug("ChooseSubjects ends");

    }

}


