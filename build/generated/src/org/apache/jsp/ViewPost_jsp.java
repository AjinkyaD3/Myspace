<<<<<<< HEAD
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class ViewPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Post</title>\n");
      out.write("       <style>\n");
      out.write("  * {\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  body {\n");
      out.write("    border: 20px solid white;\n");
      out.write("    margin-top: 300px;\n");
      out.write("    margin-left: 600px;\n");
      out.write("    background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);\n");
      out.write("    background-size: cover;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  table {\n");
      out.write("    border: 2px solid white;\n");
      out.write("    width: 100%;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    color: #fff;\n");
      out.write("    text-align: center;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  table th, table td {\n");
      out.write("    padding: 10px;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  th {\n");
      out.write("    background-color: #03fcfc;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  td {\n");
      out.write("    background-color: #00cccc;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  a {\n");
      out.write("    display: block;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    color: #03fcfc;\n");
      out.write("    text-decoration: none;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  a:hover {\n");
      out.write("    color: #00cccc;\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  h1 {\n");
      out.write("    font-size: 50px;\n");
      out.write("    line-height: 64px;\n");
      out.write("    color: #03fcfc;\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String name="";
//            try{
            
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
      out.write("              <table border=\"2\">\n");
      out.write("          <th>FAID</th>\n");
      out.write("          <th>TAID</th>\n");
      out.write("          <th>POST</th>\n");
      out.write("          <th>Postdate</th>\n");
      out.write("          <th>Action</th>\n");
      out.write("                \n");
=======
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class ViewPost_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View Post</title>\n");
      out.write("       <style>\n");
      out.write("         *\n");
      out.write("        {\n");
      out.write("        margin:0;\n");
      out.write("        padding:0;\n");
      out.write("        }\n");
      out.write("        body\n");
      out.write("        {\n");
      out.write("         border: white 20px;\n");
      out.write("         margin-top: 300px;\n");
      out.write("         margin-left: 600px;\n");
      out.write("        background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);\n");
      out.write("         background-size: cover;\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         \n");
      out.write("         \n");
      out.write("        }\n");
      out.write("        .table\n");
      out.write("        {\n");
      out.write("            border: white;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("            box-shadow: black 20px;\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("         font-size: 50px;\n");
      out.write("         line-height: 64px;\n");
      out.write("         color: #222;\n");
      out.write("         color: #03fcfc;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
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
      out.write("              <table border=\"2\">\n");
      out.write("          <th>FAID</th>\n");
      out.write("          <th>TAID</th>\n");
      out.write("          <th>POST</th>\n");
      out.write("          <th>Postdate</th>\n");
      out.write("          <th>Action</th>\n");
      out.write("                \n");
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d


    try
    {
      // create our mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/db_myspace";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
      
      // our SQL SELECT query. 
      // if you only need a few columns, specify them by name instead of using "*"
      String query = "SELECT * FROM tbl_post";

      // create the java statement
      Statement st = conn.createStatement();
      
      // execute the query, and get a java resultset
      ResultSet rs = st.executeQuery(query);
      
      // iterate through the java resultset
      while (rs.next())
      {
        int id = rs.getInt("aid");
        String faid = rs.getString("faid");
        String taid = rs.getString("taid");
        String post = rs.getString("post");
        String postdate = rs.getString("postdate");
        
        
        // print the results
        
<<<<<<< HEAD
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(rs.getString("faid"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("taid") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("post") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("postdate") );
      out.write("</td>\n");
      out.write("            <td><a href=\"Delete?aid=");
      out.print(rs.getString("aid") );
      out.write("\">Delete</a></td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </tr>\n");
      out.write("        ");
=======
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(rs.getString("faid"));
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("taid") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("post") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print(rs.getString("postdate") );
      out.write("</td>\n");
      out.write("            <td><a href=\"Delete?aid=");
      out.print(rs.getString("aid") );
      out.write("\">Delete</a></td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("        </tr>\n");
      out.write("        ");
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d

      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
<<<<<<< HEAD

      out.write("\n");
      out.write("\n");
      out.write("     </table>\n");
      out.write("     \n");
      out.write("       <a href ='HomePage.jsp'> Back to Home </a>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
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
=======

      out.write("\n");
      out.write("\n");
      out.write("     </table>\n");
      out.write("     \n");
      out.write("       <a href ='HomePage.jsp'> Back to Home </a>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       \n");
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
