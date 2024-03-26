import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//for making computer loop
public class ComputerPanel extends JPanel implements ActionListener, updateIcon{
    private JPanel innerLabel;
    private JButton computerButton;
    private JLabel computerNumber;
    private Computer comp;

    public ComputerPanel(Computer comp) {
        this.comp = comp;
        computerNumber = new JLabel("Seat - " + comp.getComp_id());
        setLayout(new BorderLayout());

        innerLabel = new JPanel();
        innerLabel.add(computerNumber);
        innerLabel.setOpaque(false);

        computerButton = new JButton();
        updateButtonIcon();
        computerButton.setOpaque(false);
        computerButton.setContentAreaFilled(false);
        computerButton.setBorderPainted(false);

        computerButton.addActionListener(this);
        add(computerButton, BorderLayout.NORTH);
        add(innerLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(computerButton)) {
            if (comp.getIsReservable() == true) {
                Reservation reservationWindow = new Reservation(this ,comp);
                reservationWindow.setVisible(true);
            } else {
                JFrame errorFrame = new JFrame();
                System.out.println(comp.getStatus());
                JOptionPane.showMessageDialog(errorFrame, "This seat is not Reservable There's a person in that seat.");
            }
        }
    }
    @Override
    public void updateButtonIcon() {
        if (comp.getStatus() == 0) {
            computerButton.setIcon(new ImageIcon(getClass().getResource("/Image/empty.png")));
        } else if (comp.getStatus() == 1){
            computerButton.setIcon(new ImageIcon(getClass().getResource("/Image/wait.png")));
        } else if (comp.getStatus() == 2) {
            computerButton.setIcon(new ImageIcon(getClass().getResource("/Image/checking.png")));
        }
    }
}

