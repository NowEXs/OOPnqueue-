import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddingButtonPanel extends JPanel implements ActionListener{
    private JPanel innerLabel;
    private JLabel buttonLabel;
    private JButton addingButton;
    private DeskPanel deskPanel;


    public AddingButtonPanel(DeskPanel deskPanel) {
        this.deskPanel = deskPanel;
        setOpaque(false);
        setLayout(new BorderLayout());
        buttonLabel = new JLabel("Add the seat");

        innerLabel = new JPanel();
        innerLabel.add(buttonLabel);
        innerLabel.setOpaque(false);

        addingButton = new JButton(new ImageIcon(getClass().getResource("/Image/add.png")));
        addingButton.setOpaque(false);
        addingButton.setContentAreaFilled(false);
        addingButton.setBorderPainted(false);

        addingButton.addActionListener(this);
        add(addingButton, BorderLayout.NORTH);
        add(innerLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(addingButton)) {
            CreateSeatMDI createSeatMDI = new CreateSeatMDI(this.deskPanel);
            createSeatMDI.setVisible(true);
        }
    }
}
