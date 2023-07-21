package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Addpost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AddPost</title>\n");
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
      out.write("    <body> ");

            String name="";
//            try{
//            
//            if(request.getSession().getAttribute("anyvar")!=null)
//            {
//                name=request.getSession().getAttribute("anyvar").toString();
//                System.err.println("--> " + name);
//            }else
//            {
//                response.sendRedirect("LoginPage.jsp");
//            }
//            
//           }catch(Exception e ){      
//            response.sendRedirect("LoginPage.jsp");
//            e.printStackTrace();
//           }
            
      out.write("\n");
      out.write("            \n");
      out.write("        <form action=\"AddPost\" method=\"POST\">\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print(name);
      out.write("\" name=\"fromuser\">\n");
      out.write("            Select User to Send a Post<br>\n");
      out.write("            ");


    try
    {
      // create our mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/db_myspace";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM tbl_user";

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      out.write("\n");
      out.write("      <select id=\"tuid\" name=\"tuid\">\n");
      out.write("          ");

      // iterate through the java resultset
      while (rs.next())
      {
        
    
        
        
        // print the results
        
        
      out.write("\n");
      out.write("      \n");
      out.write("          \n");
      out.write("            <option value=\"");
      out.print(rs.getString("aid"));
      out.write('"');
      out.write('>');
      out.print(rs.getString("txt_name"));
      out.write("</option>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("                \n");
      out.write("        \n");
      out.write("        ");

      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }

      out.write("\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </select> <br>\n");
      out.write("        <br><textarea id=\"txt_post\" name=\"txt_post\" cols=\"5\" rows=\"5\"></textarea>\n");
      out.write("        <br>\n");
      out.write("        <input type=\"submit\" value=\"Send My POST\">\n");
      out.write("        <a href ='HomePage.jsp'> Back to Home </a>\n");
      out.write("        </form>   \n");
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
