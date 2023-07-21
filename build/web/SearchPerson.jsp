<%-- 
    Document   : SearchPerson
    Created on : 23 Jun, 2023, 12:37:19 PM
    Author     : AJINKYA
--%>

<%--<%@page import="jdk.nashorn.internal.objects.NativeString.search(Object, Object)"%>--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Person</title>
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
        
          <form action="SearchPerson" method="POST">
            Search<br>
            <input type="search" name="txt_search" required=""><br>
            <br>
            <input type="submit" value="Search"><br>
            <a href ='HomePage.jsp'> Back to Home </a>
             <%
                 
//            request.getSession().setAttribute("search","txt_search" );
           
            %>
        </form>
    </body>
</html>
