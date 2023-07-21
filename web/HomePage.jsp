<%-- 
    Document   : HomePage
    Created on : 20 Jun, 2023, 11:47:38 AM
    Author     : AJINKYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     
        <title>JSP Page</title>
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
            
        <ul>
            <li><a href="HomePage.jsp">Welcome <%=name%></a></li>
            <li><a href="AddFriend.jsp">Add Friend</a></li>
            <li><a href="ViewPost.jsp">View Posts</a></li>
            <li><a href="Addpost.jsp">Add Posts</a></li>
            <li><a href="LoginPage.jsp">Logout</a></li>
        </ul>
            
       
    </body>
</html>
