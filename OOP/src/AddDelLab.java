import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddDelLab extends javax.swing.JFrame implements OnClick{

    /**
     * Creates new form Password
     */

    private javax.swing.JButton ConfirmButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTextField Lab_tf;
    private javax.swing.JLabel txt_Lab;
    private javax.swing.JPanel Color_BG;
    private javax.swing.JPanel detail;

    public AddDelLab() {
        initComponents();
        setLocationRelativeTo(null);

        try {
            Font appleFont = Font.createFont(Font.TRUETYPE_FONT, new File("OOP/src/Font/Big Apple 3PM.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(appleFont);
            setCustomFont(appleFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setCustomFont(Font font){
        txt_Lab.setFont(font.deriveFont(Font.PLAIN, 16));
        Lab_tf.setFont(font.deriveFont(Font.PLAIN, 16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        txt_Lab = new javax.swing.JLabel();
        Lab_tf = new javax.swing.JTextField();
        ConfirmButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        Color_BG = new javax.swing.JPanel();
        detail = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(275, 150));
        setResizable(false);
        setBackground(new java.awt.Color(84, 59, 45));
        setTitle("Add&Delete Lab");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Lab.setForeground(new java.awt.Color(255, 255, 255));
        txt_Lab.setText("Lab");

        Lab_tf.setBackground(new java.awt.Color(175, 130, 104));
        Lab_tf.setForeground(new java.awt.Color(255, 255, 255));
        Lab_tf.setForeground(new java.awt.Color(204, 204, 204));
        ConfirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button/confirmButtonSmallv2.png"))); // NOI18N
        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressConfirm(evt);
            }
        });

        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/button/deleteButtonSmallv2.png"))); // NOI18N
        DeleteButton.setBorderPainted(false);
        DeleteButton.setContentAreaFilled(false);
        DeleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressCancel(evt);
            }
        });
        getContentPane().add(DeleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 59, 104, -1));

        detail.setOpaque(false);

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(detail);
        detail.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
                detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detailLayout.createSequentialGroup()
                                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(detailLayout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(txt_Lab)
                                                .addGap(15, 15, 15)
                                                .addComponent(Lab_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30))
                                        .addGroup(detailLayout.createSequentialGroup()
                                                .addGap(0, 0, 0)
                                                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        detailLayout.setVerticalGroup(
                detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detailLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_Lab)
                                        .addComponent(Lab_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ConfirmButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(DeleteButton, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        getContentPane().add(detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 220, 80));

        Color_BG.setBackground(new java.awt.Color(132, 99, 82));

        javax.swing.GroupLayout Color_BGLayout = new javax.swing.GroupLayout(Color_BG);
        Color_BG.setLayout(Color_BGLayout);
        Color_BGLayout.setHorizontalGroup(
                Color_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 280, Short.MAX_VALUE)
        );
        Color_BGLayout.setVerticalGroup(
                Color_BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 170, Short.MAX_VALUE)
        );

        getContentPane().add(Color_BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 170));
        setLocationRelativeTo(null);
        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddDelLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDelLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDelLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDelLab.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDelLab().setVisible(true);
            }
        });
    }

    @Override
    public void pressConfirm(ActionEvent event) {
        String selectSql = "INSERT INTO LabManager (LabNumber) VALUES (?)";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement addingstatement = conn.prepareStatement(selectSql)) {
            addingstatement.setInt(1, Integer.parseInt(Lab_tf.getText()));
            int rowsAffected = addingstatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Lab added! :D");
            } else {
                JOptionPane.showMessageDialog(null, "This Lab was added into the program!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void pressCancel(ActionEvent event) {
        String deleteSql = "DELETE FROM LabManager WHERE LabNumber = ?";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement deleteStatement = conn.prepareStatement(deleteSql)) {
            deleteStatement.setInt(1, Integer.parseInt(Lab_tf.getText()));
            int rowsAffected = deleteStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Lab Deleted!");
            } else {
                JOptionPane.showMessageDialog(null, "This Lab was not in the program!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    // Variables declaration - do not modify

}
