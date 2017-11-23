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
    _jspx_dependants.add("/WEB-INF/tlds/TagWithAttribute.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_mytag_AttributeTag_name_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_mytag_AttributeTag_name_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_mytag_AttributeTag_name_nobody.release();
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
      out.write("%>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Tag with attribute</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Tag with attribute</h1>\n");
      out.write("        ");
      if (_jspx_meth_mytag_AttributeTag_0(_jspx_page_context))
        return;
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

  private boolean _jspx_meth_mytag_AttributeTag_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  mytag:AttributeTag
    myTag.AttributeTag _jspx_th_mytag_AttributeTag_0 = (myTag.AttributeTag) _jspx_tagPool_mytag_AttributeTag_name_nobody.get(myTag.AttributeTag.class);
    _jspx_th_mytag_AttributeTag_0.setPageContext(_jspx_page_context);
    _jspx_th_mytag_AttributeTag_0.setParent(null);
    _jspx_th_mytag_AttributeTag_0.setName("TriTuTag");
    int _jspx_eval_mytag_AttributeTag_0 = _jspx_th_mytag_AttributeTag_0.doStartTag();
    if (_jspx_th_mytag_AttributeTag_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_mytag_AttributeTag_name_nobody.reuse(_jspx_th_mytag_AttributeTag_0);
      return true;
    }
    _jspx_tagPool_mytag_AttributeTag_name_nobody.reuse(_jspx_th_mytag_AttributeTag_0);
    return false;
  }
}
