/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charitymanagementapp;

import ConnectDB.connect_db;
import Views.Main.Dashboard;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author THIEN
 */
public class CharityManagementApp {

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        return connect_db.getConnection();
    }
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args)  throws SQLException, ClassNotFoundException{
        // TODO code application logic here
//        System.out.println("Connecting to database ...");
//        Connection con = CharityManagementApp.getConnection();
//        if (con == null) {
//            System.out.print("Fail to connect to database!");
//            return;
//        }
//        System.out.println("Connected to database successfully");
        
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }
    
}
