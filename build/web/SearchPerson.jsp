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
<<<<<<< HEAD
        <style>
  * {
    margin: 0;
    padding: 0;
  }

  body {
    border: 20px solid white;
    margin-top: 300px;
    margin-left: 600px;
    background: url(https://initiate.alphacoders.com/images/616/cropped-1440-900-616945.png?8420);
    background-size: cover;
  }

  form {
    text-align: center;
    margin-top: 20px;
  }

  input[type="search"] {
    width: 200px;
    padding: 5px;
    margin-bottom: 10px;
    border: 1px solid #ccc;
    border-radius: 5px;
    outline: none;
  }

  input[type="submit"] {
    padding: 10px 20px;
    background-color: #03fcfc;
    border: none;
    color: #222;
    border-radius: 5px;
    cursor: pointer;
    font-size: 16px;
  }

  input[type="submit"]:hover {
    background-color: #00cccc;
  }

  a {
    display: block;
    margin-top: 20px;
    color: #03fcfc;
    text-decoration: none;
  }

  a:hover {
    color: #00cccc;
  }

  h1 {
    font-size: 50px;
    line-height: 64px;
    color: #03fcfc;
  }
</style>

=======
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
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
        
    </head>
    <body>
        
          <form action="SearchPerson" method="POST">
            Search<br>
            <input type="search" name="txt_search" required=""><br>
            <br>
            <input type="submit" value="Search"><br>
            <a href ='HomePage.jsp'> Back to Home </a>
             <%
                 
<<<<<<< HEAD
            request.getSession().setAttribute("search","txt_search" );
=======
//            request.getSession().setAttribute("search","txt_search" );
>>>>>>> 9fc3ba02dbbaefd5ff3c5d6c2590adef9e83943d
           
            %>
        </form>
    </body>
</html>
