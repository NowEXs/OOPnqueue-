/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author Newtellafolk
 */
public class YourQ extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public YourQ() {
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

        jInternalFrame2 = new javax.swing.JInternalFrame();
        lb1_urNext = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jInternalFrame2.setVisible(true);
        jInternalFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb1_urNext.setFont(new java.awt.Font("JasmineUPC", 1, 36)); // NOI18N
        lb1_urNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb1_urNext.setText("Good Luck You're Next!");
        jInternalFrame2.getContentPane().add(lb1_urNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, 61, 480, 45));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/N-Queue graphics/Panel/Waitting&YourQ(470, 160).png"))); // NOI18N
        jInternalFrame2.getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 163));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jInternalFrame2)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jInternalFrame2)
        );
    }// </editor-fold>


    // Variables declaration - do not modify
    private javax.swing.JLabel bg;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel lb1_urNext;
    // End of variables declaration
}
