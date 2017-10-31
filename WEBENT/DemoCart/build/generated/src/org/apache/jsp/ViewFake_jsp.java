package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.BookCart;
import entity.CartModel;
import entity.Book;
import model.DataProcess;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import entity.Cart;

public final class ViewFake_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Cart</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Your Cart Details!</h1>\n");
      out.write("         <form method=\"post\" action=\"CartControl?action=Update\">\n");
      out.write("            <table Border=\"1\" width=\"90%\" align=\"center\" >\n");
      out.write("                \n");
      out.write("                <tr>                           \n");
      out.write("                    <th>BookId</th>\n");
      out.write("                    <th>Title</th>\n");
      out.write("                    <th>Quantity</th>\n");
      out.write("                    <th>Price</th>\n");
      out.write("                    <th>Amount</th>\n");
      out.write("                    <th>Delete</th>\n");
      out.write("                </tr>\n");
      out.write("                ");


                    CartModel cart = (CartModel) session.getAttribute("cart");
                    float total = 0;
                    for (int i = 0; i < cart.getContent().size(); i++) {
                        BookCart book = cart.getContent().get(i);
                        String id = book.getId();
                        String title = book.getTitle();
                        int q = book.getQuantity();
                        float price = book.getPrice();
                        float amount = q * price;
                        total += amount;
                        int index = i;
                
      out.write("\n");
      out.write("                \n");
      out.write("               \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(title);
      out.write("</td>\n");
      out.write("                    <td><input type=\"text\" name=\"txtQ");
      out.print(index);
      out.write("\" value=\"");
      out.print(q);
      out.write("\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td>");
      out.print(price);
      out.write("</td>\n");
      out.write("\n");
      out.write("                    <td>");
      out.print(amount);
      out.write("</td>\n");
      out.write("                    <td><a href=\"CartControl?action=del&id=");
      out.print(id);
      out.write("\">Delete</a></td>  \n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"3\">Total Amount : </td>\n");
      out.write("                    <td colspan=\"2\">");
      out.print(total);
      out.write("$</td>\n");
      out.write("                </tr>             \n");
      out.write("                 ");
}
      out.write("\n");
      out.write("                 \n");
      out.write("                    <tr>\n");
      out.write("                    <td colspan=\"3\">\n");
      out.write("                        <input type=\"submit\" value=\"Okie\" />\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("          </form>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
