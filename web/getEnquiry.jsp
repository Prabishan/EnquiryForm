<%@page import="com.leapfrog.DAO.CustomerDAOImpl"%>

<%@page import="com.leapfrog.DAO.CustomerDAO"%>
<%@page import="com.Customer"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
      <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->

    </head>
    <body>
        <div class ="container"> 

            <table class="table table-condensed table-hover table-striped">

                <tr>
                    <th>ID</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Contact No</th>
                    <th>Email</th>
                    <th>Description</th>

                </tr>

                <tr>
                    <% CustomerDAO customerDao = new CustomerDAOImpl();
                        for (Customer e : customerDao.getAllCustomer()) {

                    %>
                <tr>
                    <td> <%=e.getId()%> </td>
                    <td><%=e.getFirstName()%></td> 
                    <td> <%=e.getLastName()%></td>
                    <td><%=e.getContactNo()%></td>
                    <td><%=e.getEmail()%></td>
                    <td><%=e.getDescription()%></td>

                </tr>
                <%}%>


            </table>
        </div>
    </body>
</html>
