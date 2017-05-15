package com.ubl.jwp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <pre>
 *  com.ubl.jwp.servlet.ActionServlet
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * May 15, 2017 2:18:47 PM
 *
 */
public class ActionServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        
        String jsonObject = "{\"id\": 1, \"name\": \"Nama 1\", \"alamat\": \"Tangerang\"}";
        
        out.print(jsonObject);
        out.flush();
    }

}
