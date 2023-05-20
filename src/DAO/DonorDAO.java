/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.Donor;
import java.util.List;

/**
 *
 * @author THIEN
 */
public interface DonorDAO {
    public List<Donor> getList();
    public Donor getDonor(int donor_id);
}
