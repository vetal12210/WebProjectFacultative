package com.example.FacultativeProject.users;

import com.example.FacultativeProject.subjects.Subject;
import com.example.FacultativeProject.subjects.SubjectDB;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Admin entity.
 *
 * @author V.Dulsky
 */

@WebServlet("/teachController")
public class TeacherController extends HttpServlet {

    private static final Logger log = Logger.getLogger(TeacherController.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("TeacherController starts");

        ArrayList<Subject> subjects = SubjectDB.select();
        request.setAttribute("subjects", subjects);
        log.trace("Request parameter: subjects --> " + subjects);

        getServletContext().getRequestDispatcher("/userPages/teacherPage.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.trace("TeacherController ends");

    }
}
