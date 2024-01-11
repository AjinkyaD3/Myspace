<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJINKYA
 */
public class Decline extends HttpServlet {

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
            out.println("<title>Servlet Decline</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Decline at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
 response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet RegisterUs</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>User Post Sent Successfully</h1>");
//            out.println("<a href=\"HomePage.jsp\">Back To Home</a>");
//            out.println("</body>");
//            out.println("</html>");
     try{
      // create a mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/db_myspace";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
String taid = request.getParameter("aid");
String fromaid = request.getSession().getAttribute("userrid").toString();
         System.out.println(taid + "==========="+taid);
         System.out.println(taid + "==========="+fromaid);
      // the mysql insert statement
      String query = " update tbl_association  set  status = 'Decline' where uid ='"+fromaid +"'and tid ='"+ taid +"'";

// create a sql date object so we can use it in our INSERT statement
//      Calendar calendar = Calendar.getInstance();
//      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
     
//      preparedStmt.setString (1, fromaid);
//      preparedStmt.setString (2, taid);
//      preparedStmt.setString (1, "Accept");
      
      
      // execute the preparedstatement
      preparedStmt.executeUpdate();
      conn.close();
      request.getRequestDispatcher("AddFriend.jsp").forward(request, response);
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
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
        processRequest(request, response);
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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJINKYA
 */
public class Decline extends HttpServlet {

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
            out.println("<title>Servlet Decline</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Decline at " + request.getContextPath() + "</h1>");
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
//        processRequest(request, response);
 response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet RegisterUs</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>User Post Sent Successfully</h1>");
//            out.println("<a href=\"HomePage.jsp\">Back To Home</a>");
//            out.println("</body>");
//            out.println("</html>");
     try{
      // create a mysql database connection
      String myDriver = "org.gjt.mm.mysql.Driver";
      String myUrl = "jdbc:mysql://localhost/db_myspace";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl, "root", "");
String taid = request.getParameter("aid");
String fromaid = request.getSession().getAttribute("userrid").toString();
         System.out.println(taid + "==========="+taid);
         System.out.println(taid + "==========="+fromaid);
      // the mysql insert statement
      String query = " update tbl_association  set  status = 'Decline' where uid ='"+fromaid +"'and tid ='"+ taid +"'";

// create a sql date object so we can use it in our INSERT statement
//      Calendar calendar = Calendar.getInstance();
//      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
     
//      preparedStmt.setString (1, fromaid);
//      preparedStmt.setString (2, taid);
//      preparedStmt.setString (1, "Accept");
      
      
      // execute the preparedstatement
      preparedStmt.executeUpdate();
      conn.close();
      request.getRequestDispatcher("AddFriend.jsp").forward(request, response);
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
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
        processRequest(request, response);
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
