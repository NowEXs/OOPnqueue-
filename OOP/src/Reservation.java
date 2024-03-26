
import org.bouncycastle.jcajce.provider.symmetric.DES;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nk
 */
public class Reservation extends javax.swing.JFrame implements OnClick{

    public Reservation(ComputerPanel companel,Computer comp) {
        this.companel = companel;
        this.comp = comp;
        initComponents();
    }

    private void initComponents() {

        Reservation = new javax.swing.JLabel();
        img_checking = new javax.swing.JLabel();
        seat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        std_id = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        jTextField_name = new javax.swing.JTextField();
        jTextField_id = new javax.swing.JTextField();
        jTextField_lab = new javax.swing.JTextField();
        Confirm = new javax.swing.JLabel();
        bt_confirm = new javax.swing.JButton();
        Cancel = new javax.swing.JLabel();
        bt_cancel = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reservation.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        Reservation.setForeground(new java.awt.Color(239, 210, 173));
        Reservation.setText("Reservation");
        getContentPane().add(Reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        img_checking.setIcon(new javax.swing.ImageIcon("OOP/src/Image/checking-2.png")); // NOI18N
        getContentPane().add(img_checking, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        seat.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        seat.setForeground(new java.awt.Color(239, 210, 173));
        seat.setText("Seat - " + this.comp.getComp_id());
        getContentPane().add(seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        Name.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(239, 210, 173));
        Name.setText("Name");
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 203, 60, 30));

        std_id.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        std_id.setForeground(new java.awt.Color(239, 210, 173));
        std_id.setText("STD_id");
        getContentPane().add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, 50));

        lab.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lab.setForeground(new java.awt.Color(239, 210, 173));
        lab.setText("Lab");
        getContentPane().add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 320, 40, 20));

        jTextField_name.setBackground(new java.awt.Color(76, 40, 20));
        jTextField_name.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jTextField_name.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_name.setText("name");
        jTextField_name.setBorder(null);
        jTextField_name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_nameFocusLost(evt);
            }
        });
        jTextField_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_nameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 206, 140, 20));

        jTextField_id.setBackground(new java.awt.Color(76, 40, 20));
        jTextField_id.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_id.setText("Id");
        jTextField_id.setBorder(null);
        jTextField_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_idFocusLost(evt);
            }
        });
        getContentPane().add(jTextField_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 264, 130, 20));

        jTextField_lab.setBackground(new java.awt.Color(76, 40, 20));
        jTextField_lab.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jTextField_lab.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_lab.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_lab.setText("lab");
        jTextField_lab.setBorder(null);
        jTextField_lab.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_labFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_labFocusLost(evt);
            }
        });
        getContentPane().add(jTextField_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 323, 50, 20));

        Confirm.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Confirm.setForeground(new java.awt.Color(7, 103, 6));
        Confirm.setText("Confirm");
        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 90, 50));

        bt_confirm.setIcon(new javax.swing.ImageIcon("OOP/src/Image/confirmButton-2.png")); // NOI18N
        bt_confirm.setBorderPainted(false);
        bt_confirm.setContentAreaFilled(false);
        getContentPane().add(bt_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        Cancel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        Cancel.setForeground(new java.awt.Color(126, 13, 0));
        Cancel.setText("Cancel");
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 90, 50));

        bt_cancel.setIcon(new javax.swing.ImageIcon("OOP/src/Image/cancelButton-2.png")); // NOI18N
        bt_cancel.setBorderPainted(false);
        bt_cancel.setContentAreaFilled(false);

        getContentPane().add(bt_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon("OOP/src/Image/reserve.png")); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        bt_confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressConfirm(e);

            }
        });


        bt_cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pressCancel(e);
            }
        });

        pack();

    }// </editor-fold>

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField_nameFocusGained(java.awt.event.FocusEvent evt) {
        if (jTextField_name.getText().equals("name")){
            jTextField_name.setText("");
        }
        jTextField_name.setForeground(Color.white);
    }

    private void jTextField_nameFocusLost(java.awt.event.FocusEvent evt) {
        if (jTextField_name.getText().equals("")){
            jTextField_name.setText("name");
        }
        jTextField_name.setForeground(Color.white);
    }

    private void jTextField_idFocusGained(java.awt.event.FocusEvent evt) {
        if (jTextField_id.getText().equals("Id")){
            jTextField_id.setText("");
        }
        jTextField_id.setForeground(Color.white);
    }

    private void jTextField_idFocusLost(java.awt.event.FocusEvent evt) {
        if (jTextField_id.getText().equals("")){
            jTextField_id.setText("Id");
        }
        jTextField_id.setForeground(Color.white);
    }

    private void jTextField_labFocusGained(java.awt.event.FocusEvent evt) {
        if (jTextField_lab.getText().equals("lab")){
            jTextField_lab.setText("");
        }
        jTextField_lab.setForeground(Color.white);
    }

    private void jTextField_labFocusLost(java.awt.event.FocusEvent evt) {
        if (jTextField_lab.getText().equals("")){
            jTextField_lab.setText("lab");
        }
        jTextField_lab.setForeground(Color.white);
    }

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel Confirm;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Reservation;
    private javax.swing.JLabel bg;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_confirm;
    private javax.swing.JLabel img_checking;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_lab;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel seat;
    private javax.swing.JLabel std_id;

    private ComputerPanel companel;
    private Computer comp;

    @Override
    public void pressConfirm(ActionEvent event) {
        String insertSql = "INSERT INTO Reservation (SM_SeatID, StudentID, StudentName, Lab_name) VALUES (?, ?, ?, ?)";

        String st_idcheck = jTextField_id.getText();
        int st_id;
        try {
            st_id = Integer.parseInt(st_idcheck);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please fill the studentID correctly.");
            return;
        }
        String st_name = jTextField_name.getText();
        String lab_name = jTextField_lab.getText();
        int deskNumber = this.comp.getComp_id();
            try (PreparedStatement stdstatement = DbCon.prepareStatement(insertSql)) {
                System.out.println("Seat is reservable");
                stdstatement.setInt(1, deskNumber);
                stdstatement.setInt(2, st_id);
                stdstatement.setString(3, st_name);
                stdstatement.setString(4, lab_name);
                stdstatement.executeUpdate();
                System.out.println("Data inserted successfully");
                this.comp.setName(st_name);
                this.comp.setLab_name(lab_name);
                this.comp.setStd_id(String.valueOf(st_id));
                this.comp.setStatus(1);
                this.companel.updateButtonIcon();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        JOptionPane.showMessageDialog(this, "Reservation completed", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
        this.dispose();
    }

    @Override
    public void pressCancel(ActionEvent event) {
        this.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //adasda
    }
    // End of variables declaration
}
