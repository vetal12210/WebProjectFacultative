package com.example.FacultativeProject.users;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * DeleteServlet controller
 *
 * @author V.Dulsky
 */
@WebServlet("/deleteUser")
public class DeleteUser extends HttpServlet {

    private static final Logger log = Logger.getLogger(DeleteUser.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        log.debug("DeleteUser starts");

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            log.trace("Request parameter: id --> " + id);

            UserDB.delete(id);
            response.sendRedirect(request.getContextPath() + "/adminController"); // PGR паттерн
        } catch (Exception ex) {
            getServletContext().getRequestDispatcher("/userPages/notfound.jsp").forward(request, response);
        }

        log.debug("DeleteUser ends");

    }
}
