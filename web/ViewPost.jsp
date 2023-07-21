
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Post</title>
       <style>
         *
        {
        margin:0;
        padding:0;
        }
        body
        {
         border: white 20px;
         margin-top: 300px;
         margin-left: 600px;
        background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);
         background-size: cover;
        
        
         
         
        }
        .table
        {
            border: white;
            box-sizing: border-box;
            box-shadow: black 20px;
        }
        h1{
         font-size: 50px;
         line-height: 64px;
         color: #222;
         color: #03fcfc;
}
        </style>
    </head>
    <body>
        <%
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
              <table border="2">
          <th>FAID</th>
          <th>TAID</th>
          <th>POST</th>
          <th>Postdate</th>
          <th>Action</th>
                
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
        
        %>
        <tr>
            <td><%=rs.getString("faid")%></td>
            <td><%=rs.getString("taid") %></td>
            <td><%=rs.getString("post") %></td>
            <td><%=rs.getString("postdate") %></td>
            <td><a href="Delete?aid=<%=rs.getString("aid") %>">Delete</a></td>
                
                
        </tr>
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

     </table>
     
       <a href ='HomePage.jsp'> Back to Home </a>
       
       
       
       
    </body>
</html>
