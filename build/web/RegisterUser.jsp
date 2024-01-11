<%-- 
    Document   : RegisterUser
    Created on : 19 Jun, 2023, 12:57:21 PM
    Author     : AJINKYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register page </title>
        <style>
<<<<<<< HEAD
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
        form input[type="text"],
        form input[type="number"],
        form input[type="email"],
        form input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        form input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
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
        }
    </style>
=======
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
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
    </head>
    <body>
       
        <form action="RegisterUser" method="POST">
            Name<br>
            <input type="text" name="txt_name" required=""><br>
            Phone No<br>
            <input type="number" name="txt_phone" required=""><br>
            Email<br>
            <input type="email" name="txt_email" required=""><br>
            Password<br>
            <input type="password" name="txt_password" required=""><br>
            <br>
            <input type="submit" value="Register"><br>
            <a href ='LoginPage.jsp'> Back to Login </a>
        </form>
    
        
        
        
        
    </body>
</html>
