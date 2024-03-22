import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DeskPanel extends JPanel {
    private JPanel deskPanel;
    private JLabel wood;
    private JScrollPane scrollPanel;
    private ArrayList<Computer> comp_arr = new ArrayList<>();


    private JButton addingButton, deletingButton, testerButton;

    public DeskPanel() {
        deskPanel = new JPanel();
        wood = new JLabel();
        addComputerPanels();
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPanel = new JScrollPane(deskPanel);
        scrollPanel.getViewport().setOpaque(false);
        scrollPanel.setOpaque(false);
        scrollPanel.setBorder(null);
        add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 770, 550));
        wood.setIcon(new ImageIcon(getClass().getResource("/Image/left.png")));
        add(wood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }

    private void addComputerPanels() {
        String addingSql = "SELECT SeatID FROM SeatManager WHERE Availability IS NULL"; // เพิ่มโต๊ะ
        String updateSql = "UPDATE SeatManager SET Availability = ? WHERE SeatID = ?"; // เปลี่ยนสถานะ
        String checkingSql = "SELECT SeatID FROM SeatManager WHERE Reservable = 0 AND SeatID = ?";
        String delSql = "UPDATE SeatManager SET Availability = NULL WHERE SeatID = ?"; // ลบโต๊ะ
        String resetSql = "UPDATE SeatManager SET Availability = NULL"; // รี sql
        String s_addingSql = "SELECT SeatID FROM SeatManager WHERE SeatID = ?"; // เลือกโต๊ะ

        deskPanel.setLayout(new GridLayout(0, 7));
        deskPanel.setOpaque(false);
        deskPanel.setBorder(null);
        try (Connection conn = DbCon.getConnection();
             PreparedStatement addingstatement = conn.prepareStatement(addingSql);
             PreparedStatement updateStatement = conn.prepareStatement(updateSql)) {

            ResultSet resultSet = addingstatement.executeQuery();

            int counter = 0;
            addingButton = new JButton("+"); // ปุ่มเพิ่ม
            deletingButton = new JButton("-"); // ปุ่มลด
            this.deskPanel.add(addingButton);
            this.deskPanel.add(deletingButton);
            while (resultSet.next()) {
                int compID = resultSet.getInt("SeatID");
                Computer computer = new Computer(compID, 0, "", "", "");
                this.deskPanel.add(new ComputerPanel(computer));

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
        }
    }
}
