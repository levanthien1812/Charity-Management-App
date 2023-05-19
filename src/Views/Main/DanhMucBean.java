/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views.Main;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author THIEN
 */
public class DanhMucBean {
    private String kind;
    private JButton button;

    public DanhMucBean(String kind, JButton button) {
        this.kind = kind;
        this.button = button;
    }

    public String getKind() {
        return kind;
    }

    public JButton getButton() {
        return button;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setButton(JButton button) {
        this.button = button;
    }
}
