/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.CartModel;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DataProcess;

/**
 *
 * @author Apple
 */
@WebServlet(name = "CartControl", urlPatterns = {"/CartControl"})
public class CartControl extends HttpServlet {

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
        String action = request.getParameter("action");
        if ("add".equalsIgnoreCase(action)) {
            String id = request.getParameter("id");
            HttpSession session = request.getSession();
            CartModel cart = (CartModel) session.getAttribute("cart");
            if (cart == null) {
                cart = new CartModel();
            }
            DataProcess dt = new DataProcess();
            cart.addItem(dt.getBook(id));
            session.setAttribute("cart", cart);
            response.sendRedirect("ViewFake.jsp");
        }
        if ("del".equalsIgnoreCase(action)) {
            String id = request.getParameter("id");
            HttpSession session = request.getSession();
            CartModel cart = (CartModel) session.getAttribute("cart");
            // DataProcess dt = new DataProcess();
            cart.deleteItem(id);
            session.setAttribute("cart", cart);
            response.sendRedirect("ViewFake.jsp");
        }
        if ("Update".equalsIgnoreCase(action)) {
            HttpSession session = request.getSession();
            CartModel cart = (CartModel) session.getAttribute("cart");
            String[] b = request.getParameterValues("txtQ");
            for (int i = 0; i < cart.getSize(); i++) {

                int quantity = Integer.parseInt(b[i]);
                cart.updateCart(i, quantity);
            }

            session.setAttribute("cart", cart);
            response.sendRedirect("ViewFake.jsp");

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
