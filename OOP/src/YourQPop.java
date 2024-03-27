import javax.swing.*;

public class YourQPop {
    YourQ UrQ; JFrame frme;
    public YourQPop(){
        frme = new JFrame();
        //UrQ = new YourQ();
        frme.add(UrQ);

        frme.pack();
        frme.setVisible(true);
        frme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new YourQPop();
    }
}
