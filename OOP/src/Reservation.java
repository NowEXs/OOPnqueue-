
import org.bouncycastle.jcajce.provider.symmetric.DES;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.net.*;
import java.sql.SQLException;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author nk
 */
public class Reservation extends javax.swing.JFrame implements OnClick{

    public Reservation(ComputerPanel companel,Computer comp) {
        this.companel = companel;
        this.comp = comp;
        initComponents();
        try {
            Font appleFont = Font.createFont(Font.TRUETYPE_FONT, new File("OOP/src/Font/Big Apple 3PM.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(appleFont);
            setCustomFont(appleFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
        fetchComboBox();
        timer = new Timer(10000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) jComboBox_lab.getSelectedItem();
                fetchComboBox();
                if (selectedItem != jComboBox_lab.getItemAt(0) && jComboBox_lab.getItemCount() > 0) {
                    jComboBox_lab.setSelectedItem(selectedItem);
                }
            }
        });
        timer.start();
    }

    private void setCustomFont(Font font) {
        Reservation.setFont(font.deriveFont(Font.BOLD, 27));
        seat.setFont(font.deriveFont(Font.BOLD, 18));
        Name.setFont(font.deriveFont(Font.BOLD, 18));
        std_id.setFont(font.deriveFont(Font.BOLD, 18));
        lab.setFont(font.deriveFont(Font.BOLD, 18));
        jTextField_name.setFont(font.deriveFont(Font.PLAIN, 13));
        jComboBox_lab.setFont(font.deriveFont(Font.PLAIN, 13));
        jTextField_id.setFont(font.deriveFont(Font.PLAIN, 13));
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
        bt_confirm = new javax.swing.JButton();
        bt_cancel = new javax.swing.JButton();
        jComboBox_lab = new JComboBox();
        bg = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Reservation.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        Reservation.setForeground(new java.awt.Color(239, 210, 173));
        Reservation.setText("Reservation");
        getContentPane().add(Reservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 20, -1, -1));

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
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 203, 60, 30));

        std_id.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        std_id.setForeground(new java.awt.Color(239, 210, 173));
        std_id.setText("STD_id");
        getContentPane().add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 250, 70, 50));

        lab.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lab.setForeground(new java.awt.Color(239, 210, 173));
        lab.setText("Lab");
        getContentPane().add(lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 324, 40, 20));

        jTextField_name.setBackground(new java.awt.Color(76, 40, 20));
        jTextField_name.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jTextField_name.setForeground(new java.awt.Color(248,210,173));
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

        add(jTextField_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 208, 140, 20));

        jTextField_id.setBackground(new java.awt.Color(76, 40, 20));
        jTextField_id.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jTextField_id.setForeground(new java.awt.Color(239,210,173));
        jTextField_id.setHorizontalAlignment(javax.swing.JTextField.LEADING);
        jTextField_id.setText("ID");
        jTextField_id.setBorder(null);
        jTextField_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_idFocusLost(evt);
            }
        });
        getContentPane().add(jTextField_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 265, 130, 20));

        bt_confirm.setIcon(new ImageIcon("OOP/src/Image/Button/confirmButtonSmall.png"));
        bt_confirm.setBorderPainted(false);
        bt_confirm.setContentAreaFilled(false);
        bt_confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_confirmMouseExited(evt);
            }
        });
        add(bt_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 390, -1, -1));

        bt_cancel.setIcon(new ImageIcon("OOP/src/Image/Button/cancelButtonSmall.png"));
        bt_cancel.setBorderPainted(false);
        bt_cancel.setContentAreaFilled(false);

        getContentPane().add(bt_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, -1, -1));
        bt_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_cancelMouseExited(evt);
            }
        });

        add(bt_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));



        jComboBox_lab.setBackground(new java.awt.Color(76, 40, 20));
        jComboBox_lab.setEditable(false);
        jComboBox_lab.setForeground(new java.awt.Color(239, 210, 173));
        add(jComboBox_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 318, 70, 30));

        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setIcon(new javax.swing.ImageIcon("OOP/src/Image/reserve.png")); // NOI18N
        bg.setOpaque(true);
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



    private void bt_cancelMouseEntered(java.awt.event.MouseEvent evt) {
        //        Change cursor to hand cursor and change pic to bigger button
        bt_cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bt_cancel.setIcon(new ImageIcon("OOP/src/Image/Button/cancelButtonBig.png"));
    }

    private void bt_cancelMouseExited(java.awt.event.MouseEvent evt) {
        //        Change pic to smaller button
        bt_cancel.setIcon(new ImageIcon("OOP/src/Image/Button/cancelButtonSmall.png"));
    }

    private void bt_confirmMouseEntered(java.awt.event.MouseEvent evt) {
        //        Change cursor to hand cursor and change pic to bigger button
        bt_confirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
        bt_confirm.setIcon(new ImageIcon("OOP/src/Image/Button/confirmButtonBig.png"));
    }

    private void bt_confirmMouseExited(java.awt.event.MouseEvent evt) {
        //        Change pic to smaller button
        bt_confirm.setIcon(new ImageIcon("OOP/src/Image/Button/confirmButtonSmall.png"));
    }

    private void jTextField_nameFocusGained(java.awt.event.FocusEvent evt) {
        if (jTextField_name.getText().equals("name")){
            jTextField_name.setText("");
        }
        jTextField_name.setForeground(Color.white);
    }

    private void jTextField_nameFocusLost(java.awt.event.FocusEvent evt) {
        if (jTextField_name.getText().isEmpty()){
            jTextField_name.setText("name");
        }
        jTextField_name.setForeground(Color.white);
    }

    private void jTextField_idFocusGained(java.awt.event.FocusEvent evt) {
        if (jTextField_id.getText().equals("ID")){
            jTextField_id.setText("");
        }
        jTextField_id.setForeground(Color.white);
    }

    private void jTextField_idFocusLost(java.awt.event.FocusEvent evt) {
        if (jTextField_id.getText().isEmpty()){
            jTextField_id.setText("ID");
        }
        jTextField_id.setForeground(Color.white);
    }
    /**
     * @param args the command line arguments
     */


    private javax.swing.JLabel Name;
    private javax.swing.JLabel Reservation;
    private javax.swing.JLabel bg;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_confirm;
    private javax.swing.JLabel img_checking;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField_id;
    private javax.swing.JTextField jTextField_name;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel seat;
    private Timer timer;

    private javax.swing.JComboBox jComboBox_lab;
    private javax.swing.JLabel std_id;

    private ComputerPanel companel;

    private Computer comp;
    private String selectedItem;

    @Override
    public void pressConfirm(ActionEvent event) {
        String insertSql = "INSERT INTO Reservation (SM_SeatID, StudentID, StudentName, Lab_name, Status) VALUES (?, ?, ?, ?, ?)";
        String reserveSql = "UPDATE SeatManager SET Reservable = 0 WHERE SeatID = ?";
        String st_idcheck = jTextField_id.getText();
        int st_id;
        try {
            st_id = Integer.parseInt(st_idcheck);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please fill the studentID correctly.");
            return;
        }
        String st_name = jTextField_name.getText();
        String lab_name = (String) jComboBox_lab.getSelectedItem();
        int deskNumber = this.comp.getComp_id();
        try (PreparedStatement stdstatement = DbCon.prepareStatement(insertSql);
             PreparedStatement restatement = DbCon.prepareStatement(reserveSql);) {
            System.out.println("Seat is reservable");
            stdstatement.setInt(1, deskNumber);
            stdstatement.setInt(2, st_id);
            stdstatement.setString(3, st_name);
            stdstatement.setString(4, lab_name);
            stdstatement.setInt(5, 1);
            stdstatement.executeUpdate();
            restatement.setInt(1, deskNumber);
            restatement.executeUpdate();
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
        new netForReserv();
        this.dispose();
    }

    @Override
    public void pressCancel(ActionEvent event) {
        this.dispose();
    }

    private void fetchComboBox() {
        ArrayList<String> labNames = fetchLabNamesFromDB();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(labNames.toArray(new String[0]));
        jComboBox_lab.setModel(model);
        jComboBox_lab.repaint();
    }
    private ArrayList<String> fetchLabNamesFromDB() {
        ArrayList<String> labNames = new ArrayList<>();
        String selectSql = "SELECT LabNumber FROM LabManager";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement selectstatement = conn.prepareStatement(selectSql);
             ResultSet selectResultSet = selectstatement.executeQuery()) {
            while (selectResultSet.next()) {
                String labName = selectResultSet.getString("LabNumber");
                labNames.add("Lab " + labName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return labNames;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //adasda
    }

}
