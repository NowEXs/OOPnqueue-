
import java.awt.Color;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Newtellafolk
 */
public class CreateSeatMDI extends javax.swing.JFrame {

    /**
     * Creates new form CreateSeatMDI
     */
    public CreateSeatMDI() {
        initComponents();
        enter_seatID.setFocusable(true);
        enter_seatID.setEditable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        enter_seatID = new javax.swing.JTextField();
        seatId_label = new javax.swing.JLabel();
        imgcom = new javax.swing.JLabel();
        img_txtfield = new javax.swing.JLabel();
        Cancel_label = new javax.swing.JLabel();
        CreateSeat = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        confirm_label = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        Queue_label = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enter_seatID.setEditable(false);
        enter_seatID.setBackground(new java.awt.Color(76, 40, 20));
        enter_seatID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        enter_seatID.setForeground(new java.awt.Color(239, 210, 173));
        enter_seatID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        enter_seatID.setText("Enter Seat ID");
        enter_seatID.setBorder(null);
        enter_seatID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                enter_seatIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                enter_seatIDFocusLost(evt);
            }
        });
        enter_seatID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_seatIDActionPerformed(evt);
            }
        });
        getContentPane().add(enter_seatID, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 265, 105, -1));

        seatId_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        seatId_label.setForeground(new java.awt.Color(239, 210, 173));
        seatId_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seatId_label.setText("Seat ID");
        getContentPane().add(seatId_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 255, 105, 45));

        imgcom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgcom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N-Queue graphics/Mascot/CreateCom.png"))); // NOI18N
        getContentPane().add(imgcom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 135, 345, 120));

        img_txtfield.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N-Queue graphics/Panel/Txtbox(225, 35).png"))); // NOI18N
        getContentPane().add(img_txtfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 255, 240, 45));

        Cancel_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Cancel_label.setForeground(new java.awt.Color(79, 79, 79));
        Cancel_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cancel_label.setText("Cancel");
        getContentPane().add(Cancel_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 345, 135, 45));

        CreateSeat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CreateSeat.setForeground(new java.awt.Color(239, 210, 173));
        CreateSeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CreateSeat.setText("Create New Seat");
        getContentPane().add(CreateSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 345, 45));

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N-Queue graphics/Button/cancelBtn.png"))); // NOI18N
        cancelButton.setBorderPainted(false);
        cancelButton.setContentAreaFilled(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 345, 165, -1));

        confirm_label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        confirm_label.setForeground(new java.awt.Color(79, 79, 79));
        confirm_label.setText("Confirm");
        getContentPane().add(confirm_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 345, 90, 45));

        confirmButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N-Queue graphics/Button/confirmBtn.png"))); // NOI18N
        confirmButton.setBorderPainted(false);
        confirmButton.setContentAreaFilled(false);
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });
        getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 345, 135, -1));

        Queue_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Queue_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Queue_label.setText("Queue :");
        getContentPane().add(Queue_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 75, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N-Queue graphics/Panel/bread Pop up(354,463).png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void enter_seatIDActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void enter_seatIDFocusGained(java.awt.event.FocusEvent evt) {
        if (enter_seatID.getText().equals("Enter Seat ID")){
            enter_seatID.setText("");
        }
        enter_seatID.setForeground(Color.white);
    }

    private void enter_seatIDFocusLost(java.awt.event.FocusEvent evt) {
        if (enter_seatID.getText().equals("")){
            enter_seatID.setText("Enter Seat ID");
        }
//        [239,210,173]
        enter_seatID.setForeground(new Color(239,210,173));
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
            java.util.logging.Logger.getLogger(CreateSeatMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateSeatMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateSeatMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateSeatMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateSeatMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel Cancel_label;
    private javax.swing.JLabel CreateSeat;
    private javax.swing.JLabel Queue_label;
    private javax.swing.JLabel bg;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel confirm_label;
    private javax.swing.JTextField enter_seatID;
    private javax.swing.JLabel img_txtfield;
    private javax.swing.JLabel imgcom;
    private javax.swing.JLabel seatId_label;
    // End of variables declaration
}