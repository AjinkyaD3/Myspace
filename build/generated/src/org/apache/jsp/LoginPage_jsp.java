package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login </title>\n");
      out.write("        <style>\n");
      out.write("            *\n");
      out.write("            {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("               padding-left: 600px;\n");
      out.write("               margin-right: 800px;\n");
      out.write("               margin-top: 300px;\n");
      out.write("                 background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);\n");
      out.write("                 background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("             ");

           
            request.getSession().setAttribute("anyvar", null);
            System.err.println("request reset succeffully");
            
            
            
      out.write("\n");
      out.write("        <form action=\"LoginPage\" method=\"POST\">\n");
      out.write("            Username <br>\n");
      out.write("            <input type=\"email\" name=\"txt_username\" required=\"\"><br>\n");
      out.write("            Password<br>\n");
      out.write("            <input type=\"password\" name=\"txt_pass\" required=\"\"><br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"LOGIN\"><br>\n");
      out.write("            <br>\n");
      out.write("            <a href='RegisterUser.jsp'> Create Account </a>\n");
      out.write("        </form>\n");
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
