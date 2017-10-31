/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DataProcess;

/**
 *
 * @author Apple
 */
@WebServlet(name = "MySeverlet", urlPatterns = {"/MySeverlet"})
public class MySeverlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String u = request.getParameter("txtUser");
        String p = request.getParameter("txtPass");
        String remember = request.getParameter("ckRemember");

        DataProcess dt = new DataProcess();
        HttpSession session = request.getSession();
//        session.setAttribute("username", u);        

        if (dt.checkLogin(u, p)) {
            if (remember != null) {
                String[] cookieNames = {"user", "pass"};
                String[] cookieValues = {u, p};

                //Create cookies and add them to the HTTP response
                for (int i = 0; i < cookieNames.length; ++i) {
                    Cookie cookie = new Cookie(cookieNames[i], cookieValues[i]);
                    cookie.setMaxAge(10000); // set cookies co hieu luc 30 ngay
                    response.addCookie(cookie);
                    System.out.println("cookie path : " + cookie.getPath());

                }
                response.sendRedirect("Home.jsp");
            }
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
