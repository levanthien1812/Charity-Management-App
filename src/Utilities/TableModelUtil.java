/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Models.Donor;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THIEN
 */
public class TableModelUtil {
    public DefaultTableModel setDonorTable (List<Donor> donors, String[] listColumns) {
        DefaultTableModel dtm = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        dtm.setColumnIdentifiers(listColumns);
        int columnsCount = listColumns.length;
        Object[] obj = null;
        int rows = donors.size();
        if (rows > 0) {
            for (int i = 0; i < rows; i++) {
                Donor donor = donors.get(i);
                obj = new Object[columnsCount];
                obj[0] = i + 1;
                obj[1] = donor.getId();
                obj[2] = donor.getName();
                obj[3] = donor.getGender();
                obj[4] = donor.getScore();
                obj[5] = donor.getPhone();
                obj[6] = donor.getEmail();
                dtm.addRow(obj);
            }
        }
        return dtm;
    }
}
