/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author gypprt
 */
public class Checkingpage extends javax.swing.JFrame {

    /**
     * Creates new form Checkingpage
     */
    public Checkingpage() {
        initComponents();
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
        jLabel10 = new javax.swing.JLabel();
        std_l = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name_l = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Computer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Checking");
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(0, 25, 300, 500));
        setMaximumSize(new java.awt.Dimension(300, 500));
        setMinimumSize(new java.awt.Dimension(300, 500));
        setPreferredSize(new java.awt.Dimension(300, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        confirmButton.setIcon(new javax.swing.ImageIcon("OOP/src/Image/FillScore.png")); // NOI18N
        confirmButton.setBorderPainted(false);
        confirmButton.setContentAreaFilled(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 140, 40));

        lab_l.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        lab_l.setForeground(new java.awt.Color(255, 255, 255));
        lab_l.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lab_l.setText("9");
        getContentPane().add(lab_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 50, 30));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(234, 211, 177));
        jLabel10.setText("Lab");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 40, 30));

        std_l.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        std_l.setForeground(new java.awt.Color(255, 255, 255));
        std_l.setText("std");
        getContentPane().add(std_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 90, 30));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(234, 211, 177));
        jLabel8.setText("STD_ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, 30));

        name_l.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        name_l.setForeground(new java.awt.Color(255, 255, 255));
        name_l.setText("name");
        getContentPane().add(name_l, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 80, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(234, 211, 177));
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("25");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, 290, 40));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(124, 76, 37));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("17:00:30");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 140, 30));

        Computer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Computer.setIcon(new javax.swing.ImageIcon("OOP/src/Image/checking-2.png")); // NOI18N
        Computer.setMaximumSize(new java.awt.Dimension(130, 100));
        getContentPane().add(Computer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 300, 100));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 2, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(71, 42, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Checking");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 300, 30));

        jLabel3.setBackground(new java.awt.Color(84, 59, 45));
        jLabel3.setIcon(new javax.swing.ImageIcon("OOP/src/Image/clockWood.png")); // NOI18N
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setIconTextGap(5);
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
//        this.dispose();
//        NewJFrame pi = new NewJFrame();
//        pi.setVisible(true);

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
            java.util.logging.Logger.getLogger(Checkingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Checkingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Checkingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Checkingpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Checkingpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Computer;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lab_l;
    private javax.swing.JLabel name_l;
    private javax.swing.JLabel std_l;
    // End of variables declaration
}
