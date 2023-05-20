/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ConnectDB.connect_db;
import Models.Donor;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THIEN
 */
public class DonorDAOImpl implements DonorDAO{

    @Override
    public List<Donor> getList() {
        try {
            Connection conn = connect_db.getConnection();
            Statement st = conn.createStatement();
            String query = "SELECT * FROM DONOR";
            List<Donor> donors = new ArrayList<>();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                Donor donor = new Donor();
                donor.setId(rs.getInt("ID"));
                donor.setName(rs.getString("NAME"));
                donor.setGender(rs.getInt("GENDER"));
                donor.setPhone(rs.getString("PHONE"));
                donor.setDate_of_birth(rs.getDate("DATE_OF_BIRTH"));
                donor.setPhoto(rs.getString("PHOTO"));
                donor.setEmail(rs.getString("EMAIL"));
                donor.setScore(rs.getInt("SCORE"));
                donor.setAddress_id(rs.getInt("ADDRESS_ID"));
                donors.add(donor);
            }
            st.close();
            conn.close();
            return donors;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Donor getDonor(int donor_id) {
        try {
            Connection conn = connect_db.getConnection();
            Statement st = conn.createStatement();
            String query = "SELECT * FROM DONOR WHERE ID = " + donor_id;
            ResultSet rs = st.executeQuery(query);
            
            Donor donor = new Donor();
            while (rs.next()) {
                donor.setId(rs.getInt("ID"));
                donor.setName(rs.getString("NAME"));
                donor.setGender(rs.getInt("GENDER"));
                donor.setPhone(rs.getString("PHONE"));
                donor.setDate_of_birth(rs.getDate("DATE_OF_BIRTH"));
                donor.setPhoto(rs.getString("PHOTO"));
                donor.setEmail(rs.getString("EMAIL"));
                donor.setScore(rs.getInt("SCORE"));
                donor.setAddress_id(rs.getInt("ADDRESS_ID"));
            }
            st.close();
            conn.close();
            return donor;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
