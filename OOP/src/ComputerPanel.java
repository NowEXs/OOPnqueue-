import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//for making computer loop
public class ComputerPanel extends JPanel implements ActionListener, Updater, MouseListener {
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

        computerButton.addMouseListener(this);
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
                    Reservation reservationWindow = new Reservation(this, comp);
                    reservationWindow.setVisible(true);
                } else {
                    JFrame errorFrame = new JFrame();
                    System.out.println(comp.getStatus());
                    JOptionPane.showMessageDialog(errorFrame,
                            "This seat is not Reservable There's a person in that seat.");
                }
            } else if (userType == 1) {
                if (comp.getIsReservable() == true) {
                    JFrame errorFrame = new JFrame();
                    System.out.println(comp.getStatus());
                    JOptionPane.showMessageDialog(errorFrame, "There's no person in that seat.");
                } else {
                    CheckQueueMDI queueWindow = new CheckQueueMDI(this ,comp);
                    queueWindow.setVisible(true);
                }
            } else if (userType == 2) {
                if (comp.getIsReservable() == true) {
                    DeleteSeatMDI deleteWindow = new DeleteSeatMDI(desk, comp);
                    deleteWindow.setVisible(true);
                } else {
                    CheckQueueMDI queueWindow = new CheckQueueMDI(this, comp);
                    queueWindow.setVisible(true);
                }
            }

        }

    }

    @Override
    public void updateButtonIcon() {
        if (comp.getStatus() == 0) {
            computerButton.setIcon(new ImageIcon(getClass().getResource("/Image/empty.png")));
        } else if (comp.getStatus() == 1) {
            computerButton.setIcon(new ImageIcon(getClass().getResource("/Image/wait.png")));
        } else if (comp.getStatus() == 2) {
            computerButton.setIcon(new ImageIcon(getClass().getResource("/Image/check.png")));
        }
    }

    @Override
    public void updateGUI() {

    }

    @Override
    public void dataFetcher() {

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
        computerButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
