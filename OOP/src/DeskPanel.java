import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeskPanel extends JPanel implements RoleChecker, ActionListener, Updater{
    private JPanel deskPanel;
    private JLabel wood;
    private User user;
    private int roleCheck;
    private JScrollPane scrollPanel;
    private ArrayList<Computer> comp_arr = new ArrayList<>();
    private AddingButtonPanel addingButton;
    private static boolean isRunning = false;


    public DeskPanel() {
       initComponents();
    }

    public DeskPanel(User user) {
        this.user = user;
        roleCheck = this.userType();
        initComponents();
        dataFetcher();
    }

    private void initComponents() {
        deskPanel = new JPanel();
        wood = new JLabel();
        addInitialComputerPanels();
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPanel = new JScrollPane(deskPanel);
        scrollPanel.getViewport().setOpaque(false);
        scrollPanel.setOpaque(false);
        scrollPanel.setBorder(null);
        add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 770, 550));
        wood.setIcon(new ImageIcon(getClass().getResource("/Image/left.png")));
        add(wood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }

    private void addInitialComputerPanels() {
        String addingSql = "SELECT SeatID FROM SeatManager WHERE Availability IS NULL"; // เพิ่มโต๊ะ
        String updateSql = "UPDATE SeatManager SET Availability = ? WHERE SeatID = ?"; // เปลี่ยนสถานะ
        String delSql = "UPDATE SeatManager SET Availability = NULL WHERE SeatID = ?"; // ลบโต๊ะ

        deskPanel.setLayout(new GridLayout(0, 7));
        deskPanel.setOpaque(false);
        deskPanel.setBorder(null);
        try (Connection conn = DbCon.getConnection();
             PreparedStatement addingstatement = conn.prepareStatement(addingSql);
             PreparedStatement updateStatement = conn.prepareStatement(updateSql)) {

            ResultSet resultSet = addingstatement.executeQuery();

            int counter = 0;
            if (roleCheck == 2) {
                addingButton = new AddingButtonPanel(this); /**/
                this.deskPanel.add(addingButton);
            }
            while (resultSet.next()) {
                int compID = resultSet.getInt("SeatID");
                Computer computer = new Computer("", "", "", compID, 0);
                ComputerPanel companel = new ComputerPanel(computer);
                companel.setOpaque(false);
                this.deskPanel.add(companel);

                comp_arr.add(computer); // Add the created desk button to the list
                updateStatement.setInt(1, 1); // Set Availability to 1
                updateStatement.setInt(2, compID); // SeatID
                updateStatement.executeUpdate(); // Execute the update statement

                counter++;
                if (counter >= 20) {
                    break;
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Computer> getComp_arr() {
        return  this.comp_arr;
    }
    public JPanel getDeskPanel() {
        return this.deskPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void setIsRunning(boolean run) {
        this.isRunning = run;
    }

    @Override
    public void updateButtonIcon() {

    }

    @Override
    public void updateGUI() {
        this.deskPanel.removeAll();
        for (Computer computer : comp_arr) {
            ComputerPanel companel = new ComputerPanel(computer);
            companel.updateButtonIcon();
            companel.setOpaque(false);
            this.deskPanel.add(companel);
        }
        revalidate();
        repaint();
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
    public int userType() {
        int role = 0;
        if (user instanceof Student) {
            Student student = (Student) user;
            role = student.getRole();
        } else if (user instanceof Professor) {
            Professor prof = (Professor) user;
            role = prof.getRole();
        }  else if (user instanceof TA) {
            TA t_a = (TA) user;
            role = t_a.getRole();
        }
        return role;
    }

}
