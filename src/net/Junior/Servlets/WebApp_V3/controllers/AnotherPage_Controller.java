package net.Junior.Servlets.WebApp_V3.controllers;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by root on 12.03.2015.
 */
public class AnotherPage_Controller extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hi! I am Servlet on another page! I'm fine!");
    }
}
