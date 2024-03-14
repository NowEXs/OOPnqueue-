/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author huawei
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        main = new javax.swing.JPanel();
        queue = new javax.swing.JPanel();
        q1 = new javax.swing.JPanel();
        image_status1 = new javax.swing.JLabel();
        seat_txt1 = new javax.swing.JLabel();
        lab1 = new javax.swing.JLabel();
        name_id1 = new javax.swing.JLabel();
        q2 = new javax.swing.JPanel();
        image_status2 = new javax.swing.JLabel();
        seat_txt2 = new javax.swing.JLabel();
        lab2 = new javax.swing.JLabel();
        name_id2 = new javax.swing.JLabel();
        q3 = new javax.swing.JPanel();
        image_status3 = new javax.swing.JLabel();
        seat_txt3 = new javax.swing.JLabel();
        lab3 = new javax.swing.JLabel();
        name_id3 = new javax.swing.JLabel();
        q4 = new javax.swing.JPanel();
        image_status4 = new javax.swing.JLabel();
        seat_txt4 = new javax.swing.JLabel();
        lab4 = new javax.swing.JLabel();
        name_id4 = new javax.swing.JLabel();
        q5 = new javax.swing.JPanel();
        image_status5 = new javax.swing.JLabel();
        seat_txt5 = new javax.swing.JLabel();
        lab5 = new javax.swing.JLabel();
        name_id5 = new javax.swing.JLabel();
        status = new javax.swing.JPanel();
        txt_checking = new javax.swing.JLabel();
        txt_empty = new javax.swing.JLabel();
        txt_wait = new javax.swing.JLabel();
        area_q = new javax.swing.JLabel();
        deadline = new javax.swing.JPanel();
        txt_people = new javax.swing.JLabel();
        txt_lab = new javax.swing.JLabel();
        txt_today = new javax.swing.JLabel();
        bg_dl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("N-Queue");
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setMinimumSize(new java.awt.Dimension(1200, 700));

        queue.setOpaque(false);
        queue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        q1.setBackground(new java.awt.Color(221, 199, 151));
        q1.setOpaque(false);

        image_status1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_status1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wait.png"))); // NOI18N
        image_status1.setVerifyInputWhenFocusTarget(false);

        seat_txt1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        seat_txt1.setForeground(new java.awt.Color(87, 65, 43));
        seat_txt1.setText("Seat :");

        lab1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lab1.setForeground(new java.awt.Color(87, 65, 43));
        lab1.setText("Lab : ");

        name_id1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        name_id1.setForeground(new java.awt.Color(87, 65, 43));
        name_id1.setText("Name (660xxxxx)");

        javax.swing.GroupLayout q1Layout = new javax.swing.GroupLayout(q1);
        q1.setLayout(q1Layout);
        q1Layout.setHorizontalGroup(
                q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(image_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seat_txt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(name_id1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );
        q1Layout.setVerticalGroup(
                q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q1Layout.createSequentialGroup()
                                .addGroup(q1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(image_status1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(q1Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(seat_txt1)
                                                .addGap(5, 5, 5)
                                                .addComponent(lab1)
                                                .addGap(5, 5, 5)
                                                .addComponent(name_id1)))
                                .addGap(12, 12, 12))
        );

        queue.add(q1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 240, 80));

        q2.setOpaque(false);

        image_status2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_status2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wait.png"))); // NOI18N
        image_status2.setVerifyInputWhenFocusTarget(false);

        seat_txt2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        seat_txt2.setForeground(new java.awt.Color(87, 65, 43));
        seat_txt2.setText("Seat :");

        lab2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lab2.setForeground(new java.awt.Color(87, 65, 43));
        lab2.setText("Lab : ");

        name_id2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        name_id2.setForeground(new java.awt.Color(87, 65, 43));
        name_id2.setText("Name (660xxxxx)");

        javax.swing.GroupLayout q2Layout = new javax.swing.GroupLayout(q2);
        q2.setLayout(q2Layout);
        q2Layout.setHorizontalGroup(
                q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(image_status2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seat_txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(name_id2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );
        q2Layout.setVerticalGroup(
                q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q2Layout.createSequentialGroup()
                                .addGroup(q2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(image_status2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(q2Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(seat_txt2)
                                                .addGap(5, 5, 5)
                                                .addComponent(lab2)
                                                .addGap(5, 5, 5)
                                                .addComponent(name_id2)))
                                .addGap(12, 12, 12))
        );

        queue.add(q2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 240, 80));

        q3.setOpaque(false);

        image_status3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_status3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wait.png"))); // NOI18N
        image_status3.setVerifyInputWhenFocusTarget(false);

        seat_txt3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        seat_txt3.setForeground(new java.awt.Color(87, 65, 43));
        seat_txt3.setText("Seat :");

        lab3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lab3.setForeground(new java.awt.Color(87, 65, 43));
        lab3.setText("Lab : ");

        name_id3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        name_id3.setForeground(new java.awt.Color(87, 65, 43));
        name_id3.setText("Name (660xxxxx)");

        javax.swing.GroupLayout q3Layout = new javax.swing.GroupLayout(q3);
        q3.setLayout(q3Layout);
        q3Layout.setHorizontalGroup(
                q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(image_status3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lab3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seat_txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(name_id3, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );
        q3Layout.setVerticalGroup(
                q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q3Layout.createSequentialGroup()
                                .addGroup(q3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(image_status3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(q3Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(seat_txt3)
                                                .addGap(5, 5, 5)
                                                .addComponent(lab3)
                                                .addGap(5, 5, 5)
                                                .addComponent(name_id3)))
                                .addGap(12, 12, 12))
        );

        queue.add(q3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 80));

        q4.setOpaque(false);

        image_status4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_status4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wait.png"))); // NOI18N
        image_status4.setVerifyInputWhenFocusTarget(false);

        seat_txt4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        seat_txt4.setForeground(new java.awt.Color(87, 65, 43));
        seat_txt4.setText("Seat :");

        lab4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lab4.setForeground(new java.awt.Color(87, 65, 43));
        lab4.setText("Lab : ");

        name_id4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        name_id4.setForeground(new java.awt.Color(87, 65, 43));
        name_id4.setText("Name (660xxxxx)");

        javax.swing.GroupLayout q4Layout = new javax.swing.GroupLayout(q4);
        q4.setLayout(q4Layout);
        q4Layout.setHorizontalGroup(
                q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q4Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(image_status4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lab4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seat_txt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(name_id4, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );
        q4Layout.setVerticalGroup(
                q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q4Layout.createSequentialGroup()
                                .addGroup(q4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(image_status4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(q4Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(seat_txt4)
                                                .addGap(5, 5, 5)
                                                .addComponent(lab4)
                                                .addGap(5, 5, 5)
                                                .addComponent(name_id4)))
                                .addGap(12, 12, 12))
        );

        queue.add(q4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 240, 80));

        q5.setOpaque(false);

        image_status5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_status5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/wait.png"))); // NOI18N
        image_status5.setVerifyInputWhenFocusTarget(false);

        seat_txt5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        seat_txt5.setForeground(new java.awt.Color(87, 65, 43));
        seat_txt5.setText("Seat :");

        lab5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        lab5.setForeground(new java.awt.Color(87, 65, 43));
        lab5.setText("Lab : ");

        name_id5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        name_id5.setForeground(new java.awt.Color(87, 65, 43));
        name_id5.setText("Name (660xxxxx)");

        javax.swing.GroupLayout q5Layout = new javax.swing.GroupLayout(q5);
        q5.setLayout(q5Layout);
        q5Layout.setHorizontalGroup(
                q5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q5Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(image_status5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(q5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(seat_txt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(name_id5, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                                .addGap(15, 15, 15))
        );
        q5Layout.setVerticalGroup(
                q5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(q5Layout.createSequentialGroup()
                                .addGroup(q5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(image_status5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(q5Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(seat_txt5)
                                                .addGap(5, 5, 5)
                                                .addComponent(lab5)
                                                .addGap(5, 5, 5)
                                                .addComponent(name_id5)))
                                .addGap(12, 12, 12))
        );

        queue.add(q5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 240, 80));

        status.setOpaque(false);
        status.setPreferredSize(new java.awt.Dimension(304, 100));

        txt_checking.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_checking.setForeground(new java.awt.Color(87, 65, 43));
        txt_checking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 3.png"))); // NOI18N
        txt_checking.setText("Checking");

        txt_empty.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_empty.setForeground(new java.awt.Color(87, 65, 43));
        txt_empty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 5.png"))); // NOI18N
        txt_empty.setText("Empty");

        txt_wait.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_wait.setForeground(new java.awt.Color(87, 65, 43));
        txt_wait.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Ellipse 4.png"))); // NOI18N
        txt_wait.setText("Wait");

        javax.swing.GroupLayout statusLayout = new javax.swing.GroupLayout(status);
        status.setLayout(statusLayout);
        statusLayout.setHorizontalGroup(
                statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(statusLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_checking)
                                .addGap(16, 16, 16)
                                .addComponent(txt_wait)
                                .addGap(16, 16, 16)
                                .addComponent(txt_empty, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        statusLayout.setVerticalGroup(
                statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(statusLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txt_checking)
                                        .addComponent(txt_wait)
                                        .addComponent(txt_empty))
                                .addGap(16, 16, 16))
        );

        queue.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 304, 60));

        area_q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/breadx2.png"))); // NOI18N
        queue.add(area_q, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        deadline.setOpaque(false);
        deadline.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_people.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_people.setForeground(new java.awt.Color(87, 65, 43));
        txt_people.setText("people");
        deadline.add(txt_people, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        txt_lab.setBackground(new java.awt.Color(255, 255, 255));
        txt_lab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_lab.setForeground(new java.awt.Color(87, 65, 43));
        txt_lab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_lab.setText("Lab : ");
        deadline.add(txt_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 48, 20));

        txt_today.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_today.setForeground(new java.awt.Color(87, 65, 43));
        txt_today.setText("Today's Deadline");
        deadline.add(txt_today, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, 30));

        bg_dl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/imagever2.png"))); // NOI18N
        deadline.add(bg_dl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addGap(854, 854, 854)
                                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(queue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0))
        );
        mainLayout.setVerticalGroup(
                mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainLayout.createSequentialGroup()
                                .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(queue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(100, Short.MAX_VALUE))
        );

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 600));

        pack();
    }// </editor-fold>

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel area_q;
    private javax.swing.JLabel bg_dl;
    private javax.swing.JPanel deadline;
    private javax.swing.JLabel image_status1;
    private javax.swing.JLabel image_status2;
    private javax.swing.JLabel image_status3;
    private javax.swing.JLabel image_status4;
    private javax.swing.JLabel image_status5;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JLabel lab3;
    private javax.swing.JLabel lab4;
    private javax.swing.JLabel lab5;
    private javax.swing.JPanel main;
    private javax.swing.JLabel name_id1;
    private javax.swing.JLabel name_id2;
    private javax.swing.JLabel name_id3;
    private javax.swing.JLabel name_id4;
    private javax.swing.JLabel name_id5;
    private javax.swing.JPanel q1;
    private javax.swing.JPanel q2;
    private javax.swing.JPanel q3;
    private javax.swing.JPanel q4;
    private javax.swing.JPanel q5;
    private javax.swing.JPanel queue;
    private javax.swing.JLabel seat_txt1;
    private javax.swing.JLabel seat_txt2;
    private javax.swing.JLabel seat_txt3;
    private javax.swing.JLabel seat_txt4;
    private javax.swing.JLabel seat_txt5;
    private javax.swing.JPanel status;
    private javax.swing.JLabel txt_checking;
    private javax.swing.JLabel txt_empty;
    private javax.swing.JLabel txt_lab;
    private javax.swing.JLabel txt_people;
    private javax.swing.JLabel txt_today;
    private javax.swing.JLabel txt_wait;
    // End of variables declaration
}
