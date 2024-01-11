<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJINKYA
 */
public class OTP extends HttpServlet {
    String myuserid = "";
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OTP</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OTP at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         response.setContentType("text/html;charset=UTF-8");
       String username = request.getParameter("txt_username");
       String password = request.getParameter("txt_password");
       String txt_otp = request.getParameter("txt_otp");
       
         boolean acctfound = false;
        try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/db_myspace";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT  * FROM tbl_user WHERE txt_email ='" + username + "'" + "AND txt_password ='" + password + "' AND OTP='"+txt_otp+"'";
            // execute the query, and get a java resultset
            try ( // create the java statement

                    Statement st = conn.createStatement()) {
                // execute the query, and get a java resultset
                ResultSet rs = st.executeQuery(query);
                //rs.first();

                while (rs.next()) {
                    try (PrintWriter out = response.getWriter()) {
                        String myusername = rs.getString("txt_name");
                        myuserid = rs.getString("aid");
                        System.err.println("--> " + username);
                        request.getSession().setAttribute("anyvar", myusername);
                        request.getSession().setAttribute("userrid", myuserid);
                      
                        //response.sendRedirect("HomePage.jsp");
                        request.getRequestDispatcher("HomePage.jsp").forward(request, response);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
            if (!acctfound) {
                PrintWriter out = response.getWriter();
                out.println("Login failed");
                //pop up
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Login Failed, please enter correct user id and password');");
                out.println("window.location.href = \"LoginPage.jsp\";");
                out.println("</script>");
            }

        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJINKYA
 */
public class OTP extends HttpServlet {
    String myuserid = "";
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OTP</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OTP at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         response.setContentType("text/html;charset=UTF-8");
       String username = request.getParameter("txt_username");
       String password = request.getParameter("txt_password");
       String txt_otp = request.getParameter("txt_otp");
       
         boolean acctfound = false;
        try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/db_myspace";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT  * FROM tbl_user WHERE txt_email ='" + username + "'" + "AND txt_password ='" + password + "' AND OTP='"+txt_otp+"'";
            // execute the query, and get a java resultset
            try ( // create the java statement

                    Statement st = conn.createStatement()) {
                // execute the query, and get a java resultset
                ResultSet rs = st.executeQuery(query);
                //rs.first();

                while (rs.next()) {
                    try (PrintWriter out = response.getWriter()) {
                        String myusername = rs.getString("txt_name");
                        myuserid = rs.getString("aid");
                        System.err.println("--> " + username);
                        request.getSession().setAttribute("anyvar", myusername);
                        request.getSession().setAttribute("userrid", myuserid);
                      
                        //response.sendRedirect("HomePage.jsp");
                        request.getRequestDispatcher("HomePage.jsp").forward(request, response);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
            if (!acctfound) {
                PrintWriter out = response.getWriter();
                out.println("Login failed");
                //pop up
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Login Failed, please enter correct user id and password');");
                out.println("window.location.href = \"LoginPage.jsp\";");
                out.println("</script>");
            }

        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
