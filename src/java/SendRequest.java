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
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJINKYA
 */
public class SendRequest extends HttpServlet {

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
            out.println("<title>Servlet SendRequest</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SendRequest at " + request.getContextPath() + "</h1>");
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
         System.err.println("TAID IS --> " + taid);
         
String fromaid = request.getSession().getAttribute("userrid").toString();
System.err.println("fromaid IS --> " + fromaid);
      // the mysql insert statement
      String query = " insert into tbl_association (aid,uid, tid, status)"
        + " values (?, ?, ?, ?)";
// create a sql date object so we can use it in our INSERT statement
      Calendar calendar = Calendar.getInstance();
//      java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = conn.prepareStatement(query);
      preparedStmt.setString (1, null);
      preparedStmt.setString (2, fromaid);
      preparedStmt.setString (3, taid);
      preparedStmt.setString (4, "Pending");
      
      
      // execute the preparedstatement
      preparedStmt.execute();
      conn.close();
      request.getRequestDispatcher("SearchPerson.jsp").forward(request, response);
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
