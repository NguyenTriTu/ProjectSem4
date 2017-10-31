package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import entity.Book;
import java.util.ArrayList;

public final class BookList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Book</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (getServletContext().getAttribute("data") == null) {
                response.sendRedirect("BookControl?action=getdata");
            } else {

        
      out.write("\n");
      out.write("        <h1>Book List~!</h1>\n");
      out.write("        <table Border=\"1\" width=\"90%\" align=\"center\" >\n");
      out.write("            <tr>\n");
      out.write("                <th>BookId</th>\n");
      out.write("                <th>Title</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                <th>Description</th>\n");
      out.write("                <th>DateTime</th>\n");
      out.write("                <th>Image</th>     \n");
      out.write("                <th>Delete</th>\n");
      out.write("                <th>Edit</th>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
  ArrayList list = new ArrayList();
                list = (ArrayList) getServletContext().getAttribute("data");
                for (int i = 0; i < list.size(); i++) {
                    Book newBook = (Book) list.get(i);
                    int id = newBook.getBookId();
                    String title = newBook.getTitle();
                    String date = newBook.getDatetime();
                    String des = newBook.getDescription();
                    String image = newBook.getImage();
                    double price = newBook.getPrice();
                    
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(title);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(price);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(des);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(date);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(image);
      out.write("</td>        \n");
      out.write("                <td>\n");
      out.write("                    <a href=\"BookControl?action=Del&id=");
      out.print(id);
      out.write("\">DELETE</a>\n");
      out.write("                </td>        \n");
      out.write("                <td>\n");
      out.write("                    <a href=\"BookControl?action=Edit&id=");
      out.print(id);
      out.write("\">EDIT</a>\n");
      out.write("                </td>        \n");
      out.write("                <td>\n");
      out.write("                    <a href=\"CartControl?action=add&id=");
      out.print(id);
      out.write("\">Add to Cart</a>\n");
      out.write("                </td>        \n");
      out.write("            </tr>\n");
      out.write("            ");
 }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");
 }
        
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
