import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeskPanel extends JPanel implements RoleChecker, ActionListener, Updater {
    private JPanel deskPanel;
    private JLabel wood;
    private JButton queueButton;
    private User user;
    private int roleCheck;
    private JScrollPane scrollPanel;
    private ArrayList<Computer> comp_arr = new ArrayList<>();
    private ArrayList<Integer> check_desk_arr = new ArrayList<>();
    private AddingButtonPanel addingButton;
    private static boolean isRunning = false;
    private JTable queueTable;
    private DefaultTableModel model;

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
        queueButton = new JButton();
        queueTable = new JTable();
        String[] columnNames = { "QueueNumber", "Seat_ID", "Student_ID", "Student_Name", "Lab_name" };
        model = new DefaultTableModel(columnNames, 0);
        queueTable.setModel(model);
        wood = new JLabel();
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        queueButton.setIcon(new ImageIcon("OOP/src/Image/Button/queueButtonSmall.png"));
        queueButton.setBorderPainted(false);
        queueButton.setContentAreaFilled(false);
        queueButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                queueButtonMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                queueButtonMouseExited(evt);
            }
        });
        queueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueuePerformed(evt);
            }
        });
        deskPanel.setBorder(null);
        deskPanel.setLayout(new GridLayout(0, 7));
        deskPanel.setOpaque(false);
        deskPanel.setBorder(null);
        this.deskPanel.add(queueButton);

        /*
         * scrollPanel = new JScrollPane(deskPanel);
         * scrollPanel.getViewport().setOpaque(false);
         * scrollPanel.setOpaque(false);
         * scrollPanel.setBorder(null);
         */

        add(deskPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 770, 550));
        wood.setIcon(new ImageIcon(getClass().getResource("/Image/left.png")));
        add(wood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }

    private void addInitialComputerPanels() {
        String addingSql = "SELECT SeatID FROM SeatManager WHERE Availability = 1"; // เพิ่มโต๊ะ
        try (Connection conn = DbCon.getConnection();
             PreparedStatement addingstatement = conn.prepareStatement(addingSql)) {
            ResultSet resultSet = addingstatement.executeQuery();
            if (roleCheck == 2) {
                addingButton = new AddingButtonPanel(this);
                this.deskPanel.add(addingButton);
            }
            while (resultSet.next()) {
                int compID = resultSet.getInt("SeatID");
                if (compIDnotIn(compID, check_desk_arr)) {
                    Computer computer = new Computer("", "", "", compID, 0);
                    ComputerPanel companel = new ComputerPanel(this, computer, userType());
                    companel.setOpaque(false);
                    this.deskPanel.add(companel);
                    comp_arr.add(computer);
                    check_desk_arr.add(compID);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void QueuePerformed(java.awt.event.ActionEvent evt) {
        JFrame queueFrame = new JFrame();
        JScrollPane queuescrollPane = new JScrollPane(queueTable);
        Container contentPane = queueFrame.getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(queuescrollPane, BorderLayout.CENTER);
        queueFrame.pack();
        queueFrame.setVisible(true);
    }

    private void updateQueueTable() {
        String queueSql = "SELECT * FROM Reservation";
        try (PreparedStatement addingstatement = DbCon.prepareStatement(queueSql)) {
            ResultSet resultSet = addingstatement.executeQuery();
            model.setRowCount(0);
            while (resultSet.next()) {
                int queueNumber = resultSet.getInt("QueueNumber");
                int seatID = resultSet.getInt("SM_SeatID");
                String studentID = resultSet.getString("StudentID");
                String studentName = resultSet.getString("StudentName");
                String labName = resultSet.getString("Lab_name");
                model.addRow(new Object[] { queueNumber, seatID, studentID, studentName, labName });
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Computer> getComp_arr() {
        return this.comp_arr;
    }
    public ArrayList<Integer> getCheck_desk_arr() { return this.check_desk_arr; }

    public JPanel getDeskPanel() {
        return this.deskPanel;
    }

    private void queueButtonMouseEntered(java.awt.event.MouseEvent evt) {
        queueButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        queueButton.setIcon(new ImageIcon("OOP/src/Image/Button/queueButtonBig.png"));
    }

    private void queueButtonMouseExited(java.awt.event.MouseEvent evt) {
        queueButton.setIcon(new ImageIcon("OOP/src/Image/Button/queueButtonSmall.png"));
    }
    private boolean compIDnotIn(int compID, List<Integer> idList) {
        for (int id : idList) {
            if (id == compID) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void updateButtonIcon() {

    }

    @Override
    public void updateGUI() {
        this.deskPanel.removeAll();
        this.deskPanel.add(queueButton);
        if (roleCheck == 2) {
            addingButton = new AddingButtonPanel(this); /**/
            this.deskPanel.add(addingButton);
        }
        String fetchingSql = "SELECT * FROM Reservation";
        List<Integer> checkerList = new ArrayList<>();
        try (Connection conn = DbCon.getConnection();
             PreparedStatement fetchingStatement = conn.prepareStatement(fetchingSql);
             ResultSet fetchResult = fetchingStatement.executeQuery()) {
            while (fetchResult.next()) {
                int seatID = fetchResult.getInt("SM_SeatID");
                checkerList.add(seatID);
            }
            if (checkerList.isEmpty()) {
                for (Computer computer : comp_arr) { // กรณีที่ไม่มีคิวค้าง
                    computer.setName("");
                    computer.setStd_id("");
                    computer.setLab_name("");
                    computer.setStatus(0);
                    ComputerPanel companel = new ComputerPanel(this, computer, userType());
                    companel.updateButtonIcon();
                    companel.setOpaque(false);
                    this.deskPanel.add(companel);
                }
            } else {
                for (Computer computer : comp_arr) {
                    if (computer.getStatus() != 0) {
                        boolean found = false;
                        for (Integer compId : checkerList) { // เจอปุ๊ป break
                            if (compId == computer.getComp_id()) {
                                found = true;
                                break;
                            }
                        }
                        if (!found) { // ไม่เจอ ให้ gen โต๊ะใหม่
                            computer.setName("");
                            computer.setStd_id("");
                            computer.setLab_name("");
                            computer.setStatus(0);
                        }
                    }
                    ComputerPanel companel = new ComputerPanel(this, computer, userType());
                    companel.updateButtonIcon();
                    companel.setOpaque(false);
                    this.deskPanel.add(companel);
                }
            }
            revalidate();
            repaint();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void loadInitialDataFromDatabase() {
        String fetchingSql = "SELECT * FROM Reservation";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement fetchingStatement = conn.prepareStatement(fetchingSql);
             ResultSet fetchResult = fetchingStatement.executeQuery()) {
            while (fetchResult.next()) {
                int comp_id = fetchResult.getInt("SM_SeatID");
                String name = fetchResult.getString("StudentName");
                String std_id = fetchResult.getString("StudentID");
                String lab_name = fetchResult.getString("Lab_name");
                int status = fetchResult.getInt("Status");
                for (Computer computer : comp_arr) {
                    if (comp_id == computer.getComp_id()) {
                        computer.setStd_id(std_id);
                        computer.setName(name);
                        computer.setLab_name(lab_name);
                        computer.setStatus(status);
                    }
                    ComputerPanel companel = new ComputerPanel(this, computer, userType());
                    companel.updateButtonIcon();
                    companel.setOpaque(false);
                    this.deskPanel.add(companel);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void dataFetcher() {
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addInitialComputerPanels();
                loadInitialDataFromDatabase();
                updateGUI();
                updateQueueTable();
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
        } else if (user instanceof TA) {
            TA t_a = (TA) user;
            role = t_a.getRole();
        }
        return role;
    }

}
