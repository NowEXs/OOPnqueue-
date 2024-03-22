
import javax.swing.*;
import java.awt.Color;
import java.awt.*;
import java.io.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nk
 */
public class Reservation extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    public Reservation() {
        initComponents();
        centerFrame();

        try {
            // Load and register the font
            Font appleFont = Font.createFont(Font.TRUETYPE_FONT, new File("OOP/src/Font/Big Apple 3PM.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(appleFont);


            // Set the font for components
            setCustomFont(appleFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void setCustomFont(Font font) {
        Reservation.setFont(font.deriveFont(Font.BOLD, 24));
        seat.setFont(font.deriveFont(Font.BOLD, 18));
        Name.setFont(font.deriveFont(Font.BOLD, 18));
        std_id.setFont(font.deriveFont(Font.BOLD, 18));
        lab.setFont(font.deriveFont(Font.BOLD, 18));
        jTextField_name.setFont(font.deriveFont(Font.PLAIN, 13));
        jTextField_id.setFont(font.deriveFont(Font.PLAIN, 13));
        Confirm.setFont(font.deriveFont(Font.BOLD, 18));
        Cancel.setFont(font.deriveFont(Font.BOLD, 18));
    }

    private void centerFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = this.getSize().width;
        int frameHeight = this.getSize().height;
        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;
        this.setLocation(x, y);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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
        Confirm = new javax.swing.JLabel();
        bt_confirm = new javax.swing.JButton();
        Cancel = new javax.swing.JLabel();
        bt_cancel = new javax.swing.JButton();
        JComboBox<Object> jComboBox_lab = new JComboBox<>();
        bg = new javax.swing.JLabel();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        seat.setText("32");
        getContentPane().add(seat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, -1, -1));
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
        jTextField_name.setForeground(new java.awt.Color(239,210,173));
        jTextField_name.setHorizontalAlignment(javax.swing.JTextField.LEADING);
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
        jTextField_id.setForeground(new java.awt.Color(239,210,173));
        jTextField_id.setHorizontalAlignment(javax.swing.JTextField.LEADING);
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


        bt_confirm.setIcon(new javax.swing.ImageIcon("OOP/src/Image/confirmButtonFont.png")); // NOI18N
        bt_confirm.setBorderPainted(false);
        bt_confirm.setContentAreaFilled(false);
        getContentPane().add(bt_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, -1, -1));

        bt_cancel.setIcon(new javax.swing.ImageIcon("OOP/src/Image/cancelButtonFont.png")); // NOI18N
        bt_cancel.setBorderPainted(false);
        bt_cancel.setContentAreaFilled(false);
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));



        jComboBox_lab.setBackground(new java.awt.Color(76, 40, 20));
        jComboBox_lab.setEditable(true);
        jComboBox_lab.setForeground(new java.awt.Color(239, 210, 173));
        jComboBox_lab.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "lab 1", "lab 2", "lab 3", "lab 4" }));
        jComboBox_lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               //
            }
        });
        getContentPane().add(jComboBox_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 60, -1));


        bg.setIcon(new javax.swing.ImageIcon("OOP/src/Image/reserve.png")); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setOpaque(true);

        pack();
    }// </editor-fold>

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField_nameActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField_nameFocusGained(java.awt.event.FocusEvent evt) {
        if (jTextField_name.getText().equals("name")){
            jTextField_name.setText("");
        }
        jTextField_name.setForeground(new Color(239,210,173));
    }

    private void jTextField_nameFocusLost(java.awt.event.FocusEvent evt) {
        if (jTextField_name.getText().equals("")){
            jTextField_name.setText("name");
        }
        jTextField_name.setForeground(new Color(239,210,173));
    }

    private void jTextField_idFocusGained(java.awt.event.FocusEvent evt) {
        if (jTextField_id.getText().equals("Id")){
            jTextField_id.setText("");
        }
        jTextField_id.setForeground(new Color(239,210,173));
    }

    private void jTextField_idFocusLost(java.awt.event.FocusEvent evt) {
        if (jTextField_id.getText().equals("")){
            jTextField_id.setText("Id");
        }
        jTextField_id.setForeground(new Color(239,210,173));
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

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
    // End of variables declaration
}
