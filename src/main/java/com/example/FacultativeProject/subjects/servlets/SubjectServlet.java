package com.example.FacultativeProject.subjects.servlets;

import com.example.FacultativeProject.subjects.jdbc.SubjectDB;
import com.example.FacultativeProject.subjects.entities.Subject;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * SubjectServlet controller
 *
 * @author V.Dulsky
 */

@WebServlet("/subject")
public class SubjectServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(SubjectServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("SubjectServlet starts");

        ArrayList<Subject> subjects = SubjectDB.select();
        request.setAttribute("subjects", subjects);
        log.trace("Request parameter: subjects --> " + subjects);

        getServletContext().getRequestDispatcher("/userPages/subjectIndex.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("SubjectServlet ends");

    }
}
