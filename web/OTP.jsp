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
            response.sendRedirect("LoginPage.jsp");
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
