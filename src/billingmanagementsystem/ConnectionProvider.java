/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package billingmanagementsystem;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author Manusha
 */
class ConnectionProvider {

    static Connection getCon() {
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bms?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "1234");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
    
}
