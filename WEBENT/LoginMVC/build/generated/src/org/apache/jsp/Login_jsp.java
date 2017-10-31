package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script lang=\"javacript\" >\n");
      out.write("//            function LoginClick()\n");
      out.write("//            {\n");
      out.write("//                this.frmLogin.action = \"MySeverlet\";\n");
      out.write("//                this.frmLogin.submit();\n");
      out.write("//            }\n");
      out.write("//             function RegisterClick()\n");
      out.write("//            {\n");
      out.write("//                this.frmLogin.action = \"Controller?ac=Register\";\n");
      out.write("//                this.frmLogin.submit();\n");
      out.write("//            }\n");
      out.write("//            \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            if (request.getCookies() != null) {
                Cookie c[] = request.getCookies();
                String u = "";
                String p = "";
                for (int i = 0; i < c.length; i++) {
                    if (c[i].getName().equals("user")) {
                        u = c[i].getValue();
                    }
                    if (c[i].getName().equals("pass")) {
                        p = c[i].getValue();
                    }

                }

        
      out.write("\n");
      out.write("\n");
      out.write("        <h1>WellCome Back!</h1>\n");
      out.write("        <!--<FORM id=\"frmLogin\" action=\"Controller?ac=add\" onclick=\"LoginClick\">-->\n");
      out.write("        <FORM id=\"frmLogin\" action=\"MySeverlet\" onclick=\"LoginClick\" method=\"post\">\n");
      out.write("            User:<input type=\"text\" name=\"txtUser\" value=\"");
      out.print(u);
      out.write("\" /><br/>\n");
      out.write("            Pass:<input type=\"password\" name=\"txtPass\" value=\"");
      out.print(p);
      out.write("\"/><br/>\n");
      out.write("            <input type=\"submit\" name=\"action\" onclick=\"LoginClick\" value=\"Login\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"ckRemember\" checked=\"true\"/>\n");
      out.write("            <!--            <input type=\"submit\" name=\"action\" onclick=\"RegisterClick\" value=\"Register\"/>-->\n");
      out.write("        </FORM>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
            } else {           
        
      out.write("\n");
      out.write("        <h1>Login Form!</h1>\n");
      out.write("        <!--<FORM id=\"frmLogin\" action=\"Controller?ac=add\" onclick=\"LoginClick\">-->\n");
      out.write("        <FORM id=\"frmLogin\" action=\"MySeverlet\" onclick=\"LoginClick\" method=\"post\">\n");
      out.write("            User:<input type=\"text\" name=\"txtUser\" value=\"\" /><br/>\n");
      out.write("            Pass:<input type=\"password\" name=\"txtPass\"/><br/>\n");
      out.write("            <input type=\"submit\" name=\"action\" onclick=\"LoginClick\" value=\"Login\"/>\n");
      out.write("            <input type=\"checkbox\" name=\"ckRemember\" value=\"Remember Acc\"/>\n");
      out.write("            <!--            <input type=\"submit\" name=\"action\" onclick=\"RegisterClick\" value=\"Register\"/>-->\n");
      out.write("        </FORM>\n");

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
