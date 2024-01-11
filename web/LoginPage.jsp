<<<<<<< HEAD
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
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

        form {
            width: 300px;
            padding: 20px;
            background-color: rgba(255, 255, 255, 0.7);
            border-radius: 10px;
        }

        form input[type="email"],
        form input[type="password"],
        form input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        form input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }

        form input[type="submit"]:hover {
            background-color: #0056b3;
        }

        form a {
            display: block;
            text-align: center;
            color: #007bff;
            text-decoration: none;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<%
    request.getSession().setAttribute("anyvar", null);
    System.err.println("request reset successfully");
%>
<form action="LoginPage" method="POST">
    <label for="txt_username">Username</label><br>
    <input type="email" id="txt_username" name="txt_username" required=""><br>
    <label for="txt_pass">Password</label><br>
    <input type="password" id="txt_pass" name="txt_pass" required=""><br>
    <br>
    <input type="submit" value="LOGIN"><br>
    <a href='RegisterUser.jsp'>Create Account</a>
</form>
</body>
=======
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
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
</html>
