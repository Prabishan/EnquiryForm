/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DAO;

import com.leapfrog.DAO.CustomerDAO;
import com.Customer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prabishan
 */
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public int insert(Customer c) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/problemticket", "root", null);
        String query = "INSERT INTO enquiry(customer_id,first_name ,last_name ,contact_no ,email ,description) VALUES(?,?,?,?,?,?)";
        
        PreparedStatement st = conn.prepareStatement(query);
        st.setInt(1, c.getId());
        st.setString(2, c.getFirstName());
        st.setString(3, c.getLastName());
        st.setString(4, c.getContactNo());
        st.setString(5, c.getEmail());
        st.setString(6, c.getDescription());

        int result = st.executeUpdate();
        conn.close();
        return result;

    }


    @Override
    public List<Customer> getAllCustomer() throws ClassNotFoundException, SQLException {
          List<Customer> CustomerList = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/problemticket", "root", null);
        String sql = " Select * FROM enquiry ";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Customer c = new Customer();
            c.setId(rs.getInt("customer_id"));
            c.setFirstName(rs.getString("first_name"));
            c.setLastName(rs.getString("last_name"));
            c.setContactNo(rs.getString("contact_no"));
            c.setEmail(rs.getString("email"));
            c.setDescription(rs.getString("description"));
            CustomerList.add(c);
        }
        conn.close();
        return CustomerList;
    }
}
