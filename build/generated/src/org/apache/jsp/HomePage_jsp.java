<<<<<<< HEAD
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Home Page</title>\n");
      out.write("    <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("            padding-left: 600px;\n");
      out.write("            margin-right: 800px;\n");
      out.write("            margin-top: 300px;\n");
      out.write("            background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        ul {\n");
      out.write("            list-style-type: none;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li {\n");
      out.write("            display: inline-block;\n");
      out.write("            margin-right: 15px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li a {\n");
      out.write("            display: block;\n");
      out.write("            color: #fff;\n");
      out.write("            text-decoration: none;\n");
      out.write("            padding: 5px 10px;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            background-color: rgba(0, 123, 255, 0.8);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        li a:hover {\n");
      out.write("            background-color: rgba(0, 100, 200, 0.8);\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    ");
 
        String name = "";
        Object anyvar = request.getSession().getAttribute("anyvar");
        if (anyvar != null) {
            name = anyvar.toString();

            
        } else {
//            response.sendRedirect("LoginPage.jsp");
        }
    
      out.write("\n");
      out.write("    \n");
      out.write("    <ul>\n");
      out.write("        <li><a href=\"HomePage.jsp\">Welcome ");
      out.print( name );
      out.write("</a></li>\n");
      out.write("        <li><a href=\"AddFriend.jsp\">Add Friend</a></li>\n");
      out.write("        <li><a href=\"ViewPost.jsp\">View Posts</a></li>\n");
      out.write("        <li><a href=\"Addpost.jsp\">Add Posts</a></li>\n");
      out.write("        <li><a href=\"LoginPage.jsp\">Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("</body>\n");
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

public final class HomePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     \n");
      out.write("        <title>JSP Page</title>\n");
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
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");

            String name="";
            try{
            
            if(request.getSession().getAttribute("anyvar")!=null)
            {
                name=request.getSession().getAttribute("anyvar").toString();
                System.err.println("--> " + name);
            }else
            {
                response.sendRedirect("LoginPage.jsp");
            }
            
           }catch(Exception e ){      
            response.sendRedirect("LoginPage.jsp");
            e.printStackTrace();
           }
            
      out.write("\n");
      out.write("            \n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"HomePage.jsp\">Welcome ");
      out.print(name);
      out.write("</a></li>\n");
      out.write("            <li><a href=\"AddFriend.jsp\">Add Friend</a></li>\n");
      out.write("            <li><a href=\"ViewPost.jsp\">View Posts</a></li>\n");
      out.write("            <li><a href=\"Addpost.jsp\">Add Posts</a></li>\n");
      out.write("            <li><a href=\"LoginPage.jsp\">Logout</a></li>\n");
      out.write("        </ul>\n");
      out.write("            \n");
      out.write("       \n");
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
