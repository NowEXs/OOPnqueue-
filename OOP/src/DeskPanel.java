import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeskPanel extends JPanel implements RoleChecker, ActionListener{
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
            addingButton.addActionListener(this);
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
            addingButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try (Connection conn = DbCon.getConnection();
                         PreparedStatement addingstatement = conn.prepareStatement(addingSql)) {
                        ResultSet resultSet = addingstatement.executeQuery();
                        String[] columnNames = {"Desknumber"};
                        java.util.List<Object[]> dataList = new ArrayList<>();
                        while (resultSet.next()) {
                            int seatID = resultSet.getInt("SeatID");
                            dataList.add(new Object[]{seatID});
                        }

                        Object[][] data = new Object[dataList.size()][1]; // Assuming 1 columns (Desknumber)
                        for (int i = 0; i < dataList.size(); i++) {
                            data[i] = dataList.get(i);
                        }

                        JTable table = new JTable(data, columnNames);
                        JScrollPane scrollPane = new JScrollPane(table);
                        JFrame dialog = new JFrame();
                        JButton addButton = new JButton("add the desk");
                        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                            @Override
                            public void valueChanged(ListSelectionEvent e) {
                                if (!e.getValueIsAdjusting())  { // getValueIsAdjusting() = เพื่อให้ mouse detect ที่แค่การ click row */
                                    int selectedRow = table.getSelectedRow();
                                    if (selectedRow != -1) { // condition กันบั๊กในกรณ๊ที่ ไม่เหลือข้อมูล
                                        Object deskNumber = table.getValueAt(selectedRow, 0);
                                        String selectedText = "Desk Number: " + deskNumber;
                                        System.out.println(selectedText);

                                        addButton.addActionListener(new ActionListener() {
                                            @Override
                                            public void actionPerformed(ActionEvent e) {
                                                try (Connection conn = DbCon.getConnection();
                                                     PreparedStatement addingStatement = conn.prepareStatement(s_addingSql);
                                                     PreparedStatement updateStatement = conn.prepareStatement(updateSql);
                                                     PreparedStatement r_tableStatement = conn.prepareStatement(addingSql)) {
                                                    addingStatement.setInt(1, (int) deskNumber);
                                                    ResultSet resultSet = addingStatement.executeQuery();
                                                    if (resultSet.next()) {
                                                        int compID = resultSet.getInt("SeatID");
                                                        Computer computer = new Computer("", "", "", compID, 0);

                                                        if (!comp_arr.contains(computer)) {
                                                            comp_arr.add(computer);
                                                            ComputerPanel compee = new ComputerPanel(computer);
                                                            compee.setOpaque(false);
                                                            DeskPanel.this.deskPanel.add(compee);
                                                            DeskPanel.this.deskPanel.revalidate();
                                                            DeskPanel.this.deskPanel.repaint();
                                                        }
                                                        updateStatement.setInt(1, 1);
                                                        updateStatement.setInt(2, compID);
                                                        updateStatement.executeUpdate();

                                                        ResultSet newDataResultSet = r_tableStatement.executeQuery();
                                                        List<Object[]> newDataList = new ArrayList<>(); // Parametic Polymor
                                                        while (newDataResultSet.next()) {
                                                            int seatID = newDataResultSet.getInt("SeatID");
                                                            newDataList.add(new Object[]{seatID});
                                                        }
                                                        Object[][] newData = new Object[newDataList.size()][1];
                                                        for (int i = 0; i < newDataList.size(); i++) {
                                                            newData[i] = newDataList.get(i);
                                                        }
                                                        DefaultTableModel model = new DefaultTableModel(newData, columnNames);
                                                        table.setModel(model);
                                                        dialog.dispose();
                                                    }
                                                } catch (SQLException ex) {
                                                    ex.printStackTrace();
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                        });

                        Container contentPane = dialog.getContentPane();
                        contentPane.setLayout(new BorderLayout());
                        contentPane.add(scrollPane, BorderLayout.CENTER);
                        contentPane.add(addButton, BorderLayout.SOUTH);
                        dialog.add(scrollPane);
                        dialog.pack();
                        dialog.setVisible(true);


                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                }
            });
         
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void userType() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
