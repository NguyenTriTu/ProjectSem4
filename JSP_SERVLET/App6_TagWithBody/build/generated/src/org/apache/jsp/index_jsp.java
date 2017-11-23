package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/tlds/TagWithBody.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_UppercaseTag_UpperCase;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_UppercaseTag_UpperCase = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_UppercaseTag_UpperCase.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      //  UppercaseTag:UpperCase
      mytag.UpperCase _jspx_th_UppercaseTag_UpperCase_0 = (mytag.UpperCase) _jspx_tagPool_UppercaseTag_UpperCase.get(mytag.UpperCase.class);
      _jspx_th_UppercaseTag_UpperCase_0.setPageContext(_jspx_page_context);
      _jspx_th_UppercaseTag_UpperCase_0.setParent(null);
      int _jspx_eval_UppercaseTag_UpperCase_0 = _jspx_th_UppercaseTag_UpperCase_0.doStartTag();
      if (_jspx_eval_UppercaseTag_UpperCase_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_UppercaseTag_UpperCase_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_UppercaseTag_UpperCase_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_UppercaseTag_UpperCase_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("            These is follow information are displayed using tag handler :\n");
          out.write("            <OL>\n");
          out.write("                ");
          out.write("\n");
          out.write("                <LI>Current Time : ");
          out.print(new java.util.Date());
          out.write("\n");
          out.write("                ");
          out.write("\n");
          out.write("                <LI>Requesting hostname : ");
          out.print( request.getRemoteHost());
          out.write("\n");
          out.write("                ");
          out.write("\n");
          out.write("                <LI>Session ID: ");
          out.print( session.getId());
          out.write("\n");
          out.write("            </OL>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_UppercaseTag_UpperCase_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_UppercaseTag_UpperCase_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_UppercaseTag_UpperCase_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_UppercaseTag_UpperCase.reuse(_jspx_th_UppercaseTag_UpperCase_0);
        return;
      }
      _jspx_tagPool_UppercaseTag_UpperCase.reuse(_jspx_th_UppercaseTag_UpperCase_0);
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
