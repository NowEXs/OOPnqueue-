import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Newtellafolk
 */
public class DeadlinePanel extends javax.swing.JPanel implements Updater{

    /**
     * Creates new form deadlinePanel
     */
    public DeadlinePanel() {
        initComponents();
        dataFetcher();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txt_today = new javax.swing.JLabel();
        txt_lab = new javax.swing.JLabel();
        txt_people = new javax.swing.JLabel();
        bg_deadline = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_today.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_today.setForeground(new java.awt.Color(87, 65, 43));
        txt_today.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_today.setText("Today's Deadline");
        txt_today.setToolTipText("");
        txt_today.setIconTextGap(5);
        add(txt_today, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 30));

        txt_lab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_lab.setForeground(new java.awt.Color(87, 65, 43));
        txt_lab.setText("Lab: 7");
        add(txt_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 62, 60, -1));

        txt_people.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_people.setForeground(new java.awt.Color(87, 65, 43));
        txt_people.setText("50 people");
        add(txt_people, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 62, 80, -1));

        bg_deadline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imagever2.png"))); // NOI18N
        add(bg_deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 105));
    }// </editor-fold>                        



    // Variables declaration - do not modify                     
    private javax.swing.JLabel bg_deadline;
    private javax.swing.JLabel txt_lab;
    private javax.swing.JLabel txt_people;
    private javax.swing.JLabel txt_today;


    @Override
    public void updateGUI() {
        String countSql = "SELECT COUNT(*) AS row_count FROM Reservation";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement countStatement = conn.prepareStatement(countSql);
             ResultSet countResult = countStatement.executeQuery()) {
            countResult.next();
            int rowCount = countResult.getInt("row_count");
            txt_people.setText(rowCount + " people");

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void dataFetcher() {
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateGUI();
            }
        });
        timer.start();
    }

    @Override
    public void updateButtonIcon() {

    }

}