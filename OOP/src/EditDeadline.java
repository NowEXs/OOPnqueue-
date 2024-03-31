import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditDeadline extends javax.swing.JFrame implements OnClick{


    public EditDeadline() {
        initComponents();
        lab_tf.setFocusable(true);
        setLocationRelativeTo(null);

        try{
            File fontStyle_apple = new File("OOP/src/Font/Big Apple 3PM.ttf");
            Font font_password = Font.createFont(Font.TRUETYPE_FONT,fontStyle_apple).deriveFont(20f);
            lab_txt.setFont(font_password);
            lab_tf.setFont(font_password);
        }catch(Exception e){
            e.printStackTrace();

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        detail = new javax.swing.JPanel();
        ConfirmButton = new javax.swing.JButton();
        lab_tf = new javax.swing.JTextField();
        lab_txt = new javax.swing.JLabel();
        CancelButton = new javax.swing.JButton();

        setTitle("Edit Lab Deadline");
        setBackground(new java.awt.Color(93, 66, 66));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(340, 190));
        setResizable(false);
        setSize(new java.awt.Dimension(340, 190));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detail.setOpaque(false);

        ConfirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/button/confirmButtonSmallv2.png"))); // NOI18N
        ConfirmButton.setBorderPainted(false);
        ConfirmButton.setContentAreaFilled(false);
        ConfirmButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressConfirm(evt);
            }
        });


        lab_txt.setText("Add the Lab number");

        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/button/cancelButtonSmallv2.png"))); // NOI18N
        CancelButton.setBorderPainted(false);
        CancelButton.setContentAreaFilled(false);
        CancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressCancel(evt);
            }
        });

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(detail);
        detail.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
                detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detailLayout.createSequentialGroup()
                                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(lab_tf)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detailLayout.createSequentialGroup()
                                                        .addComponent(ConfirmButton)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(CancelButton)))
                                        .addGroup(detailLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(lab_txt)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        detailLayout.setVerticalGroup(
                detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detailLayout.createSequentialGroup()
                                .addComponent(lab_txt)
                                .addGap(10, 10, 10)
                                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(detailLayout.createSequentialGroup()
                                                .addComponent(lab_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(ConfirmButton))
                                        .addComponent(CancelButton)))
        );

        getContentPane().add(detail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 340, 190));

        pack();
    }// </editor-fold>

    private void lab_tfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(EditDeadline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDeadline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDeadline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDeadline.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDeadline().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JPanel detail;
    private javax.swing.JTextField lab_tf;
    private javax.swing.JLabel lab_txt;

    @Override
    public void pressConfirm(ActionEvent event) {
        int checker = -1;
        if (this.lab_tf.getText() == "") {
            return;
        }
        try {
            checker = Integer.parseInt(this.lab_tf.getText());
            if (checker <= 0) {
                JOptionPane.showMessageDialog(null, "Invalid input! Please enter a positive integer.");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Invalid input! Please enter an integer.");
            return;
        }
        String updateSql = "UPDATE LabManager SET isTodayDeadline = 1 WHERE LabNumber = ?";
        String resetSql = "UPDATE LabManager SET isTodayDeadline = NULL";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement updateStatement = conn.prepareStatement(updateSql);
             PreparedStatement resetStatement = conn.prepareStatement(resetSql)) {
            resetStatement.executeUpdate();
            updateStatement.setInt(1, checker);
            int rowsAffected = updateStatement.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Edited successfully!");
            } else {
                JOptionPane.showMessageDialog(null, "Error! this lab was not added into the program!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void pressCancel(ActionEvent event) {
        this.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    // End of variables declaration
}
