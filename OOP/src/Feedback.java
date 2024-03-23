/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.*;
import java.net.*;
import java.io.*;
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
    public Feedback() {
        initComponents();
        feedback_txtarea.setFocusable(true);
        try{
            File fontStyle_apple = new File("OOP/src/Font/Big Apple 3PM.ttf");
            File fontStyle_minecraft = new File("OOP/src/Font/minecraft_font.ttf");
            Font font_complete = Font.createFont(Font.TRUETYPE_FONT,fontStyle_apple).deriveFont(44f);
            Font font_giveme = Font.createFont(Font.TRUETYPE_FONT,fontStyle_apple).deriveFont(18f);
            Font font_name = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            Font font_lab = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            Font font_time = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
            Font font_name_user = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(12f);
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
            time.setFont(font_time_user);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

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
        time = new javax.swing.JLabel();
        confirm_bt = new javax.swing.JButton();
        cancel_bt = new javax.swing.JButton();
        label_giveme = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        feedback_txtarea = new javax.swing.JTextArea();
        bg = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_complete.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        label_complete.setForeground(new java.awt.Color(255, 244, 204));
        label_complete.setText("COMPLETED!");
        getContentPane().add(label_complete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        image.setIcon(new javax.swing.ImageIcon("OOP/src/Image/CreateSeatBot.png")); // NOI18N
        getContentPane().add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        name_p.setBackground(new java.awt.Color(255, 244, 239));
        name_p.setForeground(new java.awt.Color(255, 244, 239));

        label_name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_name.setForeground(new java.awt.Color(80, 9, 9));
        label_name.setText("Name :");

        name.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        name.setForeground(new java.awt.Color(80, 9, 9));
        name.setText("Thananupat Rodpan");

        javax.swing.GroupLayout name_pLayout = new javax.swing.GroupLayout(name_p);
        name_p.setLayout(name_pLayout);
        name_pLayout.setHorizontalGroup(
                name_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(name_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        name_pLayout.setVerticalGroup(
                name_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(name_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(name_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(name))
                                .addContainerGap())
        );

        getContentPane().add(name_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        lab_p.setBackground(new java.awt.Color(255, 244, 239));
        lab_p.setForeground(new java.awt.Color(255, 244, 239));

        label_lab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_lab.setForeground(new java.awt.Color(80, 9, 9));
        label_lab.setText("Lab :");

        lab.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lab.setForeground(new java.awt.Color(80, 9, 9));
        lab.setText("9");

        javax.swing.GroupLayout lab_pLayout = new javax.swing.GroupLayout(lab_p);
        lab_p.setLayout(lab_pLayout);
        lab_pLayout.setHorizontalGroup(
                lab_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lab_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_lab)
                                .addGap(18, 18, 18)
                                .addComponent(lab, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(112, Short.MAX_VALUE))
        );
        lab_pLayout.setVerticalGroup(
                lab_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(lab_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(lab_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_lab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lab))
                                .addContainerGap())
        );

        getContentPane().add(lab_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 240, -1));

        time_p.setBackground(new java.awt.Color(255, 244, 239));
        time_p.setForeground(new java.awt.Color(255, 244, 239));

        label_time.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_time.setForeground(new java.awt.Color(80, 9, 9));
        label_time.setText("Time :");

        time.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        time.setForeground(new java.awt.Color(80, 9, 9));
        time.setText("12:25:58");

        javax.swing.GroupLayout time_pLayout = new javax.swing.GroupLayout(time_p);
        time_p.setLayout(time_pLayout);
        time_pLayout.setHorizontalGroup(
                time_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(time_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_time)
                                .addGap(18, 18, 18)
                                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(81, Short.MAX_VALUE))
        );
        time_pLayout.setVerticalGroup(
                time_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(time_pLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(time_pLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(label_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(time))
                                .addContainerGap())
        );

        getContentPane().add(time_p, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

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
        getContentPane().add(confirm_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

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
        getContentPane().add(cancel_bt, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        label_giveme.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        label_giveme.setForeground(new java.awt.Color(255, 244, 204));
        label_giveme.setText("Give me a feedback");
        getContentPane().add(label_giveme, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, -1, -1));

        feedback_txtarea.setBackground(new java.awt.Color(102, 51, 0));
        feedback_txtarea.setColumns(20);
        feedback_txtarea.setForeground(new java.awt.Color(255, 244, 204));
        feedback_txtarea.setRows(5);
        feedback_txtarea.setText("Add a comment");
        feedback_txtarea.setToolTipText("Add a comment");
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 450, 220));

        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setForeground(new java.awt.Color(255, 244, 204));
        bg.setIcon(new javax.swing.ImageIcon("OOP/src/Image/Wood.png")); // NOI18N
        bg.setOpaque(true);
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        pack();
    }// </editor-fold>

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
        // TODO add your handling code here:
    }

    private void cancel_btMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void cancel_btMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void confirm_btMouseEntered(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void confirm_btMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
    }

    private void confirm_btMouseClicked(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
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
                new Feedback().setVisible(true);
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
    }
    public void startServer() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try (Socket clientSocket = new Socket("localhost", 1111)) {
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
