package com.example.FacultativeProject.subjects.servlets;

import com.example.FacultativeProject.subjects.jdbc.SubjectDB;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * DeleteSubject controller
 *
 * @author V.Dulsky
 */
@WebServlet("/deleteSubject")
public class DeleteSubject extends HttpServlet {

    private static final Logger log = Logger.getLogger(DeleteSubject.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("DeleteSubject starts");

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            log.trace("Request parameter: id --> " + id);

            SubjectDB.delete(id);
            response.sendRedirect(request.getContextPath() + "/teachController"); // PGR паттерн
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

        log.debug("DeleteSubject ends");

    }
}
