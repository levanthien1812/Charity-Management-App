/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.DonorDAO;
import DAO.DonorDAOImpl;
import Models.Donor;
import Utilities.TableModelUtil;
import Views.Main.DonorDetailFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author THIEN
 */
public class DonorController {
    private JPanel viewPanel;
    private JButton addBtn;
    private JTextField searchField;
    
    private DonorDAO donorDAO = null;
    
    private String[] listColumns = {"STT", "Mã", "Họ tên", "Giới tính", "Điểm", "Số điện thoại", "Email"};
    
    private TableRowSorter<TableModel> rowSorter = null;

    public DonorController(JPanel viewPanel, JButton addBtn, JTextField searchField) {
        this.viewPanel = viewPanel;
        this.addBtn = addBtn;
        this.searchField = searchField;
        
        this.donorDAO = new DonorDAOImpl();
    }
    
    public void setDataModel() {
        List<Donor> donors = donorDAO.getList();
        DefaultTableModel model = new TableModelUtil().setDonorTable(donors, listColumns);
        
        JTable table = new JTable(model);
        rowSorter = new TableRowSorter<>(table.getModel());
        
        searchField.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = searchField.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = searchField.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 15));
        table.getTableHeader().setPreferredSize(new Dimension(100,40));
        table.setRowHeight(40);
        table.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        
        table.validate();
        table.repaint();
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertColumnIndexToModel(selectedRowIndex);
                    
//                    Donor donor = new Donor();
//                    donor.setName((String) model.getValueAt(selectedRowIndex, 1));
//                    donor.setGender((int) model.getValueAt(selectedRowIndex, 2));
//                    donor.setScore((int) model.getValueAt(selectedRowIndex, 3));
//                    donor.setPhone((String) model.getValueAt(selectedRowIndex, 4));
//                    donor.setEmail((String) model.getValueAt(selectedRowIndex, 5));
                    
                    DonorDetailFrame ddf = new DonorDetailFrame((int) model.getValueAt(selectedRowIndex, 1));
                    ddf.setTitle("Thông tin người quyên góp");
                    ddf.setResizable(false);
                    ddf.setLocationRelativeTo(null);
                    ddf.setVisible(true);
                }
            }
            
        });
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(900,700));
        
        viewPanel.removeAll();
        viewPanel.setLayout(new BorderLayout());
        viewPanel.add(scrollPane);
        viewPanel.validate();
        viewPanel.repaint();
    }
}
