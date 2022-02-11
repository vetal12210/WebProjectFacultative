package com.example.FacultativeProject.directionOfStudy.servlets;

import com.example.FacultativeProject.directionOfStudy.entities.DirectionOfStudy;
import com.example.FacultativeProject.directionOfStudy.jdbc.DirectionOfStudyDB;
import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;


/**
 * DirectionServlet controller
 *
 * @author V.Dulsky
 */

@WebServlet("/directions")
public class DirectionServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(DirectionServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("DirectionServlet starts");

        ArrayList<DirectionOfStudy> directionOfStudies = DirectionOfStudyDB.select();
        request.setAttribute("directionOfStudies", directionOfStudies);
        log.trace("Request parameter: directionOfStudies --> " + directionOfStudies);

        getServletContext().getRequestDispatcher("/userPages/direction.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("DirectionServlet ends");
    }
}
