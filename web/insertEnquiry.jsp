<%@page import="com.Customer"%>
<%@page import="com.leapfrog.DAO.CustomerDAOImpl"%>
<%@page import="com.leapfrog.DAO.CustomerDAO" %>

<%
    CustomerDAO enqDAO = new CustomerDAOImpl();

    Customer c = new Customer();

    c.setFirstName(request.getParameter("firstName"));
    c.setLastName(request.getParameter("lastName"));
    c.setContactNo(request.getParameter("contactNo"));
    c.setEmail(request.getParameter("email"));
    c.setDescription(request.getParameter("description"));
    enqDAO.insert(c);
    response.sendRedirect("getEnquiry.jsp");

%>
   