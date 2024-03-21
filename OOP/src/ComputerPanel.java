import javax.swing.*;
import java.awt.*;
//for making computer loop
public class ComputerPanel extends Computer{
    private JPanel computerPanel, innerLabel;
    private JButton computerButton;
    private JLabel computerNumber;
    private JFrame fr;

    public ComputerPanel() {
        fr = new JFrame();
        Computer currentComp = new Computer();
        computerNumber = new JLabel(currentComp.getComp_id()+"");
        computerPanel = new JPanel();
        computerPanel.setSize(10,30);
        computerPanel.setLayout(new BorderLayout());

        innerLabel = new JPanel();
        innerLabel.setSize(15,12);
        innerLabel.setLayout(new FlowLayout());
        innerLabel.add(computerNumber);

        computerButton = new JButton(new ImageIcon(getClass().getResource("/Image/checking.png")));
        computerButton.setOpaque(false);
        computerButton.setContentAreaFilled(false);
        computerButton.setBorderPainted(false);


        computerPanel.add(computerButton, BorderLayout.NORTH);
        computerPanel.add(innerLabel);
        fr.add(computerPanel);
        fr.setVisible(true);
        fr.setSize(400,300);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComputerPanel();
    }
}
