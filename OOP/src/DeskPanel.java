import javax.swing.*;

public class DeskPanel extends JPanel{
    private JPanel area_com;
    private JLabel wood;

    public DeskPanel() {
        area_com = new JPanel();
        wood = new JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        area_com.setOpaque(false);

        GroupLayout area_comLayout = new GroupLayout(area_com);
        area_com.setLayout(area_comLayout);
        area_comLayout.setHorizontalGroup(
                area_comLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 770, Short.MAX_VALUE)
        );
        area_comLayout.setVerticalGroup(
                area_comLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 550, Short.MAX_VALUE)
        );

        add(area_com, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 770, 550));

        wood.setIcon(new ImageIcon(getClass().getResource("/Image/left.png"))); // NOI18N
        add(wood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }
}