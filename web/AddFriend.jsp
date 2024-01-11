<%-- 
    Document   : AddFriend
    Created on : 24 Jun, 2023, 3:37:55 PM
    Author     : AJINKYA
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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

        table {
            border: 5px solid white;
            width: 100%;
            margin-top: 20px;
            color: #fff;
            text-align: center;
        }

        table th,
        table td {
            padding: 10px;
        }

        th {
            background-color: #03fcfc;
        }

        td {
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
        <a href ='SearchPerson.jsp'> Search User </a>
        <table border=\"5\">
            <th>aid</th>
            <th>uid</th>
            <th>tid</th>
            <th>status</th>
            <th>Action</th>
                <%

                    try {
                        // create our mysql database connection
                        String myDriver = "org.gjt.mm.mysql.Driver";
                        String myUrl = "jdbc:mysql://localhost/db_myspace";
                        Class.forName(myDriver);
                        Connection conn = DriverManager.getConnection(myUrl, "root", "");

                        // our SQL SELECT query. 
                        // if you only need a few columns, specify them by name instead of using "*"
                        String query = "SELECT * FROM tbl_association where status = 'pending'";

                        // create the java statement
                        Statement st = conn.createStatement();

                        // execute the query, and get a java resultset
                        ResultSet rs = st.executeQuery(query);

                        // iterate through the java resultset
                        while (rs.next()) {
                            int aid = rs.getInt("aid");
//                            int aid = rs.getInt("aid");
                            System.out.print("========>" + aid);
//                            String uid = rs.getString("uid");
//                            String tid = rs.getString("tid");
//                            String status = rs.getString("status");

                            // print the results

                %>
            <tr>
                <td><%=rs.getString("aid")%></td>
                <td><%=rs.getString("uid")%></td>
                <td><%=rs.getString("tid")%></td>
                <td><%=rs.getString("status")%></td>
                <td><a href="Accept?tid=<%=rs.getString("tid")%>"> Accept</a></td>
                <td><a href="Decline?tid=<%=rs.getString("tid")%>" > Decline</a></td>


            </tr>
            <%
                    }
                    st.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.err.println("Got an exception! ");
                    e.printStackTrace();
                }
            %>

        </table>

        <a href ='HomePage.jsp'> Back to Home </a>

    </body>
</html>
