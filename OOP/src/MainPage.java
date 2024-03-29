/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author huawei
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            String resetSeat = "UPDATE SeatManager SET Availability = NULL"; // รี sql
            String resetQueue = "DELETE FROM Reservation";
            String resetReserv = "UPDATE SeatManager SET Reservable = NULL";
            String resetQNum = "ALTER TABLE Reservation AUTO_INCREMENT = 1";
            try (PreparedStatement delallstatement = DbCon.prepareStatement(resetSeat);
                 PreparedStatement delQstatement = DbCon.prepareStatement(resetQueue);
                 PreparedStatement resetQstatement = DbCon.prepareStatement(resetQNum);
                 PreparedStatement reserveStatement = DbCon.prepareStatement(resetReserv)) {
                delallstatement.executeUpdate();
                delQstatement.executeUpdate();
                resetQstatement.executeUpdate();
                reserveStatement.executeUpdate();
                System.out.println("del_data_completed");
            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }));
    }
    public MainPage(User user) {
         this.user = user;
         initComponents();
         countdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {
        wood_panel = new DeskPanel(user);
        wood_panel.setBorder(null);
        cont = new javax.swing.JPanel();
        waitingPanel = new WaitingPanel(wood_panel);
        deadline = new DeadlinePanel(user);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("N-Queue");
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cont.setMinimumSize(new java.awt.Dimension(1200, 700));



        javax.swing.GroupLayout contLayout = new javax.swing.GroupLayout(cont);
        cont.setLayout(contLayout);
        contLayout.setHorizontalGroup(
                contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contLayout.createSequentialGroup()
                                .addComponent(wood_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(waitingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0))
        );
        contLayout.setVerticalGroup(
                contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(contLayout.createSequentialGroup()
                                .addGroup(contLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(contLayout.createSequentialGroup()
                                                .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(waitingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(wood_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(100, Short.MAX_VALUE))
        );
        getContentPane().add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 600));
        setLocationRelativeTo(null);
        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    public static void countdown() {
        JOptionPane loading = new JOptionPane("Loading data, please wait...", JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, null, null);
        JDialog dialog = loading.createDialog("Countdown");
        dialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Thread countdownThread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                SwingUtilities.invokeLater(() -> {
                    dialog.dispose();
                    JOptionPane.showMessageDialog(null, "Loading finished!", "Countdown", JOptionPane.INFORMATION_MESSAGE);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        countdownThread.setDaemon(true); // low priority thread that run in the bg
        countdownThread.start();

        dialog.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                countdownThread.interrupt(); //shut thread down
            }
        });

        dialog.setVisible(true);
    }


    // Variables declaration - do not modify
    private javax.swing.JPanel cont;
    private javax.swing.JPanel deadline;
    private DeskPanel wood_panel;
    private WaitingPanel waitingPanel;

    private User user;
    // End of variables declaration
}
