
/**
 *
 * @author Newtellafolk
 */
import javax.swing.*;
import java.awt.Color;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

public class DeleteSeatMDI extends javax.swing.JFrame {

    /**
     * Creates new form DeleteSeatMDI
     */
    public DeleteSeatMDI(DeskPanel desk, Computer comp) {
        this.desk = desk;
        this.comp = comp;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        seatId_label = new javax.swing.JLabel();
        seatID = new javax.swing.JTextField();
        delete_label = new javax.swing.JLabel();
        deleteButton = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        seatId_label.setFont(new java.awt.Font("Big Apple 3PM", 1, 16)); // NOI18N
        seatId_label.setForeground(new java.awt.Color(255, 244, 204));
        seatId_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seatId_label.setText("Seat ID");
        getContentPane().add(seatId_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 166, 75, -1));

        seatID.setBackground(new java.awt.Color(79, 47, 19));
        seatID.setFont(new java.awt.Font("Big Apple 3PM", 1, 12)); // NOI18N
        seatID.setForeground(new java.awt.Color(245, 243, 230));
        seatID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seatID.setText(comp.getComp_id() + "");
        seatID.setEditable(false);
        seatID.setBorder(null);
        getContentPane().add(seatID, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 167, 90, 15));

        delete_label.setFont(new java.awt.Font("Big Apple 3PM", 1, 24)); // NOI18N
        delete_label.setForeground(new java.awt.Color(255, 244, 204));
        delete_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        delete_label.setText("Delete Seat");
        getContentPane().add(delete_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 330, 30));

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/deleteButtonSmall.png"))); // NOI18N
        deleteButton.setBorder(null);
        deleteButton.setBorderPainted(false);
        deleteButton.setContentAreaFilled(false);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
              deleteButtonActionPerformed(evt);
            }
          });

        getContentPane().add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 205, 330, -1));

        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/NewSeat (1).png"))); // NOI18N
        bg.setText("jLabel1");
        bg.setOpaque(true);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, -1));

        pack();
    }// </editor-fold>

    private void enterSeatIdActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void enterSeatIdFocusGained(java.awt.event.FocusEvent evt) {
        if (seatID.getText().equals("Enter Seat ID")) {
            seatID.setText("");
        }
        seatID.setForeground(Color.WHITE);
    }

    private void enterSeatIdFocusLost(java.awt.event.FocusEvent evt) {
        if (seatID.getText().equals("")) {
            seatID.setText("Enter Seat ID");
        }
    }


    private void deleteButtonActionPerformed (java.awt.event.ActionEvent evt){
        String delSql = "UPDATE SeatManager SET Availability = NULL WHERE SeatID = ?"; // ลบโต๊ะ
        try (Connection conn = DbCon.getConnection();
             PreparedStatement delStatement = conn.prepareStatement(delSql)) {
            int deskNumber = Integer.parseInt(seatID.getText());
            for (ComputerPanel comp : this.desk.getDeskArr()) {
                int comp_id = comp.getComp().getComp_id();
                if (deskNumber == comp_id) {
                    this.desk.getDeskPanel().remove(comp);
                    this.desk.getDeskArr().remove(comp);
                    this.desk.getComp_arr().remove(comp.getComp());
                    this.desk.getCheck_desk_arr().remove(Integer.valueOf(comp_id));
                    delStatement.setInt(1, deskNumber);
                    delStatement.executeUpdate();
                    break;
                }
            }
            this.desk.getDeskPanel().revalidate();
            this.desk.getDeskPanel().repaint();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // Variables declaration - do not modify
    private javax.swing.JLabel bg;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel delete_label;
    private javax.swing.JTextField seatID;
    private javax.swing.JLabel seatId_label;
    private DeskPanel desk;
    private Computer comp;
    // End of variables declaration
}