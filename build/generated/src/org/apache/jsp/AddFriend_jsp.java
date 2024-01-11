<<<<<<< HEAD
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AddFriend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        body {\n");
      out.write("            border: 20px solid white;\n");
      out.write("            margin-top: 300px;\n");
      out.write("            margin-left: 600px;\n");
      out.write("            background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            border: 5px solid white;\n");
      out.write("            width: 100%;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table th,\n");
      out.write("        table td {\n");
      out.write("            padding: 10px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            background-color: #03fcfc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            background-color: #00cccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            display: block;\n");
      out.write("            margin-top: 20px;\n");
      out.write("            color: #03fcfc;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a:hover {\n");
      out.write("            color: #00cccc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        h1 {\n");
      out.write("            font-size: 50px;\n");
      out.write("            line-height: 64px;\n");
      out.write("            color: #03fcfc;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href ='SearchPerson.jsp'> Search User </a>\n");
      out.write("        <table border=\\\"5\\\">\n");
      out.write("            <th>aid</th>\n");
      out.write("            <th>uid</th>\n");
      out.write("            <th>tid</th>\n");
      out.write("            <th>status</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("                ");
=======
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class AddFriend_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            *\n");
      out.write("            {\n");
      out.write("                margin:0;\n");
      out.write("                padding:0;\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                border: white 20px;\n");
      out.write("                margin-top: 300px;\n");
      out.write("                margin-left: 600px;\n");
      out.write("                background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);\n");
      out.write("                background-size: cover;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .table\n");
      out.write("            {\n");
      out.write("                border: white;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                box-shadow: black 20px;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                font-size: 50px;\n");
      out.write("                line-height: 64px;\n");
      out.write("                color: #222;\n");
      out.write("                color: #03fcfc;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href ='SearchPerson.jsp'> Search User </a>\n");
      out.write("        <table border=\\\"5\\\">\n");
      out.write("            <th>aid</th>\n");
      out.write("            <th>uid</th>\n");
      out.write("            <th>tid</th>\n");
      out.write("            <th>status</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("                ");
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d


                    try {
                        // create our mysql database connection
                        String myDriver = "org.gjt.mm.mysql.Driver";
                        String myUrl = "jdbc:mysql://localhost/db_myspace";
                        Class.forName(myDriver);
                        Connection conn = DriverManager.getConnection(myUrl, "root", "");

                        // our SQL SELECT query. 
                        // if you only need a few columns, specify them by name instead of using "*"
                        String query = "SELECT * FROM tbl_association where status = 'pending'";

                        // create the java statement
                        Statement st = conn.createStatement();

                        // execute the query, and get a java resultset
                        ResultSet rs = st.executeQuery(query);

                        // iterate through the java resultset
                        while (rs.next()) {
                            int aid = rs.getInt("aid");
//                            int aid = rs.getInt("aid");
<<<<<<< HEAD
                            System.out.print("========>" + aid);
//                            String uid = rs.getString("uid");
//                            String tid = rs.getString("tid");
//                            String status = rs.getString("status");

                            // print the results

                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("aid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("uid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("tid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("                <td><a href=\"Accept?tid=");
      out.print(rs.getString("tid"));
      out.write("\"> Accept</a></td>\n");
      out.write("                <td><a href=\"Decline?tid=");
      out.print(rs.getString("tid"));
      out.write("\" > Decline</a></td>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
=======
                            System.out.print("========>"+aid);
                            String uid = rs.getString("uid");
                            String tid = rs.getString("tid");
                            String status = rs.getString("status");
                           

                            // print the results

                
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("aid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("uid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("tid"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("status"));
      out.write("</td>\n");
      out.write("                <td><a href=\"Accept?tid=");
      out.print(rs.getString("tid"));
      out.write("\"> Accept</a></td>\n");
      out.write("                <td><a href=\"Decline?tid=");
      out.print(rs.getString("tid"));
      out.write("\" > Decline</a></td>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d

                    }
                    st.close();
                } catch (Exception e) {
<<<<<<< HEAD
                    e.printStackTrace();
                    System.err.println("Got an exception! ");
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <a href ='HomePage.jsp'> Back to Home </a>\n");
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
=======
e.printStackTrace();
                    System.err.println("Got an exception! ");
                    e.printStackTrace();
                }
            
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("        <a href ='HomePage.jsp'> Back to Home </a>\n");
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
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
