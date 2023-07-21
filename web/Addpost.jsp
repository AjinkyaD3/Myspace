<%-- 
    Document   : addpost
    Created on : 21 Jun, 2023, 12:30:38 PM
    Author     : AJINKYA
--%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AddPost</title>
        <style>
            *
            {
                margin: 0;
                padding: 0;
            }
            body
            {
               padding-left: 600px;
               margin-right: 800px;
               margin-top: 300px;
                 background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);
                  background-size: cover;
            }
        </style>
    </head>
    <body> <%
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
            %>
            
        <form action="AddPost" method="POST">
            <input type="hidden" value="<%=name%>" name="fromuser">
            Select User to Send a Post<br>
            <%

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
      %>
      <select id="tuid" name="tuid">
          <%
      // iterate through the java resultset
      while (rs.next())
      {
        
    
        
        
        // print the results
        
        %>
      
          
            <option value="<%=rs.getString("aid")%>"><%=rs.getString("txt_name")%></option>
          
            
                
        
        <%
      }
      st.close();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception! ");
      System.err.println(e.getMessage());
    }
%>
        
            
            
        </select> <br>
        <br><textarea id="txt_post" name="txt_post" cols="5" rows="5"></textarea>
        <br>
        <input type="submit" value="Send My POST">
        <a href ='HomePage.jsp'> Back to Home </a>
        </form>   
    </body>
</html>
