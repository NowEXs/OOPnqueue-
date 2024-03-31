/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.net.*;
import java.io.*;
import java.util.Date;
/*
* Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
        */

/**
 *
 * @author armmy
 */
public class Feedback extends javax.swing.JFrame implements OnClick{

    /**
     * Creates new form Feedback
     */
    public Feedback(Computer comp, String time) {
        initComponents(comp, time);
        centerFrame();
        feedback_txtarea.setFocusable(true);
        try{
            File fontStyle_apple = new File("OOP/src/Font/Big Apple 3PM.ttf");
            File fontStyle_minecraft = new File("OOP/src/Font/minecraft_font.ttf");
            Font font_complete = Font.createFont(Font.TRUETYPE_FONT,fontStyle_apple).deriveFont(40f);
            Font font_giveme = Font.createFont(Font.TRUETYPE_FONT,fontStyle_apple).deriveFont(18f);
            Font font_name = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            Font font_lab = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            Font font_time = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            Font font_name_user = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(9f);
            Font font_lab_user = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            Font font_time_user = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            Font font_feedback = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            label_complete.setFont(font_complete);
            label_giveme.setFont(font_giveme);
            label_name.setFont(font_name);
            label_lab.setFont(font_lab);
            label_time.setFont(font_time);
            feedback_txtarea.setFont(font_feedback);
            name.setFont(font_name_user);
            lab.setFont(font_lab_user);
            this.time.setFont(font_time_user);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    private void centerFrame() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int frameWidth = this.getSize().width;
        int frameHeight = this.getSize().height;
        int x = (screenWidth - frameWidth) / 2;
        int y = (screenHeight - frameHeight) / 2;
        this.setLocation(x, y);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(Computer comp, String time) {
        this.comp = comp;
        label_complete = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        name_p = new javax.swing.JPanel();
        label_name = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        lab_p = new javax.swing.JPanel();
        label_lab = new javax.swing.JLabel();
        lab = new javax.swing.JLabel();
        time_p = new javax.swing.JPanel();
        label_time = new javax.swing.JLabel();
        this.time = new javax.swing.JLabel();
        confirm_bt = new javax.swing.JButton();
        cancel_bt = new javax.swing.JButton();
        label_giveme = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedback_txtarea = new javax.swing.JTextArea();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_complete.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_complete.setForeground(new java.awt.Color(255, 244, 204));
        label_complete.setText("COMPLETED!");
        getContentPane().add(label_complete, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/create.png"))); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        name_p.setBackground(new java.awt.Color(255, 244, 239));
        name_p.setForeground(new java.awt.Color(255, 244, 239));

        label_name.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        label_name.setForeground(new java.awt.Color(80, 9, 9));
        label_name.setText("Name :");

        name.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        name.setForeground(new java.awt.Color(80, 9, 9));
        name.setText(comp.getName());

        javax.swing.GroupLayout name_pLayout = new javax.swing.GroupLayout(name_p);
        name_p.setLayout(name_pLayout);
        name_pLayout.setHorizontalGroup(
                name_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(name_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name)
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        name_pLayout.setVerticalGroup(
                name_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(name_pLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(name_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(name))
                                .addGap(1, 1, 1))
        );

        getContentPane().add(name_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, 20));

        lab_p.setBackground(new java.awt.Color(255, 244, 239));
        lab_p.setForeground(new java.awt.Color(255, 244, 239));

        label_lab.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        label_lab.setForeground(new java.awt.Color(80, 9, 9));
        label_lab.setText("Lab :");

        lab.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        lab.setForeground(new java.awt.Color(80, 9, 9));
        lab.setText(comp.getLab_name());

        javax.swing.GroupLayout lab_pLayout = new javax.swing.GroupLayout(lab_p);
        lab_p.setLayout(lab_pLayout);
        lab_pLayout.setHorizontalGroup(
                lab_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lab_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_lab)
                                .addGap(18, 18, 18)
                                .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(44, Short.MAX_VALUE))
        );
        lab_pLayout.setVerticalGroup(
                lab_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lab_pLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(lab_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_lab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lab))
                                .addGap(1, 1, 1))
        );

        getContentPane().add(lab_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 170, -1));

        time_p.setBackground(new java.awt.Color(255, 244, 239));
        time_p.setForeground(new java.awt.Color(255, 244, 239));

        label_time.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        label_time.setForeground(new java.awt.Color(80, 9, 9));
        label_time.setText("Time :");

        this.time.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        this.time.setForeground(new java.awt.Color(80, 9, 9));
//        timeUpdate();
//
//        javax.swing.Timer timer = new javax.swing.Timer(1000, e -> timeUpdate());
//        timer.start();
        this.time.setText(time);

        javax.swing.GroupLayout time_pLayout = new javax.swing.GroupLayout(time_p);
        time_p.setLayout(time_pLayout);
        time_pLayout.setHorizontalGroup(
                time_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(time_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_time)
                                .addGap(18, 18, 18)
                                .addComponent(this.time, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        time_pLayout.setVerticalGroup(
                time_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(time_pLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(label_time, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                        .addComponent(this.time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(time_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 170, 20));

        confirm_bt.setIcon(new javax.swing.ImageIcon("OOP/src/Image/confirmButtonFont.png")); // NOI18N
        confirm_bt.setBorderPainted(false);
        confirm_bt.setContentAreaFilled(false);
        confirm_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirm_btMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                confirm_btMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                confirm_btMouseExited(evt);
            }
        });
        confirm_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_btActionPerformed(evt);
            }
        });
        getContentPane().add(confirm_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        cancel_bt.setIcon(new javax.swing.ImageIcon("OOP/src/Image/skipButtonFont.png")); // NOI18N
        cancel_bt.setBorderPainted(false);
        cancel_bt.setContentAreaFilled(false);
        cancel_bt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancel_btMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancel_btMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancel_btMouseExited(evt);
            }
        });
        cancel_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_btActionPerformed(evt);
            }
        });
        getContentPane().add(cancel_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 320, -1, -1));

        label_giveme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_giveme.setForeground(new java.awt.Color(255, 244, 204));
        label_giveme.setText("Give me a feedback");
        getContentPane().add(label_giveme, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        feedback_txtarea.setBackground(new java.awt.Color(102, 51, 0));
        feedback_txtarea.setColumns(20);
        feedback_txtarea.setForeground(new java.awt.Color(255, 244, 204));
        feedback_txtarea.setRows(5);
        feedback_txtarea.setText("Add a comment");
        feedback_txtarea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        feedback_txtarea.setName(""); // NOI18N
        feedback_txtarea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                feedback_txtareaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                feedback_txtareaFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(feedback_txtarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, 110));

        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setForeground(new java.awt.Color(255, 244, 204));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/FeedbackWood.png"))); // NOI18N
        bg.setOpaque(true);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>

//    public void timeUpdate(){
//        SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
//        String now  = df.format(new Date());
//        time.setText(now);
//    }
    private void feedback_txtareaFocusGained(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if(feedback_txtarea.getText().equals("Add a comment")){
            feedback_txtarea.setText("");
        }

        feedback_txtarea.setForeground(Color.white);
    }

    private void feedback_txtareaFocusLost(java.awt.event.FocusEvent evt) {
        // TODO add your handling code here:
        if(feedback_txtarea.getText().equals("")){
            feedback_txtarea.setText("Add a comment");
        }
        //[255,244,204]
        feedback_txtarea.setForeground(new Color(255,244,204));
    }

    private void cancel_btMouseExited(java.awt.event.MouseEvent evt) {
        cancel_bt.setIcon(new javax.swing.ImageIcon("OOP/src/Image/skipButtonFont.png"));
    }

    private void cancel_btMouseEntered(java.awt.event.MouseEvent evt) {
        cancel_bt.setIcon(new ImageIcon("OOP/src/Image/button/skipButtonBig.png"));
        cancel_bt.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void cancel_btMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void confirm_btMouseEntered(java.awt.event.MouseEvent evt) {
        confirm_bt.setIcon(new ImageIcon("OOP/src/Image/button/confirmButtonBig.png"));
        confirm_bt.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void confirm_btMouseExited(java.awt.event.MouseEvent evt) {
        confirm_bt.setIcon(new javax.swing.ImageIcon("OOP/src/Image/confirmButtonFont.png"));
    }

    private void confirm_btMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void cancel_btActionPerformed(java.awt.event.ActionEvent evt) {
        pressCancel(evt);
    }

    private void confirm_btActionPerformed(java.awt.event.ActionEvent evt) {
        pressConfirm(evt);
    }

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
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Feedback(new Computer(), "0:0:1").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel bg;
    private javax.swing.JButton cancel_bt;
    private javax.swing.JButton confirm_bt;
    private javax.swing.JTextArea feedback_txtarea;
    private javax.swing.JLabel image;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab;
    private javax.swing.JPanel lab_p;
    private javax.swing.JLabel label_complete;
    private javax.swing.JLabel label_giveme;
    private javax.swing.JLabel label_lab;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_time;
    private javax.swing.JLabel name;
    private javax.swing.JPanel name_p;
    private javax.swing.JLabel time;
    private javax.swing.JPanel time_p;
    private String txt;
    private BufferedReader in;
    private Computer comp;

    @Override
    public void pressConfirm(ActionEvent event) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
                Feedback.this.txt = "From "+Feedback.this.name.getText()+": "+dtf.format(LocalDateTime.now()) + ": " + feedback_txtarea.getText();
                Feedback.this.startServer();
            }
        });
        this.dispose();
    }
    public void startServer() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try (Socket clientSocket = new Socket("localhost", 112)) {
                    System.out.println("Client Start...");
                    PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true);
                    output.println(txt);
                    in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                    System.out.println(in.readLine());
                } catch (ConnectException e) {
                    System.out.println("Not Have Server!!");
                } catch (EOFException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new DemoServer();
    }

    @Override
    public void pressCancel(ActionEvent event) {
        this.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //not have anything
    }
    // End of variables declaration
}
