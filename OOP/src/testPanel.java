import javax.swing.*;
import java.awt.*;

public class testPanel {
    Waiting wait; javax.swing.JFrame frme;
    YourQ uq;
    public testPanel(){
        frme = new JFrame(); wait = new Waiting(); uq = new YourQ();
        frme.add(wait, BorderLayout.SOUTH); frme.add(uq);

        frme.pack();
        frme.setVisible(true);
        frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new testPanel();
    }
}
