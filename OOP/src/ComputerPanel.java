import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//for making computer loop
public class ComputerPanel extends JPanel implements ActionListener, Updater{
    private JPanel innerLabel;
    private JButton computerButton;
    private JLabel computerNumber;
    private Computer comp;
    private int userType;

    public ComputerPanel(Computer comp, int userType) {
        this.userType = userType;
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
            if (userType == 0) {
                if (comp.getIsReservable() == true) {
                    Reservation reservationWindow = new Reservation(this ,comp);
                    reservationWindow.setVisible(true);
                } else {
                    JFrame errorFrame = new JFrame();
                    System.out.println(comp.getStatus());
                    JOptionPane.showMessageDialog(errorFrame, "This seat is not Reservable There's a person in that seat.");
                }
            } else {
                CheckQueueMDI queueWindow = new CheckQueueMDI(comp);
                queueWindow.setVisible(true);
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

    @Override
    public void updateGUI() {

    }

    @Override
    public void dataFetcher() {

    }
}

