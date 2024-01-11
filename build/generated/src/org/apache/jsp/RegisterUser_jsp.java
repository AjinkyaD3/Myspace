<<<<<<< HEAD
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Register page </title>\n");
      out.write("        <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("            padding-left: 600px;\n");
      out.write("            margin-right: 800px;\n");
      out.write("            margin-top: 300px;\n");
      out.write("            background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("        form {\n");
      out.write("            width: 300px;\n");
      out.write("            padding: 20px;\n");
      out.write("            background-color: rgba(255, 255, 255, 0.7);\n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("        form input[type=\"text\"],\n");
      out.write("        form input[type=\"number\"],\n");
      out.write("        form input[type=\"email\"],\n");
      out.write("        form input[type=\"password\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("            border: 1px solid #ccc;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        form input[type=\"submit\"] {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 10px;\n");
      out.write("            background-color: #007bff;\n");
      out.write("            color: #fff;\n");
      out.write("            border: none;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        form input[type=\"submit\"]:hover {\n");
      out.write("            background-color: #0056b3;\n");
      out.write("        }\n");
      out.write("        form a {\n");
      out.write("            display: block;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #007bff;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <form action=\"RegisterUser\" method=\"POST\">\n");
      out.write("            Name<br>\n");
      out.write("            <input type=\"text\" name=\"txt_name\" required=\"\"><br>\n");
      out.write("            Phone No<br>\n");
      out.write("            <input type=\"number\" name=\"txt_phone\" required=\"\"><br>\n");
      out.write("            Email<br>\n");
      out.write("            <input type=\"email\" name=\"txt_email\" required=\"\"><br>\n");
      out.write("            Password<br>\n");
      out.write("            <input type=\"password\" name=\"txt_password\" required=\"\"><br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Register\"><br>\n");
      out.write("            <a href ='LoginPage.jsp'> Back to Login </a>\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
=======
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegisterUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Register page </title>\n");
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
      out.write("                  background-size: cover;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <form action=\"RegisterUser\" method=\"POST\">\n");
      out.write("            Name<br>\n");
      out.write("            <input type=\"text\" name=\"txt_name\" required=\"\"><br>\n");
      out.write("            Phone No<br>\n");
      out.write("            <input type=\"number\" name=\"txt_phone\" required=\"\"><br>\n");
      out.write("            Email<br>\n");
      out.write("            <input type=\"email\" name=\"txt_email\" required=\"\"><br>\n");
      out.write("            Password<br>\n");
      out.write("            <input type=\"password\" name=\"txt_password\" required=\"\"><br>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"Register\"><br>\n");
      out.write("            <a href ='LoginPage.jsp'> Back to Login </a>\n");
      out.write("        </form>\n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
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
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
