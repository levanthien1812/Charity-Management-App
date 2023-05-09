/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author THIEN
 */
public class connect_db {
    public static Connection getConnection() throws ClassNotFoundException,  
            SQLException{
//        Class.forName("oracle.jdbc.driver.OracleDriver");

        String connectionURL = "jdbc:mysql://103.75.185.190:5001/charity_management_app";
        String username = "root";
        String password = "password";

        Connection conn = DriverManager.getConnection(connectionURL, username,
                password);
        return conn;
    }
}
