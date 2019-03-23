/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Administrator
 */
public class cau4 extends JFrame{
     private static final long serialVersionUID = 1L; 
 

    public cau4(String title) {
        setTitle(title); 
    }
    
    public void doShow() { 
        setSize(400, 300); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        addControl(); 
        setResizable(false); 
        setVisible(true); 
    } 
        public void addControl() { 
        JPanel pnBorder = new JPanel(); 
        pnBorder.setLayout(new BorderLayout()); 
 
        // North 
        JPanel pnNorth = new JPanel(); 
 
        JLabel lblTitle = new JLabel("Cộng Trừ Nhân Chia"  ); 
        lblTitle.setForeground(Color.BLUE); 
        Font ft = new Font("arial", Font.BOLD, 25); 
        lblTitle.setFont(ft); 
         
        pnNorth.add(lblTitle); 
        pnBorder.add(pnNorth, BorderLayout.NORTH); 
 
        // West 
        JPanel pnWest = new JPanel(); 
        pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS)); 
        pnWest.setBackground(Color.LIGHT_GRAY); 
        Border southborder = BorderFactory.createLineBorder(Color.RED); 
        TitledBorder southTitleBorder = new TitledBorder(southborder, "Chọn tác vụ"  ); 
        pnWest.setBorder(southTitleBorder); 
 
        JButton btnGiai = new JButton("Giải "  ); 
        pnWest.add(btnGiai); 
        pnWest.add(Box.createVerticalStrut(10)); 
 
        JButton btnXoa = new JButton("Xóa "); 
        pnWest.add(btnXoa); 
        pnWest.add(Box.createVerticalStrut(10)); 
 
        JButton btnThoat = new JButton("Thoát"); 
        pnWest.add(btnThoat); 
        pnBorder.add(pnWest, BorderLayout.WEST); 
 
        // South 
        JPanel pnSouth = new JPanel(); 
        pnSouth.setPreferredSize(new Dimension(0, 30)); 
        pnSouth.setBackground(Color.PINK); 
                JPanel pns1 = new JPanel(); 
        pns1.setBackground(Color.BLUE); 
        pnSouth.add(pns1); 
   
        JPanel pns2 = new JPanel(); 
        pns2.setBackground(Color.RED); 
        pnSouth.add(pns2); 
   
        JPanel pns3 = new JPanel(); 
        pns3.setBackground(Color.YELLOW); 
        pnSouth.add(pns3); 
   
        pnBorder.add(pnSouth, BorderLayout.SOUTH); 
   
        // Center 
        JPanel pnCenter = new JPanel(); 
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS)); 
   
        Border centerborder = BorderFactory.createLineBorder(Color.RED); 
        TitledBorder centerTitleBorder = new TitledBorder(centerborder, "nhập 2 số a và b:"  ); 
        pnCenter.setBorder(centerTitleBorder); 
   
        JPanel pna = new JPanel(); 
        JLabel lbla = new JLabel("nhập a:"  ); 
        final JTextField txta = new JTextField(15); 
        pna.add(lbla); 
        pna.add(txta); 
        pnCenter.add(pna); 
        JPanel pnb = new JPanel(); 
        JLabel lblb = new JLabel("nhập b:"  ); 
        final JTextField txtb = new JTextField(15); 
        pnb.add(lblb); 
        pnb.add(txtb); 
        pnCenter.add(pnb); 
   
        // calculation fomular 
        JPanel pnc = new JPanel(); 
        JPanel pnpheptoan = new JPanel(); 
        pnpheptoan.setLayout(new GridLayout(2, 2)); 
        pnpheptoan.setBorder(new TitledBorder(BorderFactory. createLineBorder(Color.BLACK), "Chọn phép toán:")); 
        final JRadioButton radCong = new JRadioButton("Cộng"  ); 
        radCong.setSelected(true); 
        pnpheptoan.add(radCong); 
        final JRadioButton radTru = new JRadioButton("Trừ"  ); 
        pnpheptoan.add(radTru); 
        final JRadioButton radNhan = new JRadioButton("Nhân"); 
        pnpheptoan.add(radNhan); 
        final JRadioButton radChia = new JRadioButton("Chia"); 
        pnpheptoan.add(radChia); 
        ButtonGroup group = new ButtonGroup(); 
        group.add(radCong); 
        group.add(radTru); 
        group.add(radNhan); 
                group.add(radChia); 
        pnc.add(pnpheptoan); 
        pnCenter.add(pnc); 
   
        // result 
        JPanel pnkq = new JPanel(); 
        JLabel lblkq = new JLabel("Kết quả:"  ); 
        final JTextField txtkq = new JTextField(15); 
        pnkq.add(lblkq); 
        pnkq.add(txtkq); 
        pnCenter.add(pnkq); 
        lbla.setPreferredSize(lblkq.getPreferredSize()); 
        lblb.setPreferredSize(lblkq.getPreferredSize()); 
   
        pnBorder.add(pnCenter, BorderLayout.CENTER); 
   
        btnThoat.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent arg0) { 
                int ret = JOptionPane.showConfirmDialog(null, 
                        "Bạn muốn thoát hả?"  , "Thoát", 
                        JOptionPane.YES_NO_OPTION); 
                if (ret == JOptionPane.YES_OPTION) { 
                    System.exit(0); 
                } 
            } 
        }); 
        btnXoa.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent arg0) { 
                txta.setText(""); 
                txtb.setText(""); 
                txtkq.setText(""); 
                                txta.requestFocus(); 
   
                radCong.setSelected(true); 
                radTru.setSelected(false); 
                radNhan.setSelected(false); 
                radChia.setSelected(false); 
   
            } 
        }); 
        btnGiai.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent arg0) { 
                String sa = txta.getText(); 
                int a = 0, b = 0; 
                try { 
                    a = Integer.parseInt(sa); 
                } catch (Exception ex) { 
                    JOptionPane.showMessageDialog(null, 
                            "Nhập sai định dạng!"  ); 
                    txta.selectAll(); 
                    txta.requestFocus(); 
                    return; 
                } 
                String sb = txtb.getText(); 
                try { 
                    b = Integer.parseInt(sb); 
                } catch (Exception ex) { JOptionPane.showMessageDialog(null,"Nhập sai định dạng!"  ); 
                    txtb.selectAll(); 
                    txtb.requestFocus(); 
                    return; 
                } 
                                double kq = 0; 
                if (radCong.isSelected()) { 
                    kq = (a + b); 
                } else if (radTru.isSelected()) { 
                    kq = (a - b); 
                } else if (radNhan.isSelected()) { 
                    kq = (a * b); 
                } else { 
                    kq = a * 1.0 / b * 1.0; 
                } 
                txtkq.setText(kq + ""); 
            } 
        }); 
        Container con = getContentPane(); 
        con.add(pnBorder); 
    } 
    public static void main(String[] args) {
        cau4 ui = new cau4("cộng-trừ-nhân-chia");
        ui.doShow();
    }
}
