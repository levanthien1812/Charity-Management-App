/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Views.Main.DanhMucBean;
import Views.Main.DashboardPanel;
import Views.Main.DonationsDistributionPanel;
import Views.Main.DonorsReceiversPanel;
import Views.Main.EventsPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author THIEN
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinhController(JPanel root) {
        this.root = root;
    }
    
    public void setView(JButton button) {
        kindSelected = "dashboard";
        
        button.setBackground(new Color(255,255,255));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new DashboardPanel());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        
        for (DanhMucBean item: listItem) {
            item.getButton().addMouseListener(new ButtonEvent(item.getKind(), item.getButton()));
        }
    }
    
    class ButtonEvent implements MouseListener {
        private JPanel node;
        private String kind;
        private JButton button;

        public ButtonEvent(String kind, JButton button) {
            this.kind = kind;
            this.button = button;
        }
        
        @Override
        public void mouseClicked(MouseEvent e) {
            node = switch (kind) {
                case "dashboard" -> new DashboardPanel();
                case "donors_receivers" -> new DonorsReceiversPanel();
                case "donations_distributions" -> new DonationsDistributionPanel();
                case "events" -> new EventsPanel();
                default -> new DashboardPanel();
            };
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            button.setBackground(Color.white);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            button.setBackground(Color.white);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                button.setBackground(new Color(204,255,255));
            }
        }
        
        private void setChangeBackground (String kind) {
            for (DanhMucBean item: listItem) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                    item.getButton().setBackground(Color.white);
                } else {
                    item.getButton().setBackground(new Color(204,255,255));
                }
            }
        }
    }
}
