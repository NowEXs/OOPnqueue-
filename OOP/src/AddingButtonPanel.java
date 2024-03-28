import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class AddingButtonPanel extends JPanel implements ActionListener, MouseListener {
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

        addingButton.addMouseListener(this);
        addingButton.addActionListener(this);
        add(addingButton, BorderLayout.NORTH);
        add(innerLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(addingButton)) {
            JOptionPane.showMessageDialog(null, "The seats is limit at 60 seats so please do not fill the number that more than 60.", "How to use", JOptionPane.OK_CANCEL_OPTION);
            CreateSeatMDI createSeatMDI = new CreateSeatMDI(this.deskPanel);
            createSeatMDI.setVisible(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        addingButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
