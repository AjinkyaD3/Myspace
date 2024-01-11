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
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AJINKYA
 */
public class AddPost extends HttpServlet {

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
            out.println("<title>Servlet AddPost</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddPost at " + request.getContextPath() + "</h1>");
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
        String txt_post = request.getParameter("txt_post");
        String bad[] = {"arse",
            "arsehead",
            "arsehole",
            "ass",
            "asshole",
            "bastard",
            "bitch",
            "bloody",
            "bollocks",
            "brotherfucker",
            "bugger",
            "bullshit",
            "child-fucker",
            "Christ on a bike",
            "Christ on a cracker",
            "cock",
            "cocksucker",
            "crap",
            "cunt",
            "damn",
            "damn it",
            "dick",
            "dickhead",
            "dyke",
            "fatherfucker",
            "frigger",
            "fuck",
            "goddamn",
            "godsdamn",
            "hell",
            "holy shit",
            "horseshit",
            "in shit",
            "Jesus Christ",
            "Jesus fuck",
            "Jesus H. Christ",
            "Jesus Harold Christ",
            "Jesus, Mary and Joseph",
            "Jesus wept",
            "kike",
            "motherfucker",
            "nigga",
            "nigra",
            "piss",
            "prick",
            "pussy",
            "shit",
            "shit ass",
            "shite",
            "sisterfucker",
            "slut",
            "son of a whore",
            "son of a bitch",
            "spastic",
            "sweet Jesus",
            "turd",
            "twat",
            "wanker", "hello"};
        boolean filter = false;
        for (String item : bad) {
            if (txt_post.contains(item)) {
                filter = true;
                break;
            }
        }

        if (filter == true) {
            System.err.println("chalat ahe ");

            request.getRequestDispatcher("Addpost.jsp").forward(request, response);
        } else {
            try {
                // create a mysql database connection
                String myDriver = "org.gjt.mm.mysql.Driver";
                String myUrl = "jdbc:mysql://localhost/db_myspace";
                Class.forName(myDriver);
                Connection conn = DriverManager.getConnection(myUrl, "root", "");
                // the mysql insert statement
                String query = " insert into tbl_post (aid,faid, taid, post, postdate)"
                        + " values (?, ?, ?, ?, ?)";
// create a sql date object so we can use it in our INSERT statement
                Calendar calendar = Calendar.getInstance();
                java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, null);
                preparedStmt.setString(2, request.getParameter("fromuser"));
                preparedStmt.setString(3, request.getParameter("tuid"));
                preparedStmt.setString(4, request.getParameter("txt_post"));
                preparedStmt.setString(5, startDate.toString());
                // execute the preparedstatement
                preparedStmt.execute();
                conn.close();
            } catch (Exception e) {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }

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
public class AddPost extends HttpServlet {

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
            out.println("<title>Servlet AddPost</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddPost at " + request.getContextPath() + "</h1>");
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
        String txt_post = request.getParameter("txt_post");
        String bad[] = {"arse",
            "arsehead",
            "arsehole",
            "ass",
            "asshole",
            "bastard",
            "bitch",
            "bloody",
            "bollocks",
            "brotherfucker",
            "bugger",
            "bullshit",
            "child-fucker",
            "Christ on a bike",
            "Christ on a cracker",
            "cock",
            "cocksucker",
            "crap",
            "cunt",
            "damn",
            "damn it",
            "dick",
            "dickhead",
            "dyke",
            "fatherfucker",
            "frigger",
            "fuck",
            "goddamn",
            "godsdamn",
            "hell",
            "holy shit",
            "horseshit",
            "in shit",
            "Jesus Christ",
            "Jesus fuck",
            "Jesus H. Christ",
            "Jesus Harold Christ",
            "Jesus, Mary and Joseph",
            "Jesus wept",
            "kike",
            "motherfucker",
            "nigga",
            "nigra",
            "piss",
            "prick",
            "pussy",
            "shit",
            "shit ass",
            "shite",
            "sisterfucker",
            "slut",
            "son of a whore",
            "son of a bitch",
            "spastic",
            "sweet Jesus",
            "turd",
            "twat",
            "wanker", "hello"};
        boolean filter = false;
        for (String item : bad) {
            if (txt_post.contains(item)) {
                filter = true;
                break;
            }
        }

        if (filter == true) {
            System.err.println("chalat ahe ");

            request.getRequestDispatcher("Addpost.jsp").forward(request, response);
        } else {
            try {
                // create a mysql database connection
                String myDriver = "org.gjt.mm.mysql.Driver";
                String myUrl = "jdbc:mysql://localhost/db_myspace";
                Class.forName(myDriver);
                Connection conn = DriverManager.getConnection(myUrl, "root", "");
                // the mysql insert statement
                String query = " insert into tbl_post (aid,faid, taid, post, postdate)"
                        + " values (?, ?, ?, ?, ?)";
// create a sql date object so we can use it in our INSERT statement
                Calendar calendar = Calendar.getInstance();
                java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());
                // create the mysql insert preparedstatement
                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1, null);
                preparedStmt.setString(2, request.getParameter("fromuser"));
                preparedStmt.setString(3, request.getParameter("tuid"));
                preparedStmt.setString(4, request.getParameter("txt_post"));
                preparedStmt.setString(5, startDate.toString());
                // execute the preparedstatement
                preparedStmt.execute();
                conn.close();
            } catch (Exception e) {
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }

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
