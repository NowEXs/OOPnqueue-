/**
 *
 * @author Newtellafolk
 */
public class DeadlinePanel extends javax.swing.JPanel {

    /**
     * Creates new form deadlinePanel
     */
    public DeadlinePanel() {
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

        txt_today = new javax.swing.JLabel();
        txt_lab = new javax.swing.JLabel();
        txt_people = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        bg_deadline = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_today.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_today.setForeground(new java.awt.Color(87, 65, 43));
        txt_today.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_today.setText("Today's Deadline");
        txt_today.setToolTipText("");
        txt_today.setIconTextGap(5);
        add(txt_today, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 30));

        txt_lab.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_lab.setForeground(new java.awt.Color(87, 65, 43));
        txt_lab.setText("Lab:");
        add(txt_lab, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 62, -1, -1));

        txt_people.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txt_people.setForeground(new java.awt.Color(87, 65, 43));
        txt_people.setText("people");
        add(txt_people, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 62, 45, -1));

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/button/editButton (1).png"))); // NOI18N
        editButton.setBorder(null);
        editButton.setBorderPainted(false);
        editButton.setContentAreaFilled(false);
        add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 22, 30, 15));

        bg_deadline.setIcon(new javax.swing.ImageIcon(getClass().getResource("Image/imagever2.png"))); // NOI18N
        add(bg_deadline, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 105));
    }// </editor-fold>                        



    // Variables declaration - do not modify                     
    private javax.swing.JLabel bg_deadline;
    private javax.swing.JLabel txt_lab;
    private javax.swing.JLabel txt_people;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel txt_today;
    // End of variables declaration                   
}