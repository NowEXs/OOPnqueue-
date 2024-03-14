import javax.swing.*;

public class WaitingPop {
    Waiting wait; javax.swing.JFrame frme;
    public WaitingPop(){
        frme = new JFrame(); wait = new Waiting();
        frme.add(wait);

        frme.pack();
        frme.setVisible(true);
        frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new WaitingPop();
    }
}
