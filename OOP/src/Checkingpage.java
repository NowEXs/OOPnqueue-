/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author gypprt
 */
public class Checkingpage extends javax.swing.JFrame implements OnClick{

    /**
     * Creates new form Checkingpage
     */
    // Variables declaration - do not modify
    private javax.swing.JLabel Computer;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel checking_l;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel time;
    private javax.swing.JLabel desk_no;
    private javax.swing.JLabel name;
    private javax.swing.JLabel std_id;
    private javax.swing.JLabel lab_l;
    private javax.swing.JLabel name_l;
    private javax.swing.JLabel std_l;
    private Computer comp;
    private ComputerPanel companel;
    private Timer timer;
    private int seconds = 0;

    // End of variables declaration
    public Checkingpage(ComputerPanel companel, Computer comp) {
        this.companel = companel;
        this.comp = comp;
        initComponents();

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
        timer = new javax.swing.Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                seconds++;
                updateTime();
            }
        });
        timer.start();
    }
    private void setCustomFont(Font font){
        lab_l.setFont(font.deriveFont(Font.PLAIN, 13));
        lab.setFont(font.deriveFont(Font.BOLD, 18));
        std_l.setFont(font.deriveFont(Font.PLAIN, 13));
        std_id.setFont(font.deriveFont(Font.BOLD, 18));
        name_l.setFont(font.deriveFont(Font.PLAIN, 13));
        name.setFont(font.deriveFont(Font.BOLD, 18));
        desk_no.setFont(font.deriveFont(Font.BOLD, 18));
        time.setFont(font.deriveFont(Font.PLAIN, 16));
        checking_l.setFont(font.deriveFont(Font.BOLD, 24));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        confirmButton = new javax.swing.JButton();
        lab_l = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        std_l = new javax.swing.JLabel();
        std_id = new javax.swing.JLabel();
        name_l = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        desk_no = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        Computer = new javax.swing.JLabel();
        checking_l = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("Checking");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 0, 313, 520));
        setPreferredSize(new java.awt.Dimension(313, 520));
        setResizable(false);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmButton.setIcon(new javax.swing.ImageIcon("OOP/src/Image/FillScore.png")); // NOI18N
        confirmButton.setBorderPainted(false);
        confirmButton.setContentAreaFilled(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressConfirm(evt);
            }
        });
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirmButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirmButtonMouseExited(evt);
            }
        });
        getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 420, 150, 40));

        lab_l.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lab_l.setForeground(new java.awt.Color(255, 255, 255));
        lab_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_l.setText(comp.getLab_name());
        getContentPane().add(lab_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 50, 30));

        lab.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lab.setForeground(new java.awt.Color(234, 211, 177));
        lab.setText("Lab");
        getContentPane().add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 40, 30));

        std_l.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        std_l.setForeground(new java.awt.Color(255, 255, 255));
        std_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        std_l.setText("  " + comp.getStd_id());
        getContentPane().add(std_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 90, 10));

        std_id.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        std_id.setForeground(new java.awt.Color(234, 211, 177));
        std_id.setText("STD_ID");
        getContentPane().add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 30));

        name_l.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        name_l.setForeground(new java.awt.Color(255, 255, 255));
        name_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name_l.setText("  " + comp.getName());
        getContentPane().add(name_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 80, -1));

        name.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        name.setForeground(new java.awt.Color(234, 211, 177));
        name.setText("Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 253, -1, 30));

        desk_no.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        desk_no.setForeground(new java.awt.Color(255, 255, 255));
        desk_no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desk_no.setText(""+comp.getComp_id());
        getContentPane().add(desk_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 290, 40));

        time.setFont(new java.awt.Font("Helvetica Neue", 2, 24)); // NOI18N
        time.setForeground(new java.awt.Color(124, 76, 37));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, 30));

        Computer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Computer.setIcon(new javax.swing.ImageIcon("OOP/src/Image/checking-2.png")); // NOI18N
        Computer.setMaximumSize(new java.awt.Dimension(130, 100));
        getContentPane().add(Computer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 100));

        checking_l.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        checking_l.setForeground(new java.awt.Color(255, 244, 204));
        checking_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checking_l.setText("Checking");
        getContentPane().add(checking_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 30));

        jLabel3.setBackground(new java.awt.Color(84, 59, 45));
        jLabel3.setIcon(new javax.swing.ImageIcon("OOP/src/Image/clockWood.png")); // NOI18N
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setIconTextGap(5);
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>
    private void updateTime() {
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int secs = seconds % 60;
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, secs);
        time.setText(timeString);
    }

    private void confirmButtonMouseEntered(java.awt.event.MouseEvent evt) {
        //        Change cursor to hand cursor and change pic to bigger button
        confirmButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmButton.setIcon(new ImageIcon("OOP/src/Image/Button/FillScoreButtonBig.png"));
    }

    private void confirmButtonMouseExited(java.awt.event.MouseEvent evt) {
        confirmButton.setIcon(new ImageIcon("OOP/src/Image/Button/FillScoreButtonSmall.png"));
    }

    @Override
    public void pressConfirm(ActionEvent event) {
        String update_qSql = "DELETE FROM Reservation WHERE SM_SeatID = ?";
        String update_rSql = "UPDATE SeatManager SET Reservable = 1 WHERE SeatID = ?";
        try (PreparedStatement update_qstatement = DbCon.prepareStatement(update_qSql);
             PreparedStatement update_rstatement = DbCon.prepareStatement(update_rSql)) {
            int deskNumber = comp.getComp_id();
            this.comp.setName("");
            this.comp.setLab_name("");
            this.comp.setStd_id("");
            this.comp.setStatus(0);
            this.companel.updateButtonIcon();
            update_qstatement.setInt(1, deskNumber);
            update_rstatement.setInt(1, deskNumber);
            update_qstatement.executeUpdate();
            update_rstatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("go to Excel panel");
        new ExcelViewer().setVisible(true);
        dispose();
    }

    @Override
    public void pressCancel(ActionEvent event) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Checkingpage(null,new Computer()).setVisible(true);
    }
}
