import javax.swing.*;
import java.awt.*;

import javax.swing.*;
import java.awt.*;

public class DeskPanel extends JPanel {
    private JPanel area_com;
    private JLabel wood;
    private JScrollPane scrollPanel;

    public DeskPanel() {
        area_com = new JPanel();
        wood = new JLabel();
        addComputerPanels();
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPanel = new JScrollPane(area_com);
        scrollPanel.getViewport().setOpaque(false);
        scrollPanel.setOpaque(false);
        scrollPanel.setBorder(null);
        add(scrollPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 770, 550));
        wood.setIcon(new ImageIcon(getClass().getResource("/Image/left.png")));
        add(wood, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }

    private void addComputerPanels() {
        area_com.setLayout(new GridLayout(0, 7));
        area_com.setOpaque(false);
        area_com.setBorder(null);
        for (int i = 0; i < 50; i++) {
            ComputerPanel computerPanel = new ComputerPanel(new Computer());
            computerPanel.setPreferredSize(new Dimension(100, 100));
            computerPanel.setOpaque(false);
            area_com.add(computerPanel);
        }
    }
}
