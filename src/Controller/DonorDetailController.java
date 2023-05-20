/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DonorDAO;
import DAO.DonorDAOImpl;
import Models.Donor;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author THIEN
 */
public class DonorDetailController {
    private JTextField idField;
    private JTextField nameField;
    private JPanel genderField;
    private JTextField phoneField;
    private JXDatePicker date_of_birthDP;
    private JTextField photoField;
    private JTextField emailField;
    private JLabel scoreField;
    private JTextField address_idField;
    
    private DonorDAO donorDAO;

    public DonorDetailController(JTextField idField, JTextField nameField, JPanel genderField, JTextField phoneField, JXDatePicker date_of_birthDP, JTextField photoField, JTextField emailField, JLabel scoreField, JTextField address_idField) {
        this.idField = idField;
        this.nameField = nameField;
        this.genderField = genderField;
        this.phoneField = phoneField;
        this.date_of_birthDP = date_of_birthDP;
        this.photoField = photoField;
        this.emailField = emailField;
        this.scoreField = scoreField;
        this.address_idField = address_idField;
        
        donorDAO = new DonorDAOImpl();
    }
    
    public void setView(int donor_id) {
        Donor donor = donorDAO.getDonor(donor_id);
        
//        Generate gender radio buttons
        JRadioButton maleRadio = new JRadioButton("Nam");
        JRadioButton femaleRadio = new JRadioButton("Nữ");
        JRadioButton otherRadio = new JRadioButton("Khác");
        ButtonGroup genderGroup = new ButtonGroup();
        
        switch (donor.getGender()) {
            case 1 -> maleRadio.setSelected(true);
            case 2 -> femaleRadio.setSelected(true);
            case 3 -> otherRadio.setSelected(true);
            default -> maleRadio.setSelected(true);
        }
        genderField.add(maleRadio);
        genderField.add(femaleRadio);
        genderField.add(otherRadio);
        
        idField.setText("" + donor.getId());
        nameField.setText(donor.getName());
//        genderField.setText("" + donor.getGender());
        genderField.add(maleRadio);
        genderField.add(femaleRadio);
        genderField.add(otherRadio);
        phoneField.setText(donor.getPhone());
        date_of_birthDP.setDate(donor.getDate_of_birth());
        photoField.setText(donor.getPhoto());
        emailField.setText(donor.getEmail());
        scoreField.setText("" + donor.getScore());
        address_idField.setText("" + donor.getAddress_id());
    }
}
