import java.awt.*;
import java.io.File;
/**
 *
 * @author nk
 */
public class CheckQueueMDI extends javax.swing.JFrame {

    /**
     * Creates new form Reservation
     */
    public CheckQueueMDI() {
        initComponents();
        setCustomFont();
        centerFrame();
    }

    private void setCustomFont() {
        try {
            // Load and register the font
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("OOP/src/Font/Big Apple 3PM.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            // Set the font for components
            Queue.setFont(customFont.deriveFont(Font.BOLD, 24));
            seat.setFont(customFont.deriveFont(Font.BOLD, 18));
            Name.setFont(customFont.deriveFont(Font.BOLD, 18));
            std_id.setFont(customFont.deriveFont(Font.BOLD, 18));
            lab.setFont(customFont.deriveFont(Font.BOLD, 18));
            Confirm.setFont(customFont.deriveFont(Font.BOLD, 18));
            Cancel.setFont(customFont.deriveFont(Font.BOLD, 18));
            jLabel_name.setFont(customFont.deriveFont(Font.PLAIN, 13));
            jLabel_id.setFont(customFont.deriveFont(Font.PLAIN, 13));
            jLabel_lab.setFont(customFont.deriveFont(Font.PLAIN, 13));
        } catch (Exception e) {
            e.printStackTrace();
        }

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

        Queue = new javax.swing.JLabel();
        img_checking = new javax.swing.JLabel();
        seat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        std_id = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        Confirm = new javax.swing.JLabel();
        bt_confirm = new javax.swing.JButton();
        Cancel = new javax.swing.JLabel();
        bt_cancel = new javax.swing.JButton();
        jLabel_name = new javax.swing.JLabel();
        jLabel_id = new javax.swing.JLabel();
        jLabel_lab = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setLocationRelativeTo(null);

        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Queue.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        Queue.setForeground(new java.awt.Color(239, 210, 173));
        Queue.setText("Queue 1");
        getContentPane().add(Queue, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

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


        bt_confirm.setIcon(new javax.swing.ImageIcon("OOP/src/Image/confirmButtonFont.png")); // NOI18N
        bt_confirm.setBorderPainted(false);
        bt_confirm.setContentAreaFilled(false);
        getContentPane().add(bt_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 390, -1, -1));


        bt_cancel.setIcon(new javax.swing.ImageIcon("OOP/src/Image/cancelButtonFont.png")); // NOI18N
        bt_cancel.setBorderPainted(false);
        bt_cancel.setContentAreaFilled(false);
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });
        getContentPane().add(bt_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 390, -1, -1));

        jLabel_name.setForeground(new java.awt.Color(239, 210, 173));
        jLabel_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_name.setText("name");
        jLabel_name.setToolTipText("");
        getContentPane().add(jLabel_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 140, -1));

        jLabel_id.setForeground(new java.awt.Color(239, 210, 173));
        jLabel_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_id.setText("id");
        getContentPane().add(jLabel_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, 30));

        jLabel_lab.setForeground(new java.awt.Color(239, 210, 173));
        jLabel_lab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_lab.setText("lab");
        getContentPane().add(jLabel_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 50, 20));

        bg.setIcon(new javax.swing.ImageIcon("OOP/src/Image/reserve.png")); // NOI18N
        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setOpaque(true);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {
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
                new CheckQueueMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Cancel;
    private javax.swing.JLabel Confirm;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Queue;
    private javax.swing.JLabel bg;
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_confirm;
    private javax.swing.JLabel img_checking;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_lab;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel lab;
    private javax.swing.JLabel seat;
    private javax.swing.JLabel std_id;
    // End of variables declaration
}
