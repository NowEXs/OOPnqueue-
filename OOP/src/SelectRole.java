
import java.awt.*;
import java.io.*;
public class SelectRole extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public SelectRole() {
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

    }
    private void setCustomFont(Font font){
        txt_select.setFont(font.deriveFont(Font.PLAIN, 16));
        txt_welcome.setFont(font.deriveFont(Font.BOLD, 36));
        txt_nq.setFont(font.deriveFont(Font.BOLD, 48));
        PFSButton.setFont(font.deriveFont(Font.PLAIN, 24));
        STDButton.setFont(font.deriveFont(Font.PLAIN, 24));
        TAButton.setFont(font.deriveFont(Font.PLAIN, 24));
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        txt_select = new javax.swing.JLabel();
        txt_welcome = new javax.swing.JLabel();
        txt_nq = new javax.swing.JLabel();
        PFSButton = new javax.swing.JButton();
        STDButton = new javax.swing.JButton();
        TAButton = new javax.swing.JButton();
        image = new javax.swing.JLabel();
        bg = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("N-Queue");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(0, 0));
        setLocationRelativeTo(null);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_select.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        txt_select.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_select.setText("Select your role");
        getContentPane().add(txt_select, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 330, 170, -1));

        txt_welcome.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        txt_welcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_welcome.setText("Welcome to");
        getContentPane().add(txt_welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, 240, -1));

        txt_nq.setFont(new java.awt.Font("Arial Black", 2, 48)); // NOI18N
        txt_nq.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nq.setText("N - Queue");
        getContentPane().add(txt_nq, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, 270, -1));

        PFSButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        PFSButton.setText("Professor");
        PFSButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PFSButton.setMargin(new java.awt.Insets(3, 14, 3, 14));
        PFSButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PFSButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PFSButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 470, 170, -1));

        STDButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        STDButton.setText("Student");
        STDButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        STDButton.setMargin(new java.awt.Insets(3, 14, 3, 14));
        STDButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STDButtonActionPerformed(evt);
            }
        });
        getContentPane().add(STDButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, 170, -1));

        TAButton.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        TAButton.setText("TA");
        TAButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TAButton.setMargin(new java.awt.Insets(3, 14, 3, 14));
        TAButton.addActionListener(new java.awt.event.ActionListener() {    
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TAButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 170, -1));
        TAButton.getAccessibleContext().setAccessibleDescription("");

        image.setIcon(new javax.swing.ImageIcon("OOP/src/Image/BG.png")); // NOI18N
        image.setMaximumSize(new java.awt.Dimension(1200, 1080));
        image.setMinimumSize(new java.awt.Dimension(1200, 1080));
        image.setPreferredSize(new java.awt.Dimension(1200, 1080));
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, -210, 780, 1010));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 510, 710));
        setLocationRelativeTo(null);
        pack();
    }

    private void PFSButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Password pass_gui = new Password(new Professor());
        pass_gui.setVisible(true);
    }

    private void STDButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        MainPage mainWindow = new MainPage(new Student());
        mainWindow.setVisible(true);
    }

    private void TAButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Password pass_gui = new Password(new TA());
        pass_gui.setVisible(true);
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
            java.util.logging.Logger.getLogger(SelectRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SelectRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SelectRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SelectRole.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SelectRole().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton PFSButton;
    private javax.swing.JButton STDButton;
    private javax.swing.JButton TAButton;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel image;
    private javax.swing.JLabel txt_nq;
    private javax.swing.JLabel txt_select;
    private javax.swing.JLabel txt_welcome;
    // End of variables declaration
}
