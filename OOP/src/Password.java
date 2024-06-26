
import javax.swing.*;
import java.awt.*;
import java.io.File;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author armmy
 */
public class Password extends javax.swing.JFrame implements RoleChecker{

    /**
     * Creates new form Password
     */
    public Password() {
        this(null);
    }
    public Password(User user) {
        this.user = user;
        role = userType();
        initComponents();
        password_pwf.setFocusable(true);
        setLocationRelativeTo(null);

        try{
            File fontStyle_apple = new File("OOP/src/Font/Big Apple 3PM.ttf");
            Font font_password = Font.createFont(Font.TRUETYPE_FONT,fontStyle_apple).deriveFont(20f);
            password_l.setFont(font_password);
        }catch(Exception e){
            e.printStackTrace();

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        password_p = new javax.swing.JPanel();
        password_l = new javax.swing.JLabel();
        password_pwf = new javax.swing.JPasswordField();
        confirm_bt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Password");
        setSize(new java.awt.Dimension(300, 160));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        password_p.setOpaque(false);

        password_l.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        password_l.setText("Password");

        password_pwf.setBackground(new java.awt.Color(235, 235, 235));
        password_pwf.setForeground(new java.awt.Color(153, 153, 153));
        password_pwf.setText("Input Password");
        password_pwf.setPreferredSize(new Dimension(20,30));
        password_pwf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_pwfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                password_pwfFocusLost(evt);
            }
        });
        password_pwf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_pwfActionPerformed(evt);
            }
        });

        confirm_bt.setIcon(new javax.swing.ImageIcon("OOP/src/Image/confirmButtonFont.png")); // NOI18N
        confirm_bt.setBorderPainted(false);
        confirm_bt.setContentAreaFilled(false);
        confirm_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_btMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirm_btMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirm_btMouseExited(evt);
            }
        });
        confirm_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_btActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailLayout = new javax.swing.GroupLayout(password_p);
        password_p.setLayout(detailLayout);
        detailLayout.setHorizontalGroup(
                detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detailLayout.createSequentialGroup()
                                .addComponent(password_l)
                                .addGap(10, 10, 10)
                                .addComponent(password_pwf, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(confirm_bt)
                                .addGap(51, 51, 51))
        );
        detailLayout.setVerticalGroup(
                detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detailLayout.createSequentialGroup()
                                .addGroup(detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(password_pwf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password_l))
                                .addGap(10, 10, 10)
                                .addComponent(confirm_bt))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(password_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(password_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
        );
    }// </editor-fold>

    private void confirm_btActionPerformed(java.awt.event.ActionEvent evt) {
        String temp_pass = String.valueOf(password_pwf.getPassword());
        if (this.role == 1) {
            TA t_a = (TA) user;
            if (t_a.getPassword().equals(temp_pass)) {
                JOptionPane.showMessageDialog(null, "Welcome to NQUEUE");
                this.dispose();
                MainPage mainpage = new MainPage(new TA());
                mainpage.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (this.role == 2) {
            Professor pfs = (Professor) user;
            if (pfs.getPassword().equals(temp_pass)) {
                JOptionPane.showMessageDialog(null, "Welcome to NQUEUE");
                this.dispose();
                MainPage mainpage = new MainPage(new Professor());
                mainpage.setVisible(true);
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        new ClientTeacher().startServer();
                    }
                });
            } else {
                JOptionPane.showMessageDialog(null, "Invalid password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void password_pwfActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void password_pwfFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if(password_pwf.getText().equals("Input Password")){
            password_pwf.setText("");
        }

        password_pwf.setForeground(Color.black);
    }

    private void password_pwfFocusLost(java.awt.event.FocusEvent evt) {

        if(password_pwf.getText().equals("")){
            password_pwf.setText("Input Password");
        }
        //[153,153,153]
        password_pwf.setForeground(new Color(153,153,153));
    }

    private void confirm_btMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void confirm_btMouseEntered(java.awt.event.MouseEvent evt) {
        confirm_bt.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void confirm_btMouseClicked(java.awt.event.MouseEvent evt) {
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
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton confirm_bt;
    private javax.swing.JLabel password_l;
    private javax.swing.JPanel password_p;
    private javax.swing.JPasswordField password_pwf;
    private User user;
    private int role;

    @Override
    public int userType() {
        int role = 0;
        if (user instanceof Professor) {
            Professor prof = (Professor) user;
            role = prof.getRole();
        }  else if (user instanceof TA) {
            TA t_a = (TA) user;
            role = t_a.getRole();
        }
        return role;
    }
    // End of variables declaration
}
