import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Newtellafolk
 */
public class CreateSeatMDI extends javax.swing.JFrame implements OnClick{

    /**
     * Creates new form CreateSeatMDI
     */
    public CreateSeatMDI() {
        this(null);
    }

    public CreateSeatMDI(DeskPanel deskPanel) {
        this.deskPanel = deskPanel;
        initComponents();
        seatId.setFocusable(true);
        setLocationRelativeTo(null);
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
        seatId_label = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        createSeat = new javax.swing.JLabel();
        seatId = new javax.swing.JTextField();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(84, 59, 49));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setResizable(false);

        confirmButton.setIcon(new javax.swing.ImageIcon("OOP/src/Image/confirmButtonFont.png")); // NOI18N
        confirmButton.setActionCommand("");
        confirmButton.setBorder(null);
        confirmButton.setContentAreaFilled(false);
        confirmButton.setFocusPainted(false);
        confirmButton.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                confirmButtonAncestorResized(evt);
            }
        });
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressConfirm(evt);
            }
        });
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_confirmMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_confirmMouseExited(evt);
            }
        });
        getContentPane().add(confirmButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 195, 120, 60));
        confirmButton.getAccessibleContext().setAccessibleName("");

        seatId_label.setFont(new java.awt.Font("Big Apple 3PM", Font.PLAIN, 14)); // NOI18N
        seatId_label.setForeground(new java.awt.Color(255, 244, 204));
        seatId_label.setText("Seat ID ");
        getContentPane().add(seatId_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 165, -1, -1));

        cancelButton.setIcon(new javax.swing.ImageIcon("OOP/src/Image/cancelButtonFont.png")); // NOI18N
        cancelButton.setBorder(null);
        cancelButton.setBorderPainted(false);
        cancelButton.setContentAreaFilled(false);
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
        });
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pressCancel(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 165, 90));

        createSeat.setFont(new java.awt.Font("Big Apple 3PM", Font.BOLD, 24)); // NOI18N
        createSeat.setForeground(new java.awt.Color(255, 244, 204));
        createSeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createSeat.setText("Create New Seat");
        getContentPane().add(createSeat, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 30, 330, -1));

        seatId.setBackground(new java.awt.Color(71, 45, 12));
        seatId.setFont(new java.awt.Font("OOP/src/Font/minecraft_font.ttf", 1, 12)); // NOI18N
        seatId.setForeground(new java.awt.Color(239, 210, 173));
        seatId.setText("Enter Seat ID");
        seatId.setBorder(null);
        seatId.setDisabledTextColor(new java.awt.Color(239, 210, 173));
        seatId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                seatIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                seatIdFocusLost(evt);
            }
        });
        getContentPane().add(seatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 165, -1, -1));

        image.setBackground(new java.awt.Color(84, 59, 45));
        image.setIcon(new javax.swing.ImageIcon("OOP/src/Image/NewSeat (1).png")); // NOI18N
        image.setOpaque(true);
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>
    private void bt_confirmMouseEntered(java.awt.event.MouseEvent evt) {
        //        Change cursor to hand cursor and change pic to bigger button
        confirmButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirmButton.setIcon(new ImageIcon("OOP/src/Image/Button/confirmButtonBig.png"));
    }

    private void bt_confirmMouseExited(java.awt.event.MouseEvent evt) {
        //        Change pic to smaller button
        confirmButton.setIcon(new ImageIcon("OOP/src/Image/Button/confirmButtonSmall.png"));
    }

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }
    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {
        //        Change cursor to hand cursor and change pic to bigger button
        cancelButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancelButton.setIcon(new ImageIcon("OOP/src/Image/Button/cancelButtonBig.png"));
    }

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {
        //        Change pic to smaller button
        cancelButton.setIcon(new ImageIcon("OOP/src/Image/Button/cancelButtonSmall.png"));
    }

    private void seatIdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void seatIdFocusGained(java.awt.event.FocusEvent evt) {
        if (seatId.getText().equals("Enter Seat ID")){
            seatId.setText("");
        }
        seatId.setForeground(Color.WHITE);
    }

    private void seatIdFocusLost(java.awt.event.FocusEvent evt) {
        if (seatId.getText().equals("")){
            seatId.setText("Enter Seat ID");
        }
    }

    private void confirmButtonAncestorResized(java.awt.event.HierarchyEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateSeatMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel createSeat;
    private javax.swing.JLabel image;
    private javax.swing.JTextField seatId;
    private javax.swing.JLabel seatId_label;
    private DeskPanel deskPanel;

    @Override
    public void pressConfirm(ActionEvent event) {
        String addingSql = "SELECT SeatID FROM SeatManager WHERE SeatID = ?";
        String updateSql = "UPDATE SeatManager SET Availability = ? WHERE SeatID = ?";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement updateStatement = conn.prepareStatement(updateSql);
             PreparedStatement addingStatement = conn.prepareStatement(addingSql)) {
            try {
                int selectedDesk = Integer.parseInt(seatId.getText());
                addingStatement.setInt(1, selectedDesk);
                ResultSet addingStmt = addingStatement.executeQuery();
                boolean containsCompID = false;
                for (Computer computer : this.deskPanel.getComp_arr()) {
                    if (computer.getComp_id() == selectedDesk) {
                        containsCompID = true;
                        break;
                    }
                }
                if (addingStmt.next()) {
                    int compID = addingStmt.getInt("SeatID");
                    Computer computer = new Computer("", "", "", compID, 0);
                    if (containsCompID == false) {
                        this.deskPanel.getComp_arr().add(computer);
                        ComputerPanel compee = new ComputerPanel(deskPanel, computer, deskPanel.userType());
                        compee.setOpaque(false);
                        System.out.println("alo");
                        this.deskPanel.getDeskPanel().add(compee);
                        this.deskPanel.getCheck_desk_arr().add(compID);
                        this.deskPanel.getDeskPanel().revalidate();
                        this.deskPanel.getDeskPanel().repaint();
                        updateStatement.setInt(1, 1);
                        updateStatement.setInt(2, compID);
                        updateStatement.executeUpdate();
                    } else {
                        JOptionPane.showMessageDialog(null, "This seat already added.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "This room has only 60 seats.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid seat ID.", "Error", JOptionPane.ERROR_MESSAGE);
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