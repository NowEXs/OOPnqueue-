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
public class ComQueuePanel extends javax.swing.JPanel {

    /**
     * Creates new form ComQueuePanel
     */
    public ComQueuePanel() {
        initComponents();
        try{
            File fontStyle_apple = new File("OOP/src/Font/Big Apple 3PM.ttf");
            File fontStyle_minecraft = new File("OOP/src/Font/minecraft_font.ttf");
            Font font_info = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(10f);
            Font font_status = Font.createFont(Font.TRUETYPE_FONT,fontStyle_minecraft).deriveFont(10f);
            seat_txt1.setFont(font_info);
            lab_txt1.setFont(font_info);
            name_id1.setFont(font_info);
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

        info_p1 = new javax.swing.JPanel();
        lab_txt1 = new javax.swing.JLabel();
        seat_txt1 = new javax.swing.JLabel();
        name_id1 = new javax.swing.JLabel();
        image_status1 = new javax.swing.JLabel();

        info_p1.setOpaque(false);

        lab_txt1.setBackground(new java.awt.Color(255, 244, 204));
        lab_txt1.setForeground(new java.awt.Color(255, 244, 204));
        lab_txt1.setText("Lab :");

        seat_txt1.setBackground(new java.awt.Color(255, 244, 204));
        seat_txt1.setForeground(new java.awt.Color(255, 244, 204));
        seat_txt1.setText("Seat :");

        name_id1.setBackground(new java.awt.Color(255, 244, 204));
        name_id1.setForeground(new java.awt.Color(255, 244, 204));
        name_id1.setText("Name (660xxxxx)");

        image_status1.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/wait.png"))); // NOI18N

        javax.swing.GroupLayout info_p1Layout = new javax.swing.GroupLayout(info_p1);
        info_p1.setLayout(info_p1Layout);
        info_p1Layout.setHorizontalGroup(
                info_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(info_p1Layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(image_status1)
                                .addGap(18, 18, 18)
                                .addGroup(info_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lab_txt1)
                                        .addComponent(seat_txt1)
                                        .addComponent(name_id1))
                                .addContainerGap(53, Short.MAX_VALUE))
        );
        info_p1Layout.setVerticalGroup(
                info_p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(info_p1Layout.createSequentialGroup()
                                .addComponent(seat_txt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lab_txt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(name_id1))
                        .addGroup(info_p1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(image_status1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(info_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(info_p1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JLabel image_status1;
    private javax.swing.JPanel info_p1;
    private javax.swing.JLabel lab_txt1;
    private javax.swing.JLabel name_id1;
    private javax.swing.JLabel seat_txt1;
    // End of variables declaration
}
