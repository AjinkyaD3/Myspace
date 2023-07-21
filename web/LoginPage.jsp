<%-- 
    Document   : LoginPage
    Created on : 19 Jun, 2023, 1:45:53 PM
    Author     : AJINKYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login </title>
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
           
            request.getSession().setAttribute("anyvar", null);
            System.err.println("request reset succeffully");
            
            
            %>
        <form action="LoginPage" method="POST">
            Username <br>
            <input type="email" name="txt_username" required=""><br>
            Password<br>
            <input type="password" name="txt_pass" required=""><br>
            <br>
            <input type="submit" value="LOGIN"><br>
            <br>
            <a href='RegisterUser.jsp'> Create Account </a>
        </form>
    </body>
</html>
