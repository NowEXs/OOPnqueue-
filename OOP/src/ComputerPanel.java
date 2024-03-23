import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//for making computer loop
public class ComputerPanel extends JPanel {
    private JPanel computerPanel, innerLabel;
    private JButton computerButton;
    private JLabel computerNumber;
    private Computer comp;


    public ComputerPanel(Computer comp) {
        this.comp = comp;
        computerNumber = new JLabel(comp.getComp_id() + "");
        setLayout(new BorderLayout());

        JPanel innerLabel = new JPanel();
        innerLabel.add(computerNumber);
        innerLabel.setOpaque(false);

        computerButton = new JButton(new ImageIcon(getClass().getResource("/Image/checking.png")));
        computerButton.setOpaque(false);
        computerButton.setContentAreaFilled(false);
        computerButton.setBorderPainted(false);

        add(computerButton, BorderLayout.NORTH);
        add(innerLabel);
    }

}
