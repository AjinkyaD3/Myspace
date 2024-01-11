<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJINKYA
 */
public class SearchPerson extends HttpServlet {

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
            out.println("<title>Servlet SearchPerson</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchPerson at " + request.getContextPath() + "</h1>");
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
        String search = request.getParameter("txt_search");
        System.out.println(search);

        String myuserid = request.getSession().getAttribute("userrid").toString();
        
        System.err.println("--> " + myuserid);
        //populate table with movie entries
        try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/db_myspace";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM tbl_user  WHERE txt_name Like '%" + search + "%'";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            PrintWriter out = response.getWriter();
            out.println(" <table border=\"5\">\n"
                        + "          <th>Aid</th>\n"
                        + "          <th>Name</th>\n"
                        + "          <th>Phone</th>\n"
                        + "          <th>email</th>\n"
                        + "          <th>Status</th>");
            // iterate through the java resultset
            while (rs.next()) {
                int aid = rs.getInt("aid");
                String name = rs.getString("txt_name");
                String phone = rs.getString("txt_phone");
                String email = rs.getString("txt_email");

                //pop up
                
                out.println(" <tr>\n"
                        + "            <td>" + aid + ""
                        + "            <td>" + name + ""
                        + "            <td>" + phone + ""
                        + "            <td>" + email + ""
                        + "                \n"
                        + "                \n" + "<td><a href=\"SendRequest?aid="+aid+"\"> SendRequest</a></td>"
                        + "        </tr>");
               

            }
             out.println(" <a href='SearchPerson.jsp'> Back to search  </a>");
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
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
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJINKYA
 */
public class SearchPerson extends HttpServlet {

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
            out.println("<title>Servlet SearchPerson</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SearchPerson at " + request.getContextPath() + "</h1>");
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
        String search = request.getParameter("txt_search");
        System.out.println(search);

        String myuserid = request.getSession().getAttribute("userrid").toString();
        
        System.err.println("--> " + myuserid);
        //populate table with movie entries
        try {
            // create our mysql database connection
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost/db_myspace";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            // our SQL SELECT query. 
            // if you only need a few columns, specify them by name instead of using "*"
            String query = "SELECT * FROM tbl_user  WHERE txt_name Like '%" + search + "%'";

            // create the java statement
            Statement st = conn.createStatement();

            // execute the query, and get a java resultset
            ResultSet rs = st.executeQuery(query);
            PrintWriter out = response.getWriter();
            out.println(" <table border=\"5\">\n"
                        + "          <th>Aid</th>\n"
                        + "          <th>Name</th>\n"
                        + "          <th>Phone</th>\n"
                        + "          <th>email</th>\n"
                        + "          <th>Status</th>");
            // iterate through the java resultset
            while (rs.next()) {
                int aid = rs.getInt("aid");
                String name = rs.getString("txt_name");
                String phone = rs.getString("txt_phone");
                String email = rs.getString("txt_email");

                //pop up
                
                out.println(" <tr>\n"
                        + "            <td>" + aid + ""
                        + "            <td>" + name + ""
                        + "            <td>" + phone + ""
                        + "            <td>" + email + ""
                        + "                \n"
                        + "                \n" + "<td><a href=\"SendRequest?aid="+aid+"\"> SendRequest</a></td>"
                        + "        </tr>");
               

            }
             out.println(" <a href='SearchPerson.jsp'> Back to search  </a>");
            st.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
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
