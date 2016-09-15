/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.DAO;

import com.Customer;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Prabishan
 */
public interface CustomerDAO {

   
    int insert (Customer c) throws  ClassNotFoundException, SQLException;
    List<Customer> getAllCustomer() throws  ClassNotFoundException, SQLException;

    

}
