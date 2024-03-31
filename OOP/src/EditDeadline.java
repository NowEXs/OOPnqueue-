import java.awt.*;
import java.io.File;

public class EditDeadline extends javax.swing.JFrame {


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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        lab_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab_tfActionPerformed(evt);
            }
        });

        lab_txt.setText("Add the Lab number");

        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/button/cancelButtonSmallv2.png"))); // NOI18N
        CancelButton.setBorderPainted(false);
        CancelButton.setContentAreaFilled(false);
        CancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
    // End of variables declaration
}
