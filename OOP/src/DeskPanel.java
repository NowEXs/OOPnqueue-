import javax.swing.*;
import java.awt.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeskPanel extends JPanel implements RoleChecker, ActionListener, Updater {
    private JPanel innerLabel;
    private JPanel queue_panel;
    private JLabel queue;
    private JPanel deskPanel;
    private JLabel wood;
    private JButton queueButton;
    private User user;
    private int roleCheck;
    private JScrollPane scrollPanel;
    private ArrayList<Computer> comp_arr = new ArrayList<>();
    private ArrayList<ComputerPanel> desk_arr = new ArrayList<>();
    private ArrayList<Integer> check_desk_arr = new ArrayList<>();
    private AddingButtonPanel addingButton;
    private JTable queueTable;
    private JTableHeader header;
    private DefaultTableModel model;
    private void setCustomFont() {
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File("OOP/src/Font/minecraft_font.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(customFont);

            queue.setFont(customFont.deriveFont(Font.PLAIN, 9));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
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
       // queueTable.setBackground(new java.awt.Color(234, 175, 121, 233));
       // queueTable.setSelectionBackground(new java.awt.Color(234, 175, 121, 184));
        String[] columnNames = { "QueueNumber", "Seat_ID", "Student_ID", "Student_Name", "Lab_name" };
        model = new DefaultTableModel(columnNames, 0);
        queueTable.setModel(model);
        wood = new JLabel();
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        queue_panel = new JPanel();
        queueButton.setIcon(new ImageIcon("OOP/src/Image/Queue.png"));
        queueButton.setBorderPainted(false);
        queueButton.setContentAreaFilled(false);
        queue = new JLabel("Queue");
        queue_panel.setPreferredSize(new Dimension(62, 85));
        queue_panel.setLayout(new BorderLayout());
        innerLabel = new JPanel();
//        innerLabel.setLayout(new BorderLayout());
//        innerLabel.add(queue,BorderLayout.NORTH);
        innerLabel.add(queue);
        innerLabel.setOpaque(false);
        queue_panel.add(queueButton,BorderLayout.NORTH);
        queue_panel.add(innerLabel);
        queue_panel.setOpaque(false);
        setCustomFont();
        queueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueuePerformed(evt);
            }
        });
        deskPanel.setBorder(null);
        deskPanel.setLayout(new GridLayout(0, 7));
        deskPanel.setOpaque(false);
        deskPanel.setBorder(null);
        setOpaque(false);

        /*
         * scrollPanel = new JScrollPane(deskPanel);
         * scrollPanel.getViewport().setOpaque(false);
         * scrollPanel.setOpaque(false);
         * scrollPanel.setBorder(null);
         */

        add(deskPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 770, 550));
        wood.setIcon(new ImageIcon("OOP/src/Image/Wood.png"));
        add(wood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

    }

    private void addComputerPanels() { //OPTIMIZED
        deskPanel.removeAll();
        check_desk_arr.clear();

        String addingSql = "SELECT s.SeatID, r.StudentName, r.StudentID, r.Lab_name, r.Status " +
                "FROM SeatManager s LEFT JOIN Reservation r ON s.SeatID = r.SM_SeatID " +
                "WHERE s.Availability = 1 " +
                "ORDER BY s.SeatID ASC";

        try (Connection conn = DbCon.getConnection();
             PreparedStatement addingStatement = conn.prepareStatement(addingSql);
             ResultSet resultSet = addingStatement.executeQuery()) {

            this.deskPanel.add(queue_panel);
            if (roleCheck == 2) {
                addingButton = new AddingButtonPanel(this);
                this.deskPanel.add(addingButton);
            }

            while (resultSet.next()) {
                int compID = resultSet.getInt("SeatID");
                String name = resultSet.getString("StudentName");
                String std_id = resultSet.getString("StudentID");
                String lab_name = resultSet.getString("Lab_name");
                int status = resultSet.getInt("Status");
                Computer computer = new Computer(std_id, name, lab_name, compID, status);
                comp_arr.add(computer);

                ComputerPanel companel = new ComputerPanel(this, computer, userType());
                companel.setOpaque(false);
                this.deskPanel.add(companel);
                desk_arr.add(companel);
                check_desk_arr.add(compID);
            }

            deskPanel.revalidate();
            deskPanel.repaint();

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
        if (this.userType() == 2) {
            JButton queueResetButton = new JButton("Reset Queues");
                queueResetButton.addActionListener(new java.awt.event.ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int userChoice = JOptionPane.showConfirmDialog(null, "This will delete all queues, Are you sure?", "Warning", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                        switch (userChoice) {
                            case JOptionPane.OK_OPTION:
                                String resetSql = "DELETE FROM Reservation";
                                String resetAutoIncrementSql = "ALTER TABLE Reservation AUTO_INCREMENT = 1";
                                try (PreparedStatement reset_statement = DbCon.prepareStatement(resetSql);
                                    PreparedStatement reset_autostatement = DbCon.prepareStatement(resetAutoIncrementSql)) {
                                    reset_statement.executeUpdate();
                                    reset_autostatement.executeUpdate();
                                    JOptionPane.showMessageDialog(null, "Queue deleted");
                                } catch (SQLException ex) {
                                    ex.printStackTrace();
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }
                            case JOptionPane.CANCEL_OPTION:
                                System.out.println("Canceled");
                                return;
                        }
                    }
                });
            queueFrame.add(queueResetButton, BorderLayout.SOUTH);
        }
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
    public ArrayList<ComputerPanel> getDeskArr() { return this.desk_arr; }

    public JPanel getDeskPanel() {
        return this.deskPanel;
    }


    private boolean compIDnotIn(int compID, List<Integer> check_desk_arr) {
        return !check_desk_arr.contains(compID);
    }

    @Override
    public void updateButtonIcon() {

    }

    @Override
    public void updateGUI() {
        String fetchingSql = "SELECT * FROM Reservation";
        List<Integer> checkerList = new ArrayList<>();
        try (Connection conn = DbCon.getConnection();
             PreparedStatement fetchingStatement = conn.prepareStatement(fetchingSql);
             ResultSet fetchResult = fetchingStatement.executeQuery()) {
            while (fetchResult.next()) {
                int seatID = fetchResult.getInt("SM_SeatID");
                checkerList.add(seatID);
            }
            if (!checkerList.isEmpty()) {
                System.out.println("updateGUI Activated");
                this.deskPanel.removeAll();
                this.deskPanel.add(queue_panel);
                if (roleCheck == 2) {
                    addingButton = new AddingButtonPanel(this); /**/
                    this.deskPanel.add(addingButton);
                }
                for (Computer computer : comp_arr) {
                    if (!checkerList.contains(computer.getComp_id())) {
                        computer.setName("");
                        computer.setStd_id("");
                        computer.setLab_name("");
                        computer.setStatus(0);
                    }
                    ComputerPanel companel = new ComputerPanel(this, computer, userType());
                    companel.updateButtonIcon();
                    companel.setOpaque(false);
                    this.deskPanel.add(companel);
                }
                this.deskPanel.revalidate();
                this.deskPanel.repaint();
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
                addComputerPanels();
                //updateGUI();
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
