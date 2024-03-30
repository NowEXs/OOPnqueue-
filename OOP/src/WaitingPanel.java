import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author armmy
 */
public class WaitingPanel extends JPanel implements Updater{

    /**
     * Creates new form WaitingPanel
     */
    public WaitingPanel(DeskPanel alldesk) {
        this.alldesk = alldesk;
        initComponents();
        addInitialComqueue();
        dataFetcher();
        try{
            File fontStyle_apple = new File("OOP/src/Font/Big Apple 3PM.ttf");
            File fontStyle_minecraft = new File("OOP/src/Font/minecraft_font.ttf");
            Font font_status = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(10f);
            checking_l.setFont(font_status);
            wait_l.setFont(font_status);
            empty_l.setFont(font_status);
//            checking_l.setFont(font_status);
//            wait_l.setFont(font_status);
//            empty_l.setFont(font_status);

        }catch(Exception e){
            e.printStackTrace();

        }

    }

    private void initComponents() {
        st_p = new javax.swing.JPanel();
        st_check = new javax.swing.JLabel();
        st_wait = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checking_l = new javax.swing.JLabel();
        wait_l = new javax.swing.JLabel();
        empty_l = new javax.swing.JLabel();
        SpaceComQueue1 = new javax.swing.JPanel();
        bg = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        st_p.setOpaque(false);

        st_check.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/stcheck.png"))); // NOI18N
        st_check.setToolTipText("");

        st_wait.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/stwait.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/stempty.png"))); // NOI18N

        checking_l.setBackground(new java.awt.Color(255, 244, 204));
        checking_l.setForeground(new java.awt.Color(255, 244, 204));
        checking_l.setText("Checking");

        wait_l.setBackground(new java.awt.Color(255, 244, 204));
        wait_l.setForeground(new java.awt.Color(255, 244, 204));
        wait_l.setText("Wait");

        empty_l.setBackground(new java.awt.Color(255, 244, 204));
        empty_l.setForeground(new java.awt.Color(255, 244, 204));
        empty_l.setText("Empty");

        javax.swing.GroupLayout st_pLayout = new javax.swing.GroupLayout(st_p);
        st_p.setLayout(st_pLayout);
        st_pLayout.setHorizontalGroup(
                st_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(st_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(st_check)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checking_l)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(st_wait)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(wait_l)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(empty_l)
                                .addContainerGap())
        );
        st_pLayout.setVerticalGroup(
                st_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(st_pLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(st_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(st_check)
                                        .addComponent(empty_l)
                                        .addComponent(wait_l)
                                        .addGroup(st_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(st_wait)
                                                .addComponent(jLabel3))
                                        .addComponent(checking_l))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(st_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, 50));

        SpaceComQueue1.setOpaque(false);
        add(SpaceComQueue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, 410));

        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/breadx2.png"))); // NOI18N
        bg.setOpaque(true);
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));
    }// </editor-fold>

    private javax.swing.JPanel SpaceComQueue1;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel checking_l;
    private javax.swing.JLabel empty_l;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel st_check;
    private javax.swing.JPanel st_p;
    private javax.swing.JLabel st_wait;
    private javax.swing.JLabel wait_l;
    private ArrayList<Computer> comp_arr;
    private Computer defaultCom = new Computer("No queue rn", "", "", 0, 0);
    private DeskPanel alldesk;

    private void addInitialComqueue() {
        SpaceComQueue1.setLayout(new GridLayout(5, 1));
        for (int i = 0; i < 5; i++) {
            JPanel comp_box = new JPanel();
            comp_box.setOpaque(false);
            ComQueuePanel comQueuePanel = new ComQueuePanel(defaultCom);
            comQueuePanel.setOpaque(false);
            comp_box.add(comQueuePanel);
            SpaceComQueue1.add(comp_box);
        }
    }
    @Override
    public void updateGUI() {
        comp_arr = this.alldesk.getComp_arr();
        String retrievingSql = "SELECT * FROM Reservation LIMIT 5";
        String countSql = "SELECT COUNT(*) AS row_count FROM Reservation";
        try (Connection conn = DbCon.getConnection();
             PreparedStatement countStatement = conn.prepareStatement(countSql);
             PreparedStatement selectStatement = conn.prepareStatement(retrievingSql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet selector = selectStatement.executeQuery();
             ResultSet countResult = countStatement.executeQuery()) {
            countResult.next();
            int rowCount = countResult.getInt("row_count");
            if (rowCount == 0) {
                SpaceComQueue1.removeAll();
                addInitialComqueue();
            }
            selector.beforeFirst();
            int queueCounter = 0;
            while (selector.next()) {
                int seatID = selector.getInt("SM_SeatID");
                String name = selector.getString("StudentName");
                String std_id = selector.getString("StudentID");
                String lab_name = selector.getString("Lab_name");
                int status = selector.getInt("Status");
                JPanel compBox = (JPanel) SpaceComQueue1.getComponent(queueCounter);
                ComQueuePanel comQueuePanel = (ComQueuePanel) compBox.getComponent(0);
                for (Computer computer : comp_arr) {
                    if (computer.getComp_id() == seatID) {
                        computer.setStd_id(std_id);
                        computer.setStatus(status);
                        computer.setLab_name(lab_name);
                        computer.setName(name);
                        comQueuePanel.setComputer(computer);
                        comQueuePanel.updateGUI();
                        comQueuePanel.updateButtonIcon();
                        break;
                    }
                }
                queueCounter++;
            }
            while (queueCounter < 5) {
                JPanel compBox = (JPanel) SpaceComQueue1.getComponent(queueCounter);
                ComQueuePanel comQueuePanel = (ComQueuePanel) compBox.getComponent(0);
                comQueuePanel.setComputer(defaultCom);
                comQueuePanel.updateGUI();
                comQueuePanel.updateButtonIcon();
                queueCounter++;
            }
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