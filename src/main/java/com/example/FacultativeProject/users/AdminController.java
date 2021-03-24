package com.example.FacultativeProject.users;

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

@WebServlet("/adminController")
public class AdminController extends HttpServlet {

    private static final Logger log = Logger.getLogger(AdminController.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("AdminController starts");

        ArrayList<User> users = UserDB.select();
        request.setAttribute("users", users);
        log.trace("Request parameter: users --> " + users);


        getServletContext().getRequestDispatcher("/userPages/adminPage.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("AdminController ends");

    }
}
