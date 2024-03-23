import javax.swing.*;
import java.awt.*;
import java.awt.Font;
import java.io.File;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author armmy
 */
public class WaitingPanel extends JPanel{

    /**
     * Creates new form WaitingPanel
     */
    public WaitingPanel() {
        initComponents();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
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
        SpaceComQueue1.setLayout(new GridLayout(1,5));
        SpaceComQueue1.setLayout(new java.awt.GridLayout());
        add(SpaceComQueue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 230, 410));

        bg.setBackground(new java.awt.Color(84, 59, 45));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/breadx2.png"))); // NOI18N
        bg.setOpaque(true);
        add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 490));
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JPanel SpaceComQueue1;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel checking_l;
    private javax.swing.JLabel empty_l;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel st_check;
    private javax.swing.JPanel st_p;
    private javax.swing.JLabel st_wait;
    private javax.swing.JLabel wait_l;
    // End of variables declaration
}