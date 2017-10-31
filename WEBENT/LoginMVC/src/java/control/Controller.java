/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Book;
import model.DataProcess;

/**
 *
 * @author Apple
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

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
        String ac = request.getParameter("action");
        if ("Del".equalsIgnoreCase(ac)) {
            delRequest(request, response);
        } else if ("Edit".equalsIgnoreCase(ac)) {
            editRequest(request, response);
        } else if ("GetData".equalsIgnoreCase(ac)) {
            getDataRequest(request, response);
        } else if ("Login".equalsIgnoreCase(ac)) {
            loginRequest(request, response);
        } else if ("Update".equalsIgnoreCase(ac)) {
            updateRequest(request, response);
        }
    }

    protected void delRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        DataProcess dt = new DataProcess();
        if (dt.deleteBook(id)) {
            ArrayList list = dt.getData();
            response.sendRedirect("Home.jsp");
        }
    }

    protected void editRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DataProcess dt = new DataProcess();
        String id = request.getParameter("id");
        Book book = dt.getByID(id);
        RequestDispatcher ds = request.getRequestDispatcher("Edit.jsp");
        request.setAttribute("book", book);
        ds.forward(request, response);

    }

    protected void getDataRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DataProcess dt = new DataProcess();
        ArrayList list = dt.getData();
        RequestDispatcher ds = request.getRequestDispatcher("Home.jsp");
        request.setAttribute("Blist", list);
        ds.forward(request, response);
    }

    protected static void updateRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DataProcess dt = new DataProcess();
        String id = request.getParameter("txtbookId");
        String title = request.getParameter("txtTitle");
        String price = request.getParameter("txtPrice");
        String description = request.getParameter("txtDescription");
        String dateTime = request.getParameter("txtDateTime");
        String image = request.getParameter("txtImage");

        if (dt.upDate(id, title, price, description, dateTime, image)) {
            response.sendRedirect("Home.jsp");
        } else {
            response.sendRedirect("Error.jsp");
        }
    }

    protected void loginRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DataProcess dt = new DataProcess();
        String user = request.getParameter("txtUser");
        String pass = request.getParameter("txtPass");
     //   ServletConfig config = this.getServletConfig(); //ServletConfig and ServletContext
     // String song = config.getInitParameter("Song");
        
       if (dt.checkLogin(user, pass)) {
            ArrayList list = dt.getData();
            RequestDispatcher ds = request.getRequestDispatcher("Home.jsp");
            request.setAttribute("Blist", list);
       //     request.setAttribute("Song", song);
            ds.forward(request, response);
        } else {
            response.sendRedirect("Login.jsp");
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
