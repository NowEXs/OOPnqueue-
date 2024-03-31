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
public class DeadlinePanel extends javax.swing.JPanel implements Updater, RoleChecker, ActionListener{

    /**
     * Creates new form deadlinePanel
     */
    public DeadlinePanel(User user) {
        this.user = user;
        initComponents();
        dataFetcher();

    }

    private void initComponents() {
        txt_today = new javax.swing.JLabel();
        txt_lab = new javax.swing.JLabel();
        txt_people = new javax.swing.JLabel();
        bg_deadline = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        setOpaque(false);

        txt_today.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_today.setForeground(new java.awt.Color(87, 65, 43));
        txt_today.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_today.setText("Today's Deadline");
        txt_today.setIconTextGap(5);
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/button/editButton (1).png"))); // NOI18N
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        editButton.setContentAreaFilled(false);
        if (userType() == 2) {
            add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 22, 30, 15));
            editButton.addActionListener(this);
        }

        add(txt_today, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 30));

        txt_lab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_lab.setForeground(new java.awt.Color(87, 65, 43));
        add(txt_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 62, 60, -1));

        txt_people.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_people.setForeground(new java.awt.Color(87, 65, 43));
        txt_people.setText("0 people");
        add(txt_people, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 62, 80, -1));

        bg_deadline.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imagever2.png"))); // NOI18N
        add(bg_deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 105));
    }

    private javax.swing.JLabel bg_deadline;
    private javax.swing.JLabel txt_lab;
    private javax.swing.JLabel txt_people;
    private javax.swing.JLabel txt_today;
    private javax.swing.JButton editButton;
    private String deadlineLab;
    private User user;

    private void fetchingDeadline() {
        String fetchSql = "SELECT LabNumber FROM LabManager WHERE isTodayDeadline = 1";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement fetchStatement = conn.prepareStatement(fetchSql)) {
            ResultSet resultSet = fetchStatement.executeQuery();
            if (resultSet.next()) {
                deadlineLab = String.valueOf(resultSet.getInt("LabNumber"));
                txt_lab.setText("Lab: " + deadlineLab);
            } else {
                txt_lab.setText("Lab: -");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
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
                fetchingDeadline();
                updateGUI();
            }
        });
        timer.start();
    }

    @Override
    public void updateButtonIcon() {

    }

    @Override
    public int userType() {
        int role = 0;
        if (user instanceof Student) {
            Student student = (Student) user;
            role = student.getRole();
        } else if (user instanceof Professor) {
            Professor prof = (Professor) user;
            role = prof.getRole();
        } else if (user instanceof TA) {
            TA t_a = (TA) user;
            role = t_a.getRole();
        }
        return role;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(editButton)) {
            String[] options = {"Add and Delete Lab", "Edit Deadline"};
            int choice = JOptionPane.showOptionDialog(null, "Choose an option", "Options",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (choice == JOptionPane.YES_OPTION) {
                AddDelLab adddelWindow = new AddDelLab();
                adddelWindow.setVisible(true);
            } else if (choice == JOptionPane.NO_OPTION) {
                deadlineLab = JOptionPane.showInputDialog(null, "Add The Lab Number");
                int checker = -1;
                try {
                    checker = Integer.parseInt(deadlineLab);
                    if (checker <= 0) {
                        JOptionPane.showMessageDialog(null, "Invalid input! Please enter a positive integer.");
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please enter an integer.");
                    return;
                }
                String updateSql = "UPDATE LabManager SET isTodayDeadline = 1 WHERE LabNumber = ?";
                String resetSql = "UPDATE LabManager SET isTodayDeadline = NULL";
                try (Connection conn = DbCon.getConnection();
                     PreparedStatement updateStatement = conn.prepareStatement(updateSql);
                     PreparedStatement resetStatement = conn.prepareStatement(resetSql)) {
                    resetStatement.executeUpdate();
                    updateStatement.setInt(1, checker);
                    int rowsAffected = updateStatement.executeUpdate();
                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(null, "Edited successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error! this lab was not added into the program!");
                    }
                } catch (SQLException ev) {
                    ev.printStackTrace();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
    }
}