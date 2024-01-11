<%-- 
    Document   : OTP
    Created on : 22 Jun, 2023, 11:43:16 AM
    Author     : AJINKYA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OTP</title>
<<<<<<< HEAD
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
        form input[type="text"] {
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
    </style>
=======
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
    </head>
    <body>
         <%
            String username="";
            String password="";
            try{
            
          
                username=request.getSession().getAttribute("usernameotp").toString();
                password=request.getSession().getAttribute("passwordotp").toString();
                System.err.println("username bhetla --> " + username);
                System.err.println("password bhetla --> " + password);
        
            
           }catch(Exception e ){      
<<<<<<< HEAD
//            response.sendRedirect("LoginPage.jsp");
=======
            response.sendRedirect("LoginPage.jsp");
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
            e.printStackTrace();
           }
            %>
        <form action="OTP" method="POST">
            
            <input type="hidden" name="txt_username" value="<%=username%>">
            <input type="hidden" name="txt_password" value="<%=password%>">
            Enter O T P<br>
            <input type="text" name="txt_otp" required=""><br>
            <br>
            <input type="submit" value="Submit"><br>
            
        </form>
    </body>
</html>
