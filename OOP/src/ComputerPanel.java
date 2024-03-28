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

    private DeskPanel desk;
    public ComputerPanel(DeskPanel desk, Computer comp, int userType) {
        this.desk = desk;
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

    public Computer getComp() {
        return this.comp;
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
            }
            else if (userType == 1) {
                    if (comp.getIsReservable() == true) {
                        JFrame errorFrame = new JFrame();
                        System.out.println(comp.getStatus());
                        JOptionPane.showMessageDialog(errorFrame, "There's no person in that seat.");
                    } else if (comp.getStatus() == 1){
                        CheckQueueMDI queueWindow = new CheckQueueMDI(comp);
                        queueWindow.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "This seat is still checking...");
                    }
            } else if (userType == 2) {
                if (comp.getIsReservable() == true) {
                    DeleteSeatMDI deleteWindow = new DeleteSeatMDI(desk, comp);
                    deleteWindow.setVisible(true);
                } else if (comp.getStatus() == 1){
                    CheckQueueMDI queueWindow = new CheckQueueMDI(comp);
                    queueWindow.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "This seat is still checking...");
                }
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

