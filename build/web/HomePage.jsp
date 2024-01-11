<<<<<<< HEAD
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home Page</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        body {
            padding-left: 600px;
            margin-right: 800px;
            margin-top: 300px;
            background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);
            background-size: cover;
        }

        ul {
            list-style-type: none;
            margin-top: 20px;
        }

        li {
            display: inline-block;
            margin-right: 15px;
        }

        li a {
            display: block;
            color: #fff;
            text-decoration: none;
            padding: 5px 10px;
            border-radius: 5px;
            background-color: rgba(0, 123, 255, 0.8);
        }

        li a:hover {
            background-color: rgba(0, 100, 200, 0.8);
        }
    </style>
</head>

<body>
    <% 
        String name = "";
        Object anyvar = request.getSession().getAttribute("anyvar");
        if (anyvar != null) {
            name = anyvar.toString();

            
        } else {
//            response.sendRedirect("LoginPage.jsp");
        }
    %>
    
    <ul>
        <li><a href="HomePage.jsp">Welcome <%= name %></a></li>
        <li><a href="AddFriend.jsp">Add Friend</a></li>
        <li><a href="ViewPost.jsp">View Posts</a></li>
        <li><a href="Addpost.jsp">Add Posts</a></li>
        <li><a href="LoginPage.jsp">Logout</a></li>
    </ul>
</body>
=======
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
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
</html>
